package org.gemoc.agro.simulation.solver;

import java.util.Calendar;

import org.gemoc.agro.activitiesDSL.Comp;
import org.gemoc.agro.activitiesDSL.Date;
import org.gemoc.agro.activitiesDSL.DelaySinceActivy;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.NoRain;
import org.gemoc.agro.activitiesDSL.Predicate;
import org.gemoc.agro.activitiesDSL.TempOfTheDay;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.optaplanner.core.api.score.Score;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;
import org.optaplanner.core.impl.score.director.easy.EasyScoreCalculator;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

public class AgroScoreCalculator implements
		EasyScoreCalculator<SimulationSolution> {

	@Override
	public Score calculateScore(SimulationSolution arg0) {
		int hardScore = 0;
		int softScore = 0;

		Multimap<ExploitationActivity, ActivityWork> activityToWork = HashMultimap
				.create();
		Multimap<Day, ActivityWork> scheduledWork = HashMultimap.create();
		for (ActivityWork work : arg0.getSimulation().getWorkToDo()) {
			if (work.getActivity() != null) {
				activityToWork.put(work.getActivity(), work);
			}
		}
		for (ActivityWork work : arg0.getSimulation().getWorkToDo()) {
			/*
			 * Constraint : All work should be scheduled
			 */
			if (work.getScheduledOn() == null) {
				hardScore -= 100;
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
									 * if delta > 0 the scheduled date is later
									 * than the end date.
									 */
									if (nbDaysInBetween < 0) {
										hardScore += nbDaysInBetween;
									} else if (delayConstraint.getDays() != 0
											&& nbDaysInBetween < delayConstraint
													.getDays()) {
										hardScore += -nbDaysInBetween;
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
							}
							if (tempConstraint.getComparison() == Comp.LESS_THAN
									&& work.getScheduledOn().getTemperature() > tempConstraint
											.getLowerTempBound()) {
								hardScore += -100;
							}

						}
					}
				}
			}

		}

		// /*
		// * we can't set two work on the same day.
		// */
		// for (Day day : arg0.getSimulation().getClimateData().getDays()) {
		//
		// if (scheduledWork.get(day).size() > 1) {
		// int delta = scheduledWork.get(day).size() - 1;
		// hardScore -= delta * 100;
		// }
		// }

		HardSoftScore score = HardSoftScore.valueOf(hardScore, softScore);
		return score;
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
