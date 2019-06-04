/**
 */
package edu.som.uoc.openapiprofile;

import edu.som.uoc.openapiprofile.types.JSONDataType;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Enumeration;
import org.eclipse.uml2.uml.PrimitiveType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.APIDataType#getType <em>Type</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIDataType#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIDataType#getBase_PrimitiveType <em>Base Primitive Type</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIDataType#getBase_Enumeration <em>Base Enumeration</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIDataType()
 * @model
 * @generated
 */
public interface APIDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.types.JSONDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.types.JSONDataType
	 * @see #setType(JSONDataType)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIDataType_Type()
	 * @model ordered="false"
	 * @generated
	 */
	JSONDataType getType();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIDataType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.types.JSONDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(JSONDataType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIDataType_Format()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIDataType#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Base Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Primitive Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Primitive Type</em>' reference.
	 * @see #setBase_PrimitiveType(PrimitiveType)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIDataType_Base_PrimitiveType()
	 * @model ordered="false"
	 * @generated
	 */
	PrimitiveType getBase_PrimitiveType();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIDataType#getBase_PrimitiveType <em>Base Primitive Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Primitive Type</em>' reference.
	 * @see #getBase_PrimitiveType()
	 * @generated
	 */
	void setBase_PrimitiveType(PrimitiveType value);

	/**
	 * Returns the value of the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Enumeration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Enumeration</em>' reference.
	 * @see #setBase_Enumeration(Enumeration)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIDataType_Base_Enumeration()
	 * @model ordered="false"
	 * @generated
	 */
	Enumeration getBase_Enumeration();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIDataType#getBase_Enumeration <em>Base Enumeration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Enumeration</em>' reference.
	 * @see #getBase_Enumeration()
	 * @generated
	 */
	void setBase_Enumeration(Enumeration value);

} // APIDataType
