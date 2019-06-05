/**
 */
package edu.som.uoc.openapiprofile;

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
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMultiplOf <em>Multipl Of</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset()
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_MinLength()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinLength <em>Min Length</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_Maximum()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaximum <em>Maximum</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_ExclusiveMaximum()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_Minimum()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinimum <em>Minimum</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_MaxLength()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(Integer)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_MinItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(Integer value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_Pattern()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getPattern <em>Pattern</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_ExclusiveMinimum()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Boolean value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(Integer)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_MaxItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(Integer value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_UniqueItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #getUniqueItems()
	 * @generated
	 */
	void setUniqueItems(Boolean value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_Default()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Multipl Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipl Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multipl Of</em>' attribute.
	 * @see #setMultiplOf(Double)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaSubset_MultiplOf()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMultiplOf();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMultiplOf <em>Multipl Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multipl Of</em>' attribute.
	 * @see #getMultiplOf()
	 * @generated
	 */
	void setMultiplOf(Double value);

} // JSONSchemaSubset
