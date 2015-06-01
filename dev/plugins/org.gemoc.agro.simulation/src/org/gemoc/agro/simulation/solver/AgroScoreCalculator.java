package org.gemoc.agro.simulation.solver;

import java.util.Calendar;
import java.util.Collection;
import java.util.Set;

import org.drools.core.process.core.Work;
import org.gemoc.agro.activitiesDSL.ActivityResource;
import org.gemoc.agro.activitiesDSL.Comp;
import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.Predicate;
import org.gemoc.agro.activitiesDSL.ResourceKind;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.exploitation.Resource;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.FeedbackLevel;
import org.gemoc.agro.simulation.ResourceAllocation;
import org.gemoc.agro.simulation.SchedulingFeedback;
import org.gemoc.agro.simulation.SimulationFactory;
import org.optaplanner.core.api.score.Score;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class AgroScoreCalculator implements
		EasyScoreCalculator<SimulationSolution> {

	@Override
	public Score calculateScore(SimulationSolution solution) {
		int hardScore = 0;
		int softScore = 0;

		Multimap<ExploitationActivity, ActivityWork> activityToWork = HashMultimap
				.create();
		Multimap<Day, ActivityWork> scheduledWork = HashMultimap.create();
		for (ActivityWork work : solution.getSimulation().getWorkToDo()) {
			work.getSchedulingFeedback().clear();
			if (work.getActivity() != null) {
				activityToWork.put(work.getActivity(), work);
			}
		}

		Multimap<ActivityWork, ResourceAllocation> workToAllocation = HashMultimap
				.create();
		for (ResourceAllocation allocated : solution.getSimulation()
				.getAllocations()) {
			workToAllocation.put(allocated.getWork(), allocated);
		}

		for (ActivityWork allocatedWork : workToAllocation.keySet()) {
			Collection<ResourceAllocation> allocations = workToAllocation
					.get(allocatedWork);
			Set<Resource> usedResource = Sets.newLinkedHashSet();
			for (ResourceAllocation alloc : allocations) {
				if (usedResource.contains(alloc.getResource())) {
					hardScore += -100;
					alloc.getWork()
							.getSchedulingFeedback()
							.add(createFeedback(FeedbackLevel.ERROR, "Resource "
									+ alloc.getResource().getName()
									+ " is allocated more than one time."));
				}
				if (alloc.getResource() != null) {
					usedResource.add(alloc.getResource());
				}
			}

		}

		Multimap<Day, Resource> dayToResource = HashMultimap.create();
		for (ResourceAllocation alloc : solution.getSimulation()
				.getAllocations()) {
			if (alloc.getResource() != null && alloc.getWork() != null
					&& alloc.getWork().getScheduledOn() != null) {
				dayToResource.put(alloc.getWork().getScheduledOn(),
						alloc.getResource());
			}
		}
		/*
		 * Constraint : a given resource can only be used for a given activity
		 * on a given day.
		 */
		for (Day d : dayToResource.keySet()) {
			Collection<Resource> allResourcesForThisDay = dayToResource.get(d);
			Set<Resource> uniqueResources = Sets
					.newLinkedHashSet(allResourcesForThisDay);
			int delta = allResourcesForThisDay.size() - uniqueResources.size();
			if (delta > 0) {
				hardScore += -1000 * delta;
				System.out.println("double usage for the same day");
			}

		}

		for (ResourceAllocation alloc : solution.getSimulation()
				.getAllocations()) {
			if (alloc.getResource() != null) {

				if (alloc.getResource().getKind() != alloc.getKind()) {
					hardScore += -1000;
					alloc.getWork()
							.getSchedulingFeedback()
							.add(createFeedback(FeedbackLevel.ERROR, "Resource"
									+ alloc.getResource().getName()
									+ " is not of kind " + alloc.getKind().getName()
									+ "."));
				}

			} else {
				hardScore += -100;
				alloc.getWork()
						.getSchedulingFeedback()
						.add(createFeedback(
								FeedbackLevel.ERROR,
								"A required resource of kind "
										+ alloc.getKind() + " is missing."));
			}
		}

		for (ActivityWork work : solution.getSimulation().getWorkToDo()) {
			

			/*
			 * Constraint : all work needing a resource should have a
			 * corresponding allocation of the right type
			 */
			Multimap<ResourceKind, Resource> allocationsForThisWork = HashMultimap
					.create();
			for (ResourceAllocation allocated : workToAllocation.get(work)) {
				if (allocated.getResource() != null) {
					allocationsForThisWork.put(allocated.getKind(),
							allocated.getResource());
				}
			}

			for (ActivityResource use : work.getActivity().getUses()) {
				if (use.getResourceKind() != null) {

					int delta = allocationsForThisWork.get(
							use.getResourceKind()).size()
							- use.getQuantity();
					if (delta > 0) {
						/*
						 * we are missing at least an allocation of this type.
						 */
						hardScore -= 100 * delta;
						work.getSchedulingFeedback().add(
								createFeedback(FeedbackLevel.ERROR,
										"This activity is missing "
												+ delta
												+ " resources of kind "
												+ use.getResourceKind()
														.getName()));
					}
				}
			}

			/*
			 * Constraint : All work should be scheduled
			 */
			if (work.getScheduledOn() == null) {

				hardScore -= 100;
				work.getSchedulingFeedback().add(
						createFeedback(FeedbackLevel.ERROR,
								"This activity is not scheduled."));
			} else {
				scheduledWork.put(work.getScheduledOn(), work);
				if (work.getActivity() != null) {
					/*
					 * start date is in range
					 */
					Date minimumDayToStart = work.getActivity().getStartDate();
					if (minimumDayToStart != null) {
						int deltaDaysFromIdeal = delta(work.getScheduledOn(),
								minimumDayToStart);
						/*
						 * if delta is >0, the schedule is later than the start
						 * date.
						 */
						if (deltaDaysFromIdeal < 0) {
							hardScore += deltaDaysFromIdeal;
							work.getSchedulingFeedback()
									.add(createFeedback(FeedbackLevel.ERROR,
											"This activity starts before the specified start date."));
						} else if (deltaDaysFromIdeal != 0) {
							softScore += -deltaDaysFromIdeal;
						}
					}

					/*
					 * end date is in range
					 */
					Date maximumDayToFinish = work.getActivity().getEndDate();
					if (maximumDayToFinish != null) {
						int deltaDaysFromIdeal = delta(work.getScheduledOn(),
								maximumDayToFinish);

						/*
						 * if delta > 0, the scheduled date is later than the
						 * end date.
						 */
						if (deltaDaysFromIdeal > 0) {
							hardScore += -deltaDaysFromIdeal;
							work.getSchedulingFeedback()
									.add(createFeedback(FeedbackLevel.ERROR,
											"This activity starts after the specified end date."));
						} else if (deltaDaysFromIdeal != 0) {
							softScore += deltaDaysFromIdeal;
						}
					}

					/*
					 * predicates are ok
					 */

					for (Predicate p : work.getActivity().getPredicates()) {
						/*
						 * delay are focused on the same surface..
						 */
						if (p instanceof DelaySinceActivy) {
							DelaySinceActivy delayConstraint = (DelaySinceActivy) p;
							for (ActivityWork otherWorkOnSameAct : activityToWork
									.get(delayConstraint.getPrerequisite())) {
								if (otherWorkOnSameAct.getOnSurface() == work
										.getOnSurface()
										&& otherWorkOnSameAct.getScheduledOn() != null) {
									int nbDaysInBetween = delta(
											work.getScheduledOn(),
											otherWorkOnSameAct.getScheduledOn());
									/*
									 * if delta > 0 this activity scheduled date
									 * is later than the when activity it
									 * depends on is scheduled.
									 */
									if (nbDaysInBetween < 0) {
										hardScore += nbDaysInBetween;
										work.getSchedulingFeedback()
												.add(createFeedback(
														FeedbackLevel.ERROR,
														"This activity starts before  "
																+ otherWorkOnSameAct
																		.getActivity()
																		.getName()
																+ " whereas it should not."));

									} else if (delayConstraint.getDays() != 0
											&& nbDaysInBetween < delayConstraint
													.getDays()) {
										hardScore += -nbDaysInBetween;
										work.getSchedulingFeedback()
												.add(createFeedback(
														FeedbackLevel.ERROR,
														"The minimum number of days in between this activity and "
																+ otherWorkOnSameAct
																		.getActivity()
																		.getName()
																+ " is not respected."));
									}
								}

							}
						}

						if (p instanceof TempOfTheDay) {
							TempOfTheDay tempConstraint = (TempOfTheDay) p;
							if (tempConstraint.getComparison() == Comp.MORE_THAN
									&& work.getScheduledOn().getTemperature() < tempConstraint
											.getLowerTempBound()) {
								hardScore += -100;
								work.getSchedulingFeedback()
										.add(createFeedback(
												FeedbackLevel.ERROR,
												"The minimum temperature is not respected."));
							}
							if (tempConstraint.getComparison() == Comp.LESS_THAN
									&& work.getScheduledOn().getTemperature() > tempConstraint
											.getLowerTempBound()) {
								hardScore += -100;
								work.getSchedulingFeedback()
										.add(createFeedback(
												FeedbackLevel.ERROR,
												"The minimum temperature is not respected."));
							}

						}
					}
				}
			}

		}

		HardSoftScore score = HardSoftScore.valueOf(hardScore, softScore);
		return score;
	}

	private SchedulingFeedback createFeedback(FeedbackLevel error,
			String message) {
		SchedulingFeedback feedback = SimulationFactory.eINSTANCE
				.createSchedulingFeedback();
		feedback.setLevel(error);
		feedback.setMessage(message);
		return feedback;
	}

	/*
	 * return the nb days between the dates.
	 */
	private int delta(Day scheduledOn, Date date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, date.getDay());
		cal.set(Calendar.MONTH, date.getMonth().getValue());
		int dateDayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		cal.set(Calendar.DAY_OF_MONTH, scheduledOn.getDay());
		cal.set(Calendar.MONTH, scheduledOn.getMonth().getValue());
		int scheduleDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		return scheduleDayOfYear - dateDayOfYear;
	}

	/*
	 * return the nb days between the dates.
	 */
	private int delta(Day scheduledOn, Day date) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, date.getDay());
		cal.set(Calendar.MONTH, date.getMonth().getValue());
		int dateDayOfYear = cal.get(Calendar.DAY_OF_YEAR);

		cal.set(Calendar.DAY_OF_MONTH, scheduledOn.getDay());
		cal.set(Calendar.MONTH, scheduledOn.getMonth().getValue());
		int scheduleDayOfYear = cal.get(Calendar.DAY_OF_YEAR);
		return scheduleDayOfYear - dateDayOfYear;
	}

}
