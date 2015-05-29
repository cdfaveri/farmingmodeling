package org.gemoc.agro.simulation.solver;

import java.io.Serializable;
import java.util.Comparator;

import org.apache.commons.lang.builder.CompareToBuilder;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.gemoc.agro.simulation.ActivityWork;

public class ActivityWorkDifficultyComparator implements
		Comparator<ActivityWork>, Serializable {

	public int compare(ActivityWork a, ActivityWork b) {
		return 0;
		// return new CompareToBuilder().append(a.getScheduledOn(),
		// b.getScheduledOn()).toComparison();
	}

}