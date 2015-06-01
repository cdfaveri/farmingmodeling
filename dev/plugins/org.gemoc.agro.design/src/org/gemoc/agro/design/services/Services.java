package org.gemoc.agro.design.services;

import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;

public class Services {

	public EObject moveToNextDay(Schedule schedule) {
		if (schedule.getClimateData() != null
				&& schedule.getClimateData().getDays().size() > 0) {
			if (schedule.getCurrentDay() == null) {
				schedule.setCurrentDay(schedule.getClimateData().getDays()
						.iterator().next());
			} else {
				int index = schedule.getClimateData().getDays()
						.indexOf(schedule.getCurrentDay());
				if (index < 0) {
					index = 0;
				}
				index++;
				if (index >= schedule.getClimateData().getDays().size()) {
					index = 0;
				}
				Day next = schedule.getClimateData().getDays().get(index);
				if (next != null) {
					schedule.setCurrentDay(next);
				}
			}
		}
		return schedule;
	}

}
