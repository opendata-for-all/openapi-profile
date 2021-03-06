/**
 */
package edu.uoc.som.openapi2.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Schema Subset</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset()
 * @model abstract="true"
 * @generated
 */
public interface JSONSchemaSubset extends EObject {
	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(Integer)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_MinLength()
	 * @model dataType="edu.uoc.som.openapi2.profile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(Double)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_Maximum()
	 * @model dataType="edu.uoc.som.openapi2.profile.Double" ordered="false"
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Double value);

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
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_ExclusiveMaximum()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #getExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(Boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Double)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_Minimum()
	 * @model dataType="edu.uoc.som.openapi2.profile.Double" ordered="false"
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Double value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(Integer)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_MaxLength()
	 * @model dataType="edu.uoc.som.openapi2.profile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

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
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_Pattern()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

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
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_ExclusiveMinimum()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Boolean value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(Boolean)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_UniqueItems()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #getUniqueItems()
	 * @generated
	 */
	void setUniqueItems(Boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(Double)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getJSONSchemaSubset_MultipleOf()
	 * @model dataType="edu.uoc.som.openapi2.profile.Double" ordered="false"
	 * @generated
	 */
	Double getMultipleOf();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.JSONSchemaSubset#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(Double value);

} // JSONSchemaSubset
