/**
 */
package edu.som.uoc.openapiprofile;

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
 *   <li>{@link edu.som.uoc.openapiprofile.Header#isArray <em>Array</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Header#getConstraints <em>Constraints</em>}</li>
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
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Array()
	 * @model dataType="org.eclipse.uml2.types.Boolean" ordered="false"
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

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
	 * Returns the value of the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraints</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints</em>' containment reference.
	 * @see #setConstraints(JSONSchemaConstraints)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHeader_Constraints()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	JSONSchemaConstraints getConstraints();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Header#getConstraints <em>Constraints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints</em>' containment reference.
	 * @see #getConstraints()
	 * @generated
	 */
	void setConstraints(JSONSchemaConstraints value);

} // Header
