package org.gemoc.agro.design.services;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class Services {

	public EObject moveToNextDay(Schedule schedule) {
		if (schedule.getClimateData() != null
				&& schedule.getClimateData().getDays().size() > 0) {
			if (schedule.getCurrentDay() == null) {
				schedule.setCurrentDay(schedule.getClimateData().getDays()
						.iterator().next());
			} else {
				Day next = getNextDay(schedule, schedule.getCurrentDay());
				if (next != null) {
					schedule.setCurrentDay(next);
				}
			}
		}
		return schedule;
	}

	private Day getNextDay(Schedule schedule, Day cur) {
		int index = schedule.getClimateData().getDays().indexOf(cur);
		if (index < 0) {
			index = 0;
		}
		index++;
		if (index >= schedule.getClimateData().getDays().size()) {
			index = 0;
		}
		Day next = schedule.getClimateData().getDays().get(index);
		return next;
	}

	public EObject moveToNextDayWithWork(Schedule schedule) {
		if (schedule.getClimateData() != null
				&& schedule.getClimateData().getDays().size() > 0) {
			Multimap<Day, ActivityWork> dayToWork = HashMultimap.create();
			for (ActivityWork w : schedule.getWorkToDo()) {
				if (w.getScheduledOn() != null) {
					dayToWork.put(w.getScheduledOn(), w);
				}
			}
			Set<Day> browsedDays = Sets.newLinkedHashSet();
			boolean found = false;
			moveToNextDay(schedule);
			if (schedule.getCurrentDay() != null) {
				Day cur = schedule.getCurrentDay();
				while (!found) {
					if (browsedDays.contains(cur)) {
						found = true;
					} else {
						if (dayToWork.get(cur).size() > 0) {
							found = true;
						}
					}
					browsedDays.add(cur);
					if (!found) {
						cur = getNextDay(schedule, cur);
					}
				}
				if (found) {
					schedule.setCurrentDay(cur);
				}
			}
		}
		return schedule;
	}

}
