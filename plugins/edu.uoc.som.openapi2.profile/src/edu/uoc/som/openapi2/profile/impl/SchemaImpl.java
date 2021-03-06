/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;
import edu.uoc.som.openapi2.profile.Schema;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getAdditionalPropertiesAllowed <em>Additional Properties Allowed</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SchemaImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
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
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected Type additionalProperties;

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
		return OpenAPIProfilePackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaxProperties(Integer newMaxProperties) {
		Integer oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinProperties(Integer newMinProperties) {
		Integer oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__MIN_PROPERTIES, oldMinProperties, minProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDiscriminator(String newDiscriminator) {
		String oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdditionalPropertiesAllowed() {
		return additionalPropertiesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalPropertiesAllowed(Boolean newAdditionalPropertiesAllowed) {
		Boolean oldAdditionalPropertiesAllowed = additionalPropertiesAllowed;
		additionalPropertiesAllowed = newAdditionalPropertiesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED, oldAdditionalPropertiesAllowed, additionalPropertiesAllowed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.SCHEMA__BASE_CLASS, oldBase_Class, base_Class));
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
	@Override
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__EXAMPLE, oldExample, example));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__DEFAULT, oldDefault, default_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getAdditionalProperties() {
		if (additionalProperties != null && additionalProperties.eIsProxy()) {
			InternalEObject oldAdditionalProperties = (InternalEObject)additionalProperties;
			additionalProperties = (Type)eResolveProxy(oldAdditionalProperties);
			if (additionalProperties != oldAdditionalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
			}
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalProperties(Type newAdditionalProperties) {
		Type oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIProfilePackage.SCHEMA__TITLE:
				return getTitle();
			case OpenAPIProfilePackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case OpenAPIProfilePackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case OpenAPIProfilePackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				return getAdditionalPropertiesAllowed();
			case OpenAPIProfilePackage.SCHEMA__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case OpenAPIProfilePackage.SCHEMA__EXAMPLE:
				return getExample();
			case OpenAPIProfilePackage.SCHEMA__DEFAULT:
				return getDefault();
			case OpenAPIProfilePackage.SCHEMA__DESCRIPTION:
				return getDescription();
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES:
				if (resolve) return getAdditionalProperties();
				return basicGetAdditionalProperties();
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
			case OpenAPIProfilePackage.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				setAdditionalPropertiesAllowed((Boolean)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__DEFAULT:
				setDefault((String)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Type)newValue);
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
			case OpenAPIProfilePackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				setAdditionalPropertiesAllowed(ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case OpenAPIProfilePackage.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Type)null);
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
			case OpenAPIProfilePackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenAPIProfilePackage.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? maxProperties != null : !MAX_PROPERTIES_EDEFAULT.equals(maxProperties);
			case OpenAPIProfilePackage.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? minProperties != null : !MIN_PROPERTIES_EDEFAULT.equals(minProperties);
			case OpenAPIProfilePackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED:
				return ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT == null ? additionalPropertiesAllowed != null : !ADDITIONAL_PROPERTIES_ALLOWED_EDEFAULT.equals(additionalPropertiesAllowed);
			case OpenAPIProfilePackage.SCHEMA__BASE_CLASS:
				return base_Class != null;
			case OpenAPIProfilePackage.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case OpenAPIProfilePackage.SCHEMA__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case OpenAPIProfilePackage.SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIProfilePackage.SCHEMA__ADDITIONAL_PROPERTIES:
				return additionalProperties != null;
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
		result.append(" (title: ");
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
		result.append(", default: ");
		result.append(default_);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
