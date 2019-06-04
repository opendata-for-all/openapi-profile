/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link edu.som.uoc.openapiprofile.APIProperty#getXml <em>Xml</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIProperty#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIProperty()
 * @model
 * @generated
 */
public interface APIProperty extends EObject {
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIProperty_Xml()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	XMLElement getXml();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIProperty#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(XMLElement value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIProperty_Base_Property()
	 * @model ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIProperty#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // APIProperty
