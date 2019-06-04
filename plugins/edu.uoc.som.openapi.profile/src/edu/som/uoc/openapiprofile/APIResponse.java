/**
 */
package edu.som.uoc.openapiprofile;

import edu.som.uoc.openapiprofile.types.Example;
import edu.som.uoc.openapiprofile.types.Header;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getCode <em>Code</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getHeaders <em>Headers</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getExamples <em>Examples</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getBase_Parameter <em>Base Parameter</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse()
 * @model
 * @generated
 */
public interface APIResponse extends EObject {
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' attribute.
	 * @see #setCode(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Code()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getCode();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(String value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapiprofile.types.Header}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' containment reference list.
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Headers()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Header> getHeaders();

	/**
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference.
	 * @see #setExamples(Example)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Examples()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	Example getExamples();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getExamples <em>Examples</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Examples</em>' containment reference.
	 * @see #getExamples()
	 * @generated
	 */
	void setExamples(Example value);

	/**
	 * Returns the value of the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Parameter</em>' reference.
	 * @see #setBase_Parameter(Parameter)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Base_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(Parameter value);

} // APIResponse
