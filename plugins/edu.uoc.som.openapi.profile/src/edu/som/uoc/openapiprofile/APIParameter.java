/**
 */
package edu.som.uoc.openapiprofile;

import edu.som.uoc.openapiprofile.types.CollectionFormat;
import edu.som.uoc.openapiprofile.types.JSONSchemaConstraints;
import edu.som.uoc.openapiprofile.types.ParameterLocation;

import org.eclipse.emf.ecore.EObject;

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
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getLocation <em>Location</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValues <em>Allow Empty Values</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getBase_Parameter <em>Base Parameter</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.APIParameter#getConstraints <em>Constraints</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter()
 * @model
 * @generated
 */
public interface APIParameter extends EObject {
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.types.ParameterLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.types.ParameterLocation
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
	 * @see edu.som.uoc.openapiprofile.types.ParameterLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(ParameterLocation value);

	/**
	 * Returns the value of the '<em><b>Allow Empty Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Empty Values</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Empty Values</em>' attribute.
	 * @see #setAllowEmptyValues(Boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_AllowEmptyValues()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EBooleanObject" ordered="false"
	 * @generated
	 */
	Object getAllowEmptyValues();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValues <em>Allow Empty Values</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Empty Values</em>' attribute.
	 * @see #getAllowEmptyValues()
	 * @generated
	 */
	void setAllowEmptyValues(Object value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.types.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.types.CollectionFormat
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
	 * @see edu.som.uoc.openapiprofile.types.CollectionFormat
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

	/**
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(JSONSchemaConstraints)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getAPIParameter_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	JSONSchemaConstraints getConstraints();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.APIParameter#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(JSONSchemaConstraints value);

} // APIParameter
