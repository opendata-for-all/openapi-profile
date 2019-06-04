/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.SecurityDefinitions;
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

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl#getSecuritySchemes <em>Security Schemes</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityDefinitionsImpl extends MinimalEObjectImpl.Container implements SecurityDefinitions {
	/**
	 * The cached value of the '{@link #getSecuritySchemes() <em>Security Schemes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<edu.som.uoc.openapiprofile.SecurityScheme> securitySchemes;

	/**
	 * The cached value of the '{@link #getBase_Model() <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Model()
	 * @generated
	 * @ordered
	 */
	protected Model base_Model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityDefinitionsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.SECURITY_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<edu.som.uoc.openapiprofile.SecurityScheme> getSecuritySchemes() {
		if (securitySchemes == null) {
			securitySchemes = new EObjectContainmentEList<edu.som.uoc.openapiprofile.SecurityScheme>(edu.som.uoc.openapiprofile.SecurityScheme.class, this, OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES);
		}
		return securitySchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getBase_Model() {
		if (base_Model != null && base_Model.eIsProxy()) {
			InternalEObject oldBase_Model = (InternalEObject)base_Model;
			base_Model = (Model)eResolveProxy(oldBase_Model);
			if (base_Model != oldBase_Model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL, oldBase_Model, base_Model));
			}
		}
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetBase_Model() {
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Model(Model newBase_Model) {
		Model oldBase_Model = base_Model;
		base_Model = newBase_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				return ((InternalEList<?>)getSecuritySchemes()).basicRemove(otherEnd, msgs);
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
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				return getSecuritySchemes();
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
				if (resolve) return getBase_Model();
				return basicGetBase_Model();
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
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				getSecuritySchemes().addAll((Collection<? extends edu.som.uoc.openapiprofile.SecurityScheme>)newValue);
				return;
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
				setBase_Model((Model)newValue);
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
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				return;
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
				setBase_Model((Model)null);
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
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				return securitySchemes != null && !securitySchemes.isEmpty();
			case OpenapiprofilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
				return base_Model != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityDefinitionsImpl
