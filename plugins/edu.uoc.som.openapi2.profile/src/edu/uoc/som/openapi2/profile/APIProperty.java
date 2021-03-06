/**
 */
package edu.uoc.som.openapi2.profile;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getRequired <em>Required</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getExample <em>Example</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.APIProperty#getIsID <em>Is ID</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty()
 * @model
 * @generated
 */
public interface APIProperty extends JSONSchemaSubset {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute.
	 * @see #setRequired(Boolean)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Required()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getRequired();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getRequired <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required</em>' attribute.
	 * @see #getRequired()
	 * @generated
	 */
	void setRequired(Boolean value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(XMLElement)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Xml()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	XMLElement getXml();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(XMLElement value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Example()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

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
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_Title()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Is ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is ID</em>' attribute.
	 * @see #setIsID(Boolean)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getAPIProperty_IsID()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getIsID();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.APIProperty#getIsID <em>Is ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is ID</em>' attribute.
	 * @see #getIsID()
	 * @generated
	 */
	void setIsID(Boolean value);

} // APIProperty
