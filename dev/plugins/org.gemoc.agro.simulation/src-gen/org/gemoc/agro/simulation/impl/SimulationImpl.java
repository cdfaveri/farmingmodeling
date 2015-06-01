/**
 */
package org.gemoc.agro.simulation.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.gemoc.agro.exploitation.Exploitation;
import org.gemoc.agro.simulation.ActivityWork;
import org.gemoc.agro.simulation.ClimateData;
import org.gemoc.agro.simulation.SchedulingStrategy;
import org.gemoc.agro.simulation.Simulation;
import org.gemoc.agro.simulation.SimulationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.impl.SimulationImpl#getExploitation <em>Exploitation</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.SimulationImpl#getSchedulingStrategy <em>Scheduling Strategy</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.SimulationImpl#getWorkToDo <em>Work To Do</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.SimulationImpl#getClimateData <em>Climate Data</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.impl.SimulationImpl#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulationImpl extends MinimalEObjectImpl.Container implements Simulation {
	/**
	 * The cached value of the '{@link #getExploitation() <em>Exploitation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExploitation()
	 * @generated
	 * @ordered
	 */
	protected Exploitation exploitation;

	/**
	 * The default value of the '{@link #getSchedulingStrategy() <em>Scheduling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingStrategy()
	 * @generated
	 * @ordered
	 */
	protected static final SchedulingStrategy SCHEDULING_STRATEGY_EDEFAULT = SchedulingStrategy.RANDOM;

	/**
	 * The cached value of the '{@link #getSchedulingStrategy() <em>Scheduling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedulingStrategy()
	 * @generated
	 * @ordered
	 */
	protected SchedulingStrategy schedulingStrategy = SCHEDULING_STRATEGY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getWorkToDo() <em>Work To Do</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkToDo()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityWork> workToDo;

	/**
	 * The cached value of the '{@link #getClimateData() <em>Climate Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClimateData()
	 * @generated
	 * @ordered
	 */
	protected ClimateData climateData;

	/**
	 * The default value of the '{@link #getSolverSearchSecondsSpentLimit() <em>Solver Search Seconds Spent Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverSearchSecondsSpentLimit()
	 * @generated
	 * @ordered
	 */
	protected static final long SOLVER_SEARCH_SECONDS_SPENT_LIMIT_EDEFAULT = 5L;

	/**
	 * The cached value of the '{@link #getSolverSearchSecondsSpentLimit() <em>Solver Search Seconds Spent Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolverSearchSecondsSpentLimit()
	 * @generated
	 * @ordered
	 */
	protected long solverSearchSecondsSpentLimit = SOLVER_SEARCH_SECONDS_SPENT_LIMIT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulationPackage.Literals.SIMULATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exploitation getExploitation() {
		if (exploitation != null && exploitation.eIsProxy()) {
			InternalEObject oldExploitation = (InternalEObject)exploitation;
			exploitation = (Exploitation)eResolveProxy(oldExploitation);
			if (exploitation != oldExploitation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.SIMULATION__EXPLOITATION, oldExploitation, exploitation));
			}
		}
		return exploitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Exploitation basicGetExploitation() {
		return exploitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExploitation(Exploitation newExploitation) {
		Exploitation oldExploitation = exploitation;
		exploitation = newExploitation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SIMULATION__EXPLOITATION, oldExploitation, exploitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchedulingStrategy getSchedulingStrategy() {
		return schedulingStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchedulingStrategy(SchedulingStrategy newSchedulingStrategy) {
		SchedulingStrategy oldSchedulingStrategy = schedulingStrategy;
		schedulingStrategy = newSchedulingStrategy == null ? SCHEDULING_STRATEGY_EDEFAULT : newSchedulingStrategy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SIMULATION__SCHEDULING_STRATEGY, oldSchedulingStrategy, schedulingStrategy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityWork> getWorkToDo() {
		if (workToDo == null) {
			workToDo = new EObjectContainmentEList<ActivityWork>(ActivityWork.class, this, SimulationPackage.SIMULATION__WORK_TO_DO);
		}
		return workToDo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClimateData getClimateData() {
		if (climateData != null && climateData.eIsProxy()) {
			InternalEObject oldClimateData = (InternalEObject)climateData;
			climateData = (ClimateData)eResolveProxy(oldClimateData);
			if (climateData != oldClimateData) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulationPackage.SIMULATION__CLIMATE_DATA, oldClimateData, climateData));
			}
		}
		return climateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClimateData basicGetClimateData() {
		return climateData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClimateData(ClimateData newClimateData) {
		ClimateData oldClimateData = climateData;
		climateData = newClimateData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SIMULATION__CLIMATE_DATA, oldClimateData, climateData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getSolverSearchSecondsSpentLimit() {
		return solverSearchSecondsSpentLimit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolverSearchSecondsSpentLimit(long newSolverSearchSecondsSpentLimit) {
		long oldSolverSearchSecondsSpentLimit = solverSearchSecondsSpentLimit;
		solverSearchSecondsSpentLimit = newSolverSearchSecondsSpentLimit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulationPackage.SIMULATION__SOLVER_SEARCH_SECONDS_SPENT_LIMIT, oldSolverSearchSecondsSpentLimit, solverSearchSecondsSpentLimit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulationPackage.SIMULATION__WORK_TO_DO:
				return ((InternalEList<?>)getWorkToDo()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulationPackage.SIMULATION__EXPLOITATION:
				if (resolve) return getExploitation();
				return basicGetExploitation();
			case SimulationPackage.SIMULATION__SCHEDULING_STRATEGY:
				return getSchedulingStrategy();
			case SimulationPackage.SIMULATION__WORK_TO_DO:
				return getWorkToDo();
			case SimulationPackage.SIMULATION__CLIMATE_DATA:
				if (resolve) return getClimateData();
				return basicGetClimateData();
			case SimulationPackage.SIMULATION__SOLVER_SEARCH_SECONDS_SPENT_LIMIT:
				return getSolverSearchSecondsSpentLimit();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulationPackage.SIMULATION__EXPLOITATION:
				setExploitation((Exploitation)newValue);
				return;
			case SimulationPackage.SIMULATION__SCHEDULING_STRATEGY:
				setSchedulingStrategy((SchedulingStrategy)newValue);
				return;
			case SimulationPackage.SIMULATION__WORK_TO_DO:
				getWorkToDo().clear();
				getWorkToDo().addAll((Collection<? extends ActivityWork>)newValue);
				return;
			case SimulationPackage.SIMULATION__CLIMATE_DATA:
				setClimateData((ClimateData)newValue);
				return;
			case SimulationPackage.SIMULATION__SOLVER_SEARCH_SECONDS_SPENT_LIMIT:
				setSolverSearchSecondsSpentLimit((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimulationPackage.SIMULATION__EXPLOITATION:
				setExploitation((Exploitation)null);
				return;
			case SimulationPackage.SIMULATION__SCHEDULING_STRATEGY:
				setSchedulingStrategy(SCHEDULING_STRATEGY_EDEFAULT);
				return;
			case SimulationPackage.SIMULATION__WORK_TO_DO:
				getWorkToDo().clear();
				return;
			case SimulationPackage.SIMULATION__CLIMATE_DATA:
				setClimateData((ClimateData)null);
				return;
			case SimulationPackage.SIMULATION__SOLVER_SEARCH_SECONDS_SPENT_LIMIT:
				setSolverSearchSecondsSpentLimit(SOLVER_SEARCH_SECONDS_SPENT_LIMIT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimulationPackage.SIMULATION__EXPLOITATION:
				return exploitation != null;
			case SimulationPackage.SIMULATION__SCHEDULING_STRATEGY:
				return schedulingStrategy != SCHEDULING_STRATEGY_EDEFAULT;
			case SimulationPackage.SIMULATION__WORK_TO_DO:
				return workToDo != null && !workToDo.isEmpty();
			case SimulationPackage.SIMULATION__CLIMATE_DATA:
				return climateData != null;
			case SimulationPackage.SIMULATION__SOLVER_SEARCH_SECONDS_SPENT_LIMIT:
				return solverSearchSecondsSpentLimit != SOLVER_SEARCH_SECONDS_SPENT_LIMIT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (schedulingStrategy: ");
		result.append(schedulingStrategy);
		result.append(", solverSearchSecondsSpentLimit: ");
		result.append(solverSearchSecondsSpentLimit);
		result.append(')');
		return result.toString();
	}

} //SimulationImpl
