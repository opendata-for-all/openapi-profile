/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage
 * @generated
 */
public interface OpenapiprofileFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenapiprofileFactory eINSTANCE = edu.som.uoc.openapiprofile.impl.OpenapiprofileFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>API Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Property</em>'.
	 * @generated
	 */
	APIProperty createAPIProperty();

	/**
	 * Returns a new object of class '<em>API Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Data Type</em>'.
	 * @generated
	 */
	APIDataType createAPIDataType();

	/**
	 * Returns a new object of class '<em>API Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Operation</em>'.
	 * @generated
	 */
	APIOperation createAPIOperation();

	/**
	 * Returns a new object of class '<em>API Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Parameter</em>'.
	 * @generated
	 */
	APIParameter createAPIParameter();

	/**
	 * Returns a new object of class '<em>API Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Response</em>'.
	 * @generated
	 */
	APIResponse createAPIResponse();

	/**
	 * Returns a new object of class '<em>API Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API Info</em>'.
	 * @generated
	 */
	APIInfo createAPIInfo();

	/**
	 * Returns a new object of class '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Docs</em>'.
	 * @generated
	 */
	ExternalDocs createExternalDocs();

	/**
	 * Returns a new object of class '<em>Security Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Definitions</em>'.
	 * @generated
	 */
	SecurityDefinitions createSecurityDefinitions();

	/**
	 * Returns a new object of class '<em>Security Requirements</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirements</em>'.
	 * @generated
	 */
	SecurityRequirements createSecurityRequirements();

	/**
	 * Returns a new object of class '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tags</em>'.
	 * @generated
	 */
	Tags createTags();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenapiprofilePackage getOpenapiprofilePackage();

} //OpenapiprofileFactory
