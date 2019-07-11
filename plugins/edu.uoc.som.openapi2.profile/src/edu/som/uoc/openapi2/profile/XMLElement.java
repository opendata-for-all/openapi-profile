/**
 */
package edu.som.uoc.openapi2.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XML Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.XMLElement#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.XMLElement#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.XMLElement#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.XMLElement#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.XMLElement#getWrapped <em>Wrapped</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement()
 * @model
 * @generated
 */
public interface XMLElement extends EObject {
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
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.XMLElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement_Namespace()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.XMLElement#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prefix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prefix</em>' attribute.
	 * @see #setPrefix(String)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement_Prefix()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPrefix();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.XMLElement#getPrefix <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prefix</em>' attribute.
	 * @see #getPrefix()
	 * @generated
	 */
	void setPrefix(String value);

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' attribute.
	 * @see #setAttribute(Boolean)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement_Attribute()
	 * @model dataType="edu.som.uoc.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getAttribute();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.XMLElement#getAttribute <em>Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' attribute.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(Boolean value);

	/**
	 * Returns the value of the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Wrapped</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wrapped</em>' attribute.
	 * @see #setWrapped(Boolean)
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getXMLElement_Wrapped()
	 * @model dataType="edu.som.uoc.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getWrapped();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.XMLElement#getWrapped <em>Wrapped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrapped</em>' attribute.
	 * @see #getWrapped()
	 * @generated
	 */
	void setWrapped(Boolean value);

} // XMLElement
