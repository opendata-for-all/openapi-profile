/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.APIOperation;
import edu.uoc.som.openapi2.profile.HTTPMethod;
import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;
import edu.uoc.som.openapi2.profile.SchemeType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.APIOperationImpl#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIOperationImpl extends MinimalEObjectImpl.Container implements APIOperation {
	/**
	 * The default value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected String relativePath = RELATIVE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected static final HTTPMethod METHOD_EDEFAULT = HTTPMethod.UNDEFINED;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected HTTPMethod method = METHOD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> produces;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consumes;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

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
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIProfilePackage.Literals.API_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRelativePath(String newRelativePath) {
		String oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__RELATIVE_PATH, oldRelativePath, relativePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HTTPMethod getMethod() {
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMethod(HTTPMethod newMethod) {
		HTTPMethod oldMethod = method;
		method = newMethod == null ? METHOD_EDEFAULT : newMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__METHOD, oldMethod, method));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getProduces() {
		if (produces == null) {
			produces = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIProfilePackage.API_OPERATION__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIProfilePackage.API_OPERATION__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, OpenAPIProfilePackage.API_OPERATION__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIProfilePackage.API_OPERATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeprecated(Boolean newDeprecated) {
		Boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.API_OPERATION__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIProfilePackage.API_OPERATION__RELATIVE_PATH:
				return getRelativePath();
			case OpenAPIProfilePackage.API_OPERATION__METHOD:
				return getMethod();
			case OpenAPIProfilePackage.API_OPERATION__PRODUCES:
				return getProduces();
			case OpenAPIProfilePackage.API_OPERATION__CONSUMES:
				return getConsumes();
			case OpenAPIProfilePackage.API_OPERATION__SCHEMES:
				return getSchemes();
			case OpenAPIProfilePackage.API_OPERATION__SUMMARY:
				return getSummary();
			case OpenAPIProfilePackage.API_OPERATION__DESCRIPTION:
				return getDescription();
			case OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
			case OpenAPIProfilePackage.API_OPERATION__TAGS:
				return getTags();
			case OpenAPIProfilePackage.API_OPERATION__DEPRECATED:
				return getDeprecated();
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
			case OpenAPIProfilePackage.API_OPERATION__RELATIVE_PATH:
				setRelativePath((String)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__METHOD:
				setMethod((HTTPMethod)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__SUMMARY:
				setSummary((String)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIProfilePackage.API_OPERATION__DEPRECATED:
				setDeprecated((Boolean)newValue);
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
			case OpenAPIProfilePackage.API_OPERATION__RELATIVE_PATH:
				setRelativePath(RELATIVE_PATH_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_OPERATION__METHOD:
				setMethod(METHOD_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_OPERATION__PRODUCES:
				getProduces().clear();
				return;
			case OpenAPIProfilePackage.API_OPERATION__CONSUMES:
				getConsumes().clear();
				return;
			case OpenAPIProfilePackage.API_OPERATION__SCHEMES:
				getSchemes().clear();
				return;
			case OpenAPIProfilePackage.API_OPERATION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
			case OpenAPIProfilePackage.API_OPERATION__TAGS:
				getTags().clear();
				return;
			case OpenAPIProfilePackage.API_OPERATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
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
			case OpenAPIProfilePackage.API_OPERATION__RELATIVE_PATH:
				return RELATIVE_PATH_EDEFAULT == null ? relativePath != null : !RELATIVE_PATH_EDEFAULT.equals(relativePath);
			case OpenAPIProfilePackage.API_OPERATION__METHOD:
				return method != METHOD_EDEFAULT;
			case OpenAPIProfilePackage.API_OPERATION__PRODUCES:
				return produces != null && !produces.isEmpty();
			case OpenAPIProfilePackage.API_OPERATION__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case OpenAPIProfilePackage.API_OPERATION__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case OpenAPIProfilePackage.API_OPERATION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case OpenAPIProfilePackage.API_OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIProfilePackage.API_OPERATION__BASE_OPERATION:
				return base_Operation != null;
			case OpenAPIProfilePackage.API_OPERATION__TAGS:
				return tags != null && !tags.isEmpty();
			case OpenAPIProfilePackage.API_OPERATION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
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
		result.append(" (relativePath: ");
		result.append(relativePath);
		result.append(", method: ");
		result.append(method);
		result.append(", produces: ");
		result.append(produces);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", tags: ");
		result.append(tags);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //APIOperationImpl
