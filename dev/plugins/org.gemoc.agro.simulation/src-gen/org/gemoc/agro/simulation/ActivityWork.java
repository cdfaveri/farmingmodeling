/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.agro.activitiesDSL.ExploitationActivity;

import org.gemoc.agro.exploitation.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.ActivityWork#getResourceAllocation <em>Resource Allocation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork()
 * @model
 * @generated
 */
public interface ActivityWork extends EObject {
	/**
	 * Returns the value of the '<em><b>Activity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Activity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' reference.
	 * @see #setActivity(ExploitationActivity)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_Activity()
	 * @model required="true"
	 * @generated
	 */
	ExploitationActivity getActivity();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getActivity <em>Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(ExploitationActivity value);

	/**
	 * Returns the value of the '<em><b>Resource Allocation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Allocation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Allocation</em>' reference.
	 * @see #setResourceAllocation(Resource)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getActivityWork_ResourceAllocation()
	 * @model required="true"
	 * @generated
	 */
	Resource getResourceAllocation();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.ActivityWork#getResourceAllocation <em>Resource Allocation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Allocation</em>' reference.
	 * @see #getResourceAllocation()
	 * @generated
	 */
	void setResourceAllocation(Resource value);

} // ActivityWork
