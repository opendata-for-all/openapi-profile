/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.CollectionFormat;
import edu.uoc.som.openapi2.profile.Header;
import edu.uoc.som.openapi2.profile.JSONDataType;
import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.HeaderImpl#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JSONDataType TYPE_EDEFAULT = JSONDataType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JSONDataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final Double MULTIPLE_OF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected Double multipleOf = MULTIPLE_OF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enum_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIProfilePackage.Literals.HEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JSONDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(JSONDataType newType) {
		JSONDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__FORMAT, oldFormat, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinItems(Integer newMinItems) {
		Integer oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMinimum(Boolean newExclusiveMinimum) {
		Boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinimum(Double newMinimum) {
		Double oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinLength(Integer newMinLength) {
		Integer oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxLength(Integer newMaxLength) {
		Integer oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximum(Double newMaximum) {
		Double oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxItems(Integer newMaxItems) {
		Integer oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExclusiveMaximum(Boolean newExclusiveMaximum) {
		Boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUniqueItems(Boolean newUniqueItems) {
		Boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMultipleOf() {
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultipleOf(Double newMultipleOf) {
		Double oldMultipleOf = multipleOf;
		multipleOf = newMultipleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.HEADER__MULTIPLE_OF, oldMultipleOf, multipleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIProfilePackage.HEADER__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIProfilePackage.HEADER__NAME:
				return getName();
			case OpenAPIProfilePackage.HEADER__DESCRIPTION:
				return getDescription();
			case OpenAPIProfilePackage.HEADER__TYPE:
				return getType();
			case OpenAPIProfilePackage.HEADER__FORMAT:
				return getFormat();
			case OpenAPIProfilePackage.HEADER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case OpenAPIProfilePackage.HEADER__MIN_ITEMS:
				return getMinItems();
			case OpenAPIProfilePackage.HEADER__PATTERN:
				return getPattern();
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case OpenAPIProfilePackage.HEADER__MINIMUM:
				return getMinimum();
			case OpenAPIProfilePackage.HEADER__MIN_LENGTH:
				return getMinLength();
			case OpenAPIProfilePackage.HEADER__MAX_LENGTH:
				return getMaxLength();
			case OpenAPIProfilePackage.HEADER__MAXIMUM:
				return getMaximum();
			case OpenAPIProfilePackage.HEADER__MAX_ITEMS:
				return getMaxItems();
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case OpenAPIProfilePackage.HEADER__DEFAULT:
				return getDefault();
			case OpenAPIProfilePackage.HEADER__UNIQUE_ITEMS:
				return getUniqueItems();
			case OpenAPIProfilePackage.HEADER__MULTIPLE_OF:
				return getMultipleOf();
			case OpenAPIProfilePackage.HEADER__ENUM:
				return getEnum();
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
			case OpenAPIProfilePackage.HEADER__NAME:
				setName((String)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__TYPE:
				setType((JSONDataType)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__PATTERN:
				setPattern((String)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__DEFAULT:
				setDefault((String)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__MULTIPLE_OF:
				setMultipleOf((Double)newValue);
				return;
			case OpenAPIProfilePackage.HEADER__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
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
			case OpenAPIProfilePackage.HEADER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case OpenAPIProfilePackage.HEADER__ENUM:
				getEnum().clear();
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
			case OpenAPIProfilePackage.HEADER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenAPIProfilePackage.HEADER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIProfilePackage.HEADER__TYPE:
				return type != TYPE_EDEFAULT;
			case OpenAPIProfilePackage.HEADER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenAPIProfilePackage.HEADER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case OpenAPIProfilePackage.HEADER__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? minItems != null : !MIN_ITEMS_EDEFAULT.equals(minItems);
			case OpenAPIProfilePackage.HEADER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case OpenAPIProfilePackage.HEADER__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case OpenAPIProfilePackage.HEADER__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case OpenAPIProfilePackage.HEADER__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case OpenAPIProfilePackage.HEADER__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case OpenAPIProfilePackage.HEADER__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
			case OpenAPIProfilePackage.HEADER__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case OpenAPIProfilePackage.HEADER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OpenAPIProfilePackage.HEADER__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? uniqueItems != null : !UNIQUE_ITEMS_EDEFAULT.equals(uniqueItems);
			case OpenAPIProfilePackage.HEADER__MULTIPLE_OF:
				return MULTIPLE_OF_EDEFAULT == null ? multipleOf != null : !MULTIPLE_OF_EDEFAULT.equals(multipleOf);
			case OpenAPIProfilePackage.HEADER__ENUM:
				return enum_ != null && !enum_.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", default: ");
		result.append(default_);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", enum: ");
		result.append(enum_);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
