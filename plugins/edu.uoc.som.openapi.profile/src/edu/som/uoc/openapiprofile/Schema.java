/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getAdditionalPropertiesAllowed <em>Additional Properties Allowed</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getExample <em>Example</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getDefault <em>Default</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.Schema#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends EObject {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Title()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' attribute.
	 * @see #setMaxProperties(Integer)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_MaxProperties()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getMaxProperties <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Properties</em>' attribute.
	 * @see #getMaxProperties()
	 * @generated
	 */
	void setMaxProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' attribute.
	 * @see #setMinProperties(Integer)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_MinProperties()
	 * @model dataType="edu.som.uoc.openapiprofile.Integer" ordered="false"
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getMinProperties <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Properties</em>' attribute.
	 * @see #getMinProperties()
	 * @generated
	 */
	void setMinProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Discriminator()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getDiscriminator <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' attribute.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Properties Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties Allowed</em>' attribute.
	 * @see #setAdditionalPropertiesAllowed(Boolean)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_AdditionalPropertiesAllowed()
	 * @model dataType="edu.som.uoc.openapiprofile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getAdditionalPropertiesAllowed();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getAdditionalPropertiesAllowed <em>Additional Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties Allowed</em>' attribute.
	 * @see #getAdditionalPropertiesAllowed()
	 * @generated
	 */
	void setAdditionalPropertiesAllowed(Boolean value);

	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Base_Class()
	 * @model ordered="false"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Example()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Default()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Additional Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Properties</em>' attribute.
	 * @see #setAdditionalProperties(String)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSchema_AdditionalProperties()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getAdditionalProperties();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.Schema#getAdditionalProperties <em>Additional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Properties</em>' attribute.
	 * @see #getAdditionalProperties()
	 * @generated
	 */
	void setAdditionalProperties(String value);

} // Schema
