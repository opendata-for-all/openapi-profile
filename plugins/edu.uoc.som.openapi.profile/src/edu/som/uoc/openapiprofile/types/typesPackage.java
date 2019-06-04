/**
 */
package edu.som.uoc.openapiprofile.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.types.typesFactory
 * @model kind="package"
 * @generated
 */
public interface typesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///OpenAPIProfile/types.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "OpenAPIProfile.types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	typesPackage eINSTANCE = edu.som.uoc.openapiprofile.types.impl.typesPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl <em>XML Format</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getXMLFormat()
	 * @generated
	 */
	int XML_FORMAT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT__WRAPPED = 4;

	/**
	 * The number of structural features of the '<em>XML Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>XML Format</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FORMAT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.HeaderImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__ARRAY = 4;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__COLLECTION_FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__CONSTRAINTS = 6;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl <em>JSON Schema Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getJSONSchemaConstraints()
	 * @generated
	 */
	int JSON_SCHEMA_CONSTRAINTS = 2;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM = 0;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH = 1;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH = 2;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__PATTERN = 3;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM = 5;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS = 6;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MAXIMUM = 7;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS__MINIMUM = 8;

	/**
	 * The number of structural features of the '<em>JSON Schema Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>JSON Schema Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.ExampleImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 3;

	/**
	 * The feature id for the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__MIME_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Example</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.SecuritySchemeImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Flow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__FLOW = 4;

	/**
	 * The feature id for the '<em><b>Authorization URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__AUTHORIZATION_URL = 5;

	/**
	 * The feature id for the '<em><b>Token URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__TOKEN_URL = 6;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME__SCOPES = 7;

	/**
	 * The number of structural features of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Security Scheme</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCHEME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.SecurityScopeImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityScope()
	 * @generated
	 */
	int SECURITY_SCOPE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE__DESCRIPTION = 1;

	/**
	 * The number of structural features of the '<em>Security Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.SecurityRequirementImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT__SCOPE = 1;

	/**
	 * The number of structural features of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Requirement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.impl.TagImpl
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getTag()
	 * @generated
	 */
	int TAG = 7;

	/**
	 * The feature id for the '<em><b>External Docs URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__EXTERNAL_DOCS_URL = 0;

	/**
	 * The feature id for the '<em><b>External Docs Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__EXTERNAL_DOCS_DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__NAME = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG__DESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.SchemeType
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 8;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.JSONDataType <em>JSON Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.JSONDataType
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getJSONDataType()
	 * @generated
	 */
	int JSON_DATA_TYPE = 9;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.HTTPMethod <em>HTTP Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.HTTPMethod
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getHTTPMethod()
	 * @generated
	 */
	int HTTP_METHOD = 10;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.ParameterLocation
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 11;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.CollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.CollectionFormat
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 12;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.SecuritySchemeType
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecuritySchemeType()
	 * @generated
	 */
	int SECURITY_SCHEME_TYPE = 13;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.APIKeyLocation <em>API Key Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.APIKeyLocation
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getAPIKeyLocation()
	 * @generated
	 */
	int API_KEY_LOCATION = 14;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.types.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.types.OAuth2FlowType
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getOAuth2FlowType()
	 * @generated
	 */
	int OAUTH2_FLOW_TYPE = 15;

	/**
	 * The meta object id for the '<em>EInteger Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEIntegerObject()
	 * @generated
	 */
	int EINTEGER_OBJECT = 16;

	/**
	 * The meta object id for the '<em>EBoolean Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Boolean
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEBooleanObject()
	 * @generated
	 */
	int EBOOLEAN_OBJECT = 17;

	/**
	 * The meta object id for the '<em>EDouble Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEDoubleObject()
	 * @generated
	 */
	int EDOUBLE_OBJECT = 18;


	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.XMLFormat <em>XML Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Format</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat
	 * @generated
	 */
	EClass getXMLFormat();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.XMLFormat#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat#getName()
	 * @see #getXMLFormat()
	 * @generated
	 */
	EAttribute getXMLFormat_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.XMLFormat#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat#getNamespace()
	 * @see #getXMLFormat()
	 * @generated
	 */
	EAttribute getXMLFormat_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.XMLFormat#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat#getPrefix()
	 * @see #getXMLFormat()
	 * @generated
	 */
	EAttribute getXMLFormat_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.XMLFormat#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat#getAttribute()
	 * @see #getXMLFormat()
	 * @generated
	 */
	EAttribute getXMLFormat_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.XMLFormat#getWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see edu.som.uoc.openapiprofile.types.XMLFormat#getWrapped()
	 * @see #getXMLFormat()
	 * @generated
	 */
	EAttribute getXMLFormat_Wrapped();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getDescription()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getType()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getFormat()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getArray()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Array();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Header#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getCollectionFormat()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_CollectionFormat();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.types.Header#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Header#getConstraints()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_Constraints();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints <em>JSON Schema Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Schema Constraints</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints
	 * @generated
	 */
	EClass getJSONSchemaConstraints();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMaximum()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_ExclusiveMaximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinLength()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxLength()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getPattern()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinItems()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getExclusiveMinimum()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaxItems()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMaximum()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONSchemaConstraints#getMinimum()
	 * @see #getJSONSchemaConstraints()
	 * @generated
	 */
	EAttribute getJSONSchemaConstraints_Minimum();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Example#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Example#getMimeType()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Example#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Example#getValue()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Value();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getName()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getLocation()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getFlow()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Flow();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getAuthorizationURL <em>Authorization URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization URL</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getAuthorizationURL()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_AuthorizationURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getTokenURL <em>Token URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token URL</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getTokenURL()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_TokenURL();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.types.SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScheme#getScopes()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Scopes();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scope</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScope
	 * @generated
	 */
	EClass getSecurityScope();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScope#getName()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityScope#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityScope#getDescription()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Description();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityRequirement#getName()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EAttribute getSecurityRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.SecurityRequirement#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecurityRequirement#getScope()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EAttribute getSecurityRequirement_Scope();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.types.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Tag#getExternalDocsURL <em>External Docs URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Docs URL</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Tag#getExternalDocsURL()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ExternalDocsURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Tag#getExternalDocsDescription <em>External Docs Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Docs Description</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Tag#getExternalDocsDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ExternalDocsDescription();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.types.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.types.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.SchemeType <em>Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SchemeType
	 * @generated
	 */
	EEnum getSchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.JSONDataType <em>JSON Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JSON Data Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.JSONDataType
	 * @generated
	 */
	EEnum getJSONDataType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.HTTPMethod <em>HTTP Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Method</em>'.
	 * @see edu.som.uoc.openapiprofile.types.HTTPMethod
	 * @generated
	 */
	EEnum getHTTPMethod();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see edu.som.uoc.openapiprofile.types.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Format</em>'.
	 * @see edu.som.uoc.openapiprofile.types.CollectionFormat
	 * @generated
	 */
	EEnum getCollectionFormat();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.SecuritySchemeType <em>Security Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.SecuritySchemeType
	 * @generated
	 */
	EEnum getSecuritySchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.APIKeyLocation <em>API Key Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Key Location</em>'.
	 * @see edu.som.uoc.openapiprofile.types.APIKeyLocation
	 * @generated
	 */
	EEnum getAPIKeyLocation();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.types.OAuth2FlowType <em>OAuth2 Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OAuth2 Flow Type</em>'.
	 * @see edu.som.uoc.openapiprofile.types.OAuth2FlowType
	 * @generated
	 */
	EEnum getOAuth2FlowType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EInteger Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EInteger Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Integer'"
	 * @generated
	 */
	EDataType getEIntegerObject();

	/**
	 * Returns the meta object for data type '{@link Boolean <em>EBoolean Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EBoolean Object</em>'.
	 * @see Boolean
	 * @model instanceClass="java.lang.Object"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Boolean'"
	 * @generated
	 */
	EDataType getEBooleanObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>EDouble Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EDouble Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Real'"
	 * @generated
	 */
	EDataType getEDoubleObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	typesFactory gettypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl <em>XML Format</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.XMLFormatImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getXMLFormat()
		 * @generated
		 */
		EClass XML_FORMAT = eINSTANCE.getXMLFormat();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_FORMAT__NAME = eINSTANCE.getXMLFormat_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_FORMAT__NAMESPACE = eINSTANCE.getXMLFormat_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_FORMAT__PREFIX = eINSTANCE.getXMLFormat_Prefix();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_FORMAT__ATTRIBUTE = eINSTANCE.getXMLFormat_Attribute();

		/**
		 * The meta object literal for the '<em><b>Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_FORMAT__WRAPPED = eINSTANCE.getXMLFormat_Wrapped();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.HeaderImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__DESCRIPTION = eINSTANCE.getHeader_Description();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__TYPE = eINSTANCE.getHeader_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__FORMAT = eINSTANCE.getHeader_Format();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__ARRAY = eINSTANCE.getHeader_Array();

		/**
		 * The meta object literal for the '<em><b>Collection Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__COLLECTION_FORMAT = eINSTANCE.getHeader_CollectionFormat();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__CONSTRAINTS = eINSTANCE.getHeader_Constraints();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl <em>JSON Schema Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.JSONSchemaConstraintsImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getJSONSchemaConstraints()
		 * @generated
		 */
		EClass JSON_SCHEMA_CONSTRAINTS = eINSTANCE.getJSONSchemaConstraints();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MAXIMUM = eINSTANCE.getJSONSchemaConstraints_ExclusiveMaximum();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MIN_LENGTH = eINSTANCE.getJSONSchemaConstraints_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MAX_LENGTH = eINSTANCE.getJSONSchemaConstraints_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__PATTERN = eINSTANCE.getJSONSchemaConstraints_Pattern();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MIN_ITEMS = eINSTANCE.getJSONSchemaConstraints_MinItems();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__EXCLUSIVE_MINIMUM = eINSTANCE.getJSONSchemaConstraints_ExclusiveMinimum();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MAX_ITEMS = eINSTANCE.getJSONSchemaConstraints_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MAXIMUM = eINSTANCE.getJSONSchemaConstraints_Maximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_CONSTRAINTS__MINIMUM = eINSTANCE.getJSONSchemaConstraints_Minimum();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.ExampleImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getExample()
		 * @generated
		 */
		EClass EXAMPLE = eINSTANCE.getExample();

		/**
		 * The meta object literal for the '<em><b>Mime Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__MIME_TYPE = eINSTANCE.getExample_MimeType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE__VALUE = eINSTANCE.getExample_Value();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.SecuritySchemeImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityScheme()
		 * @generated
		 */
		EClass SECURITY_SCHEME = eINSTANCE.getSecurityScheme();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__NAME = eINSTANCE.getSecurityScheme_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__TYPE = eINSTANCE.getSecurityScheme_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__DESCRIPTION = eINSTANCE.getSecurityScheme_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__LOCATION = eINSTANCE.getSecurityScheme_Location();

		/**
		 * The meta object literal for the '<em><b>Flow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__FLOW = eINSTANCE.getSecurityScheme_Flow();

		/**
		 * The meta object literal for the '<em><b>Authorization URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__AUTHORIZATION_URL = eINSTANCE.getSecurityScheme_AuthorizationURL();

		/**
		 * The meta object literal for the '<em><b>Token URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCHEME__TOKEN_URL = eINSTANCE.getSecurityScheme_TokenURL();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_SCHEME__SCOPES = eINSTANCE.getSecurityScheme_Scopes();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.SecurityScopeImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityScope()
		 * @generated
		 */
		EClass SECURITY_SCOPE = eINSTANCE.getSecurityScope();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCOPE__NAME = eINSTANCE.getSecurityScope_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_SCOPE__DESCRIPTION = eINSTANCE.getSecurityScope_Description();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.SecurityRequirementImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecurityRequirement()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENT = eINSTANCE.getSecurityRequirement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_REQUIREMENT__NAME = eINSTANCE.getSecurityRequirement_Name();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECURITY_REQUIREMENT__SCOPE = eINSTANCE.getSecurityRequirement_Scope();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.impl.TagImpl
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getTag()
		 * @generated
		 */
		EClass TAG = eINSTANCE.getTag();

		/**
		 * The meta object literal for the '<em><b>External Docs URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__EXTERNAL_DOCS_URL = eINSTANCE.getTag_ExternalDocsURL();

		/**
		 * The meta object literal for the '<em><b>External Docs Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__EXTERNAL_DOCS_DESCRIPTION = eINSTANCE.getTag_ExternalDocsDescription();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__NAME = eINSTANCE.getTag_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAG__DESCRIPTION = eINSTANCE.getTag_Description();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.SchemeType
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.JSONDataType <em>JSON Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.JSONDataType
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getJSONDataType()
		 * @generated
		 */
		EEnum JSON_DATA_TYPE = eINSTANCE.getJSONDataType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.HTTPMethod <em>HTTP Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.HTTPMethod
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getHTTPMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHTTPMethod();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.ParameterLocation
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.CollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.CollectionFormat
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getCollectionFormat()
		 * @generated
		 */
		EEnum COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.SecuritySchemeType
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getSecuritySchemeType()
		 * @generated
		 */
		EEnum SECURITY_SCHEME_TYPE = eINSTANCE.getSecuritySchemeType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.APIKeyLocation <em>API Key Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.APIKeyLocation
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getAPIKeyLocation()
		 * @generated
		 */
		EEnum API_KEY_LOCATION = eINSTANCE.getAPIKeyLocation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.types.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.types.OAuth2FlowType
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getOAuth2FlowType()
		 * @generated
		 */
		EEnum OAUTH2_FLOW_TYPE = eINSTANCE.getOAuth2FlowType();

		/**
		 * The meta object literal for the '<em>EInteger Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEIntegerObject()
		 * @generated
		 */
		EDataType EINTEGER_OBJECT = eINSTANCE.getEIntegerObject();

		/**
		 * The meta object literal for the '<em>EBoolean Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Boolean
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEBooleanObject()
		 * @generated
		 */
		EDataType EBOOLEAN_OBJECT = eINSTANCE.getEBooleanObject();

		/**
		 * The meta object literal for the '<em>EDouble Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see edu.som.uoc.openapiprofile.types.impl.typesPackageImpl#getEDoubleObject()
		 * @generated
		 */
		EDataType EDOUBLE_OBJECT = eINSTANCE.getEDoubleObject();

	}

} //typesPackage
