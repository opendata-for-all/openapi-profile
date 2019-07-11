/**
 */
package edu.som.uoc.openapi2.profile;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getProduces <em>Produces</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getSummary <em>Summary</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getTags <em>Tags</em>}</li>
 *   <li>{@link edu.som.uoc.openapi2.profile.APIOperation#getDeprecated <em>Deprecated</em>}</li>
 * </ul>
 *
 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation()
 * @model
 * @generated
 */
public interface APIOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_RelativePath()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * The literals are from the enumeration {@link edu.som.uoc.openapi2.profile.HTTPMethod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.HTTPMethod
	 * @see #setMethod(HTTPMethod)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Method()
	 * @model ordered="false"
	 * @generated
	 */
	HTTPMethod getMethod();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see edu.som.uoc.openapi2.profile.HTTPMethod
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(HTTPMethod value);

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute list.
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Produces()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Consumes()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getConsumes();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link edu.som.uoc.openapi2.profile.SchemeType}.
	 * The literals are from the enumeration {@link edu.som.uoc.openapi2.profile.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see edu.som.uoc.openapi2.profile.SchemeType
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Schemes()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Summary()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

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
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Description()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

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
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Base_Operation()
	 * @model ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' attribute list.
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Tags()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getTags();

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see edu.som.uoc.openapi2.profile.openapiPackage#getAPIOperation_Deprecated()
	 * @model dataType="edu.som.uoc.openapi2.profile.Boolean" ordered="false"
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link edu.som.uoc.openapi2.profile.APIOperation#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

} // APIOperation
