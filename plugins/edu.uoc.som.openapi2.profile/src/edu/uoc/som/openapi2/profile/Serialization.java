/**
 */
package edu.uoc.som.openapi2.profile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Association;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Serialization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.uoc.som.openapi2.profile.Serialization#getIncludesTarget <em>Includes Target</em>}</li>
 *   <li>{@link edu.uoc.som.openapi2.profile.Serialization#getBase_Association <em>Base Association</em>}</li>
 * </ul>
 *
 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getSerialization()
 * @model
 * @generated
 */
public interface Serialization extends EObject {
	/**
	 * Returns the value of the '<em><b>Includes Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Includes Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Includes Target</em>' attribute.
	 * @see #setIncludesTarget(Boolean)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getSerialization_IncludesTarget()
	 * @model dataType="edu.uoc.som.openapi2.profile.Boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getIncludesTarget();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.Serialization#getIncludesTarget <em>Includes Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Includes Target</em>' attribute.
	 * @see #getIncludesTarget()
	 * @generated
	 */
	void setIncludesTarget(Boolean value);

	/**
	 * Returns the value of the '<em><b>Base Association</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Association</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Association</em>' reference.
	 * @see #setBase_Association(Association)
	 * @see edu.uoc.som.openapi2.profile.OpenAPIProfilePackage#getSerialization_Base_Association()
	 * @model ordered="false"
	 * @generated
	 */
	Association getBase_Association();

	/**
	 * Sets the value of the '{@link edu.uoc.som.openapi2.profile.Serialization#getBase_Association <em>Base Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Association</em>' reference.
	 * @see #getBase_Association()
	 * @generated
	 */
	void setBase_Association(Association value);

} // Serialization
