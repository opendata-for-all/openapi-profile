/**
 */
package edu.som.uoc.openapi2.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Scheme</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getType <em>Type</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getFlow <em>Flow</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getAuthorizationURL <em>Authorization URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getTokenURL <em>Token URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getScopes <em>Scopes</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityScheme#getReferenceName <em>Reference Name</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme()
 * @model
 * @generated
 */
public interface SecurityScheme extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapi2.profile.SecuritySchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.SecuritySchemeType
	 * @see #setType(SecuritySchemeType)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Type()
	 * @model ordered="false"
	 * @generated
	 */
	SecuritySchemeType getType();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.SecuritySchemeType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecuritySchemeType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapi2.profile.APIKeyLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.APIKeyLocation
	 * @see #setLocation(APIKeyLocation)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Location()
	 * @model ordered="false"
	 * @generated
	 */
	APIKeyLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.APIKeyLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(APIKeyLocation value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapi2.profile.OAuth2FlowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.OAuth2FlowType
	 * @see #setFlow(OAuth2FlowType)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Flow()
	 * @model ordered="false"
	 * @generated
	 */
	OAuth2FlowType getFlow();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.OAuth2FlowType
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(OAuth2FlowType value);

	/**
	 * Returns the value of the '<em><b>Authorization URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization URL</em>' attribute.
	 * @see #setAuthorizationURL(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_AuthorizationURL()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAuthorizationURL();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getAuthorizationURL <em>Authorization URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization URL</em>' attribute.
	 * @see #getAuthorizationURL()
	 * @generated
	 */
	void setAuthorizationURL(String value);

	/**
	 * Returns the value of the '<em><b>Token URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token URL</em>' attribute.
	 * @see #setTokenURL(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_TokenURL()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTokenURL();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getTokenURL <em>Token URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token URL</em>' attribute.
	 * @see #getTokenURL()
	 * @generated
	 */
	void setTokenURL(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapi2.profile.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_Scopes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityScope> getScopes();

	/**
	 * Returns the value of the '<em><b>Reference Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference Name</em>' attribute.
	 * @see #setReferenceName(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityScheme_ReferenceName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReferenceName();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.SecurityScheme#getReferenceName <em>Reference Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Name</em>' attribute.
	 * @see #getReferenceName()
	 * @generated
	 */
	void setReferenceName(String value);

} // SecurityScheme
