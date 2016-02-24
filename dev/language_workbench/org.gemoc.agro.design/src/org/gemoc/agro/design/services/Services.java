package org.gemoc.agro.design.services;

import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.ECrossReferenceAdapter;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.gemoc.agro.scientific.ExploitationAnalysis;
import org.gemoc.agro.scientific.SurfaceData;
import org.gemoc.agro.scientific.WaterAnalysis;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;
import org.gemoc.agro.simulation.SimulationPackage;
import org.gemoc.agro.simulation.solver.ExploitationActivitiesScheduler;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.Sets;

public class Services {

  public EObject moveToNextDay(Schedule schedule) {
    if (schedule.getClimateData() != null
        && schedule.getClimateData().getDays().size() > 0) {
      if (schedule.getCurrentDay() == null) {
        schedule.setCurrentDay(schedule.getClimateData().getDays().iterator()
            .next());
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

  public EObject computeSchedule(EObject ctx) {
    if (ctx instanceof Schedule) {
      new ExploitationActivitiesScheduler().createSchedule((Schedule) ctx);
    }
    return ctx;
  }

  public EObject computeWaterAnalysis(EObject ctx) {
    if (ctx instanceof ExploitationAnalysis) {
      new WaterAnalysis().compute((ExploitationAnalysis) ctx);
    }
    return ctx;
  }

  public int totalExtraWater(ExploitationAnalysis analysis) {
    int total = 0;
    for (SurfaceData data : analysis.getSurfaceDatas()) {
      if (data.getSurface() != null) {
        total += data.getExtraWater() / 1000 * data.getSurface().getTotal()
            * 10000;
      }
    }
    return total;
  }

  public boolean isCurrentDay(Day d) {
    Session s = SessionManager.INSTANCE.getSession(d);
    if (s != null) {
      for (Setting xRef : s.getSemanticCrossReferencer()
          .getNonNavigableInverseReferences(d)) {
        if (xRef.getEStructuralFeature() == SimulationPackage.eINSTANCE
            .getSchedule_CurrentDay()) {
          return true;
        }
      }

    }
    return false;
  }

}
