package org.gemoc.agro.scientific;

import java.util.Map;

import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.exploitation.Exploitation;
import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Schedule;

import com.google.common.collect.Maps;

public class WaterAnalysis {

	public void compute(ExploitationAnalysis analysis) {
		if (analysis.getSchedule() != null
				&& analysis.getSchedule().getExploitation() != null
				&& analysis.getBiomassModels().size() > 0) {
			Exploitation exp = analysis.getSchedule().getExploitation();
			Map<Culture, BiomassModel> activityToModel = Maps
					.newLinkedHashMap();
			Map<Culture, ExploitationActivity> activityPlanting = Maps
					.newLinkedHashMap();
			Map<Culture, ExploitationActivity> activityHarvest = Maps
					.newLinkedHashMap();
			for (BiomassModel bioModel : analysis.getBiomassModels()) {
				if (bioModel.getCulture() != null
						&& bioModel.getCulture().getActivities().size() > 0) {

					for (ExploitationActivity activity : bioModel.getCulture()
							.getActivities()) {
						if (activity.getName().equals("SEMIS")) {
							activityPlanting.put(bioModel.getCulture(),
									activity);
						}
						if (activity.getName().equals("RECOLTE")) {
							activityHarvest
									.put(bioModel.getCulture(), activity);
						}
					}
					activityToModel.put(bioModel.getCulture(), bioModel);
				}
			}

			analysis.getSurfaceDatas().clear();
			for (Surface s : exp.getSurfaces()) {
				if (s.getDedicatedto() != null) {
					for (Culture culture : s.getDedicatedto().getCultures()) {
						ExploitationActivity plantingActivity = activityPlanting
								.get(culture);
						
						ExploitationActivity harvestingActivity = activityHarvest
								.get(culture);
						Day plantingDay = null;
						Day harvestingDay = null;
						if (plantingActivity != null
								&& harvestingActivity != null) {
							for (ActivityWork work : analysis.getSchedule()
									.getWorkToDo()) {
								if (work.getActivity() == plantingActivity
										&& work.getOnSurface() == s) {
									plantingDay = work.getScheduledOn();
								}
								if (work.getActivity() == harvestingActivity
										&& work.getOnSurface() == s) {
									harvestingDay = work.getScheduledOn();
								}
							}
						}
						if (plantingDay != null && harvestingDay != null) {
							SurfaceData previousData = null;
							Day currentDay = plantingDay;
							BiomassModel bioModel = null;
							for (BiomassModel model : analysis.getBiomassModels()) {
								if (model.getCulture() == culture) {
									bioModel = model;
								}
							}
							while (currentDay != null
									&& currentDay != harvestingDay) {
								SurfaceData data = ScientificFactory.eINSTANCE
										.createSurfaceData();
								data.setSurface(s);
								data.setDay(currentDay);
								analysis.getSurfaceDatas().add(data);
								if (previousData != null && bioModel != null) {
									/*
									 * compute the biomass growth
									 */
									data.setBiomass(Calculator
											.calculateBiomass(
													previousData.getBiomass(),
													currentDay, bioModel));
									data.setLAI(Calculator.calculateLAI(currentDay, previousData.getLAI(), bioModel));
								}
								currentDay = getNextDay(analysis.getSchedule(),
										currentDay);
								previousData = data;
							}
						}

					}
				}
			}

		}
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
}
