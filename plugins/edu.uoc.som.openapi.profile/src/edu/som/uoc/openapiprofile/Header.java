/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getType <em>Type</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getFormat <em>Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getPattern <em>Pattern</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapiprofile.JSONDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.JSONDataType
	 * @see #setType(JSONDataType)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	JSONDataType getType();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.JSONDataType
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Format()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_CollectionFormat()
	 * @model ordered="false"
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see edu.som.uoc.openapiprofile.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_MinItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMinItems <em>Min Items</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Pattern()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getPattern <em>Pattern</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_ExclusiveMinimum()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #getExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(Boolean value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Minimum()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMinimum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Double value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_MinLength()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(Integer value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_MaxLength()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxLength();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(Integer value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Maximum()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Double value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_MaxItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(Integer value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_ExclusiveMaximum()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getExclusiveMaximum();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #getExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(Boolean value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Default()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_UniqueItems()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getUniqueItems();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getUniqueItems <em>Unique Items</em>}' attribute.
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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_MultipleOf()
	 * @model dataType="edu.som.uoc.openapiprofile.Double" ordered="false"
	 * @generated
	 */
	Double getMultipleOf();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(Double value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Items()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getItems();

} // Header
