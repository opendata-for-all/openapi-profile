/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.SecurityRequirements;

import edu.som.uoc.openapiprofile.types.SecurityRequirement;

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
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementsImpl extends MinimalEObjectImpl.Container implements SecurityRequirements {
	/**
	 * The cached value of the '{@link #getSecurityRequirements() <em>Security Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> securityRequirements;

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
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.SECURITY_REQUIREMENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRequirement> getSecurityRequirements() {
		if (securityRequirements == null) {
			securityRequirements = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS);
		}
		return securityRequirements;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL, oldBase_Model, base_Model));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS:
				return ((InternalEList<?>)getSecurityRequirements()).basicRemove(otherEnd, msgs);
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
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS:
				return getSecurityRequirements();
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL:
				if (resolve) return getBase_Model();
				return basicGetBase_Model();
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
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
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				getSecurityRequirements().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL:
				setBase_Model((Model)newValue);
				return;
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
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
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				return;
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL:
				setBase_Model((Model)null);
				return;
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION:
				setBase_Operation((Operation)null);
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
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS:
				return securityRequirements != null && !securityRequirements.isEmpty();
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_MODEL:
				return base_Model != null;
			case OpenapiprofilePackage.SECURITY_REQUIREMENTS__BASE_OPERATION:
				return base_Operation != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementsImpl
