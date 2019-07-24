/**
 */
package edu.som.uoc.openapi2.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.SecurityRequirement#getSecuritySchemes <em>Security Schemes</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityRequirement()
 * @model
 * @generated
 */
public interface SecurityRequirement extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Schemes</b></em>' containment reference list.
	 * The list contents are of type {@link edu.som.uoc.openapi2.profile.RequiredSecurityScheme}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Schemes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Schemes</em>' containment reference list.
	 * @see edu.som.uoc.openapi2.profile.OpenAPIProfilePackage#getSecurityRequirement_SecuritySchemes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<RequiredSecurityScheme> getSecuritySchemes();

} // SecurityRequirement
