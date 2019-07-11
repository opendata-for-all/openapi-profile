/**
 */
package edu.som.uoc.openapi2.profile.impl;

import edu.som.uoc.openapi2.profile.Tag;
import edu.som.uoc.openapi2.profile.openapiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.impl.TagImpl#getExternalDocsURL <em>External Docs URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.impl.TagImpl#getExternalDocsDescription <em>External Docs Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.impl.TagImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.impl.TagImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagImpl extends MinimalEObjectImpl.Container implements Tag {
	/**
	 * The default value of the '{@link #getExternalDocsURL() <em>External Docs URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocsURL()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DOCS_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDocsURL() <em>External Docs URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocsURL()
	 * @generated
	 * @ordered
	 */
	protected String externalDocsURL = EXTERNAL_DOCS_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExternalDocsDescription() <em>External Docs Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocsDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTERNAL_DOCS_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExternalDocsDescription() <em>External Docs Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocsDescription()
	 * @generated
	 * @ordered
	 */
	protected String externalDocsDescription = EXTERNAL_DOCS_DESCRIPTION_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return openapiPackage.Literals.TAG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalDocsURL() {
		return externalDocsURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDocsURL(String newExternalDocsURL) {
		String oldExternalDocsURL = externalDocsURL;
		externalDocsURL = newExternalDocsURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openapiPackage.TAG__EXTERNAL_DOCS_URL, oldExternalDocsURL, externalDocsURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExternalDocsDescription() {
		return externalDocsDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExternalDocsDescription(String newExternalDocsDescription) {
		String oldExternalDocsDescription = externalDocsDescription;
		externalDocsDescription = newExternalDocsDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, openapiPackage.TAG__EXTERNAL_DOCS_DESCRIPTION, oldExternalDocsDescription, externalDocsDescription));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openapiPackage.TAG__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, openapiPackage.TAG__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case openapiPackage.TAG__EXTERNAL_DOCS_URL:
				return getExternalDocsURL();
			case openapiPackage.TAG__EXTERNAL_DOCS_DESCRIPTION:
				return getExternalDocsDescription();
			case openapiPackage.TAG__NAME:
				return getName();
			case openapiPackage.TAG__DESCRIPTION:
				return getDescription();
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
			case openapiPackage.TAG__EXTERNAL_DOCS_URL:
				setExternalDocsURL((String)newValue);
				return;
			case openapiPackage.TAG__EXTERNAL_DOCS_DESCRIPTION:
				setExternalDocsDescription((String)newValue);
				return;
			case openapiPackage.TAG__NAME:
				setName((String)newValue);
				return;
			case openapiPackage.TAG__DESCRIPTION:
				setDescription((String)newValue);
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
			case openapiPackage.TAG__EXTERNAL_DOCS_URL:
				setExternalDocsURL(EXTERNAL_DOCS_URL_EDEFAULT);
				return;
			case openapiPackage.TAG__EXTERNAL_DOCS_DESCRIPTION:
				setExternalDocsDescription(EXTERNAL_DOCS_DESCRIPTION_EDEFAULT);
				return;
			case openapiPackage.TAG__NAME:
				setName(NAME_EDEFAULT);
				return;
			case openapiPackage.TAG__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
			case openapiPackage.TAG__EXTERNAL_DOCS_URL:
				return EXTERNAL_DOCS_URL_EDEFAULT == null ? externalDocsURL != null : !EXTERNAL_DOCS_URL_EDEFAULT.equals(externalDocsURL);
			case openapiPackage.TAG__EXTERNAL_DOCS_DESCRIPTION:
				return EXTERNAL_DOCS_DESCRIPTION_EDEFAULT == null ? externalDocsDescription != null : !EXTERNAL_DOCS_DESCRIPTION_EDEFAULT.equals(externalDocsDescription);
			case openapiPackage.TAG__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case openapiPackage.TAG__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (externalDocsURL: ");
		result.append(externalDocsURL);
		result.append(", externalDocsDescription: ");
		result.append(externalDocsDescription);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //TagImpl
