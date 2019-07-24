/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;
import edu.uoc.som.openapi2.profile.SecurityDefinitions;
import edu.uoc.som.openapi2.profile.SecurityScheme;

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
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecurityDefinitionsImpl#getSecuritySchemes <em>Security Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecurityDefinitionsImpl#getBase_Model <em>Base Model</em>}</li>
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
	protected EList<SecurityScheme> securitySchemes;

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
		return OpenAPIProfilePackage.Literals.SECURITY_DEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScheme> getSecuritySchemes() {
		if (securitySchemes == null) {
			securitySchemes = new EObjectContainmentEList<SecurityScheme>(SecurityScheme.class, this, OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES);
		}
		return securitySchemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Model getBase_Model() {
		if (base_Model != null && base_Model.eIsProxy()) {
			InternalEObject oldBase_Model = (InternalEObject)base_Model;
			base_Model = (Model)eResolveProxy(oldBase_Model);
			if (base_Model != oldBase_Model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL, oldBase_Model, base_Model));
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
	@Override
	public void setBase_Model(Model newBase_Model) {
		Model oldBase_Model = base_Model;
		base_Model = newBase_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
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
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				return getSecuritySchemes();
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
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
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				getSecuritySchemes().addAll((Collection<? extends SecurityScheme>)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
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
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				getSecuritySchemes().clear();
				return;
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
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
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__SECURITY_SCHEMES:
				return securitySchemes != null && !securitySchemes.isEmpty();
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS__BASE_MODEL:
				return base_Model != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityDefinitionsImpl
