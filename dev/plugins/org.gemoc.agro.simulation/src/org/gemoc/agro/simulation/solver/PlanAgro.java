package org.gemoc.agro.simulation.solver;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.gemoc.agro.ActivitiesDSLStandaloneSetup;
import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;
import org.gemoc.agro.activitiesDSL.Culture;
import org.gemoc.agro.activitiesDSL.ExploitationActivity;
import org.gemoc.agro.activitiesDSL.Month;
import org.gemoc.agro.exploitation.Surface;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.Simulation;
import org.gemoc.agro.simulation.SimulationFactory;
import org.gemoc.agro.simulation.SimulationPackage;
import org.optaplanner.core.api.solver.Solver;
import org.optaplanner.core.api.solver.SolverFactory;
import org.optaplanner.core.config.constructionheuristic.ConstructionHeuristicPhaseConfig;
import org.optaplanner.core.config.constructionheuristic.ConstructionHeuristicType;
import org.optaplanner.core.config.localsearch.LocalSearchPhaseConfig;
import org.optaplanner.core.config.localsearch.decider.acceptor.AcceptorConfig;
import org.optaplanner.core.config.localsearch.decider.forager.LocalSearchForagerConfig;
import org.optaplanner.core.config.phase.PhaseConfig;
import org.optaplanner.core.config.score.definition.ScoreDefinitionType;
import org.optaplanner.core.config.score.director.ScoreDirectorFactoryConfig;
import org.optaplanner.core.config.solver.SolverConfig;
import org.optaplanner.core.config.solver.termination.TerminationConfig;

import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;

public class PlanAgro {

	public void createSchedule(Simulation s) {
		createWorkToDo(s);
//		for (ActivityWork work : s.getWorkToDo()) {
//			work.setScheduledOn(s.getClimateData().getDays().get(0));
//		}

		SolverConfig conf = configureSolver();
		Solver solver = conf.buildSolver();
		// //
		// SolverFactory solverFactory = SolverFactory
		// .createFromXmlResource("org/gemoc/agro/simulation/solver/config.xml");
		//
		// Solver solver = solverFactory.buildSolver();

		SimulationSolution unsolvedCloudBalance = new SimulationSolution(s);

		// Solve the problem
		solver.solve(unsolvedCloudBalance);
		SimulationSolution solvedCloudBalance = (SimulationSolution) solver
				.getBestSolution();
		s.getWorkToDo().clear();
		s.getWorkToDo()
				.addAll(solvedCloudBalance.getSimulation().getWorkToDo());
		System.out.println("PlanAgro.createStartingSimulation()"
				+ solvedCloudBalance.getScore());

	}

	public static void main(String[] args) {

		ResourceSet set = new ResourceSetImpl();

		set.getPackageRegistry().put(SimulationPackage.eINSTANCE.getNsURI(),
				SimulationPackage.eINSTANCE);
		set.getPackageRegistry().put(ActivitiesDSLPackage.eINSTANCE.getNsURI(),
				ActivitiesDSLPackage.eINSTANCE);
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("simulation", new XMIResourceFactoryImpl());
		set.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put("exploitation", new XMIResourceFactoryImpl());

		new ActivitiesDSLStandaloneSetup()
				.createInjectorAndDoEMFRegistration();
		
		Resource loaded = set
				.getResource(
						URI.createFileURI("/home/cedric/src/farmingmodeling/dev/workspace_projects/MyExploitation/csv.simulation"),
						true);
		EcoreUtil.resolveAll(loaded);
		for (Simulation s : Iterables.filter(loaded.getContents(),
				Simulation.class)) {
			new PlanAgro().createSchedule(s);
		}
		System.out.println("PlanAgro.main()");
		//
		// SolverFactory solverFactory = SolverFactory.createFromXmlResource(
		// "org/gemoc/agro/simulation/solver/config.xml");
		//
		// Solver solver = solverFactory.buildSolver();
		//

		// Display the result
	}

	private static SolverConfig configureSolver() {
		SolverConfig conf = new SolverConfig();
		conf.setSolutionClass(SimulationSolution.class);
		conf.setEntityClassList(Lists.newArrayList(ActivityWork.class));

		ScoreDirectorFactoryConfig scoreDirectorFactoryConfig = new ScoreDirectorFactoryConfig();
		scoreDirectorFactoryConfig
				.setScoreDefinitionType(ScoreDefinitionType.HARD_SOFT);
		scoreDirectorFactoryConfig
				.setEasyScoreCalculatorClass(AgroScoreCalculator.class);
		scoreDirectorFactoryConfig.setInitializingScoreTrend("ONLY_DOWN");
		conf.setScoreDirectorFactoryConfig(scoreDirectorFactoryConfig);

		TerminationConfig terminationConfig = new TerminationConfig();
		terminationConfig.setSecondsSpentLimit(5l);
		conf.setTerminationConfig(terminationConfig);

		List<PhaseConfig> phases = Lists.newArrayList();
		ConstructionHeuristicPhaseConfig heuristic = new ConstructionHeuristicPhaseConfig();
		heuristic
				.setConstructionHeuristicType(ConstructionHeuristicType.FIRST_FIT_DECREASING);
		phases.add(heuristic);

		LocalSearchPhaseConfig localsearch = new LocalSearchPhaseConfig();
		AcceptorConfig acceptorConfig = new AcceptorConfig();
		acceptorConfig.setEntityTabuSize(7);

		localsearch.setAcceptorConfig(acceptorConfig);

		LocalSearchForagerConfig foragerConfig = new LocalSearchForagerConfig();
		foragerConfig.setAcceptedCountLimit(1000);
		localsearch.setForagerConfig(foragerConfig);
		phases.add(localsearch);
		conf.setPhaseConfigList(phases);
		return conf;
	}

	public void createWorkToDo(Simulation sim) {
		sim.getWorkToDo().clear();
		/*
		 * for each surface x culture we declare the corresponding activities
		 */
		if (sim.getExploitation() != null) {
			for (Surface s : sim.getExploitation().getSurfaces()) {
				if (s.getDedicatedto() != null) {
					for (Culture c : s.getDedicatedto().getCultures()) {
						for (ExploitationActivity activity : c.getActivities()) {
							ActivityWork work = SimulationFactory.eINSTANCE
									.createActivityWork();
							work.setActivity(activity);
							work.setOnSurface(s);
							sim.getWorkToDo().add(work);
						}

					}
				}
			}
		}
	}

	private static Day createDay(int i, Month j) {
		Day d = SimulationFactory.eINSTANCE.createDay();
		d.setDay(i);
		d.setMonth(j);
		return d;
	}

	private static ActivityWork createWorkTodo() {
		ActivityWork work = SimulationFactory.eINSTANCE.createActivityWork();
		return work;
	}

}
