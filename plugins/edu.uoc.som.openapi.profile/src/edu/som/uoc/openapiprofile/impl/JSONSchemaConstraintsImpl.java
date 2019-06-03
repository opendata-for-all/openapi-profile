/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.JSONSchemaConstraints;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;

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
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaConstraintsImpl#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JSONSchemaConstraintsImpl extends MinimalEObjectImpl.Container implements JSONSchemaConstraints {
	/**
	 * The default value of the '{@link #isExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_MAXIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

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
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected int minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_MINIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected int maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected double minimum = MINIMUM_EDEFAULT;

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
		return OpenapiprofilePackage.Literals.JSON_SCHEMA_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMaximum(boolean newExclusiveMaximum) {
		boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(int newMinItems) {
		int oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(boolean newExclusiveMinimum) {
		boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(int newMaxItems) {
		int oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(double newMaximum) {
		double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(double newMinimum) {
		double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				return isExclusiveMaximum();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				return getMinLength();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				return getMaxLength();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				return getPattern();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				return getMinItems();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				return isExclusiveMinimum();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				return getMaxItems();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				return getMaximum();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
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
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				setPattern((String)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				setMinimum((Double)newValue);
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
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
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
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM:
				return exclusiveMaximum != EXCLUSIVE_MAXIMUM_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS:
				return minItems != MIN_ITEMS_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM:
				return exclusiveMinimum != EXCLUSIVE_MINIMUM_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
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
