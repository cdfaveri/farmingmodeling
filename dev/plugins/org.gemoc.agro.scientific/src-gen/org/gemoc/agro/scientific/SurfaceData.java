/**
 */
package org.gemoc.agro.scientific;

import org.eclipse.emf.ecore.EObject;

import org.gemoc.agro.exploitation.Surface;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getHydroDeficit <em>Hydro Deficit</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getExtraWater <em>Extra Water</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.SurfaceData#getSurface <em>Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData()
 * @model
 * @generated
 */
public interface SurfaceData extends EObject {
	/**
	 * Returns the value of the '<em><b>Hydro Deficit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hydro Deficit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hydro Deficit</em>' attribute.
	 * @see #setHydroDeficit(float)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_HydroDeficit()
	 * @model
	 * @generated
	 */
	float getHydroDeficit();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getHydroDeficit <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hydro Deficit</em>' attribute.
	 * @see #getHydroDeficit()
	 * @generated
	 */
	void setHydroDeficit(float value);

	/**
	 * Returns the value of the '<em><b>Extra Water</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Extra Water</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extra Water</em>' attribute.
	 * @see #setExtraWater(float)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_ExtraWater()
	 * @model
	 * @generated
	 */
	float getExtraWater();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getExtraWater <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Water</em>' attribute.
	 * @see #getExtraWater()
	 * @generated
	 */
	void setExtraWater(float value);

	/**
	 * Returns the value of the '<em><b>Surface</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface</em>' reference.
	 * @see #setSurface(Surface)
	 * @see org.gemoc.agro.scientific.ScientificPackage#getSurfaceData_Surface()
	 * @model
	 * @generated
	 */
	Surface getSurface();

	/**
	 * Sets the value of the '{@link org.gemoc.agro.scientific.SurfaceData#getSurface <em>Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surface</em>' reference.
	 * @see #getSurface()
	 * @generated
	 */
	void setSurface(Surface value);

} // SurfaceData
