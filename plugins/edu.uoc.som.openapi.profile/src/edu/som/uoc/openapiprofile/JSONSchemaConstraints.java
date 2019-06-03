/**
 */
package edu.som.uoc.openapiprofile;

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
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinimum <em>Minimum</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints()
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
	 * @see #setExclusiveMaximum(boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_ExclusiveMaximum()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isExclusiveMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#isExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #isExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(boolean value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_MinLength()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_MaxLength()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_Pattern()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getPattern <em>Pattern</em>}' attribute.
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
	 * @see #setMinItems(int)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_MinItems()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMinItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_ExclusiveMinimum()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isExclusiveMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#isExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #isExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(int)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_MaxItems()
	 * @model dataType="org.eclipse.uml2.types.Integer" ordered="false"
	 * @generated
	 */
	int getMaxItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(int value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(double)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_Maximum()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(double value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(double)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getJSONSchemaConstraints_Minimum()
	 * @model dataType="org.eclipse.uml2.types.Real" ordered="false"
	 * @generated
	 */
	double getMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(double value);

} // JSONSchemaConstraints
