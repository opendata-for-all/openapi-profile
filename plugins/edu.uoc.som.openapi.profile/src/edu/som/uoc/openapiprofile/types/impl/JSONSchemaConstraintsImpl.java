/**
 */
package edu.som.uoc.openapiprofile.types.impl;

import edu.som.uoc.openapiprofile.types.JSONSchemaConstraints;
import edu.som.uoc.openapiprofile.types.typesPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Schema Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONSchemaConstraintsImpl extends MinimalEObjectImpl.Container implements JSONSchemaConstraints {
	/**
	 * The default value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXCLUSIVE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected Object exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Object minLength;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Object maxLength;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected Object minItems;

	/**
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Object EXCLUSIVE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected Object exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected Object maxItems;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected Object maximum;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Object minimum;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONSchemaConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return typesPackage.Literals.JSON_SCHEMA_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMaximum(Object newExclusiveMaximum) {
		Object oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(Object newMinLength) {
		Object oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Object newMaxLength) {
		Object oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(Object newMinItems) {
		Object oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(Object newExclusiveMinimum) {
		Object oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(Object newMaxItems) {
		Object oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(Object newMaximum) {
		Object oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(Object newMinimum) {
		Object oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				return getMinLength();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				return getMaxLength();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				return getPattern();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				return getMinItems();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				return getMaxItems();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				return getMaximum();
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				return getMinimum();
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
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Object)newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				setMinLength(newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				setMaxLength(newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				setPattern((String)newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				setMinItems(newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Object)newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				setMaxItems(newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				setMaximum(newValue);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				setMinimum(newValue);
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
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				setMinLength((Object)null);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				setMaxLength((Object)null);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				setMinItems((Object)null);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				setMaxItems((Object)null);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				setMaximum((Object)null);
				return;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				setMinimum((Object)null);
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
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				return minLength != null;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				return maxLength != null;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				return minItems != null;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				return maxItems != null;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				return maximum != null;
			case typesPackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				return minimum != null;
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
		result.append(" (exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(')');
		return result.toString();
	}

} //JSONSchemaConstraintsImpl
