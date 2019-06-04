/**
 */
package edu.som.uoc.openapiprofile;

import edu.som.uoc.openapiprofile.types.SecurityScheme;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.SecurityDefinitions#getSecuritySchemes <em>Security Schemes</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.SecurityDefinitions#getBase_Model <em>Base Model</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityDefinitions()
 * @model
 * @generated
 */
public interface SecurityDefinitions extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Schemes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapiprofile.types.SecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Schemes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Schemes</em>' containment reference list.
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityDefinitions_SecuritySchemes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityScheme> getSecuritySchemes();

	/**
	 * Returns the value of the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Model</em>' reference.
	 * @see #setBase_Model(Model)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityDefinitions_Base_Model()
	 * @model ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.SecurityDefinitions#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

} // SecurityDefinitions
