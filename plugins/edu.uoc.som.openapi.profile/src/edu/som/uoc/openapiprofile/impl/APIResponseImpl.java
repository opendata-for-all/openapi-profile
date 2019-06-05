/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.APIResponse;
import edu.som.uoc.openapiprofile.Example;
import edu.som.uoc.openapiprofile.Header;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;

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

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl#getCode <em>Code</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIResponseImpl extends MinimalEObjectImpl.Container implements APIResponse {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCode()
	 * @generated
	 * @ordered
	 */
	protected String code = CODE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<Header> headers;

	/**
	 * The cached value of the '{@link #getExamples() <em>Examples</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExamples()
	 * @generated
	 * @ordered
	 */
	protected EList<Example> examples;

	/**
	 * The cached value of the '{@link #getBase_Parameter() <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Parameter()
	 * @generated
	 * @ordered
	 */
	protected Parameter base_Parameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.API_RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_RESPONSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCode() {
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCode(String newCode) {
		String oldCode = code;
		code = newCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_RESPONSE__CODE, oldCode, code));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Header> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<Header>(Header.class, this, OpenapiprofilePackage.API_RESPONSE__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Example> getExamples() {
		if (examples == null) {
			examples = new EObjectContainmentEList<Example>(Example.class, this, OpenapiprofilePackage.API_RESPONSE__EXAMPLES);
		}
		return examples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter getBase_Parameter() {
		if (base_Parameter != null && base_Parameter.eIsProxy()) {
			InternalEObject oldBase_Parameter = (InternalEObject)base_Parameter;
			base_Parameter = (Parameter)eResolveProxy(oldBase_Parameter);
			if (base_Parameter != oldBase_Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
			}
		}
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter basicGetBase_Parameter() {
		return base_Parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Parameter(Parameter newBase_Parameter) {
		Parameter oldBase_Parameter = base_Parameter;
		base_Parameter = newBase_Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiprofilePackage.API_RESPONSE__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
			case OpenapiprofilePackage.API_RESPONSE__EXAMPLES:
				return ((InternalEList<?>)getExamples()).basicRemove(otherEnd, msgs);
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
			case OpenapiprofilePackage.API_RESPONSE__DESCRIPTION:
				return getDescription();
			case OpenapiprofilePackage.API_RESPONSE__CODE:
				return getCode();
			case OpenapiprofilePackage.API_RESPONSE__HEADERS:
				return getHeaders();
			case OpenapiprofilePackage.API_RESPONSE__EXAMPLES:
				return getExamples();
			case OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
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
			case OpenapiprofilePackage.API_RESPONSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiprofilePackage.API_RESPONSE__CODE:
				setCode((String)newValue);
				return;
			case OpenapiprofilePackage.API_RESPONSE__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends Header>)newValue);
				return;
			case OpenapiprofilePackage.API_RESPONSE__EXAMPLES:
				getExamples().clear();
				getExamples().addAll((Collection<? extends Example>)newValue);
				return;
			case OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER:
				setBase_Parameter((Parameter)newValue);
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
			case OpenapiprofilePackage.API_RESPONSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_RESPONSE__CODE:
				setCode(CODE_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_RESPONSE__HEADERS:
				getHeaders().clear();
				return;
			case OpenapiprofilePackage.API_RESPONSE__EXAMPLES:
				getExamples().clear();
				return;
			case OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER:
				setBase_Parameter((Parameter)null);
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
			case OpenapiprofilePackage.API_RESPONSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiprofilePackage.API_RESPONSE__CODE:
				return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
			case OpenapiprofilePackage.API_RESPONSE__HEADERS:
				return headers != null && !headers.isEmpty();
			case OpenapiprofilePackage.API_RESPONSE__EXAMPLES:
				return examples != null && !examples.isEmpty();
			case OpenapiprofilePackage.API_RESPONSE__BASE_PARAMETER:
				return base_Parameter != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", code: ");
		result.append(code);
		result.append(')');
		return result.toString();
	}

} //APIResponseImpl
