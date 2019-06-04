/**
 */
package edu.som.uoc.openapiprofile.types.impl;

import edu.som.uoc.openapiprofile.types.XMLFormat;
import edu.som.uoc.openapiprofile.types.typesPackage;

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
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl#getWrapped <em>Wrapped</em>}</li>
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
	 * The default value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final Object ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected Object attribute = ATTRIBUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapped()
	 * @generated
	 * @ordered
	 */
	protected static final Object WRAPPED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrapped() <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrapped()
	 * @generated
	 * @ordered
	 */
	protected Object wrapped = WRAPPED_EDEFAULT;

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
		return typesPackage.Literals.XML_FORMAT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.XML_FORMAT__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.XML_FORMAT__NAMESPACE, oldNamespace, namespace));
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
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.XML_FORMAT__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAttribute() {
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(Object newAttribute) {
		Object oldAttribute = attribute;
		attribute = newAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.XML_FORMAT__ATTRIBUTE, oldAttribute, attribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getWrapped() {
		return wrapped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrapped(Object newWrapped) {
		Object oldWrapped = wrapped;
		wrapped = newWrapped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, typesPackage.XML_FORMAT__WRAPPED, oldWrapped, wrapped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case typesPackage.XML_FORMAT__NAME:
				return getName();
			case typesPackage.XML_FORMAT__NAMESPACE:
				return getNamespace();
			case typesPackage.XML_FORMAT__PREFIX:
				return getPrefix();
			case typesPackage.XML_FORMAT__ATTRIBUTE:
				return getAttribute();
			case typesPackage.XML_FORMAT__WRAPPED:
				return getWrapped();
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
			case typesPackage.XML_FORMAT__NAME:
				setName((String)newValue);
				return;
			case typesPackage.XML_FORMAT__NAMESPACE:
				setNamespace((String)newValue);
				return;
			case typesPackage.XML_FORMAT__PREFIX:
				setPrefix((String)newValue);
				return;
			case typesPackage.XML_FORMAT__ATTRIBUTE:
				setAttribute((Object)newValue);
				return;
			case typesPackage.XML_FORMAT__WRAPPED:
				setWrapped((Object)newValue);
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
			case typesPackage.XML_FORMAT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case typesPackage.XML_FORMAT__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
				return;
			case typesPackage.XML_FORMAT__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case typesPackage.XML_FORMAT__ATTRIBUTE:
				setAttribute(ATTRIBUTE_EDEFAULT);
				return;
			case typesPackage.XML_FORMAT__WRAPPED:
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
			case typesPackage.XML_FORMAT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case typesPackage.XML_FORMAT__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
			case typesPackage.XML_FORMAT__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case typesPackage.XML_FORMAT__ATTRIBUTE:
				return ATTRIBUTE_EDEFAULT == null ? attribute != null : !ATTRIBUTE_EDEFAULT.equals(attribute);
			case typesPackage.XML_FORMAT__WRAPPED:
				return WRAPPED_EDEFAULT == null ? wrapped != null : !WRAPPED_EDEFAULT.equals(wrapped);
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
