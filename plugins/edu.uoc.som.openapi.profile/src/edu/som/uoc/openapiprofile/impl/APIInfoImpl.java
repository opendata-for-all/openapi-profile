/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.APIInfo;
import edu.som.uoc.openapiprofile.OpenapiprofilePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getTermsOfService <em>Terms Of Service</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getLicenseName <em>License Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getLicenseURL <em>License URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getContactName <em>Contact Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getContactURL <em>Contact URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getContactEmail <em>Contact Email</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIInfoImpl extends MinimalEObjectImpl.Container implements APIInfo {
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
	 * The default value of the '{@link #getTermsOfService() <em>Terms Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsOfService()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMS_OF_SERVICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermsOfService() <em>Terms Of Service</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermsOfService()
	 * @generated
	 * @ordered
	 */
	protected String termsOfService = TERMS_OF_SERVICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseName() <em>License Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseName()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseName() <em>License Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseName()
	 * @generated
	 * @ordered
	 */
	protected String licenseName = LICENSE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLicenseURL() <em>License URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseURL()
	 * @generated
	 * @ordered
	 */
	protected static final String LICENSE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLicenseURL() <em>License URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLicenseURL()
	 * @generated
	 * @ordered
	 */
	protected String licenseURL = LICENSE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactName() <em>Contact Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactName()
	 * @generated
	 * @ordered
	 */
	protected String contactName = CONTACT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactURL() <em>Contact URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactURL()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactURL() <em>Contact URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactURL()
	 * @generated
	 * @ordered
	 */
	protected String contactURL = CONTACT_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTACT_EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContactEmail() <em>Contact Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactEmail()
	 * @generated
	 * @ordered
	 */
	protected String contactEmail = CONTACT_EMAIL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Model() <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Model()
	 * @generated
	 * @ordered
	 */
	protected Model base_Model;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIInfoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenapiprofilePackage.Literals.API_INFO;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermsOfService() {
		return termsOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermsOfService(String newTermsOfService) {
		String oldTermsOfService = termsOfService;
		termsOfService = newTermsOfService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__TERMS_OF_SERVICE, oldTermsOfService, termsOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicenseName() {
		return licenseName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseName(String newLicenseName) {
		String oldLicenseName = licenseName;
		licenseName = newLicenseName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__LICENSE_NAME, oldLicenseName, licenseName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLicenseURL() {
		return licenseURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLicenseURL(String newLicenseURL) {
		String oldLicenseURL = licenseURL;
		licenseURL = newLicenseURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__LICENSE_URL, oldLicenseURL, licenseURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactName(String newContactName) {
		String oldContactName = contactName;
		contactName = newContactName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__CONTACT_NAME, oldContactName, contactName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactURL() {
		return contactURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactURL(String newContactURL) {
		String oldContactURL = contactURL;
		contactURL = newContactURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__CONTACT_URL, oldContactURL, contactURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContactEmail(String newContactEmail) {
		String oldContactEmail = contactEmail;
		contactEmail = newContactEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__CONTACT_EMAIL, oldContactEmail, contactEmail));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model getBase_Model() {
		if (base_Model != null && base_Model.eIsProxy()) {
			InternalEObject oldBase_Model = (InternalEObject)base_Model;
			base_Model = (Model)eResolveProxy(oldBase_Model);
			if (base_Model != oldBase_Model) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenapiprofilePackage.API_INFO__BASE_MODEL, oldBase_Model, base_Model));
			}
		}
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Model basicGetBase_Model() {
		return base_Model;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Model(Model newBase_Model) {
		Model oldBase_Model = base_Model;
		base_Model = newBase_Model;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenapiprofilePackage.API_INFO__BASE_MODEL, oldBase_Model, base_Model));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenapiprofilePackage.API_INFO__TITLE:
				return getTitle();
			case OpenapiprofilePackage.API_INFO__DESCRIPTION:
				return getDescription();
			case OpenapiprofilePackage.API_INFO__TERMS_OF_SERVICE:
				return getTermsOfService();
			case OpenapiprofilePackage.API_INFO__VERSION:
				return getVersion();
			case OpenapiprofilePackage.API_INFO__LICENSE_NAME:
				return getLicenseName();
			case OpenapiprofilePackage.API_INFO__LICENSE_URL:
				return getLicenseURL();
			case OpenapiprofilePackage.API_INFO__CONTACT_NAME:
				return getContactName();
			case OpenapiprofilePackage.API_INFO__CONTACT_URL:
				return getContactURL();
			case OpenapiprofilePackage.API_INFO__CONTACT_EMAIL:
				return getContactEmail();
			case OpenapiprofilePackage.API_INFO__BASE_MODEL:
				if (resolve) return getBase_Model();
				return basicGetBase_Model();
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
			case OpenapiprofilePackage.API_INFO__TITLE:
				setTitle((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__TERMS_OF_SERVICE:
				setTermsOfService((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__VERSION:
				setVersion((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__LICENSE_NAME:
				setLicenseName((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__LICENSE_URL:
				setLicenseURL((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_NAME:
				setContactName((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_URL:
				setContactURL((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_EMAIL:
				setContactEmail((String)newValue);
				return;
			case OpenapiprofilePackage.API_INFO__BASE_MODEL:
				setBase_Model((Model)newValue);
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
			case OpenapiprofilePackage.API_INFO__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__TERMS_OF_SERVICE:
				setTermsOfService(TERMS_OF_SERVICE_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__LICENSE_NAME:
				setLicenseName(LICENSE_NAME_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__LICENSE_URL:
				setLicenseURL(LICENSE_URL_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_NAME:
				setContactName(CONTACT_NAME_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_URL:
				setContactURL(CONTACT_URL_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__CONTACT_EMAIL:
				setContactEmail(CONTACT_EMAIL_EDEFAULT);
				return;
			case OpenapiprofilePackage.API_INFO__BASE_MODEL:
				setBase_Model((Model)null);
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
			case OpenapiprofilePackage.API_INFO__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenapiprofilePackage.API_INFO__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenapiprofilePackage.API_INFO__TERMS_OF_SERVICE:
				return TERMS_OF_SERVICE_EDEFAULT == null ? termsOfService != null : !TERMS_OF_SERVICE_EDEFAULT.equals(termsOfService);
			case OpenapiprofilePackage.API_INFO__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OpenapiprofilePackage.API_INFO__LICENSE_NAME:
				return LICENSE_NAME_EDEFAULT == null ? licenseName != null : !LICENSE_NAME_EDEFAULT.equals(licenseName);
			case OpenapiprofilePackage.API_INFO__LICENSE_URL:
				return LICENSE_URL_EDEFAULT == null ? licenseURL != null : !LICENSE_URL_EDEFAULT.equals(licenseURL);
			case OpenapiprofilePackage.API_INFO__CONTACT_NAME:
				return CONTACT_NAME_EDEFAULT == null ? contactName != null : !CONTACT_NAME_EDEFAULT.equals(contactName);
			case OpenapiprofilePackage.API_INFO__CONTACT_URL:
				return CONTACT_URL_EDEFAULT == null ? contactURL != null : !CONTACT_URL_EDEFAULT.equals(contactURL);
			case OpenapiprofilePackage.API_INFO__CONTACT_EMAIL:
				return CONTACT_EMAIL_EDEFAULT == null ? contactEmail != null : !CONTACT_EMAIL_EDEFAULT.equals(contactEmail);
			case OpenapiprofilePackage.API_INFO__BASE_MODEL:
				return base_Model != null;
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
		result.append(", description: ");
		result.append(description);
		result.append(", termsOfService: ");
		result.append(termsOfService);
		result.append(", version: ");
		result.append(version);
		result.append(", licenseName: ");
		result.append(licenseName);
		result.append(", licenseURL: ");
		result.append(licenseURL);
		result.append(", contactName: ");
		result.append(contactName);
		result.append(", contactURL: ");
		result.append(contactURL);
		result.append(", contactEmail: ");
		result.append(contactEmail);
		result.append(')');
		return result.toString();
	}

} //APIInfoImpl
