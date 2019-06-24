/**
 */
package edu.som.uoc.openapiprofile;

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
 *   <li>{@link edu.som.uoc.openapiprofile.APIResponse#getDefault <em>Default</em>}</li>
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
	 * @see #setCode(int)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Code()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getCode();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getCode <em>Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' attribute.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(int value);

	/**
	 * Returns the value of the '<em><b>Headers</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapiprofile.Header}.
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
	 * Returns the value of the '<em><b>Examples</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapiprofile.Example}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Examples</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Examples</em>' containment reference list.
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Examples()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<Example> getExamples();

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

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(Boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIResponse_Default()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getDefault();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIResponse#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(Boolean value);

} // APIResponse
