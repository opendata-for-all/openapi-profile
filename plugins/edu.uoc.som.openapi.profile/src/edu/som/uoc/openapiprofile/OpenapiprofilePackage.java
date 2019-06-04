/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see edu.som.uoc.openapiprofile.OpenapiprofileFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='OpenAPIProfile'"
 * @generated
 */
public interface OpenapiprofilePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "openapiprofile";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://edu.uoc.som/openapi/profile/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "openapiprofile";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenapiprofilePackage eINSTANCE = edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIImpl <em>API</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPI()
	 * @generated
	 */
	int API = 0;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__HOST = 0;

	/**
	 * The feature id for the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_PATH = 1;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__SCHEMES = 2;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__CONSUMES = 3;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__PRODUCES = 4;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API__BASE_MODEL = 5;

	/**
	 * The number of structural features of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>API</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SchemaImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_PROPERTIES = 2;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISCRIMINATOR = 3;

	/**
	 * The feature id for the '<em><b>Additional Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED = 4;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BASE_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIPropertyImpl <em>API Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIPropertyImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIProperty()
	 * @generated
	 */
	int API_PROPERTY = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__XML = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__BASE_PROPERTY = 3;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__CONSTRAINTS = 4;

	/**
	 * The number of structural features of the '<em>API Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>API Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIDataTypeImpl <em>API Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIDataTypeImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIDataType()
	 * @generated
	 */
	int API_DATA_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE__FORMAT = 1;

	/**
	 * The feature id for the '<em><b>Base Primitive Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE__BASE_PRIMITIVE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE__BASE_ENUMERATION = 3;

	/**
	 * The number of structural features of the '<em>API Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>API Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_DATA_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIOperationImpl <em>API Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIOperationImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIOperation()
	 * @generated
	 */
	int API_OPERATION = 4;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__RELATIVE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Produces</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__PRODUCES = 2;

	/**
	 * The feature id for the '<em><b>Consumes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__CONSUMES = 3;

	/**
	 * The feature id for the '<em><b>Schemes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__SCHEMES = 4;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__SUMMARY = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__BASE_OPERATION = 7;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION__TAGS = 8;

	/**
	 * The number of structural features of the '<em>API Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>API Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_OPERATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl <em>API Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIParameterImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIParameter()
	 * @generated
	 */
	int API_PARAMETER = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__LOCATION = 1;

	/**
	 * The feature id for the '<em><b>Allow Empty Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__ALLOW_EMPTY_VALUES = 2;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__COLLECTION_FORMAT = 3;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__BASE_PARAMETER = 4;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__CONSTRAINTS = 5;

	/**
	 * The number of structural features of the '<em>API Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>API Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl <em>API Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIResponseImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIResponse()
	 * @generated
	 */
	int API_RESPONSE = 6;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE__CODE = 1;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE__HEADERS = 2;

	/**
	 * The feature id for the '<em><b>Examples</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE__EXAMPLES = 3;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE__BASE_PARAMETER = 4;

	/**
	 * The number of structural features of the '<em>API Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>API Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_RESPONSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl <em>API Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIInfoImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIInfo()
	 * @generated
	 */
	int API_INFO = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Terms Of Service</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__TERMS_OF_SERVICE = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__VERSION = 3;

	/**
	 * The feature id for the '<em><b>License Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__LICENSE_NAME = 4;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__LICENSE_URL = 5;

	/**
	 * The feature id for the '<em><b>Contact Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__CONTACT_NAME = 6;

	/**
	 * The feature id for the '<em><b>Contact URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__CONTACT_URL = 7;

	/**
	 * The feature id for the '<em><b>Contact Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__CONTACT_EMAIL = 8;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__BASE_MODEL = 9;

	/**
	 * The number of structural features of the '<em>API Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO_FEATURE_COUNT = 10;

	/**
	 * The number of operations of the '<em>API Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.ExternalDocsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getExternalDocs()
	 * @generated
	 */
	int EXTERNAL_DOCS = 8;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__URL = 1;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__BASE_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__BASE_CLASS = 3;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS__BASE_OPERATION = 4;

	/**
	 * The number of structural features of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>External Docs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_DOCS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl <em>Security Definitions</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityDefinitions()
	 * @generated
	 */
	int SECURITY_DEFINITIONS = 9;

	/**
	 * The feature id for the '<em><b>Security Schemes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS__SECURITY_SCHEMES = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS__BASE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Security Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Security Definitions</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_DEFINITIONS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl <em>Security Requirements</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityRequirements()
	 * @generated
	 */
	int SECURITY_REQUIREMENTS = 10;

	/**
	 * The feature id for the '<em><b>Security Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENTS__BASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENTS__BASE_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Security Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENTS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security Requirements</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_REQUIREMENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.TagsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 11;

	/**
	 * The feature id for the '<em><b>Tags</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__TAGS = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS__BASE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Tags</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAGS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API</em>'.
	 * @see edu.som.uoc.openapiprofile.API
	 * @generated
	 */
	EClass getAPI();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.API#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getHost()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Host();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.API#getBasePath <em>Base Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Path</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getBasePath()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_BasePath();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.API#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getSchemes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Schemes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.API#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getConsumes()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.API#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getProduces()
	 * @see #getAPI()
	 * @generated
	 */
	EAttribute getAPI_Produces();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.API#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.API#getBase_Model()
	 * @see #getAPI()
	 * @generated
	 */
	EReference getAPI_Base_Model();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getTitle()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getMaxProperties <em>Max Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Properties</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getMaxProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MaxProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getMinProperties <em>Min Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Properties</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getMinProperties()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_MinProperties();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getDiscriminator <em>Discriminator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Discriminator</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getDiscriminator()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Discriminator();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getAdditionalPropertiesAllowed <em>Additional Properties Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Additional Properties Allowed</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getAdditionalPropertiesAllowed()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_AdditionalPropertiesAllowed();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.Schema#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getBase_Class()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Base_Class();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIProperty <em>API Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Property</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty
	 * @generated
	 */
	EClass getAPIProperty();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIProperty#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty#getTitle()
	 * @see #getAPIProperty()
	 * @generated
	 */
	EAttribute getAPIProperty_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIProperty#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty#getDescription()
	 * @see #getAPIProperty()
	 * @generated
	 */
	EAttribute getAPIProperty_Description();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIProperty#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty#getXml()
	 * @see #getAPIProperty()
	 * @generated
	 */
	EReference getAPIProperty_Xml();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIProperty#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty#getBase_Property()
	 * @see #getAPIProperty()
	 * @generated
	 */
	EReference getAPIProperty_Base_Property();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIProperty#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see edu.som.uoc.openapiprofile.APIProperty#getConstraints()
	 * @see #getAPIProperty()
	 * @generated
	 */
	EReference getAPIProperty_Constraints();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIDataType <em>API Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Data Type</em>'.
	 * @see edu.som.uoc.openapiprofile.APIDataType
	 * @generated
	 */
	EClass getAPIDataType();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIDataType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.APIDataType#getType()
	 * @see #getAPIDataType()
	 * @generated
	 */
	EAttribute getAPIDataType_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIDataType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.som.uoc.openapiprofile.APIDataType#getFormat()
	 * @see #getAPIDataType()
	 * @generated
	 */
	EAttribute getAPIDataType_Format();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIDataType#getBase_PrimitiveType <em>Base Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Primitive Type</em>'.
	 * @see edu.som.uoc.openapiprofile.APIDataType#getBase_PrimitiveType()
	 * @see #getAPIDataType()
	 * @generated
	 */
	EReference getAPIDataType_Base_PrimitiveType();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIDataType#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see edu.som.uoc.openapiprofile.APIDataType#getBase_Enumeration()
	 * @see #getAPIDataType()
	 * @generated
	 */
	EReference getAPIDataType_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIOperation <em>API Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Operation</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation
	 * @generated
	 */
	EClass getAPIOperation();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIOperation#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getRelativePath()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_RelativePath();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIOperation#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Method</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getMethod()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Method();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.APIOperation#getProduces <em>Produces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Produces</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getProduces()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Produces();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.APIOperation#getConsumes <em>Consumes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Consumes</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getConsumes()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Consumes();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.APIOperation#getSchemes <em>Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Schemes</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getSchemes()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Schemes();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIOperation#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getSummary()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Summary();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIOperation#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getDescription()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Description();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIOperation#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getBase_Operation()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EReference getAPIOperation_Base_Operation();

	/**
	 * Returns the meta object for the attribute list '{@link edu.som.uoc.openapiprofile.APIOperation#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tags</em>'.
	 * @see edu.som.uoc.openapiprofile.APIOperation#getTags()
	 * @see #getAPIOperation()
	 * @generated
	 */
	EAttribute getAPIOperation_Tags();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIParameter <em>API Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Parameter</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter
	 * @generated
	 */
	EClass getAPIParameter();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIParameter#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getDescription()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EAttribute getAPIParameter_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIParameter#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getLocation()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EAttribute getAPIParameter_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValues <em>Allow Empty Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Empty Values</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getAllowEmptyValues()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EAttribute getAPIParameter_AllowEmptyValues();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIParameter#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getCollectionFormat()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EAttribute getAPIParameter_CollectionFormat();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIParameter#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getBase_Parameter()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EReference getAPIParameter_Base_Parameter();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIParameter#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Constraints</em>'.
	 * @see edu.som.uoc.openapiprofile.APIParameter#getConstraints()
	 * @see #getAPIParameter()
	 * @generated
	 */
	EReference getAPIParameter_Constraints();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIResponse <em>API Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Response</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse
	 * @generated
	 */
	EClass getAPIResponse();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIResponse#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse#getDescription()
	 * @see #getAPIResponse()
	 * @generated
	 */
	EAttribute getAPIResponse_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIResponse#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse#getCode()
	 * @see #getAPIResponse()
	 * @generated
	 */
	EAttribute getAPIResponse_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.APIResponse#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse#getHeaders()
	 * @see #getAPIResponse()
	 * @generated
	 */
	EReference getAPIResponse_Headers();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIResponse#getExamples <em>Examples</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Examples</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse#getExamples()
	 * @see #getAPIResponse()
	 * @generated
	 */
	EReference getAPIResponse_Examples();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIResponse#getBase_Parameter <em>Base Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Parameter</em>'.
	 * @see edu.som.uoc.openapiprofile.APIResponse#getBase_Parameter()
	 * @see #getAPIResponse()
	 * @generated
	 */
	EReference getAPIResponse_Base_Parameter();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.APIInfo <em>API Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>API Info</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo
	 * @generated
	 */
	EClass getAPIInfo();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getTitle()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_Title();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getDescription()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getTermsOfService <em>Terms Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Terms Of Service</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getTermsOfService()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_TermsOfService();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getVersion()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_Version();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getLicenseName <em>License Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License Name</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getLicenseName()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_LicenseName();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getLicenseURL <em>License URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License URL</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getLicenseURL()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_LicenseURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getContactName <em>Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Name</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getContactName()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_ContactName();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getContactURL <em>Contact URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact URL</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getContactURL()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_ContactURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.APIInfo#getContactEmail <em>Contact Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contact Email</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getContactEmail()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EAttribute getAPIInfo_ContactEmail();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.APIInfo#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getBase_Model()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EReference getAPIInfo_Base_Model();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Docs</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs
	 * @generated
	 */
	EClass getExternalDocs();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.ExternalDocs#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs#getDescription()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.ExternalDocs#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs#getUrl()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EAttribute getExternalDocs_Url();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.ExternalDocs#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs#getBase_Model()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EReference getExternalDocs_Base_Model();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.ExternalDocs#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs#getBase_Class()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EReference getExternalDocs_Base_Class();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.ExternalDocs#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs#getBase_Operation()
	 * @see #getExternalDocs()
	 * @generated
	 */
	EReference getExternalDocs_Base_Operation();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.SecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Definitions</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityDefinitions
	 * @generated
	 */
	EClass getSecurityDefinitions();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.SecurityDefinitions#getSecuritySchemes <em>Security Schemes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Schemes</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityDefinitions#getSecuritySchemes()
	 * @see #getSecurityDefinitions()
	 * @generated
	 */
	EReference getSecurityDefinitions_SecuritySchemes();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.SecurityDefinitions#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityDefinitions#getBase_Model()
	 * @see #getSecurityDefinitions()
	 * @generated
	 */
	EReference getSecurityDefinitions_Base_Model();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.SecurityRequirements <em>Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirements</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirements
	 * @generated
	 */
	EClass getSecurityRequirements();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.SecurityRequirements#getSecurityRequirements <em>Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Requirements</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirements#getSecurityRequirements()
	 * @see #getSecurityRequirements()
	 * @generated
	 */
	EReference getSecurityRequirements_SecurityRequirements();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Model()
	 * @see #getSecurityRequirements()
	 * @generated
	 */
	EReference getSecurityRequirements_Base_Model();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirements#getBase_Operation()
	 * @see #getSecurityRequirements()
	 * @generated
	 */
	EReference getSecurityRequirements_Base_Operation();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tags</em>'.
	 * @see edu.som.uoc.openapiprofile.Tags
	 * @generated
	 */
	EClass getTags();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.Tags#getTags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tags</em>'.
	 * @see edu.som.uoc.openapiprofile.Tags#getTags()
	 * @see #getTags()
	 * @generated
	 */
	EReference getTags_Tags();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.Tags#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.Tags#getBase_Model()
	 * @see #getTags()
	 * @generated
	 */
	EReference getTags_Base_Model();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OpenapiprofileFactory getOpenapiprofileFactory();

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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIImpl <em>API</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPI()
		 * @generated
		 */
		EClass API = eINSTANCE.getAPI();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__HOST = eINSTANCE.getAPI_Host();

		/**
		 * The meta object literal for the '<em><b>Base Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__BASE_PATH = eINSTANCE.getAPI_BasePath();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__SCHEMES = eINSTANCE.getAPI_Schemes();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__CONSUMES = eINSTANCE.getAPI_Consumes();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API__PRODUCES = eINSTANCE.getAPI_Produces();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API__BASE_MODEL = eINSTANCE.getAPI_Base_Model();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SchemaImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__TITLE = eINSTANCE.getSchema_Title();

		/**
		 * The meta object literal for the '<em><b>Max Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MAX_PROPERTIES = eINSTANCE.getSchema_MaxProperties();

		/**
		 * The meta object literal for the '<em><b>Min Properties</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__MIN_PROPERTIES = eINSTANCE.getSchema_MinProperties();

		/**
		 * The meta object literal for the '<em><b>Discriminator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__DISCRIMINATOR = eINSTANCE.getSchema_Discriminator();

		/**
		 * The meta object literal for the '<em><b>Additional Properties Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED = eINSTANCE.getSchema_AdditionalPropertiesAllowed();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__BASE_CLASS = eINSTANCE.getSchema_Base_Class();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIPropertyImpl <em>API Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIPropertyImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIProperty()
		 * @generated
		 */
		EClass API_PROPERTY = eINSTANCE.getAPIProperty();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PROPERTY__TITLE = eINSTANCE.getAPIProperty_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PROPERTY__DESCRIPTION = eINSTANCE.getAPIProperty_Description();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_PROPERTY__XML = eINSTANCE.getAPIProperty_Xml();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_PROPERTY__BASE_PROPERTY = eINSTANCE.getAPIProperty_Base_Property();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_PROPERTY__CONSTRAINTS = eINSTANCE.getAPIProperty_Constraints();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIDataTypeImpl <em>API Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIDataTypeImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIDataType()
		 * @generated
		 */
		EClass API_DATA_TYPE = eINSTANCE.getAPIDataType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_DATA_TYPE__TYPE = eINSTANCE.getAPIDataType_Type();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_DATA_TYPE__FORMAT = eINSTANCE.getAPIDataType_Format();

		/**
		 * The meta object literal for the '<em><b>Base Primitive Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_DATA_TYPE__BASE_PRIMITIVE_TYPE = eINSTANCE.getAPIDataType_Base_PrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_DATA_TYPE__BASE_ENUMERATION = eINSTANCE.getAPIDataType_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIOperationImpl <em>API Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIOperationImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIOperation()
		 * @generated
		 */
		EClass API_OPERATION = eINSTANCE.getAPIOperation();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__RELATIVE_PATH = eINSTANCE.getAPIOperation_RelativePath();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__METHOD = eINSTANCE.getAPIOperation_Method();

		/**
		 * The meta object literal for the '<em><b>Produces</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__PRODUCES = eINSTANCE.getAPIOperation_Produces();

		/**
		 * The meta object literal for the '<em><b>Consumes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__CONSUMES = eINSTANCE.getAPIOperation_Consumes();

		/**
		 * The meta object literal for the '<em><b>Schemes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__SCHEMES = eINSTANCE.getAPIOperation_Schemes();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__SUMMARY = eINSTANCE.getAPIOperation_Summary();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__DESCRIPTION = eINSTANCE.getAPIOperation_Description();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_OPERATION__BASE_OPERATION = eINSTANCE.getAPIOperation_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_OPERATION__TAGS = eINSTANCE.getAPIOperation_Tags();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIParameterImpl <em>API Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIParameterImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIParameter()
		 * @generated
		 */
		EClass API_PARAMETER = eINSTANCE.getAPIParameter();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PARAMETER__DESCRIPTION = eINSTANCE.getAPIParameter_Description();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PARAMETER__LOCATION = eINSTANCE.getAPIParameter_Location();

		/**
		 * The meta object literal for the '<em><b>Allow Empty Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PARAMETER__ALLOW_EMPTY_VALUES = eINSTANCE.getAPIParameter_AllowEmptyValues();

		/**
		 * The meta object literal for the '<em><b>Collection Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_PARAMETER__COLLECTION_FORMAT = eINSTANCE.getAPIParameter_CollectionFormat();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_PARAMETER__BASE_PARAMETER = eINSTANCE.getAPIParameter_Base_Parameter();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_PARAMETER__CONSTRAINTS = eINSTANCE.getAPIParameter_Constraints();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl <em>API Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIResponseImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIResponse()
		 * @generated
		 */
		EClass API_RESPONSE = eINSTANCE.getAPIResponse();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESPONSE__DESCRIPTION = eINSTANCE.getAPIResponse_Description();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_RESPONSE__CODE = eINSTANCE.getAPIResponse_Code();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_RESPONSE__HEADERS = eINSTANCE.getAPIResponse_Headers();

		/**
		 * The meta object literal for the '<em><b>Examples</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_RESPONSE__EXAMPLES = eINSTANCE.getAPIResponse_Examples();

		/**
		 * The meta object literal for the '<em><b>Base Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_RESPONSE__BASE_PARAMETER = eINSTANCE.getAPIResponse_Base_Parameter();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl <em>API Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.APIInfoImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIInfo()
		 * @generated
		 */
		EClass API_INFO = eINSTANCE.getAPIInfo();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__TITLE = eINSTANCE.getAPIInfo_Title();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__DESCRIPTION = eINSTANCE.getAPIInfo_Description();

		/**
		 * The meta object literal for the '<em><b>Terms Of Service</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__TERMS_OF_SERVICE = eINSTANCE.getAPIInfo_TermsOfService();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__VERSION = eINSTANCE.getAPIInfo_Version();

		/**
		 * The meta object literal for the '<em><b>License Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__LICENSE_NAME = eINSTANCE.getAPIInfo_LicenseName();

		/**
		 * The meta object literal for the '<em><b>License URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__LICENSE_URL = eINSTANCE.getAPIInfo_LicenseURL();

		/**
		 * The meta object literal for the '<em><b>Contact Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__CONTACT_NAME = eINSTANCE.getAPIInfo_ContactName();

		/**
		 * The meta object literal for the '<em><b>Contact URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__CONTACT_URL = eINSTANCE.getAPIInfo_ContactURL();

		/**
		 * The meta object literal for the '<em><b>Contact Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute API_INFO__CONTACT_EMAIL = eINSTANCE.getAPIInfo_ContactEmail();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_INFO__BASE_MODEL = eINSTANCE.getAPIInfo_Base_Model();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.ExternalDocsImpl <em>External Docs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.ExternalDocsImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getExternalDocs()
		 * @generated
		 */
		EClass EXTERNAL_DOCS = eINSTANCE.getExternalDocs();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__DESCRIPTION = eINSTANCE.getExternalDocs_Description();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_DOCS__URL = eINSTANCE.getExternalDocs_Url();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS__BASE_MODEL = eINSTANCE.getExternalDocs_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS__BASE_CLASS = eINSTANCE.getExternalDocs_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_DOCS__BASE_OPERATION = eINSTANCE.getExternalDocs_Base_Operation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl <em>Security Definitions</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecurityDefinitionsImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityDefinitions()
		 * @generated
		 */
		EClass SECURITY_DEFINITIONS = eINSTANCE.getSecurityDefinitions();

		/**
		 * The meta object literal for the '<em><b>Security Schemes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_DEFINITIONS__SECURITY_SCHEMES = eINSTANCE.getSecurityDefinitions_SecuritySchemes();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_DEFINITIONS__BASE_MODEL = eINSTANCE.getSecurityDefinitions_Base_Model();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl <em>Security Requirements</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecurityRequirementsImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityRequirements()
		 * @generated
		 */
		EClass SECURITY_REQUIREMENTS = eINSTANCE.getSecurityRequirements();

		/**
		 * The meta object literal for the '<em><b>Security Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENTS__SECURITY_REQUIREMENTS = eINSTANCE.getSecurityRequirements_SecurityRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENTS__BASE_MODEL = eINSTANCE.getSecurityRequirements_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY_REQUIREMENTS__BASE_OPERATION = eINSTANCE.getSecurityRequirements_Base_Operation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.TagsImpl <em>Tags</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.TagsImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getTags()
		 * @generated
		 */
		EClass TAGS = eINSTANCE.getTags();

		/**
		 * The meta object literal for the '<em><b>Tags</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS__TAGS = eINSTANCE.getTags_Tags();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAGS__BASE_MODEL = eINSTANCE.getTags_Base_Model();

	}

} //OpenapiprofilePackage
