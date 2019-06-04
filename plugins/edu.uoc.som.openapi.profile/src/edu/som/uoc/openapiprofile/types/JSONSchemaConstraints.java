/**
 */
package edu.som.uoc.openapiprofile.types;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Schema Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints()
 * @model
 * @generated
 */
public interface JSONSchemaConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #setExclusiveMaximum(Boolean)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_ExclusiveMaximum()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EBooleanObject" ordered="false"
	 * @generated
	 */
	Object getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #getExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(Object value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_MinLength()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EIntegerObject" ordered="false"
	 * @generated
	 */
	Object getMinLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Object value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_MaxLength()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EIntegerObject" ordered="false"
	 * @generated
	 */
	Object getMaxLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Object value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_Pattern()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_MinItems()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EIntegerObject" ordered="false"
	 * @generated
	 */
	Object getMinItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(Object value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(Boolean)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_ExclusiveMinimum()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EBooleanObject" ordered="false"
	 * @generated
	 */
	Object getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Object value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_MaxItems()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EIntegerObject" ordered="false"
	 * @generated
	 */
	Object getMaxItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(Object value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_Maximum()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EDoubleObject" ordered="false"
	 * @generated
	 */
	Object getMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Object value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Object)
	 * @see edu.som.uoc.openapiprofile.types.typesPackage#getJSONSchemaConstraints_Minimum()
	 * @model dataType="edu.som.uoc.openapiprofile.types.EDoubleObject" ordered="false"
	 * @generated
	 */
	Object getMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Object value);

} // JSONSchemaConstraints
