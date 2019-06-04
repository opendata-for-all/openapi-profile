/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenapiprofileFactoryImpl extends EFactoryImpl implements OpenapiprofileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenapiprofileFactory init() {
		try {
			OpenapiprofileFactory theOpenapiprofileFactory = (OpenapiprofileFactory)EPackage.Registry.INSTANCE.getEFactory(OpenapiprofilePackage.eNS_URI);
			if (theOpenapiprofileFactory != null) {
				return theOpenapiprofileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenapiprofileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofileFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenapiprofilePackage.API: return createAPI();
			case OpenapiprofilePackage.SCHEMA: return createSchema();
			case OpenapiprofilePackage.API_PROPERTY: return createAPIProperty();
			case OpenapiprofilePackage.API_DATA_TYPE: return createAPIDataType();
			case OpenapiprofilePackage.API_OPERATION: return createAPIOperation();
			case OpenapiprofilePackage.API_PARAMETER: return createAPIParameter();
			case OpenapiprofilePackage.API_RESPONSE: return createAPIResponse();
			case OpenapiprofilePackage.API_INFO: return createAPIInfo();
			case OpenapiprofilePackage.EXTERNAL_DOCS: return createExternalDocs();
			case OpenapiprofilePackage.SECURITY_DEFINITIONS: return createSecurityDefinitions();
			case OpenapiprofilePackage.SECURITY: return createSecurity();
			case OpenapiprofilePackage.TAGS: return createTags();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIProperty createAPIProperty() {
		APIPropertyImpl apiProperty = new APIPropertyImpl();
		return apiProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIDataType createAPIDataType() {
		APIDataTypeImpl apiDataType = new APIDataTypeImpl();
		return apiDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIOperation createAPIOperation() {
		APIOperationImpl apiOperation = new APIOperationImpl();
		return apiOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIParameter createAPIParameter() {
		APIParameterImpl apiParameter = new APIParameterImpl();
		return apiParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIResponse createAPIResponse() {
		APIResponseImpl apiResponse = new APIResponseImpl();
		return apiResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIInfo createAPIInfo() {
		APIInfoImpl apiInfo = new APIInfoImpl();
		return apiInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs createExternalDocs() {
		ExternalDocsImpl externalDocs = new ExternalDocsImpl();
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityDefinitions createSecurityDefinitions() {
		SecurityDefinitionsImpl securityDefinitions = new SecurityDefinitionsImpl();
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofilePackage getOpenapiprofilePackage() {
		return (OpenapiprofilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenapiprofilePackage getPackage() {
		return OpenapiprofilePackage.eINSTANCE;
	}

} //OpenapiprofileFactoryImpl
