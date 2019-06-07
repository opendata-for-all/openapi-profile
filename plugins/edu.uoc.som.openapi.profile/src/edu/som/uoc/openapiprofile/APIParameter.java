/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.uml2.uml.Parameter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValue <em>Allow Empty Value</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getBase_Parameter <em>Base Parameter</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter()
 * @model
 * @generated
 */
public interface APIParameter extends JSONSchemaSubset {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.ParameterLocation
	 * @see #setLocation(ParameterLocation)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_Location()
	 * @model ordered="false"
	 * @generated
	 */
	ParameterLocation getLocation();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Allow Empty Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Empty Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Empty Value</em>' attribute.
	 * @see #setAllowEmptyValue(Boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_AllowEmptyValue()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getAllowEmptyValue();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValue <em>Allow Empty Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Value</em>' attribute.
	 * @see #getAllowEmptyValue()
	 * @generated
	 */
	void setAllowEmptyValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_CollectionFormat()
	 * @model ordered="false"
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_Base_Parameter()
	 * @model ordered="false"
	 * @generated
	 */
	Parameter getBase_Parameter();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getBase_Parameter <em>Base Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Parameter</em>' reference.
	 * @see #getBase_Parameter()
	 * @generated
	 */
	void setBase_Parameter(Parameter value);

} // APIParameter
