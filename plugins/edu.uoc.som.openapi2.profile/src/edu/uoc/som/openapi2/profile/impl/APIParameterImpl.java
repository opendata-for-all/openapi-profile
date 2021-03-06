/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.APIParameter;
import edu.uoc.som.openapi2.profile.CollectionFormat;
import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;
import edu.uoc.som.openapi2.profile.ParameterLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getAllowEmptyValue <em>Allow Empty Value</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIParameterImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIParameterImpl extends JSONSchemaSubsetImpl implements APIParameter {
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
	 * The default value of the '{@link #getAllowEmptyValue() <em>Allow Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyValue()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ALLOW_EMPTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowEmptyValue() <em>Allow Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowEmptyValue()
	 * @generated
	 * @ordered
	 */
	protected Boolean allowEmptyValue = ALLOW_EMPTY_VALUE_EDEFAULT;

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
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

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
		return OpenAPIProfilePackage.Literals.API_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParameterLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(ParameterLocation newLocation) {
		ParameterLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAllowEmptyValue() {
		return allowEmptyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAllowEmptyValue(Boolean newAllowEmptyValue) {
		Boolean oldAllowEmptyValue = allowEmptyValue;
		allowEmptyValue = newAllowEmptyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__ALLOW_EMPTY_VALUE, oldAllowEmptyValue, allowEmptyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getBase_Parameter() {
		if (base_Parameter != null && base_Parameter.eIsProxy()) {
			InternalEObject oldBase_Parameter = (InternalEObject)base_Parameter;
			base_Parameter = (Parameter)eResolveProxy(oldBase_Parameter);
			if (base_Parameter != oldBase_Parameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
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
	@Override
	public void setBase_Parameter(Parameter newBase_Parameter) {
		Parameter oldBase_Parameter = base_Parameter;
		base_Parameter = newBase_Parameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER, oldBase_Parameter, base_Parameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIProfilePackage.API_PARAMETER__DESCRIPTION:
				return getDescription();
			case OpenAPIProfilePackage.API_PARAMETER__LOCATION:
				return getLocation();
			case OpenAPIProfilePackage.API_PARAMETER__ALLOW_EMPTY_VALUE:
				return getAllowEmptyValue();
			case OpenAPIProfilePackage.API_PARAMETER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER:
				if (resolve) return getBase_Parameter();
				return basicGetBase_Parameter();
			case OpenAPIProfilePackage.API_PARAMETER__REQUIRED:
				return getRequired();
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
			case OpenAPIProfilePackage.API_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__LOCATION:
				setLocation((ParameterLocation)newValue);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__ALLOW_EMPTY_VALUE:
				setAllowEmptyValue((Boolean)newValue);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)newValue);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
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
			case OpenAPIProfilePackage.API_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__ALLOW_EMPTY_VALUE:
				setAllowEmptyValue(ALLOW_EMPTY_VALUE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER:
				setBase_Parameter((Parameter)null);
				return;
			case OpenAPIProfilePackage.API_PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case OpenAPIProfilePackage.API_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIProfilePackage.API_PARAMETER__LOCATION:
				return location != LOCATION_EDEFAULT;
			case OpenAPIProfilePackage.API_PARAMETER__ALLOW_EMPTY_VALUE:
				return ALLOW_EMPTY_VALUE_EDEFAULT == null ? allowEmptyValue != null : !ALLOW_EMPTY_VALUE_EDEFAULT.equals(allowEmptyValue);
			case OpenAPIProfilePackage.API_PARAMETER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case OpenAPIProfilePackage.API_PARAMETER__BASE_PARAMETER:
				return base_Parameter != null;
			case OpenAPIProfilePackage.API_PARAMETER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
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
		result.append(", allowEmptyValue: ");
		result.append(allowEmptyValue);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", required: ");
		result.append(required);
		result.append(')');
		return result.toString();
	}

} //APIParameterImpl
