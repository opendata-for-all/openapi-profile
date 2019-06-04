/**
 */
package edu.som.uoc.openapiprofile.impl;

import edu.som.uoc.openapiprofile.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
			case OpenapiprofilePackage.XML_FORMAT: return createXMLFormat();
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS: return createJSONSchemaConstraints();
			case OpenapiprofilePackage.API_DATA_TYPE: return createAPIDataType();
			case OpenapiprofilePackage.API_OPERATION: return createAPIOperation();
			case OpenapiprofilePackage.API_PARAMETER: return createAPIParameter();
			case OpenapiprofilePackage.API_RESPONSE: return createAPIResponse();
			case OpenapiprofilePackage.HEADER: return createHeader();
			case OpenapiprofilePackage.EXAMPLE: return createExample();
			case OpenapiprofilePackage.API_INFO: return createAPIInfo();
			case OpenapiprofilePackage.EXTERNAL_DOCS: return createExternalDocs();
			case OpenapiprofilePackage.SECURITY_DEFINITIONS: return createSecurityDefinitions();
			case OpenapiprofilePackage.SECURITY_SCHEME: return createSecurityScheme();
			case OpenapiprofilePackage.SECURITY_SCOPE: return createSecurityScope();
			case OpenapiprofilePackage.SECURITY: return createSecurity();
			case OpenapiprofilePackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case OpenapiprofilePackage.TAGS: return createTags();
			case OpenapiprofilePackage.TAG: return createTag();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenapiprofilePackage.SCHEME_TYPE:
				return createSchemeTypeFromString(eDataType, initialValue);
			case OpenapiprofilePackage.JSON_DATA_TYPE:
				return createJSONDataTypeFromString(eDataType, initialValue);
			case OpenapiprofilePackage.HTTP_METHOD:
				return createHTTPMethodFromString(eDataType, initialValue);
			case OpenapiprofilePackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case OpenapiprofilePackage.COLLECTION_FORMAT:
				return createCollectionFormatFromString(eDataType, initialValue);
			case OpenapiprofilePackage.SECURITY_SCHEME_TYPE:
				return createSecuritySchemeTypeFromString(eDataType, initialValue);
			case OpenapiprofilePackage.API_KEY_LOCATION:
				return createAPIKeyLocationFromString(eDataType, initialValue);
			case OpenapiprofilePackage.OAUTH2_FLOW_TYPE:
				return createOAuth2FlowTypeFromString(eDataType, initialValue);
			case OpenapiprofilePackage.EINTEGER_OBJECT:
				return createEIntegerObjectFromString(eDataType, initialValue);
			case OpenapiprofilePackage.EBOOLEAN_OBJECT:
				return createEBooleanObjectFromString(eDataType, initialValue);
			case OpenapiprofilePackage.EDOUBLE_OBJECT:
				return createEDoubleObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenapiprofilePackage.SCHEME_TYPE:
				return convertSchemeTypeToString(eDataType, instanceValue);
			case OpenapiprofilePackage.JSON_DATA_TYPE:
				return convertJSONDataTypeToString(eDataType, instanceValue);
			case OpenapiprofilePackage.HTTP_METHOD:
				return convertHTTPMethodToString(eDataType, instanceValue);
			case OpenapiprofilePackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case OpenapiprofilePackage.COLLECTION_FORMAT:
				return convertCollectionFormatToString(eDataType, instanceValue);
			case OpenapiprofilePackage.SECURITY_SCHEME_TYPE:
				return convertSecuritySchemeTypeToString(eDataType, instanceValue);
			case OpenapiprofilePackage.API_KEY_LOCATION:
				return convertAPIKeyLocationToString(eDataType, instanceValue);
			case OpenapiprofilePackage.OAUTH2_FLOW_TYPE:
				return convertOAuth2FlowTypeToString(eDataType, instanceValue);
			case OpenapiprofilePackage.EINTEGER_OBJECT:
				return convertEIntegerObjectToString(eDataType, instanceValue);
			case OpenapiprofilePackage.EBOOLEAN_OBJECT:
				return convertEBooleanObjectToString(eDataType, instanceValue);
			case OpenapiprofilePackage.EDOUBLE_OBJECT:
				return convertEDoubleObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
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
	public XMLFormat createXMLFormat() {
		XMLFormatImpl xmlFormat = new XMLFormatImpl();
		return xmlFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONSchemaConstraints createJSONSchemaConstraints() {
		JSONSchemaConstraintsImpl jsonSchemaConstraints = new JSONSchemaConstraintsImpl();
		return jsonSchemaConstraints;
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
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
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
	public SecurityScheme createSecurityScheme() {
		SecuritySchemeImpl securityScheme = new SecuritySchemeImpl();
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScope createSecurityScope() {
		SecurityScopeImpl securityScope = new SecurityScopeImpl();
		return securityScope;
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
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
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
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeType createSchemeTypeFromString(EDataType eDataType, String initialValue) {
		SchemeType result = SchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDataType createJSONDataTypeFromString(EDataType eDataType, String initialValue) {
		JSONDataType result = JSONDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HTTPMethod createHTTPMethodFromString(EDataType eDataType, String initialValue) {
		HTTPMethod result = HTTPMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHTTPMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation createParameterLocationFromString(EDataType eDataType, String initialValue) {
		ParameterLocation result = ParameterLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormatFromString(EDataType eDataType, String initialValue) {
		CollectionFormat result = CollectionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType createSecuritySchemeTypeFromString(EDataType eDataType, String initialValue) {
		SecuritySchemeType result = SecuritySchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritySchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeyLocation createAPIKeyLocationFromString(EDataType eDataType, String initialValue) {
		APIKeyLocation result = APIKeyLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPIKeyLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2FlowType createOAuth2FlowTypeFromString(EDataType eDataType, String initialValue) {
		OAuth2FlowType result = OAuth2FlowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOAuth2FlowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEIntegerObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEIntegerObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEBooleanObjectFromString(EDataType eDataType, String initialValue) {
		return (Object)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEBooleanObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createEDoubleObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEDoubleObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
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
