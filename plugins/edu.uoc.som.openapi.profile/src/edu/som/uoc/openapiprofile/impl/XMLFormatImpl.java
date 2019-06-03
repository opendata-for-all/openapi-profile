/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.XMLFormat;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Format</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.XMLFormatImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.XMLFormatImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.XMLFormatImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.XMLFormatImpl#isAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.XMLFormatImpl#isWrapped <em>Wrapped</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XMLFormatImpl extends MinimalEObjectImpl.Container implements XMLFormat {
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
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #isAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ATTRIBUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAttribute()
	 * @generated
	 * @ordered
	 */
	protected boolean attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRAPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWrapped()
	 * @generated
	 * @ordered
	 */
	protected boolean wrapped = WRAPPED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLFormatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.XML_FORMAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.XML_FORMAT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.XML_FORMAT__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.XML_FORMAT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(boolean newAttribute) {
		boolean oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.XML_FORMAT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWrapped() {
		return wrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapped(boolean newWrapped) {
		boolean oldWrapped = wrapped;
		wrapped = newWrapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.XML_FORMAT__WRAPPED, oldWrapped, wrapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiprofilePackage.XML_FORMAT__NAME:
				return getName();
			case OpenapiprofilePackage.XML_FORMAT__NAMESPACE:
				return getNamespace();
			case OpenapiprofilePackage.XML_FORMAT__PREFIX:
				return getPrefix();
			case OpenapiprofilePackage.XML_FORMAT__ATTRIBUTE:
				return isAttribute();
			case OpenapiprofilePackage.XML_FORMAT__WRAPPED:
				return isWrapped();
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
			case OpenapiprofilePackage.XML_FORMAT__NAME:
				setName((String)newValue);
				return;
			case OpenapiprofilePackage.XML_FORMAT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case OpenapiprofilePackage.XML_FORMAT__PREFIX:
				setPrefix((String)newValue);
				return;
			case OpenapiprofilePackage.XML_FORMAT__ATTRIBUTE:
				setAttribute((Boolean)newValue);
				return;
			case OpenapiprofilePackage.XML_FORMAT__WRAPPED:
				setWrapped((Boolean)newValue);
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
			case OpenapiprofilePackage.XML_FORMAT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenapiprofilePackage.XML_FORMAT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case OpenapiprofilePackage.XML_FORMAT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case OpenapiprofilePackage.XML_FORMAT__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case OpenapiprofilePackage.XML_FORMAT__WRAPPED:
				setWrapped(WRAPPED_EDEFAULT);
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
			case OpenapiprofilePackage.XML_FORMAT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenapiprofilePackage.XML_FORMAT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case OpenapiprofilePackage.XML_FORMAT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case OpenapiprofilePackage.XML_FORMAT__ATTRIBUTE:
				return attribute != ATTRIBUTE_EDEFAULT;
			case OpenapiprofilePackage.XML_FORMAT__WRAPPED:
				return wrapped != WRAPPED_EDEFAULT;
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
		result.append(", namespace: ");
		result.append(namespace);
		result.append(", prefix: ");
		result.append(prefix);
		result.append(", attribute: ");
		result.append(attribute);
		result.append(", wrapped: ");
		result.append(wrapped);
		result.append(')');
		return result.toString();
	}

} //XMLFormatImpl
