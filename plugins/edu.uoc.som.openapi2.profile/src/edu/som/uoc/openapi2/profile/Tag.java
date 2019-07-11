/**
 */
package edu.som.uoc.openapi2.profile;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tag</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.Tag#getExternalDocsURL <em>External Docs URL</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.Tag#getExternalDocsDescription <em>External Docs Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.Tag#getName <em>Name</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.Tag#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapi2.profile.openapiPackage#getTag()
 * @model
 * @generated
 */
public interface Tag extends EObject {
	/**
	 * Returns the value of the '<em><b>External Docs URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Docs URL</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs URL</em>' attribute.
	 * @see #setExternalDocsURL(String)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getTag_ExternalDocsURL()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExternalDocsURL();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.Tag#getExternalDocsURL <em>External Docs URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs URL</em>' attribute.
	 * @see #getExternalDocsURL()
	 * @generated
	 */
	void setExternalDocsURL(String value);

	/**
	 * Returns the value of the '<em><b>External Docs Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Docs Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Docs Description</em>' attribute.
	 * @see #setExternalDocsDescription(String)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getTag_ExternalDocsDescription()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getExternalDocsDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.Tag#getExternalDocsDescription <em>External Docs Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>External Docs Description</em>' attribute.
	 * @see #getExternalDocsDescription()
	 * @generated
	 */
	void setExternalDocsDescription(String value);

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
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getTag_Name()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.Tag#getName <em>Name</em>}' attribute.
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
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getTag_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.Tag#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Tag
