/**
 */
package org.gemoc.agro.simulation;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Climate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.simulation.Climate#getRain <em>Rain</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Climate#getRay <em>Ray</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Climate#getETp <em>ETp</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Climate#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link org.gemoc.agro.simulation.Climate#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate()
 * @model
 * @generated
 */
public interface Climate extends EObject {
	/**
	 * Returns the value of the '<em><b>Rain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rain</em>' attribute.
	 * @see #setRain(int)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate_Rain()
	 * @model
	 * @generated
	 */
	int getRain();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Climate#getRain <em>Rain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rain</em>' attribute.
	 * @see #getRain()
	 * @generated
	 */
	void setRain(int value);

	/**
	 * Returns the value of the '<em><b>Ray</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ray</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ray</em>' attribute.
	 * @see #setRay(int)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate_Ray()
	 * @model
	 * @generated
	 */
	int getRay();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Climate#getRay <em>Ray</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ray</em>' attribute.
	 * @see #getRay()
	 * @generated
	 */
	void setRay(int value);

	/**
	 * Returns the value of the '<em><b>ETp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ETp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETp</em>' attribute.
	 * @see #setETp(int)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate_ETp()
	 * @model
	 * @generated
	 */
	int getETp();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Climate#getETp <em>ETp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETp</em>' attribute.
	 * @see #getETp()
	 * @generated
	 */
	void setETp(int value);

	/**
	 * Returns the value of the '<em><b>Temperature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Temperature</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temperature</em>' attribute.
	 * @see #setTemperature(int)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate_Temperature()
	 * @model
	 * @generated
	 */
	int getTemperature();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Climate#getTemperature <em>Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Temperature</em>' attribute.
	 * @see #getTemperature()
	 * @generated
	 */
	void setTemperature(int value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(ClimateDefinition)
	 * @see org.gemoc.agro.simulation.SimulationPackage#getClimate_From()
	 * @model
	 * @generated
	 */
	ClimateDefinition getFrom();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.simulation.Climate#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(ClimateDefinition value);

} // Climate
