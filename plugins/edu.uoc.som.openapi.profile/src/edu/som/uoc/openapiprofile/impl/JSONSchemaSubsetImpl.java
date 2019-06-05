/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.JSONSchemaSubset;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>JSON Schema Subset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl#getMultiplOf <em>Multipl Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class JSONSchemaSubsetImpl extends MinimalEObjectImpl.Container implements JSONSchemaSubset {
	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected Integer minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected Double maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MAXIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Double MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Double minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected Integer maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected Integer minItems = MIN_ITEMS_EDEFAULT;

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
	 * The default value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUSIVE_MINIMUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected Integer maxItems = MAX_ITEMS_EDEFAULT;

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
	 * The default value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean UNIQUE_ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected Boolean uniqueItems = UNIQUE_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplOf() <em>Multipl Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplOf()
	 * @generated
	 * @ordered
	 */
	protected static final Double MULTIPL_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiplOf() <em>Multipl Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplOf()
	 * @generated
	 * @ordered
	 */
	protected Double multiplOf = MULTIPL_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JSONSchemaSubsetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.JSON_SCHEMA_SUBSET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(Double newMaximum) {
		Double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMaximum(Boolean newExclusiveMaximum) {
		Boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(Double newMinimum) {
		Double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(Integer newMinItems) {
		Integer oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS, oldMinItems, minItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(Boolean newExclusiveMinimum) {
		Boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(Integer newMaxItems) {
		Integer oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueItems(Boolean newUniqueItems) {
		Boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getMultiplOf() {
		return multiplOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplOf(Double newMultiplOf) {
		Double oldMultiplOf = multiplOf;
		multiplOf = newMultiplOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF, oldMultiplOf, multiplOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH:
				return getMinLength();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM:
				return getMaximum();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM:
				return getMinimum();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH:
				return getMaxLength();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS:
				return getMinItems();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN:
				return getPattern();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS:
				return getMaxItems();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION:
				return getDescription();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS:
				return getUniqueItems();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT:
				return getDefault();
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF:
				return getMultiplOf();
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
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN:
				setPattern((String)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT:
				setDefault((String)newValue);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF:
				setMultiplOf((Double)newValue);
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
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF:
				setMultiplOf(MULTIPL_OF_EDEFAULT);
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
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? minItems != null : !MIN_ITEMS_EDEFAULT.equals(minItems);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? uniqueItems != null : !UNIQUE_ITEMS_EDEFAULT.equals(uniqueItems);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF:
				return MULTIPL_OF_EDEFAULT == null ? multiplOf != null : !MULTIPL_OF_EDEFAULT.equals(multiplOf);
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
		result.append(" (minLength: ");
		result.append(minLength);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", description: ");
		result.append(description);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", default: ");
		result.append(default_);
		result.append(", multiplOf: ");
		result.append(multiplOf);
		result.append(')');
		return result.toString();
	}

} //JSONSchemaSubsetImpl
