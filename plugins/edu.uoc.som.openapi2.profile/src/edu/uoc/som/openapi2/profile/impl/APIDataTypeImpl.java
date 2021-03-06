/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.APIDataType;
import edu.uoc.som.openapi2.profile.JSONDataType;
import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIDataTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIDataTypeImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIDataTypeImpl#getBase_Enumeration <em>Base Enumeration</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIDataTypeImpl#getBase_PrimitiveType <em>Base Primitive Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIDataTypeImpl extends MinimalEObjectImpl.Container implements APIDataType {
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
	 * The cached value of the '{@link #getBase_Enumeration() <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Enumeration()
	 * @generated
	 * @ordered
	 */
	protected Enumeration base_Enumeration;

	/**
	 * The cached value of the '{@link #getBase_PrimitiveType() <em>Base Primitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_PrimitiveType()
	 * @generated
	 * @ordered
	 */
	protected PrimitiveType base_PrimitiveType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIProfilePackage.Literals.API_DATA_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_DATA_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_DATA_TYPE__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Enumeration getBase_Enumeration() {
		if (base_Enumeration != null && base_Enumeration.eIsProxy()) {
			InternalEObject oldBase_Enumeration = (InternalEObject)base_Enumeration;
			base_Enumeration = (Enumeration)eResolveProxy(oldBase_Enumeration);
			if (base_Enumeration != oldBase_Enumeration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
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
	@Override
	public void setBase_Enumeration(Enumeration newBase_Enumeration) {
		Enumeration oldBase_Enumeration = base_Enumeration;
		base_Enumeration = newBase_Enumeration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION, oldBase_Enumeration, base_Enumeration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PrimitiveType getBase_PrimitiveType() {
		if (base_PrimitiveType != null && base_PrimitiveType.eIsProxy()) {
			InternalEObject oldBase_PrimitiveType = (InternalEObject)base_PrimitiveType;
			base_PrimitiveType = (PrimitiveType)eResolveProxy(oldBase_PrimitiveType);
			if (base_PrimitiveType != oldBase_PrimitiveType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE, oldBase_PrimitiveType, base_PrimitiveType));
			}
		}
		return base_PrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimitiveType basicGetBase_PrimitiveType() {
		return base_PrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_PrimitiveType(PrimitiveType newBase_PrimitiveType) {
		PrimitiveType oldBase_PrimitiveType = base_PrimitiveType;
		base_PrimitiveType = newBase_PrimitiveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE, oldBase_PrimitiveType, base_PrimitiveType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIProfilePackage.API_DATA_TYPE__TYPE:
				return getType();
			case OpenAPIProfilePackage.API_DATA_TYPE__FORMAT:
				return getFormat();
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION:
				if (resolve) return getBase_Enumeration();
				return basicGetBase_Enumeration();
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE:
				if (resolve) return getBase_PrimitiveType();
				return basicGetBase_PrimitiveType();
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
			case OpenAPIProfilePackage.API_DATA_TYPE__TYPE:
				setType((JSONDataType)newValue);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__FORMAT:
				setFormat((String)newValue);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)newValue);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE:
				setBase_PrimitiveType((PrimitiveType)newValue);
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
			case OpenAPIProfilePackage.API_DATA_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION:
				setBase_Enumeration((Enumeration)null);
				return;
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE:
				setBase_PrimitiveType((PrimitiveType)null);
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
			case OpenAPIProfilePackage.API_DATA_TYPE__TYPE:
				return type != TYPE_EDEFAULT;
			case OpenAPIProfilePackage.API_DATA_TYPE__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_ENUMERATION:
				return base_Enumeration != null;
			case OpenAPIProfilePackage.API_DATA_TYPE__BASE_PRIMITIVE_TYPE:
				return base_PrimitiveType != null;
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
		result.append(" (type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(')');
		return result.toString();
	}

} //APIDataTypeImpl
