/**
 */
package org.gemoc.agro.simulation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.gemoc.agro.activitiesDSL.ActivitiesDSLPackage;

import org.gemoc.agro.exploitation.ExploitationPackage;

import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.Day;
import org.gemoc.agro.simulation.SchedulingStrategy;
import org.gemoc.agro.simulation.Simulation;
import org.gemoc.agro.simulation.SimulationFactory;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationPackageImpl extends EPackageImpl implements SimulationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simulationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityWorkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass climateDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum schedulingStrategyEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.gemoc.agro.simulation.SimulationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SimulationPackageImpl() {
		super(eNS_URI, SimulationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SimulationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SimulationPackage init() {
		if (isInited) return (SimulationPackage)EPackage.Registry.INSTANCE.getEPackage(SimulationPackage.eNS_URI);

		// Obtain or create and register package
		SimulationPackageImpl theSimulationPackage = (SimulationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SimulationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SimulationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExploitationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSimulationPackage.createPackageContents();

		// Initialize created meta-data
		theSimulationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSimulationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SimulationPackage.eNS_URI, theSimulationPackage);
		return theSimulationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimulation() {
		return simulationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_Exploitation() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimulation_SchedulingStrategy() {
		return (EAttribute)simulationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_WorkToDo() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimulation_ClimateData() {
		return (EReference)simulationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityWork() {
		return activityWorkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityWork_Activity() {
		return (EReference)activityWorkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityWork_ResourceAllocation() {
		return (EReference)activityWorkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityWork_ScheduledOn() {
		return (EReference)activityWorkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityWork_OnSurface() {
		return (EReference)activityWorkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDay() {
		return dayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Month() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Day() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Rain() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Ray() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_ETp() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDay_Temperature() {
		return (EAttribute)dayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClimateData() {
		return climateDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClimateData_Name() {
		return (EAttribute)climateDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClimateData_Days() {
		return (EReference)climateDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSchedulingStrategy() {
		return schedulingStrategyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationFactory getSimulationFactory() {
		return (SimulationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		simulationEClass = createEClass(SIMULATION);
		createEReference(simulationEClass, SIMULATION__EXPLOITATION);
		createEAttribute(simulationEClass, SIMULATION__SCHEDULING_STRATEGY);
		createEReference(simulationEClass, SIMULATION__WORK_TO_DO);
		createEReference(simulationEClass, SIMULATION__CLIMATE_DATA);

		activityWorkEClass = createEClass(ACTIVITY_WORK);
		createEReference(activityWorkEClass, ACTIVITY_WORK__ACTIVITY);
		createEReference(activityWorkEClass, ACTIVITY_WORK__RESOURCE_ALLOCATION);
		createEReference(activityWorkEClass, ACTIVITY_WORK__SCHEDULED_ON);
		createEReference(activityWorkEClass, ACTIVITY_WORK__ON_SURFACE);

		dayEClass = createEClass(DAY);
		createEAttribute(dayEClass, DAY__MONTH);
		createEAttribute(dayEClass, DAY__DAY);
		createEAttribute(dayEClass, DAY__RAIN);
		createEAttribute(dayEClass, DAY__RAY);
		createEAttribute(dayEClass, DAY__ETP);
		createEAttribute(dayEClass, DAY__TEMPERATURE);

		climateDataEClass = createEClass(CLIMATE_DATA);
		createEAttribute(climateDataEClass, CLIMATE_DATA__NAME);
		createEReference(climateDataEClass, CLIMATE_DATA__DAYS);

		// Create enums
		schedulingStrategyEEnum = createEEnum(SCHEDULING_STRATEGY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExploitationPackage theExploitationPackage = (ExploitationPackage)EPackage.Registry.INSTANCE.getEPackage(ExploitationPackage.eNS_URI);
		ActivitiesDSLPackage theActivitiesDSLPackage = (ActivitiesDSLPackage)EPackage.Registry.INSTANCE.getEPackage(ActivitiesDSLPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(simulationEClass, Simulation.class, "Simulation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSimulation_Exploitation(), theExploitationPackage.getExploitation(), null, "exploitation", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSimulation_SchedulingStrategy(), this.getSchedulingStrategy(), "schedulingStrategy", null, 0, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_WorkToDo(), this.getActivityWork(), null, "workToDo", null, 0, -1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSimulation_ClimateData(), this.getClimateData(), null, "climateData", null, 1, 1, Simulation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(activityWorkEClass, ActivityWork.class, "ActivityWork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityWork_Activity(), theActivitiesDSLPackage.getExploitationActivity(), null, "activity", null, 1, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityWork_ResourceAllocation(), theExploitationPackage.getResource(), null, "resourceAllocation", null, 1, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityWork_ScheduledOn(), this.getDay(), null, "scheduledOn", null, 0, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityWork_OnSurface(), theExploitationPackage.getSurface(), null, "onSurface", null, 0, 1, ActivityWork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dayEClass, Day.class, "Day", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDay_Month(), theActivitiesDSLPackage.getMonth(), "month", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_Day(), ecorePackage.getEInt(), "day", "1", 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_Rain(), ecorePackage.getEFloat(), "rain", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_Ray(), ecorePackage.getEFloat(), "ray", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_ETp(), ecorePackage.getEInt(), "ETp", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDay_Temperature(), ecorePackage.getEFloat(), "temperature", null, 0, 1, Day.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(climateDataEClass, ClimateData.class, "ClimateData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClimateData_Name(), ecorePackage.getEString(), "name", null, 0, 1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClimateData_Days(), this.getDay(), null, "days", null, 1, -1, ClimateData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(schedulingStrategyEEnum, SchedulingStrategy.class, "SchedulingStrategy");
		addEEnumLiteral(schedulingStrategyEEnum, SchedulingStrategy.RANDOM);

		// Create resource
		createResource(eNS_URI);
	}

} //SimulationPackageImpl
