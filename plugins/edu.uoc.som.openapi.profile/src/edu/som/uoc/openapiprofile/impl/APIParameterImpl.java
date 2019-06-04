/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.APIParameter;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;

import edu.som.uoc.openapiprofile.types.CollectionFormat;
import edu.som.uoc.openapiprofile.types.JSONSchemaConstraints;
import edu.som.uoc.openapiprofile.types.ParameterLocation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getAllowEmptyValues <em>Allow Empty Values</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIParameterImpl extends MinimalEObjectImpl.Container implements APIParameter {
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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation LOCATION_EDEFAULT = ParameterLocation.UNDEFINED;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAllowEmptyValues() <em>Allow Empty Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyValues()
	 * @generated
	 * @ordered
	 */
	protected static final Object ALLOW_EMPTY_VALUES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmptyValues() <em>Allow Empty Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyValues()
	 * @generated
	 * @ordered
	 */
	protected Object allowEmptyValues = ALLOW_EMPTY_VALUES_EDEFAULT;

	/**
	 * The default value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionFormat COLLECTION_FORMAT_EDEFAULT = CollectionFormat.UNDEFINED;

	/**
	 * The cached value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected CollectionFormat collectionFormat = COLLECTION_FORMAT_EDEFAULT;

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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected JSONSchemaConstraints constraints;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.API_PARAMETER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(ParameterLocation newLocation) {
		ParameterLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAllowEmptyValues() {
		return allowEmptyValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmptyValues(Object newAllowEmptyValues) {
		Object oldAllowEmptyValues = allowEmptyValues;
		allowEmptyValues = newAllowEmptyValues;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__ALLOW_EMPTY_VALUES, oldAllowEmptyValues, allowEmptyValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONSchemaConstraints getConstraints() {
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstraints(JSONSchemaConstraints newConstraints, NotificationChain msgs) {
		JSONSchemaConstraints oldConstraints = constraints;
		constraints = newConstraints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS, oldConstraints, newConstraints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraints(JSONSchemaConstraints newConstraints) {
		if (newConstraints != constraints) {
			NotificationChain msgs = null;
			if (constraints != null)
				msgs = ((InternalEObject)constraints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS, null, msgs);
			if (newConstraints != null)
				msgs = ((InternalEObject)newConstraints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS, null, msgs);
			msgs = basicSetConstraints(newConstraints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS, newConstraints, newConstraints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS:
				return basicSetConstraints(null, msgs);
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
			case OpenapiprofilePackage.API_PARAMETER__DESCRIPTION:
				return getDescription();
			case OpenapiprofilePackage.API_PARAMETER__LOCATION:
				return getLocation();
			case OpenapiprofilePackage.API_PARAMETER__ALLOW_EMPTY_VALUES:
				return getAllowEmptyValues();
			case OpenapiprofilePackage.API_PARAMETER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
			case OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS:
				return getConstraints();
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
			case OpenapiprofilePackage.API_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiprofilePackage.API_PARAMETER__LOCATION:
				setLocation((ParameterLocation)newValue);
				return;
			case OpenapiprofilePackage.API_PARAMETER__ALLOW_EMPTY_VALUES:
				setAllowEmptyValues((Object)newValue);
				return;
			case OpenapiprofilePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)newValue);
				return;
			case OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS:
				setConstraints((JSONSchemaConstraints)newValue);
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
			case OpenapiprofilePackage.API_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_PARAMETER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_PARAMETER__ALLOW_EMPTY_VALUES:
				setAllowEmptyValues(ALLOW_EMPTY_VALUES_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)null);
				return;
			case OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS:
				setConstraints((JSONSchemaConstraints)null);
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
			case OpenapiprofilePackage.API_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiprofilePackage.API_PARAMETER__LOCATION:
				return location != LOCATION_EDEFAULT;
			case OpenapiprofilePackage.API_PARAMETER__ALLOW_EMPTY_VALUES:
				return ALLOW_EMPTY_VALUES_EDEFAULT == null ? allowEmptyValues != null : !ALLOW_EMPTY_VALUES_EDEFAULT.equals(allowEmptyValues);
			case OpenapiprofilePackage.API_PARAMETER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case OpenapiprofilePackage.API_PARAMETER__BASE_PARAMETER:
				return base_Parameter != null;
			case OpenapiprofilePackage.API_PARAMETER__CONSTRAINTS:
				return constraints != null;
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
		result.append(", location: ");
		result.append(location);
		result.append(", allowEmptyValues: ");
		result.append(allowEmptyValues);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(')');
		return result.toString();
	}

} //APIParameterImpl
