/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.gemoc.agro.simulation.SimulationFactory
 * @model kind="package"
 * @generated
 */
public interface SimulationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.gemoc.org/agro/simulation";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulationPackage eINSTANCE = org.gemoc.agro.simulation.impl.SimulationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.impl.SimulationImpl <em>Simulation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.impl.SimulationImpl
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSimulation()
	 * @generated
	 */
	int SIMULATION = 0;

	/**
	 * The feature id for the '<em><b>Exploitation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__EXPLOITATION = 0;

	/**
	 * The feature id for the '<em><b>Scheduling Strategy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__SCHEDULING_STRATEGY = 1;

	/**
	 * The feature id for the '<em><b>Work To Do</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__WORK_TO_DO = 2;

	/**
	 * The feature id for the '<em><b>Climate Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION__CLIMATE_DATA = 3;

	/**
	 * The number of structural features of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Simulation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl <em>Activity Work</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.impl.ActivityWorkImpl
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getActivityWork()
	 * @generated
	 */
	int ACTIVITY_WORK = 1;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK__ACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Resource Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK__RESOURCE_ALLOCATION = 1;

	/**
	 * The feature id for the '<em><b>Scheduled On</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK__SCHEDULED_ON = 2;

	/**
	 * The feature id for the '<em><b>On Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK__ON_SURFACE = 3;

	/**
	 * The feature id for the '<em><b>Scheduling Feedback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK__SCHEDULING_FEEDBACK = 4;

	/**
	 * The number of structural features of the '<em>Activity Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Activity Work</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_WORK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.impl.DayImpl
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 2;

	/**
	 * The feature id for the '<em><b>Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__MONTH = 0;

	/**
	 * The feature id for the '<em><b>Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__DAY = 1;

	/**
	 * The feature id for the '<em><b>Rain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__RAIN = 2;

	/**
	 * The feature id for the '<em><b>Ray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__RAY = 3;

	/**
	 * The feature id for the '<em><b>ETp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__ETP = 4;

	/**
	 * The feature id for the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__TEMPERATURE = 5;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.impl.ClimateDataImpl <em>Climate Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.impl.ClimateDataImpl
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getClimateData()
	 * @generated
	 */
	int CLIMATE_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE_DATA__DAYS = 1;

	/**
	 * The number of structural features of the '<em>Climate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE_DATA_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Climate Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIMATE_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl <em>Scheduling Feedback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingFeedback()
	 * @generated
	 */
	int SCHEDULING_FEEDBACK = 4;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_FEEDBACK__LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_FEEDBACK__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Scheduling Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_FEEDBACK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Scheduling Feedback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEDULING_FEEDBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.SchedulingStrategy <em>Scheduling Strategy</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.SchedulingStrategy
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingStrategy()
	 * @generated
	 */
	int SCHEDULING_STRATEGY = 5;


	/**
	 * The meta object id for the '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.gemoc.agro.simulation.FeedbackLevel
	 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getFeedbackLevel()
	 * @generated
	 */
	int FEEDBACK_LEVEL = 6;


	/**
	 * Returns the meta object for class '{@link org.gemoc.agro.simulation.Simulation <em>Simulation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simulation</em>'.
	 * @see org.gemoc.agro.simulation.Simulation
	 * @generated
	 */
	EClass getSimulation();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.Simulation#getExploitation <em>Exploitation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exploitation</em>'.
	 * @see org.gemoc.agro.simulation.Simulation#getExploitation()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_Exploitation();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Simulation#getSchedulingStrategy <em>Scheduling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scheduling Strategy</em>'.
	 * @see org.gemoc.agro.simulation.Simulation#getSchedulingStrategy()
	 * @see #getSimulation()
	 * @generated
	 */
	EAttribute getSimulation_SchedulingStrategy();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.Simulation#getWorkToDo <em>Work To Do</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Work To Do</em>'.
	 * @see org.gemoc.agro.simulation.Simulation#getWorkToDo()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_WorkToDo();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.Simulation#getClimateData <em>Climate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Climate Data</em>'.
	 * @see org.gemoc.agro.simulation.Simulation#getClimateData()
	 * @see #getSimulation()
	 * @generated
	 */
	EReference getSimulation_ClimateData();

	/**
	 * Returns the meta object for class '{@link org.gemoc.agro.simulation.ActivityWork <em>Activity Work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity Work</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork
	 * @generated
	 */
	EClass getActivityWork();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Activity</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork#getActivity()
	 * @see #getActivityWork()
	 * @generated
	 */
	EReference getActivityWork_Activity();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getResourceAllocation <em>Resource Allocation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Resource Allocation</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork#getResourceAllocation()
	 * @see #getActivityWork()
	 * @generated
	 */
	EReference getActivityWork_ResourceAllocation();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getScheduledOn <em>Scheduled On</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Scheduled On</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork#getScheduledOn()
	 * @see #getActivityWork()
	 * @generated
	 */
	EReference getActivityWork_ScheduledOn();

	/**
	 * Returns the meta object for the reference '{@link org.gemoc.agro.simulation.ActivityWork#getOnSurface <em>On Surface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>On Surface</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork#getOnSurface()
	 * @see #getActivityWork()
	 * @generated
	 */
	EReference getActivityWork_OnSurface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.ActivityWork#getSchedulingFeedback <em>Scheduling Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduling Feedback</em>'.
	 * @see org.gemoc.agro.simulation.ActivityWork#getSchedulingFeedback()
	 * @see #getActivityWork()
	 * @generated
	 */
	EReference getActivityWork_SchedulingFeedback();

	/**
	 * Returns the meta object for class '{@link org.gemoc.agro.simulation.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see org.gemoc.agro.simulation.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getMonth <em>Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Month</em>'.
	 * @see org.gemoc.agro.simulation.Day#getMonth()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Month();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Day</em>'.
	 * @see org.gemoc.agro.simulation.Day#getDay()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Day();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getRain <em>Rain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rain</em>'.
	 * @see org.gemoc.agro.simulation.Day#getRain()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Rain();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getRay <em>Ray</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ray</em>'.
	 * @see org.gemoc.agro.simulation.Day#getRay()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Ray();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getETp <em>ETp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ETp</em>'.
	 * @see org.gemoc.agro.simulation.Day#getETp()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_ETp();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.Day#getTemperature <em>Temperature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Temperature</em>'.
	 * @see org.gemoc.agro.simulation.Day#getTemperature()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Temperature();

	/**
	 * Returns the meta object for class '{@link org.gemoc.agro.simulation.ClimateData <em>Climate Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Climate Data</em>'.
	 * @see org.gemoc.agro.simulation.ClimateData
	 * @generated
	 */
	EClass getClimateData();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.ClimateData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.gemoc.agro.simulation.ClimateData#getName()
	 * @see #getClimateData()
	 * @generated
	 */
	EAttribute getClimateData_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.gemoc.agro.simulation.ClimateData#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see org.gemoc.agro.simulation.ClimateData#getDays()
	 * @see #getClimateData()
	 * @generated
	 */
	EReference getClimateData_Days();

	/**
	 * Returns the meta object for class '{@link org.gemoc.agro.simulation.SchedulingFeedback <em>Scheduling Feedback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scheduling Feedback</em>'.
	 * @see org.gemoc.agro.simulation.SchedulingFeedback
	 * @generated
	 */
	EClass getSchedulingFeedback();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.SchedulingFeedback#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see org.gemoc.agro.simulation.SchedulingFeedback#getLevel()
	 * @see #getSchedulingFeedback()
	 * @generated
	 */
	EAttribute getSchedulingFeedback_Level();

	/**
	 * Returns the meta object for the attribute '{@link org.gemoc.agro.simulation.SchedulingFeedback#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see org.gemoc.agro.simulation.SchedulingFeedback#getMessage()
	 * @see #getSchedulingFeedback()
	 * @generated
	 */
	EAttribute getSchedulingFeedback_Message();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.agro.simulation.SchedulingStrategy <em>Scheduling Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheduling Strategy</em>'.
	 * @see org.gemoc.agro.simulation.SchedulingStrategy
	 * @generated
	 */
	EEnum getSchedulingStrategy();

	/**
	 * Returns the meta object for enum '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Feedback Level</em>'.
	 * @see org.gemoc.agro.simulation.FeedbackLevel
	 * @generated
	 */
	EEnum getFeedbackLevel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulationFactory getSimulationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.SimulationImpl <em>Simulation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.impl.SimulationImpl
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSimulation()
		 * @generated
		 */
		EClass SIMULATION = eINSTANCE.getSimulation();

		/**
		 * The meta object literal for the '<em><b>Exploitation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__EXPLOITATION = eINSTANCE.getSimulation_Exploitation();

		/**
		 * The meta object literal for the '<em><b>Scheduling Strategy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULATION__SCHEDULING_STRATEGY = eINSTANCE.getSimulation_SchedulingStrategy();

		/**
		 * The meta object literal for the '<em><b>Work To Do</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__WORK_TO_DO = eINSTANCE.getSimulation_WorkToDo();

		/**
		 * The meta object literal for the '<em><b>Climate Data</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SIMULATION__CLIMATE_DATA = eINSTANCE.getSimulation_ClimateData();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ActivityWorkImpl <em>Activity Work</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.impl.ActivityWorkImpl
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getActivityWork()
		 * @generated
		 */
		EClass ACTIVITY_WORK = eINSTANCE.getActivityWork();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_WORK__ACTIVITY = eINSTANCE.getActivityWork_Activity();

		/**
		 * The meta object literal for the '<em><b>Resource Allocation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_WORK__RESOURCE_ALLOCATION = eINSTANCE.getActivityWork_ResourceAllocation();

		/**
		 * The meta object literal for the '<em><b>Scheduled On</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_WORK__SCHEDULED_ON = eINSTANCE.getActivityWork_ScheduledOn();

		/**
		 * The meta object literal for the '<em><b>On Surface</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_WORK__ON_SURFACE = eINSTANCE.getActivityWork_OnSurface();

		/**
		 * The meta object literal for the '<em><b>Scheduling Feedback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_WORK__SCHEDULING_FEEDBACK = eINSTANCE.getActivityWork_SchedulingFeedback();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.impl.DayImpl
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '<em><b>Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__MONTH = eINSTANCE.getDay_Month();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__DAY = eINSTANCE.getDay_Day();

		/**
		 * The meta object literal for the '<em><b>Rain</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__RAIN = eINSTANCE.getDay_Rain();

		/**
		 * The meta object literal for the '<em><b>Ray</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__RAY = eINSTANCE.getDay_Ray();

		/**
		 * The meta object literal for the '<em><b>ETp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__ETP = eINSTANCE.getDay_ETp();

		/**
		 * The meta object literal for the '<em><b>Temperature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__TEMPERATURE = eINSTANCE.getDay_Temperature();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.ClimateDataImpl <em>Climate Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.impl.ClimateDataImpl
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getClimateData()
		 * @generated
		 */
		EClass CLIMATE_DATA = eINSTANCE.getClimateData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLIMATE_DATA__NAME = eINSTANCE.getClimateData_Name();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLIMATE_DATA__DAYS = eINSTANCE.getClimateData_Days();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl <em>Scheduling Feedback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.impl.SchedulingFeedbackImpl
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingFeedback()
		 * @generated
		 */
		EClass SCHEDULING_FEEDBACK = eINSTANCE.getSchedulingFeedback();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_FEEDBACK__LEVEL = eINSTANCE.getSchedulingFeedback_Level();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEDULING_FEEDBACK__MESSAGE = eINSTANCE.getSchedulingFeedback_Message();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.SchedulingStrategy <em>Scheduling Strategy</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.SchedulingStrategy
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getSchedulingStrategy()
		 * @generated
		 */
		EEnum SCHEDULING_STRATEGY = eINSTANCE.getSchedulingStrategy();

		/**
		 * The meta object literal for the '{@link org.gemoc.agro.simulation.FeedbackLevel <em>Feedback Level</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.gemoc.agro.simulation.FeedbackLevel
		 * @see org.gemoc.agro.simulation.impl.SimulationPackageImpl#getFeedbackLevel()
		 * @generated
		 */
		EEnum FEEDBACK_LEVEL = eINSTANCE.getFeedbackLevel();

	}

} //SimulationPackage
