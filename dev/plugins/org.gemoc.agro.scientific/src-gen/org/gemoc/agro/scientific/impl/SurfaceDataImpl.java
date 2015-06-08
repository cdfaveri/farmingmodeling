/**
 */
package org.gemoc.agro.scientific.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.gemoc.agro.exploitation.Surface;

import org.gemoc.agro.scientific.ScientificPackage;
import org.gemoc.agro.scientific.SurfaceData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getHydroDeficit <em>Hydro Deficit</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getExtraWater <em>Extra Water</em>}</li>
 *   <li>{@link org.gemoc.agro.scientific.impl.SurfaceDataImpl#getSurface <em>Surface</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SurfaceDataImpl extends MinimalEObjectImpl.Container implements SurfaceData {
	/**
	 * The default value of the '{@link #getHydroDeficit() <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroDeficit()
	 * @generated
	 * @ordered
	 */
	protected static final float HYDRO_DEFICIT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getHydroDeficit() <em>Hydro Deficit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHydroDeficit()
	 * @generated
	 * @ordered
	 */
	protected float hydroDeficit = HYDRO_DEFICIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExtraWater() <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWater()
	 * @generated
	 * @ordered
	 */
	protected static final float EXTRA_WATER_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getExtraWater() <em>Extra Water</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraWater()
	 * @generated
	 * @ordered
	 */
	protected float extraWater = EXTRA_WATER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSurface() <em>Surface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurface()
	 * @generated
	 * @ordered
	 */
	protected Surface surface;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ScientificPackage.Literals.SURFACE_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getHydroDeficit() {
		return hydroDeficit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHydroDeficit(float newHydroDeficit) {
		float oldHydroDeficit = hydroDeficit;
		hydroDeficit = newHydroDeficit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT, oldHydroDeficit, hydroDeficit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getExtraWater() {
		return extraWater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtraWater(float newExtraWater) {
		float oldExtraWater = extraWater;
		extraWater = newExtraWater;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__EXTRA_WATER, oldExtraWater, extraWater));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface getSurface() {
		if (surface != null && surface.eIsProxy()) {
			InternalEObject oldSurface = (InternalEObject)surface;
			surface = (Surface)eResolveProxy(oldSurface);
			if (surface != oldSurface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ScientificPackage.SURFACE_DATA__SURFACE, oldSurface, surface));
			}
		}
		return surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Surface basicGetSurface() {
		return surface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurface(Surface newSurface) {
		Surface oldSurface = surface;
		surface = newSurface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ScientificPackage.SURFACE_DATA__SURFACE, oldSurface, surface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				return getHydroDeficit();
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				return getExtraWater();
			case ScientificPackage.SURFACE_DATA__SURFACE:
				if (resolve) return getSurface();
				return basicGetSurface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				setHydroDeficit((Float)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				setExtraWater((Float)newValue);
				return;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				setSurface((Surface)newValue);
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
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				setHydroDeficit(HYDRO_DEFICIT_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				setExtraWater(EXTRA_WATER_EDEFAULT);
				return;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				setSurface((Surface)null);
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
			case ScientificPackage.SURFACE_DATA__HYDRO_DEFICIT:
				return hydroDeficit != HYDRO_DEFICIT_EDEFAULT;
			case ScientificPackage.SURFACE_DATA__EXTRA_WATER:
				return extraWater != EXTRA_WATER_EDEFAULT;
			case ScientificPackage.SURFACE_DATA__SURFACE:
				return surface != null;
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
		result.append(" (hydroDeficit: ");
		result.append(hydroDeficit);
		result.append(", extraWater: ");
		result.append(extraWater);
		result.append(')');
		return result.toString();
	}

} //SurfaceDataImpl
