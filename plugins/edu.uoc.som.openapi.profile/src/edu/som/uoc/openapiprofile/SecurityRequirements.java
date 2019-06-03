/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapiprofile.SecurityRequirements#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Model <em>Base Model</em>}</li>
 *   <li>{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Operation <em>Base Operation</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityRequirements()
 * @model
 * @generated
 */
public interface SecurityRequirements extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Requirements</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapiprofile.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Requirements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Requirements</em>' containment reference list.
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityRequirements_SecurityRequirements()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurityRequirements();

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
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityRequirements_Base_Model()
	 * @model ordered="false"
	 * @generated
	 */
	Model getBase_Model();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Model <em>Base Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Model</em>' reference.
	 * @see #getBase_Model()
	 * @generated
	 */
	void setBase_Model(Model value);

	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getSecurityRequirements_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

} // SecurityRequirements
