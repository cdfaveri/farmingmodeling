/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.exploitation.Exploitation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getExploitation <em>Exploitation</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getSchedulingStrategy <em>Scheduling Strategy</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getWorkToDo <em>Work To Do</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getClimateData <em>Climate Data</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getAllocations <em>Allocations</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Schedule#getCurrentDay <em>Current Day</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule()
 * @model
 * @generated
 */
public interface Schedule extends EObject  {
	/**
	 * Returns the value of the '<em><b>Exploitation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exploitation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exploitation</em>' reference.
	 * @see #setExploitation(Exploitation)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_Exploitation()
	 * @model
	 * @generated
	 */
	Exploitation getExploitation();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Schedule#getExploitation <em>Exploitation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exploitation</em>' reference.
	 * @see #getExploitation()
	 * @generated
	 */
	void setExploitation(Exploitation value);

	/**
	 * Returns the value of the '<em><b>Scheduling Strategy</b></em>' attribute.
	 * The literals are from the enumeration {@link org.gemoc.agro.simulation.SchedulingStrategy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduling Strategy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduling Strategy</em>' attribute.
	 * @see org.gemoc.agro.simulation.SchedulingStrategy
	 * @see #setSchedulingStrategy(SchedulingStrategy)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_SchedulingStrategy()
	 * @model
	 * @generated
	 */
	SchedulingStrategy getSchedulingStrategy();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Schedule#getSchedulingStrategy <em>Scheduling Strategy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scheduling Strategy</em>' attribute.
	 * @see org.gemoc.agro.simulation.SchedulingStrategy
	 * @see #getSchedulingStrategy()
	 * @generated
	 */
	void setSchedulingStrategy(SchedulingStrategy value);

	/**
	 * Returns the value of the '<em><b>Work To Do</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.agro.simulation.ActivityWork}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Work To Do</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Work To Do</em>' containment reference list.
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_WorkToDo()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityWork> getWorkToDo();

	/**
	 * Returns the value of the '<em><b>Climate Data</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Climate Data</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Climate Data</em>' reference.
	 * @see #setClimateData(ClimateData)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_ClimateData()
	 * @model required="true"
	 * @generated
	 */
	ClimateData getClimateData();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Schedule#getClimateData <em>Climate Data</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Climate Data</em>' reference.
	 * @see #getClimateData()
	 * @generated
	 */
	void setClimateData(ClimateData value);

	/**
	 * Returns the value of the '<em><b>Solver Search Seconds Spent Limit</b></em>' attribute.
	 * The default value is <code>"5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Solver Search Seconds Spent Limit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Solver Search Seconds Spent Limit</em>' attribute.
	 * @see #setSolverSearchSecondsSpentLimit(int)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_SolverSearchSecondsSpentLimit()
	 * @model default="5"
	 * @generated
	 */
	int getSolverSearchSecondsSpentLimit();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Schedule#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Search Seconds Spent Limit</em>' attribute.
	 * @see #getSolverSearchSecondsSpentLimit()
	 * @generated
	 */
	void setSolverSearchSecondsSpentLimit(int value);

	/**
	 * Returns the value of the '<em><b>Allocations</b></em>' containment reference list.
	 * The list contents are of type {@link org.gemoc.agro.simulation.ResourceAllocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allocations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allocations</em>' containment reference list.
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_Allocations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ResourceAllocation> getAllocations();

	/**
	 * Returns the value of the '<em><b>Current Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Day</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Day</em>' reference.
	 * @see #setCurrentDay(Day)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSchedule_CurrentDay()
	 * @model transient="true"
	 * @generated
	 */
	Day getCurrentDay();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Schedule#getCurrentDay <em>Current Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Day</em>' reference.
	 * @see #getCurrentDay()
	 * @generated
	 */
	void setCurrentDay(Day value);

} // Schedule
