/**
 */
package edu.uoc.som.openapi2.profile.impl;

import edu.uoc.som.openapi2.profile.*;

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
public class OpenAPIProfileFactoryImpl extends EFactoryImpl implements OpenAPIProfileFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenAPIProfileFactory init() {
		try {
			OpenAPIProfileFactory theOpenAPIProfileFactory = (OpenAPIProfileFactory)EPackage.Registry.INSTANCE.getEFactory(OpenAPIProfilePackage.eNS_URI);
			if (theOpenAPIProfileFactory != null) {
				return theOpenAPIProfileFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenAPIProfileFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPIProfileFactoryImpl() {
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
			case OpenAPIProfilePackage.API: return createAPI();
			case OpenAPIProfilePackage.SCHEMA: return createSchema();
			case OpenAPIProfilePackage.API_OPERATION: return createAPIOperation();
			case OpenAPIProfilePackage.API_PARAMETER: return createAPIParameter();
			case OpenAPIProfilePackage.API_RESPONSE: return createAPIResponse();
			case OpenAPIProfilePackage.HEADER: return createHeader();
			case OpenAPIProfilePackage.EXAMPLE: return createExample();
			case OpenAPIProfilePackage.API_INFO: return createAPIInfo();
			case OpenAPIProfilePackage.LICENSE: return createLicense();
			case OpenAPIProfilePackage.CONTACT: return createContact();
			case OpenAPIProfilePackage.EXTERNAL_DOCS: return createExternalDocs();
			case OpenAPIProfilePackage.SECURITY_DEFINITIONS: return createSecurityDefinitions();
			case OpenAPIProfilePackage.SECURITY_SCHEME: return createSecurityScheme();
			case OpenAPIProfilePackage.SECURITY_SCOPE: return createSecurityScope();
			case OpenAPIProfilePackage.SECURITY: return createSecurity();
			case OpenAPIProfilePackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			case OpenAPIProfilePackage.REQUIRED_SECURITY_SCHEME: return createRequiredSecurityScheme();
			case OpenAPIProfilePackage.TAGS: return createTags();
			case OpenAPIProfilePackage.TAG: return createTag();
			case OpenAPIProfilePackage.XML_ELEMENT: return createXMLElement();
			case OpenAPIProfilePackage.API_DATA_TYPE: return createAPIDataType();
			case OpenAPIProfilePackage.API_PROPERTY: return createAPIProperty();
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
			case OpenAPIProfilePackage.SCHEME_TYPE:
				return createSchemeTypeFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.HTTP_METHOD:
				return createHTTPMethodFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.COLLECTION_FORMAT:
				return createCollectionFormatFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.JSON_DATA_TYPE:
				return createJSONDataTypeFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.SECURITY_SCHEME_TYPE:
				return createSecuritySchemeTypeFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.API_KEY_LOCATION:
				return createAPIKeyLocationFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.OAUTH2_FLOW_TYPE:
				return createOAuth2FlowTypeFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.INTEGER:
				return createIntegerFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.BOOLEAN:
				return createBooleanFromString(eDataType, initialValue);
			case OpenAPIProfilePackage.DOUBLE:
				return createDoubleFromString(eDataType, initialValue);
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
			case OpenAPIProfilePackage.SCHEME_TYPE:
				return convertSchemeTypeToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.HTTP_METHOD:
				return convertHTTPMethodToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.COLLECTION_FORMAT:
				return convertCollectionFormatToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.JSON_DATA_TYPE:
				return convertJSONDataTypeToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.SECURITY_SCHEME_TYPE:
				return convertSecuritySchemeTypeToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.API_KEY_LOCATION:
				return convertAPIKeyLocationToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.OAUTH2_FLOW_TYPE:
				return convertOAuth2FlowTypeToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.INTEGER:
				return convertIntegerToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.BOOLEAN:
				return convertBooleanToString(eDataType, instanceValue);
			case OpenAPIProfilePackage.DOUBLE:
				return convertDoubleToString(eDataType, instanceValue);
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
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIOperation createAPIOperation() {
		APIOperationImpl apiOperation = new APIOperationImpl();
		return apiOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIParameter createAPIParameter() {
		APIParameterImpl apiParameter = new APIParameterImpl();
		return apiParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIResponse createAPIResponse() {
		APIResponseImpl apiResponse = new APIResponseImpl();
		return apiResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIInfo createAPIInfo() {
		APIInfoImpl apiInfo = new APIInfoImpl();
		return apiInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExternalDocs createExternalDocs() {
		ExternalDocsImpl externalDocs = new ExternalDocsImpl();
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityDefinitions createSecurityDefinitions() {
		SecurityDefinitionsImpl securityDefinitions = new SecurityDefinitionsImpl();
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScheme createSecurityScheme() {
		SecuritySchemeImpl securityScheme = new SecuritySchemeImpl();
		return securityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityScope createSecurityScope() {
		SecurityScopeImpl securityScope = new SecurityScopeImpl();
		return securityScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequiredSecurityScheme createRequiredSecurityScheme() {
		RequiredSecuritySchemeImpl requiredSecurityScheme = new RequiredSecuritySchemeImpl();
		return requiredSecurityScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tags createTags() {
		TagsImpl tags = new TagsImpl();
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLElement createXMLElement() {
		XMLElementImpl xmlElement = new XMLElementImpl();
		return xmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIDataType createAPIDataType() {
		APIDataTypeImpl apiDataType = new APIDataTypeImpl();
		return apiDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public APIProperty createAPIProperty() {
		APIPropertyImpl apiProperty = new APIPropertyImpl();
		return apiProperty;
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
	public Integer createIntegerFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean createBooleanFromString(EDataType eDataType, String initialValue) {
		return (Boolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createDoubleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoubleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OpenAPIProfilePackage getOpenAPIProfilePackage() {
		return (OpenAPIProfilePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenAPIProfilePackage getPackage() {
		return OpenAPIProfilePackage.eINSTANCE;
	}

} //OpenAPIProfileFactoryImpl
