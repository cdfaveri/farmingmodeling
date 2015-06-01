/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.gemoc.agro.exploitation.Exploitation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.Simulation#getExploitation <em>Exploitation</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Simulation#getSchedulingStrategy <em>Scheduling Strategy</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Simulation#getWorkToDo <em>Work To Do</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Simulation#getClimateData <em>Climate Data</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Simulation#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation()
 * @model
 * @generated
 */
public interface Simulation extends EObject  {
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
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation_Exploitation()
	 * @model
	 * @generated
	 */
	Exploitation getExploitation();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Simulation#getExploitation <em>Exploitation</em>}' reference.
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
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation_SchedulingStrategy()
	 * @model
	 * @generated
	 */
	SchedulingStrategy getSchedulingStrategy();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Simulation#getSchedulingStrategy <em>Scheduling Strategy</em>}' attribute.
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
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation_WorkToDo()
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
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation_ClimateData()
	 * @model required="true"
	 * @generated
	 */
	ClimateData getClimateData();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Simulation#getClimateData <em>Climate Data</em>}' reference.
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
	 * @see #setSolverSearchSecondsSpentLimit(long)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getSimulation_SolverSearchSecondsSpentLimit()
	 * @model default="5" dataType="org.eclipse.emf.ecore.xml.type.Long"
	 * @generated
	 */
	long getSolverSearchSecondsSpentLimit();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Simulation#getSolverSearchSecondsSpentLimit <em>Solver Search Seconds Spent Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solver Search Seconds Spent Limit</em>' attribute.
	 * @see #getSolverSearchSecondsSpentLimit()
	 * @generated
	 */
	void setSolverSearchSecondsSpentLimit(long value);

} // Simulation
