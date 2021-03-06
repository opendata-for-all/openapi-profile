/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.APIKeyLocation;
import edu.uoc.som.openapi2.profile.OAuth2FlowType;
import edu.uoc.som.openapi2.profile.OpenAPIProfilePackage;
import edu.uoc.som.openapi2.profile.SecurityScheme;
import edu.uoc.som.openapi2.profile.SecuritySchemeType;
import edu.uoc.som.openapi2.profile.SecurityScope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getAuthorizationURL <em>Authorization URL</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getTokenURL <em>Token URL</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.impl.SecuritySchemeImpl#getKey <em>Key</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecuritySchemeImpl extends MinimalEObjectImpl.Container implements SecurityScheme {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final SecuritySchemeType TYPE_EDEFAULT = SecuritySchemeType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SecuritySchemeType type = TYPE_EDEFAULT;

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
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final APIKeyLocation LOCATION_EDEFAULT = APIKeyLocation.UNDEFINED;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected APIKeyLocation location = LOCATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected static final OAuth2FlowType FLOW_EDEFAULT = OAuth2FlowType.UNDEFINED;

	/**
	 * The cached value of the '{@link #getFlow() <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlow()
	 * @generated
	 * @ordered
	 */
	protected OAuth2FlowType flow = FLOW_EDEFAULT;

	/**
	 * The default value of the '{@link #getAuthorizationURL() <em>Authorization URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationURL()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHORIZATION_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAuthorizationURL() <em>Authorization URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationURL()
	 * @generated
	 * @ordered
	 */
	protected String authorizationURL = AUTHORIZATION_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getTokenURL() <em>Token URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenURL()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTokenURL() <em>Token URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTokenURL()
	 * @generated
	 * @ordered
	 */
	protected String tokenURL = TOKEN_URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getScopes() <em>Scopes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScope> scopes;

	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecuritySchemeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIProfilePackage.Literals.SECURITY_SCHEME;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecuritySchemeType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(SecuritySchemeType newType) {
		SecuritySchemeType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIKeyLocation getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLocation(APIKeyLocation newLocation) {
		APIKeyLocation oldLocation = location;
		location = newLocation == null ? LOCATION_EDEFAULT : newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__LOCATION, oldLocation, location));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OAuth2FlowType getFlow() {
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFlow(OAuth2FlowType newFlow) {
		OAuth2FlowType oldFlow = flow;
		flow = newFlow == null ? FLOW_EDEFAULT : newFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__FLOW, oldFlow, flow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAuthorizationURL() {
		return authorizationURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAuthorizationURL(String newAuthorizationURL) {
		String oldAuthorizationURL = authorizationURL;
		authorizationURL = newAuthorizationURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__AUTHORIZATION_URL, oldAuthorizationURL, authorizationURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTokenURL() {
		return tokenURL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTokenURL(String newTokenURL) {
		String oldTokenURL = tokenURL;
		tokenURL = newTokenURL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__TOKEN_URL, oldTokenURL, tokenURL));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SecurityScope> getScopes() {
		if (scopes == null) {
			scopes = new EObjectContainmentEList<SecurityScope>(SecurityScope.class, this, OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES);
		}
		return scopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIProfilePackage.SECURITY_SCHEME__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES:
				return ((InternalEList<?>)getScopes()).basicRemove(otherEnd, msgs);
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
			case OpenAPIProfilePackage.SECURITY_SCHEME__NAME:
				return getName();
			case OpenAPIProfilePackage.SECURITY_SCHEME__TYPE:
				return getType();
			case OpenAPIProfilePackage.SECURITY_SCHEME__DESCRIPTION:
				return getDescription();
			case OpenAPIProfilePackage.SECURITY_SCHEME__LOCATION:
				return getLocation();
			case OpenAPIProfilePackage.SECURITY_SCHEME__FLOW:
				return getFlow();
			case OpenAPIProfilePackage.SECURITY_SCHEME__AUTHORIZATION_URL:
				return getAuthorizationURL();
			case OpenAPIProfilePackage.SECURITY_SCHEME__TOKEN_URL:
				return getTokenURL();
			case OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES:
				return getScopes();
			case OpenAPIProfilePackage.SECURITY_SCHEME__KEY:
				return getKey();
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
			case OpenAPIProfilePackage.SECURITY_SCHEME__NAME:
				setName((String)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__TYPE:
				setType((SecuritySchemeType)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__LOCATION:
				setLocation((APIKeyLocation)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__FLOW:
				setFlow((OAuth2FlowType)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__AUTHORIZATION_URL:
				setAuthorizationURL((String)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__TOKEN_URL:
				setTokenURL((String)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES:
				getScopes().clear();
				getScopes().addAll((Collection<? extends SecurityScope>)newValue);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__KEY:
				setKey((String)newValue);
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
			case OpenAPIProfilePackage.SECURITY_SCHEME__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__FLOW:
				setFlow(FLOW_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__AUTHORIZATION_URL:
				setAuthorizationURL(AUTHORIZATION_URL_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__TOKEN_URL:
				setTokenURL(TOKEN_URL_EDEFAULT);
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES:
				getScopes().clear();
				return;
			case OpenAPIProfilePackage.SECURITY_SCHEME__KEY:
				setKey(KEY_EDEFAULT);
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
			case OpenAPIProfilePackage.SECURITY_SCHEME__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenAPIProfilePackage.SECURITY_SCHEME__TYPE:
				return type != TYPE_EDEFAULT;
			case OpenAPIProfilePackage.SECURITY_SCHEME__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OpenAPIProfilePackage.SECURITY_SCHEME__LOCATION:
				return location != LOCATION_EDEFAULT;
			case OpenAPIProfilePackage.SECURITY_SCHEME__FLOW:
				return flow != FLOW_EDEFAULT;
			case OpenAPIProfilePackage.SECURITY_SCHEME__AUTHORIZATION_URL:
				return AUTHORIZATION_URL_EDEFAULT == null ? authorizationURL != null : !AUTHORIZATION_URL_EDEFAULT.equals(authorizationURL);
			case OpenAPIProfilePackage.SECURITY_SCHEME__TOKEN_URL:
				return TOKEN_URL_EDEFAULT == null ? tokenURL != null : !TOKEN_URL_EDEFAULT.equals(tokenURL);
			case OpenAPIProfilePackage.SECURITY_SCHEME__SCOPES:
				return scopes != null && !scopes.isEmpty();
			case OpenAPIProfilePackage.SECURITY_SCHEME__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
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
		result.append(", type: ");
		result.append(type);
		result.append(", description: ");
		result.append(description);
		result.append(", location: ");
		result.append(location);
		result.append(", flow: ");
		result.append(flow);
		result.append(", authorizationURL: ");
		result.append(authorizationURL);
		result.append(", tokenURL: ");
		result.append(tokenURL);
		result.append(", key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //SecuritySchemeImpl
