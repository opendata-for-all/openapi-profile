/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.JSONDataType;
import edu.som.uoc.openapiprofile.JSONSchemaSubset;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.Schema;
import edu.som.uoc.openapiprofile.XMLElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Enumeration;

import org.eclipse.uml2.uml.internal.impl.PrimitiveTypeImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMultiplOf <em>Multipl Of</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getAdditionalPropertiesAllowed <em>Additional Properties Allowed</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.SchemaImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends PrimitiveTypeImpl implements Schema {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JSONDataType TYPE_EDEFAULT = JSONDataType.BOOLEAN;

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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer maxProperties = MAX_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer minProperties = MIN_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected String discriminator = DISCRIMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdditionalPropertiesAllowed() <em>Additional Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalPropertiesAllowed() <em>Additional Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected Boolean additionalPropertiesAllowed = ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected XMLElement xml;

	/**
	 * The cached value of the '{@link #getBase_Enumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Enumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration base_Enumeration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MIN_LENGTH, oldMinLength, minLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MAXIMUM, oldMaximum, maximum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MIN_ITEMS, oldMinItems, minItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JSONDataType newType) {
		JSONDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MULTIPL_OF, oldMultiplOf, multiplOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxProperties(Integer newMaxProperties) {
		Integer oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinProperties(Integer newMinProperties) {
		Integer oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__MIN_PROPERTIES, oldMinProperties, minProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminator(String newDiscriminator) {
		String oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getAdditionalPropertiesAllowed() {
		return additionalPropertiesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalPropertiesAllowed(Boolean newAdditionalPropertiesAllowed) {
		Boolean oldAdditionalPropertiesAllowed = additionalPropertiesAllowed;
		additionalPropertiesAllowed = newAdditionalPropertiesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED, oldAdditionalPropertiesAllowed, additionalPropertiesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.SCHEMA__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(Boolean newReadOnly) {
		Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLElement getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(XMLElement newXml, NotificationChain msgs) {
		XMLElement oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(XMLElement newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenapiprofilePackage.SCHEMA__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenapiprofilePackage.SCHEMA__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration getBase_Enumeration() {
		if (base_Enumeration != null && base_Enumeration.eIsProxy()) {
			InternalEObject oldBase_Enumeration = (InternalEObject)base_Enumeration;
			base_Enumeration = (Enumeration)eResolveProxy(oldBase_Enumeration);
			if (base_Enumeration != oldBase_Enumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
			}
		}
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumeration basicGetBase_Enumeration() {
		return base_Enumeration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Enumeration(Enumeration newBase_Enumeration) {
		Enumeration oldBase_Enumeration = base_Enumeration;
		base_Enumeration = newBase_Enumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenapiprofilePackage.SCHEMA__XML:
				return basicSetXml(null, msgs);
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
			case OpenapiprofilePackage.SCHEMA__MIN_LENGTH:
				return getMinLength();
			case OpenapiprofilePackage.SCHEMA__MAXIMUM:
				return getMaximum();
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return getExclusiveMaximum();
			case OpenapiprofilePackage.SCHEMA__MINIMUM:
				return getMinimum();
			case OpenapiprofilePackage.SCHEMA__MAX_LENGTH:
				return getMaxLength();
			case OpenapiprofilePackage.SCHEMA__MIN_ITEMS:
				return getMinItems();
			case OpenapiprofilePackage.SCHEMA__PATTERN:
				return getPattern();
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return getExclusiveMinimum();
			case OpenapiprofilePackage.SCHEMA__MAX_ITEMS:
				return getMaxItems();
			case OpenapiprofilePackage.SCHEMA__FORMAT:
				return getFormat();
			case OpenapiprofilePackage.SCHEMA__TYPE:
				return getType();
			case OpenapiprofilePackage.SCHEMA__DESCRIPTION:
				return getDescription();
			case OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS:
				return getUniqueItems();
			case OpenapiprofilePackage.SCHEMA__DEFAULT:
				return getDefault();
			case OpenapiprofilePackage.SCHEMA__MULTIPL_OF:
				return getMultiplOf();
			case OpenapiprofilePackage.SCHEMA__TITLE:
				return getTitle();
			case OpenapiprofilePackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case OpenapiprofilePackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case OpenapiprofilePackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case OpenapiprofilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				return getAdditionalPropertiesAllowed();
			case OpenapiprofilePackage.SCHEMA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case OpenapiprofilePackage.SCHEMA__EXAMPLE:
				return getExample();
			case OpenapiprofilePackage.SCHEMA__READ_ONLY:
				return getReadOnly();
			case OpenapiprofilePackage.SCHEMA__XML:
				return getXml();
			case OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
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
			case OpenapiprofilePackage.SCHEMA__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MAXIMUM:
				setMaximum((Double)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MINIMUM:
				setMinimum((Double)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__PATTERN:
				setPattern((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__TYPE:
				setType((JSONDataType)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__DEFAULT:
				setDefault((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MULTIPL_OF:
				setMultiplOf((Double)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				setAdditionalPropertiesAllowed((Boolean)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__XML:
				setXml((XMLElement)newValue);
				return;
			case OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
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
			case OpenapiprofilePackage.SCHEMA__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MULTIPL_OF:
				setMultiplOf(MULTIPL_OF_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				setAdditionalPropertiesAllowed(ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case OpenapiprofilePackage.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case OpenapiprofilePackage.SCHEMA__XML:
				setXml((XMLElement)null);
				return;
			case OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
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
			case OpenapiprofilePackage.SCHEMA__MIN_LENGTH:
				return MIN_LENGTH_EDEFAULT == null ? minLength != null : !MIN_LENGTH_EDEFAULT.equals(minLength);
			case OpenapiprofilePackage.SCHEMA__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return EXCLUSIVE_MAXIMUM_EDEFAULT == null ? exclusiveMaximum != null : !EXCLUSIVE_MAXIMUM_EDEFAULT.equals(exclusiveMaximum);
			case OpenapiprofilePackage.SCHEMA__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case OpenapiprofilePackage.SCHEMA__MAX_LENGTH:
				return MAX_LENGTH_EDEFAULT == null ? maxLength != null : !MAX_LENGTH_EDEFAULT.equals(maxLength);
			case OpenapiprofilePackage.SCHEMA__MIN_ITEMS:
				return MIN_ITEMS_EDEFAULT == null ? minItems != null : !MIN_ITEMS_EDEFAULT.equals(minItems);
			case OpenapiprofilePackage.SCHEMA__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return EXCLUSIVE_MINIMUM_EDEFAULT == null ? exclusiveMinimum != null : !EXCLUSIVE_MINIMUM_EDEFAULT.equals(exclusiveMinimum);
			case OpenapiprofilePackage.SCHEMA__MAX_ITEMS:
				return MAX_ITEMS_EDEFAULT == null ? maxItems != null : !MAX_ITEMS_EDEFAULT.equals(maxItems);
			case OpenapiprofilePackage.SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenapiprofilePackage.SCHEMA__TYPE:
				return type != TYPE_EDEFAULT;
			case OpenapiprofilePackage.SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS:
				return UNIQUE_ITEMS_EDEFAULT == null ? uniqueItems != null : !UNIQUE_ITEMS_EDEFAULT.equals(uniqueItems);
			case OpenapiprofilePackage.SCHEMA__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OpenapiprofilePackage.SCHEMA__MULTIPL_OF:
				return MULTIPL_OF_EDEFAULT == null ? multiplOf != null : !MULTIPL_OF_EDEFAULT.equals(multiplOf);
			case OpenapiprofilePackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenapiprofilePackage.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? maxProperties != null : !MAX_PROPERTIES_EDEFAULT.equals(maxProperties);
			case OpenapiprofilePackage.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? minProperties != null : !MIN_PROPERTIES_EDEFAULT.equals(minProperties);
			case OpenapiprofilePackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case OpenapiprofilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				return ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT == null ? additionalPropertiesAllowed != null : !ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT.equals(additionalPropertiesAllowed);
			case OpenapiprofilePackage.SCHEMA__BASE_CLASS:
				return base_Class != null;
			case OpenapiprofilePackage.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case OpenapiprofilePackage.SCHEMA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case OpenapiprofilePackage.SCHEMA__XML:
				return xml != null;
			case OpenapiprofilePackage.SCHEMA__BASE_ENUMERATION:
				return base_Enumeration != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == JSONSchemaSubset.class) {
			switch (derivedFeatureID) {
				case OpenapiprofilePackage.SCHEMA__MIN_LENGTH: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH;
				case OpenapiprofilePackage.SCHEMA__MAXIMUM: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM;
				case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;
				case OpenapiprofilePackage.SCHEMA__MINIMUM: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM;
				case OpenapiprofilePackage.SCHEMA__MAX_LENGTH: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH;
				case OpenapiprofilePackage.SCHEMA__MIN_ITEMS: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS;
				case OpenapiprofilePackage.SCHEMA__PATTERN: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN;
				case OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;
				case OpenapiprofilePackage.SCHEMA__MAX_ITEMS: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS;
				case OpenapiprofilePackage.SCHEMA__FORMAT: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__FORMAT;
				case OpenapiprofilePackage.SCHEMA__TYPE: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__TYPE;
				case OpenapiprofilePackage.SCHEMA__DESCRIPTION: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION;
				case OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;
				case OpenapiprofilePackage.SCHEMA__DEFAULT: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT;
				case OpenapiprofilePackage.SCHEMA__MULTIPL_OF: return OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == JSONSchemaSubset.class) {
			switch (baseFeatureID) {
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_LENGTH: return OpenapiprofilePackage.SCHEMA__MIN_LENGTH;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAXIMUM: return OpenapiprofilePackage.SCHEMA__MAXIMUM;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM: return OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MAXIMUM;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MINIMUM: return OpenapiprofilePackage.SCHEMA__MINIMUM;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_LENGTH: return OpenapiprofilePackage.SCHEMA__MAX_LENGTH;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MIN_ITEMS: return OpenapiprofilePackage.SCHEMA__MIN_ITEMS;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__PATTERN: return OpenapiprofilePackage.SCHEMA__PATTERN;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM: return OpenapiprofilePackage.SCHEMA__EXCLUSIVE_MINIMUM;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MAX_ITEMS: return OpenapiprofilePackage.SCHEMA__MAX_ITEMS;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__FORMAT: return OpenapiprofilePackage.SCHEMA__FORMAT;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__TYPE: return OpenapiprofilePackage.SCHEMA__TYPE;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DESCRIPTION: return OpenapiprofilePackage.SCHEMA__DESCRIPTION;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__UNIQUE_ITEMS: return OpenapiprofilePackage.SCHEMA__UNIQUE_ITEMS;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__DEFAULT: return OpenapiprofilePackage.SCHEMA__DEFAULT;
				case OpenapiprofilePackage.JSON_SCHEMA_SUBSET__MULTIPL_OF: return OpenapiprofilePackage.SCHEMA__MULTIPL_OF;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", format: ");
		result.append(format);
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", default: ");
		result.append(default_);
		result.append(", multiplOf: ");
		result.append(multiplOf);
		result.append(", title: ");
		result.append(title);
		result.append(", maxProperties: ");
		result.append(maxProperties);
		result.append(", minProperties: ");
		result.append(minProperties);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", additionalPropertiesAllowed: ");
		result.append(additionalPropertiesAllowed);
		result.append(", example: ");
		result.append(example);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
