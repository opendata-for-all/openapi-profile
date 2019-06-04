/**
 */
package edu.som.uoc.openapiprofile;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.uml2.uml.UMLPackage;

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
	 * The feature id for the '<em><b>EAnnotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EANNOTATIONS = UMLPackage.PRIMITIVE_TYPE__EANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_COMMENT = UMLPackage.PRIMITIVE_TYPE__OWNED_COMMENT;

	/**
	 * The feature id for the '<em><b>Owned Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_ELEMENT = UMLPackage.PRIMITIVE_TYPE__OWNED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNER = UMLPackage.PRIMITIVE_TYPE__OWNER;

	/**
	 * The feature id for the '<em><b>Client Dependency</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__CLIENT_DEPENDENCY = UMLPackage.PRIMITIVE_TYPE__CLIENT_DEPENDENCY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = UMLPackage.PRIMITIVE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Name Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME_EXPRESSION = UMLPackage.PRIMITIVE_TYPE__NAME_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAMESPACE = UMLPackage.PRIMITIVE_TYPE__NAMESPACE;

	/**
	 * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__QUALIFIED_NAME = UMLPackage.PRIMITIVE_TYPE__QUALIFIED_NAME;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__VISIBILITY = UMLPackage.PRIMITIVE_TYPE__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Owned Rule</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_RULE = UMLPackage.PRIMITIVE_TYPE__OWNED_RULE;

	/**
	 * The feature id for the '<em><b>Element Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ELEMENT_IMPORT = UMLPackage.PRIMITIVE_TYPE__ELEMENT_IMPORT;

	/**
	 * The feature id for the '<em><b>Package Import</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PACKAGE_IMPORT = UMLPackage.PRIMITIVE_TYPE__PACKAGE_IMPORT;

	/**
	 * The feature id for the '<em><b>Owned Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_MEMBER = UMLPackage.PRIMITIVE_TYPE__OWNED_MEMBER;

	/**
	 * The feature id for the '<em><b>Imported Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IMPORTED_MEMBER = UMLPackage.PRIMITIVE_TYPE__IMPORTED_MEMBER;

	/**
	 * The feature id for the '<em><b>Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MEMBER = UMLPackage.PRIMITIVE_TYPE__MEMBER;

	/**
	 * The feature id for the '<em><b>Is Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IS_LEAF = UMLPackage.PRIMITIVE_TYPE__IS_LEAF;

	/**
	 * The feature id for the '<em><b>Redefined Element</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REDEFINED_ELEMENT = UMLPackage.PRIMITIVE_TYPE__REDEFINED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Redefinition Context</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REDEFINITION_CONTEXT = UMLPackage.PRIMITIVE_TYPE__REDEFINITION_CONTEXT;

	/**
	 * The feature id for the '<em><b>Owning Template Parameter</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNING_TEMPLATE_PARAMETER = UMLPackage.PRIMITIVE_TYPE__OWNING_TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Template Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TEMPLATE_PARAMETER = UMLPackage.PRIMITIVE_TYPE__TEMPLATE_PARAMETER;

	/**
	 * The feature id for the '<em><b>Package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PACKAGE = UMLPackage.PRIMITIVE_TYPE__PACKAGE;

	/**
	 * The feature id for the '<em><b>Template Binding</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TEMPLATE_BINDING = UMLPackage.PRIMITIVE_TYPE__TEMPLATE_BINDING;

	/**
	 * The feature id for the '<em><b>Owned Template Signature</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_TEMPLATE_SIGNATURE = UMLPackage.PRIMITIVE_TYPE__OWNED_TEMPLATE_SIGNATURE;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FEATURE = UMLPackage.PRIMITIVE_TYPE__FEATURE;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ATTRIBUTE = UMLPackage.PRIMITIVE_TYPE__ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Collaboration Use</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__COLLABORATION_USE = UMLPackage.PRIMITIVE_TYPE__COLLABORATION_USE;

	/**
	 * The feature id for the '<em><b>General</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__GENERAL = UMLPackage.PRIMITIVE_TYPE__GENERAL;

	/**
	 * The feature id for the '<em><b>Generalization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__GENERALIZATION = UMLPackage.PRIMITIVE_TYPE__GENERALIZATION;

	/**
	 * The feature id for the '<em><b>Powertype Extent</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__POWERTYPE_EXTENT = UMLPackage.PRIMITIVE_TYPE__POWERTYPE_EXTENT;

	/**
	 * The feature id for the '<em><b>Inherited Member</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__INHERITED_MEMBER = UMLPackage.PRIMITIVE_TYPE__INHERITED_MEMBER;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IS_ABSTRACT = UMLPackage.PRIMITIVE_TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Is Final Specialization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__IS_FINAL_SPECIALIZATION = UMLPackage.PRIMITIVE_TYPE__IS_FINAL_SPECIALIZATION;

	/**
	 * The feature id for the '<em><b>Owned Use Case</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_USE_CASE = UMLPackage.PRIMITIVE_TYPE__OWNED_USE_CASE;

	/**
	 * The feature id for the '<em><b>Use Case</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__USE_CASE = UMLPackage.PRIMITIVE_TYPE__USE_CASE;

	/**
	 * The feature id for the '<em><b>Redefined Classifier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REDEFINED_CLASSIFIER = UMLPackage.PRIMITIVE_TYPE__REDEFINED_CLASSIFIER;

	/**
	 * The feature id for the '<em><b>Representation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__REPRESENTATION = UMLPackage.PRIMITIVE_TYPE__REPRESENTATION;

	/**
	 * The feature id for the '<em><b>Substitution</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__SUBSTITUTION = UMLPackage.PRIMITIVE_TYPE__SUBSTITUTION;

	/**
	 * The feature id for the '<em><b>Owned Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_ATTRIBUTE = UMLPackage.PRIMITIVE_TYPE__OWNED_ATTRIBUTE;

	/**
	 * The feature id for the '<em><b>Owned Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__OWNED_OPERATION = UMLPackage.PRIMITIVE_TYPE__OWNED_OPERATION;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_LENGTH = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAXIMUM = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MAXIMUM = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MINIMUM = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_LENGTH = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_ITEMS = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__PATTERN = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXCLUSIVE_MINIMUM = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_ITEMS = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__FORMAT = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TYPE = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DESCRIPTION = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__UNIQUE_ITEMS = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DEFAULT = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Multipl Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MULTIPL_OF = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TITLE = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MAX_PROPERTIES = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__MIN_PROPERTIES = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DISCRIMINATOR = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Additional Properties Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ADDITIONAL_PROPERTIES_ALLOWED = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BASE_CLASS = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__EXAMPLE = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__READ_ONLY = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__XML = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Base Enumeration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__BASE_ENUMERATION = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 24;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = UMLPackage.PRIMITIVE_TYPE_FEATURE_COUNT + 25;

	/**
	 * The operation id for the '<em>Get EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_EANNOTATION__STRING = UMLPackage.PRIMITIVE_TYPE___GET_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Validate Has Owner</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_HAS_OWNER__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Not Own Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_NOT_OWN_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Add Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ADD_KEYWORD__STRING = UMLPackage.PRIMITIVE_TYPE___ADD_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Apply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___APPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___APPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Create EAnnotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_EANNOTATION__STRING = UMLPackage.PRIMITIVE_TYPE___CREATE_EANNOTATION__STRING;

	/**
	 * The operation id for the '<em>Destroy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___DESTROY = UMLPackage.PRIMITIVE_TYPE___DESTROY;

	/**
	 * The operation id for the '<em>Get Keywords</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_KEYWORDS = UMLPackage.PRIMITIVE_TYPE___GET_KEYWORDS;

	/**
	 * The operation id for the '<em>Get Applicable Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLICABLE_STEREOTYPE__STRING = UMLPackage.PRIMITIVE_TYPE___GET_APPLICABLE_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applicable Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLICABLE_STEREOTYPES = UMLPackage.PRIMITIVE_TYPE___GET_APPLICABLE_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLIED_STEREOTYPE__STRING = UMLPackage.PRIMITIVE_TYPE___GET_APPLIED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Applied Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLIED_STEREOTYPES = UMLPackage.PRIMITIVE_TYPE___GET_APPLIED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Applied Substereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING = UMLPackage.PRIMITIVE_TYPE___GET_APPLIED_SUBSTEREOTYPE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Get Applied Substereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___GET_APPLIED_SUBSTEREOTYPES__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Model</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_MODEL = UMLPackage.PRIMITIVE_TYPE___GET_MODEL;

	/**
	 * The operation id for the '<em>Get Nearest Package</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_NEAREST_PACKAGE = UMLPackage.PRIMITIVE_TYPE___GET_NEAREST_PACKAGE;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_RELATIONSHIPS = UMLPackage.PRIMITIVE_TYPE___GET_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_RELATIONSHIPS__ECLASS = UMLPackage.PRIMITIVE_TYPE___GET_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Required Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_REQUIRED_STEREOTYPE__STRING = UMLPackage.PRIMITIVE_TYPE___GET_REQUIRED_STEREOTYPE__STRING;

	/**
	 * The operation id for the '<em>Get Required Stereotypes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_REQUIRED_STEREOTYPES = UMLPackage.PRIMITIVE_TYPE___GET_REQUIRED_STEREOTYPES;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_SOURCE_DIRECTED_RELATIONSHIPS = UMLPackage.PRIMITIVE_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Source Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PRIMITIVE_TYPE___GET_SOURCE_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Stereotype Application</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_STEREOTYPE_APPLICATION__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___GET_STEREOTYPE_APPLICATION__STEREOTYPE;

	/**
	 * The operation id for the '<em>Get Stereotype Applications</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_STEREOTYPE_APPLICATIONS = UMLPackage.PRIMITIVE_TYPE___GET_STEREOTYPE_APPLICATIONS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_TARGET_DIRECTED_RELATIONSHIPS = UMLPackage.PRIMITIVE_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS;

	/**
	 * The operation id for the '<em>Get Target Directed Relationships</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS = UMLPackage.PRIMITIVE_TYPE___GET_TARGET_DIRECTED_RELATIONSHIPS__ECLASS;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_VALUE__STEREOTYPE_STRING = UMLPackage.PRIMITIVE_TYPE___GET_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Has Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___HAS_KEYWORD__STRING = UMLPackage.PRIMITIVE_TYPE___HAS_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Has Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___HAS_VALUE__STEREOTYPE_STRING = UMLPackage.PRIMITIVE_TYPE___HAS_VALUE__STEREOTYPE_STRING;

	/**
	 * The operation id for the '<em>Is Stereotype Applicable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_STEREOTYPE_APPLICABLE__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___IS_STEREOTYPE_APPLICABLE__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Applied</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_STEREOTYPE_APPLIED__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___IS_STEREOTYPE_APPLIED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Is Stereotype Required</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_STEREOTYPE_REQUIRED__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___IS_STEREOTYPE_REQUIRED__STEREOTYPE;

	/**
	 * The operation id for the '<em>Remove Keyword</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___REMOVE_KEYWORD__STRING = UMLPackage.PRIMITIVE_TYPE___REMOVE_KEYWORD__STRING;

	/**
	 * The operation id for the '<em>Set Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___SET_VALUE__STEREOTYPE_STRING_OBJECT = UMLPackage.PRIMITIVE_TYPE___SET_VALUE__STEREOTYPE_STRING_OBJECT;

	/**
	 * The operation id for the '<em>Unapply Stereotype</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___UNAPPLY_STEREOTYPE__STEREOTYPE = UMLPackage.PRIMITIVE_TYPE___UNAPPLY_STEREOTYPE__STEREOTYPE;

	/**
	 * The operation id for the '<em>All Owned Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_OWNED_ELEMENTS = UMLPackage.PRIMITIVE_TYPE___ALL_OWNED_ELEMENTS;

	/**
	 * The operation id for the '<em>Must Be Owned</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___MUST_BE_OWNED = UMLPackage.PRIMITIVE_TYPE___MUST_BE_OWNED;

	/**
	 * The operation id for the '<em>Validate Visibility Needs Ownership</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_VISIBILITY_NEEDS_OWNERSHIP__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_HAS_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Has No Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_HAS_NO_QUALIFIED_NAME__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Dependency</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_DEPENDENCY__NAMEDELEMENT = UMLPackage.PRIMITIVE_TYPE___CREATE_DEPENDENCY__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Create Usage</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_USAGE__NAMEDELEMENT = UMLPackage.PRIMITIVE_TYPE___CREATE_USAGE__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_LABEL = UMLPackage.PRIMITIVE_TYPE___GET_LABEL;

	/**
	 * The operation id for the '<em>Get Label</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_LABEL__BOOLEAN = UMLPackage.PRIMITIVE_TYPE___GET_LABEL__BOOLEAN;

	/**
	 * The operation id for the '<em>Get Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_NAMESPACE = UMLPackage.PRIMITIVE_TYPE___GET_NAMESPACE;

	/**
	 * The operation id for the '<em>All Namespaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_NAMESPACES = UMLPackage.PRIMITIVE_TYPE___ALL_NAMESPACES;

	/**
	 * The operation id for the '<em>All Owning Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_OWNING_PACKAGES = UMLPackage.PRIMITIVE_TYPE___ALL_OWNING_PACKAGES;

	/**
	 * The operation id for the '<em>Is Distinguishable From</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE = UMLPackage.PRIMITIVE_TYPE___IS_DISTINGUISHABLE_FROM__NAMEDELEMENT_NAMESPACE;

	/**
	 * The operation id for the '<em>Get Qualified Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_QUALIFIED_NAME = UMLPackage.PRIMITIVE_TYPE___GET_QUALIFIED_NAME;

	/**
	 * The operation id for the '<em>Separator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___SEPARATOR = UMLPackage.PRIMITIVE_TYPE___SEPARATOR;

	/**
	 * The operation id for the '<em>Get Client Dependencies</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_CLIENT_DEPENDENCIES = UMLPackage.PRIMITIVE_TYPE___GET_CLIENT_DEPENDENCIES;

	/**
	 * The operation id for the '<em>Validate Members Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_MEMBERS_DISTINGUISHABLE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Self</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_CANNOT_IMPORT_SELF__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Cannot Import Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_CANNOT_IMPORT_OWNED_MEMBERS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Element Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND = UMLPackage.PRIMITIVE_TYPE___CREATE_ELEMENT_IMPORT__PACKAGEABLEELEMENT_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Create Package Import</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND = UMLPackage.PRIMITIVE_TYPE___CREATE_PACKAGE_IMPORT__PACKAGE_VISIBILITYKIND;

	/**
	 * The operation id for the '<em>Get Imported Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_IMPORTED_ELEMENTS = UMLPackage.PRIMITIVE_TYPE___GET_IMPORTED_ELEMENTS;

	/**
	 * The operation id for the '<em>Get Imported Packages</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_IMPORTED_PACKAGES = UMLPackage.PRIMITIVE_TYPE___GET_IMPORTED_PACKAGES;

	/**
	 * The operation id for the '<em>Get Owned Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_OWNED_MEMBERS = UMLPackage.PRIMITIVE_TYPE___GET_OWNED_MEMBERS;

	/**
	 * The operation id for the '<em>Exclude Collisions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___EXCLUDE_COLLISIONS__ELIST = UMLPackage.PRIMITIVE_TYPE___EXCLUDE_COLLISIONS__ELIST;

	/**
	 * The operation id for the '<em>Get Names Of Member</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_NAMES_OF_MEMBER__NAMEDELEMENT = UMLPackage.PRIMITIVE_TYPE___GET_NAMES_OF_MEMBER__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Import Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IMPORT_MEMBERS__ELIST = UMLPackage.PRIMITIVE_TYPE___IMPORT_MEMBERS__ELIST;

	/**
	 * The operation id for the '<em>Get Imported Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_IMPORTED_MEMBERS = UMLPackage.PRIMITIVE_TYPE___GET_IMPORTED_MEMBERS;

	/**
	 * The operation id for the '<em>Members Are Distinguishable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___MEMBERS_ARE_DISTINGUISHABLE = UMLPackage.PRIMITIVE_TYPE___MEMBERS_ARE_DISTINGUISHABLE;

	/**
	 * The operation id for the '<em>Validate Redefinition Consistent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_REDEFINITION_CONSISTENT__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Leaf Redefinition</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_NON_LEAF_REDEFINITION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_REDEFINITION_CONTEXT_VALID__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Is Consistent With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_CONSISTENT_WITH__REDEFINABLEELEMENT = UMLPackage.PRIMITIVE_TYPE___IS_CONSISTENT_WITH__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Redefinition Context Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT = UMLPackage.PRIMITIVE_TYPE___IS_REDEFINITION_CONTEXT_VALID__REDEFINABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Compatible With</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT = UMLPackage.PRIMITIVE_TYPE___IS_COMPATIBLE_WITH__PARAMETERABLEELEMENT;

	/**
	 * The operation id for the '<em>Is Template Parameter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_TEMPLATE_PARAMETER = UMLPackage.PRIMITIVE_TYPE___IS_TEMPLATE_PARAMETER;

	/**
	 * The operation id for the '<em>Validate Namespace Needs Visibility</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_NAMESPACE_NEEDS_VISIBILITY__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Create Association</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT = UMLPackage.PRIMITIVE_TYPE___CREATE_ASSOCIATION__BOOLEAN_AGGREGATIONKIND_STRING_INT_INT_TYPE_BOOLEAN_AGGREGATIONKIND_STRING_INT_INT;

	/**
	 * The operation id for the '<em>Get Associations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_ASSOCIATIONS = UMLPackage.PRIMITIVE_TYPE___GET_ASSOCIATIONS;

	/**
	 * The operation id for the '<em>Conforms To</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CONFORMS_TO__TYPE = UMLPackage.PRIMITIVE_TYPE___CONFORMS_TO__TYPE;

	/**
	 * The operation id for the '<em>Is Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_TEMPLATE = UMLPackage.PRIMITIVE_TYPE___IS_TEMPLATE;

	/**
	 * The operation id for the '<em>Parameterable Elements</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___PARAMETERABLE_ELEMENTS = UMLPackage.PRIMITIVE_TYPE___PARAMETERABLE_ELEMENTS;

	/**
	 * The operation id for the '<em>Validate Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_SPECIALIZE_TYPE__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Maps To Generalization Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_MAPS_TO_GENERALIZATION_SET__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate Non Final Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_NON_FINAL_PARENTS__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Validate No Cycles In Generalization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP = UMLPackage.PRIMITIVE_TYPE___VALIDATE_NO_CYCLES_IN_GENERALIZATION__DIAGNOSTICCHAIN_MAP;

	/**
	 * The operation id for the '<em>Get All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_ALL_ATTRIBUTES = UMLPackage.PRIMITIVE_TYPE___GET_ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>Get All Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_ALL_OPERATIONS = UMLPackage.PRIMITIVE_TYPE___GET_ALL_OPERATIONS;

	/**
	 * The operation id for the '<em>Get All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_ALL_USED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___GET_ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_OPERATION__STRING_ELIST_ELIST = UMLPackage.PRIMITIVE_TYPE___GET_OPERATION__STRING_ELIST_ELIST;

	/**
	 * The operation id for the '<em>Get Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN = UMLPackage.PRIMITIVE_TYPE___GET_OPERATION__STRING_ELIST_ELIST_BOOLEAN;

	/**
	 * The operation id for the '<em>Get Operations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_OPERATIONS = UMLPackage.PRIMITIVE_TYPE___GET_OPERATIONS;

	/**
	 * The operation id for the '<em>Get Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_USED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___GET_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_FEATURES = UMLPackage.PRIMITIVE_TYPE___ALL_FEATURES;

	/**
	 * The operation id for the '<em>All Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_PARENTS = UMLPackage.PRIMITIVE_TYPE___ALL_PARENTS;

	/**
	 * The operation id for the '<em>Get Generals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_GENERALS = UMLPackage.PRIMITIVE_TYPE___GET_GENERALS;

	/**
	 * The operation id for the '<em>Has Visibility Of</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___HAS_VISIBILITY_OF__NAMEDELEMENT = UMLPackage.PRIMITIVE_TYPE___HAS_VISIBILITY_OF__NAMEDELEMENT;

	/**
	 * The operation id for the '<em>Inherit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___INHERIT__ELIST = UMLPackage.PRIMITIVE_TYPE___INHERIT__ELIST;

	/**
	 * The operation id for the '<em>Inheritable Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___INHERITABLE_MEMBERS__CLASSIFIER = UMLPackage.PRIMITIVE_TYPE___INHERITABLE_MEMBERS__CLASSIFIER;

	/**
	 * The operation id for the '<em>Get Inherited Members</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___GET_INHERITED_MEMBERS = UMLPackage.PRIMITIVE_TYPE___GET_INHERITED_MEMBERS;

	/**
	 * The operation id for the '<em>May Specialize Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___MAY_SPECIALIZE_TYPE__CLASSIFIER = UMLPackage.PRIMITIVE_TYPE___MAY_SPECIALIZE_TYPE__CLASSIFIER;

	/**
	 * The operation id for the '<em>Parents</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___PARENTS = UMLPackage.PRIMITIVE_TYPE___PARENTS;

	/**
	 * The operation id for the '<em>Directly Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___DIRECTLY_REALIZED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___DIRECTLY_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>Directly Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___DIRECTLY_USED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___DIRECTLY_USED_INTERFACES;

	/**
	 * The operation id for the '<em>All Realized Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_REALIZED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___ALL_REALIZED_INTERFACES;

	/**
	 * The operation id for the '<em>All Used Interfaces</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_USED_INTERFACES = UMLPackage.PRIMITIVE_TYPE___ALL_USED_INTERFACES;

	/**
	 * The operation id for the '<em>Is Substitutable For</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___IS_SUBSTITUTABLE_FOR__CLASSIFIER = UMLPackage.PRIMITIVE_TYPE___IS_SUBSTITUTABLE_FOR__CLASSIFIER;

	/**
	 * The operation id for the '<em>All Attributes</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_ATTRIBUTES = UMLPackage.PRIMITIVE_TYPE___ALL_ATTRIBUTES;

	/**
	 * The operation id for the '<em>All Slottable Features</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___ALL_SLOTTABLE_FEATURES = UMLPackage.PRIMITIVE_TYPE___ALL_SLOTTABLE_FEATURES;

	/**
	 * The operation id for the '<em>Create Owned Attribute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT = UMLPackage.PRIMITIVE_TYPE___CREATE_OWNED_ATTRIBUTE__STRING_TYPE_INT_INT;

	/**
	 * The operation id for the '<em>Create Owned Operation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE = UMLPackage.PRIMITIVE_TYPE___CREATE_OWNED_OPERATION__STRING_ELIST_ELIST_TYPE;

	/**
	 * The number of operations of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_OPERATION_COUNT = UMLPackage.PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getJSONSchemaSubset()
	 * @generated
	 */
	int JSON_SCHEMA_SUBSET = 2;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MIN_LENGTH = 0;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAXIMUM = 1;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM = 2;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MINIMUM = 3;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAX_LENGTH = 4;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MIN_ITEMS = 5;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__PATTERN = 6;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM = 7;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MAX_ITEMS = 8;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__FORMAT = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__DESCRIPTION = 11;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__UNIQUE_ITEMS = 12;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__DEFAULT = 13;

	/**
	 * The feature id for the '<em><b>Multipl Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET__MULTIPL_OF = 14;

	/**
	 * The number of structural features of the '<em>JSON Schema Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>JSON Schema Subset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JSON_SCHEMA_SUBSET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.XMLElementImpl <em>XML Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.XMLElementImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getXMLElement()
	 * @generated
	 */
	int XML_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Wrapped</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT__WRAPPED = 4;

	/**
	 * The number of structural features of the '<em>XML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>XML Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIPropertyImpl <em>API Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIPropertyImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIProperty()
	 * @generated
	 */
	int API_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__XML = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY__BASE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>API Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>API Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIOperationImpl <em>API Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIOperationImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIOperation()
	 * @generated
	 */
	int API_OPERATION = 5;

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
	int API_PARAMETER = 6;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MIN_LENGTH = JSON_SCHEMA_SUBSET__MIN_LENGTH;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MAXIMUM = JSON_SCHEMA_SUBSET__MAXIMUM;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__EXCLUSIVE_MAXIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MINIMUM = JSON_SCHEMA_SUBSET__MINIMUM;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MAX_LENGTH = JSON_SCHEMA_SUBSET__MAX_LENGTH;

	/**
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MIN_ITEMS = JSON_SCHEMA_SUBSET__MIN_ITEMS;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__PATTERN = JSON_SCHEMA_SUBSET__PATTERN;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__EXCLUSIVE_MINIMUM = JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MAX_ITEMS = JSON_SCHEMA_SUBSET__MAX_ITEMS;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__FORMAT = JSON_SCHEMA_SUBSET__FORMAT;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__TYPE = JSON_SCHEMA_SUBSET__TYPE;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__DESCRIPTION = JSON_SCHEMA_SUBSET__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Unique Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__UNIQUE_ITEMS = JSON_SCHEMA_SUBSET__UNIQUE_ITEMS;

	/**
	 * The feature id for the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__DEFAULT = JSON_SCHEMA_SUBSET__DEFAULT;

	/**
	 * The feature id for the '<em><b>Multipl Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__MULTIPL_OF = JSON_SCHEMA_SUBSET__MULTIPL_OF;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__LOCATION = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Allow Empty Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__ALLOW_EMPTY_VALUES = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Collection Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__COLLECTION_FORMAT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Base Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER__BASE_PARAMETER = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>API Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER_FEATURE_COUNT = JSON_SCHEMA_SUBSET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>API Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_PARAMETER_OPERATION_COUNT = JSON_SCHEMA_SUBSET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIResponseImpl <em>API Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIResponseImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIResponse()
	 * @generated
	 */
	int API_RESPONSE = 7;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.HeaderImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 8;

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
	 * The feature id for the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MIN_ITEMS = 6;

	/**
	 * The feature id for the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__PATTERN = 7;

	/**
	 * The feature id for the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__EXCLUSIVE_MINIMUM = 8;

	/**
	 * The feature id for the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MINIMUM = 9;

	/**
	 * The feature id for the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MIN_LENGTH = 10;

	/**
	 * The feature id for the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAX_LENGTH = 11;

	/**
	 * The feature id for the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAXIMUM = 12;

	/**
	 * The feature id for the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__MAX_ITEMS = 13;

	/**
	 * The feature id for the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__EXCLUSIVE_MAXIMUM = 14;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.ExampleImpl <em>Example</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.ExampleImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getExample()
	 * @generated
	 */
	int EXAMPLE = 9;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.APIInfoImpl <em>API Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.APIInfoImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIInfo()
	 * @generated
	 */
	int API_INFO = 10;

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
	 * The feature id for the '<em><b>License</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__LICENSE = 4;

	/**
	 * The feature id for the '<em><b>Contact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__CONTACT = 5;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO__BASE_MODEL = 6;

	/**
	 * The number of structural features of the '<em>API Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>API Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int API_INFO_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.LicenseImpl <em>License</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.LicenseImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getLicense()
	 * @generated
	 */
	int LICENSE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__NAME = 0;

	/**
	 * The feature id for the '<em><b>License URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE__LICENSE_URL = 1;

	/**
	 * The number of structural features of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>License</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LICENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.ContactImpl <em>Contact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.ContactImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getContact()
	 * @generated
	 */
	int CONTACT = 12;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__URL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT__EMAIL = 2;

	/**
	 * The number of structural features of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Contact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTACT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.ExternalDocsImpl <em>External Docs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.ExternalDocsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getExternalDocs()
	 * @generated
	 */
	int EXTERNAL_DOCS = 13;

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
	int SECURITY_DEFINITIONS = 14;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecuritySchemeImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityScheme()
	 * @generated
	 */
	int SECURITY_SCHEME = 15;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecurityScopeImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityScope()
	 * @generated
	 */
	int SECURITY_SCOPE = 16;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecurityImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 17;

	/**
	 * The feature id for the '<em><b>Security Requirements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__SECURITY_REQUIREMENTS = 0;

	/**
	 * The feature id for the '<em><b>Base Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__BASE_MODEL = 1;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY__BASE_OPERATION = 2;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.SecurityRequirementImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityRequirement()
	 * @generated
	 */
	int SECURITY_REQUIREMENT = 18;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.TagsImpl <em>Tags</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.TagsImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getTags()
	 * @generated
	 */
	int TAGS = 19;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.impl.TagImpl <em>Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.impl.TagImpl
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getTag()
	 * @generated
	 */
	int TAG = 20;

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
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.SchemeType <em>Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.SchemeType
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSchemeType()
	 * @generated
	 */
	int SCHEME_TYPE = 21;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.JSONDataType <em>JSON Data Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.JSONDataType
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getJSONDataType()
	 * @generated
	 */
	int JSON_DATA_TYPE = 22;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.HTTPMethod <em>HTTP Method</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.HTTPMethod
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getHTTPMethod()
	 * @generated
	 */
	int HTTP_METHOD = 23;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.ParameterLocation <em>Parameter Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.ParameterLocation
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getParameterLocation()
	 * @generated
	 */
	int PARAMETER_LOCATION = 24;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.CollectionFormat <em>Collection Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.CollectionFormat
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getCollectionFormat()
	 * @generated
	 */
	int COLLECTION_FORMAT = 25;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.SecuritySchemeType
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecuritySchemeType()
	 * @generated
	 */
	int SECURITY_SCHEME_TYPE = 26;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.APIKeyLocation <em>API Key Location</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.APIKeyLocation
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIKeyLocation()
	 * @generated
	 */
	int API_KEY_LOCATION = 27;

	/**
	 * The meta object id for the '{@link edu.som.uoc.openapiprofile.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.som.uoc.openapiprofile.OAuth2FlowType
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getOAuth2FlowType()
	 * @generated
	 */
	int OAUTH2_FLOW_TYPE = 28;

	/**
	 * The meta object id for the '<em>Integer</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 29;

	/**
	 * The meta object id for the '<em>Double</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Double
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getDouble()
	 * @generated
	 */
	int DOUBLE = 30;

	/**
	 * The meta object id for the '<em>Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Boolean
	 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getBoolean()
	 * @generated
	 */
	int BOOLEAN = 31;


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
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Example</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getExample()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Example();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Schema#getReadOnly <em>Read Only</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read Only</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getReadOnly()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_ReadOnly();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.Schema#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getXml()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Xml();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.Schema#getBase_Enumeration <em>Base Enumeration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Enumeration</em>'.
	 * @see edu.som.uoc.openapiprofile.Schema#getBase_Enumeration()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Base_Enumeration();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset <em>JSON Schema Subset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JSON Schema Subset</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset
	 * @generated
	 */
	EClass getJSONSchemaSubset();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMaximum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMaximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxLength()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMinItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getPattern()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getExclusiveMinimum()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMaxItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getFormat()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getType()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getDescription()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getUniqueItems <em>Unique Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique Items</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getUniqueItems()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_UniqueItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getDefault <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getDefault()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_Default();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.JSONSchemaSubset#getMultiplOf <em>Multipl Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multipl Of</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaSubset#getMultiplOf()
	 * @see #getJSONSchemaSubset()
	 * @generated
	 */
	EAttribute getJSONSchemaSubset_MultiplOf();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.XMLElement <em>XML Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XML Element</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement
	 * @generated
	 */
	EClass getXMLElement();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.XMLElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement#getName()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.XMLElement#getNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namespace</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement#getNamespace()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Namespace();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.XMLElement#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement#getPrefix()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Prefix();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.XMLElement#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attribute</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement#getAttribute()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Attribute();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.XMLElement#getWrapped <em>Wrapped</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrapped</em>'.
	 * @see edu.som.uoc.openapiprofile.XMLElement#getWrapped()
	 * @see #getXMLElement()
	 * @generated
	 */
	EAttribute getXMLElement_Wrapped();

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
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see edu.som.uoc.openapiprofile.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getDescription()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getType()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getFormat()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Format();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getArray()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Array();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getCollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Collection Format</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getCollectionFormat()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_CollectionFormat();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMinItems <em>Min Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Items</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMinItems()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_MinItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getPattern <em>Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pattern</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getPattern()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Pattern();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getExclusiveMinimum <em>Exclusive Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getExclusiveMinimum()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_ExclusiveMinimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMinimum <em>Minimum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMinimum()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Minimum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMinLength <em>Min Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Length</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMinLength()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_MinLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMaxLength <em>Max Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Length</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMaxLength()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_MaxLength();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMaximum <em>Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMaximum()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Maximum();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getMaxItems <em>Max Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Items</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getMaxItems()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_MaxItems();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Header#getExclusiveMaximum <em>Exclusive Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclusive Maximum</em>'.
	 * @see edu.som.uoc.openapiprofile.Header#getExclusiveMaximum()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_ExclusiveMaximum();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example</em>'.
	 * @see edu.som.uoc.openapiprofile.Example
	 * @generated
	 */
	EClass getExample();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Example#getMimeType <em>Mime Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mime Type</em>'.
	 * @see edu.som.uoc.openapiprofile.Example#getMimeType()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_MimeType();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Example#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see edu.som.uoc.openapiprofile.Example#getValue()
	 * @see #getExample()
	 * @generated
	 */
	EAttribute getExample_Value();

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
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIInfo#getLicense <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>License</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getLicense()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EReference getAPIInfo_License();

	/**
	 * Returns the meta object for the containment reference '{@link edu.som.uoc.openapiprofile.APIInfo#getContact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Contact</em>'.
	 * @see edu.som.uoc.openapiprofile.APIInfo#getContact()
	 * @see #getAPIInfo()
	 * @generated
	 */
	EReference getAPIInfo_Contact();

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
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.License <em>License</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>License</em>'.
	 * @see edu.som.uoc.openapiprofile.License
	 * @generated
	 */
	EClass getLicense();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.License#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.License#getName()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.License#getLicenseURL <em>License URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>License URL</em>'.
	 * @see edu.som.uoc.openapiprofile.License#getLicenseURL()
	 * @see #getLicense()
	 * @generated
	 */
	EAttribute getLicense_LicenseURL();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Contact <em>Contact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contact</em>'.
	 * @see edu.som.uoc.openapiprofile.Contact
	 * @generated
	 */
	EClass getContact();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Contact#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see edu.som.uoc.openapiprofile.Contact#getUrl()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Url();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Contact#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.Contact#getName()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Contact#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see edu.som.uoc.openapiprofile.Contact#getEmail()
	 * @see #getContact()
	 * @generated
	 */
	EAttribute getContact_Email();

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
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scheme</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme
	 * @generated
	 */
	EClass getSecurityScheme();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getName()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getType()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Type();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getDescription()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Description();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getLocation()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Location();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getFlow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Flow</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getFlow()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_Flow();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getAuthorizationURL <em>Authorization URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Authorization URL</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getAuthorizationURL()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_AuthorizationURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScheme#getTokenURL <em>Token URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token URL</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getTokenURL()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EAttribute getSecurityScheme_TokenURL();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.SecurityScheme#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme#getScopes()
	 * @see #getSecurityScheme()
	 * @generated
	 */
	EReference getSecurityScheme_Scopes();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Scope</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScope
	 * @generated
	 */
	EClass getSecurityScope();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScope#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScope#getName()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityScope#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityScope#getDescription()
	 * @see #getSecurityScope()
	 * @generated
	 */
	EAttribute getSecurityScope_Description();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see edu.som.uoc.openapiprofile.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.som.uoc.openapiprofile.Security#getSecurityRequirements <em>Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Security Requirements</em>'.
	 * @see edu.som.uoc.openapiprofile.Security#getSecurityRequirements()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_SecurityRequirements();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.Security#getBase_Model <em>Base Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Model</em>'.
	 * @see edu.som.uoc.openapiprofile.Security#getBase_Model()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Base_Model();

	/**
	 * Returns the meta object for the reference '{@link edu.som.uoc.openapiprofile.Security#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see edu.som.uoc.openapiprofile.Security#getBase_Operation()
	 * @see #getSecurity()
	 * @generated
	 */
	EReference getSecurity_Base_Operation();

	/**
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security Requirement</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirement
	 * @generated
	 */
	EClass getSecurityRequirement();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityRequirement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirement#getName()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EAttribute getSecurityRequirement_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.SecurityRequirement#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirement#getScope()
	 * @see #getSecurityRequirement()
	 * @generated
	 */
	EAttribute getSecurityRequirement_Scope();

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
	 * Returns the meta object for class '{@link edu.som.uoc.openapiprofile.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tag</em>'.
	 * @see edu.som.uoc.openapiprofile.Tag
	 * @generated
	 */
	EClass getTag();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Tag#getExternalDocsURL <em>External Docs URL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Docs URL</em>'.
	 * @see edu.som.uoc.openapiprofile.Tag#getExternalDocsURL()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ExternalDocsURL();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Tag#getExternalDocsDescription <em>External Docs Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>External Docs Description</em>'.
	 * @see edu.som.uoc.openapiprofile.Tag#getExternalDocsDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_ExternalDocsDescription();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Tag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see edu.som.uoc.openapiprofile.Tag#getName()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Name();

	/**
	 * Returns the meta object for the attribute '{@link edu.som.uoc.openapiprofile.Tag#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see edu.som.uoc.openapiprofile.Tag#getDescription()
	 * @see #getTag()
	 * @generated
	 */
	EAttribute getTag_Description();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.SchemeType <em>Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scheme Type</em>'.
	 * @see edu.som.uoc.openapiprofile.SchemeType
	 * @generated
	 */
	EEnum getSchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.JSONDataType <em>JSON Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>JSON Data Type</em>'.
	 * @see edu.som.uoc.openapiprofile.JSONDataType
	 * @generated
	 */
	EEnum getJSONDataType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.HTTPMethod <em>HTTP Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>HTTP Method</em>'.
	 * @see edu.som.uoc.openapiprofile.HTTPMethod
	 * @generated
	 */
	EEnum getHTTPMethod();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.ParameterLocation <em>Parameter Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Parameter Location</em>'.
	 * @see edu.som.uoc.openapiprofile.ParameterLocation
	 * @generated
	 */
	EEnum getParameterLocation();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.CollectionFormat <em>Collection Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Collection Format</em>'.
	 * @see edu.som.uoc.openapiprofile.CollectionFormat
	 * @generated
	 */
	EEnum getCollectionFormat();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.SecuritySchemeType <em>Security Scheme Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Security Scheme Type</em>'.
	 * @see edu.som.uoc.openapiprofile.SecuritySchemeType
	 * @generated
	 */
	EEnum getSecuritySchemeType();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.APIKeyLocation <em>API Key Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>API Key Location</em>'.
	 * @see edu.som.uoc.openapiprofile.APIKeyLocation
	 * @generated
	 */
	EEnum getAPIKeyLocation();

	/**
	 * Returns the meta object for enum '{@link edu.som.uoc.openapiprofile.OAuth2FlowType <em>OAuth2 Flow Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>OAuth2 Flow Type</em>'.
	 * @see edu.som.uoc.openapiprofile.OAuth2FlowType
	 * @generated
	 */
	EEnum getOAuth2FlowType();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Integer</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getInteger();

	/**
	 * Returns the meta object for data type '{@link java.lang.Double <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Double</em>'.
	 * @see java.lang.Double
	 * @model instanceClass="java.lang.Double"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Real'"
	 * @generated
	 */
	EDataType getDouble();

	/**
	 * Returns the meta object for data type '{@link java.lang.Boolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Boolean</em>'.
	 * @see java.lang.Boolean
	 * @model instanceClass="java.lang.Boolean"
	 * @generated
	 */
	EDataType getBoolean();

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
		 * The meta object literal for the '<em><b>Example</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__EXAMPLE = eINSTANCE.getSchema_Example();

		/**
		 * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__READ_ONLY = eINSTANCE.getSchema_ReadOnly();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__XML = eINSTANCE.getSchema_Xml();

		/**
		 * The meta object literal for the '<em><b>Base Enumeration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__BASE_ENUMERATION = eINSTANCE.getSchema_Base_Enumeration();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl <em>JSON Schema Subset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.JSONSchemaSubsetImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getJSONSchemaSubset()
		 * @generated
		 */
		EClass JSON_SCHEMA_SUBSET = eINSTANCE.getJSONSchemaSubset();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MIN_LENGTH = eINSTANCE.getJSONSchemaSubset_MinLength();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAXIMUM = eINSTANCE.getJSONSchemaSubset_Maximum();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__EXCLUSIVE_MAXIMUM = eINSTANCE.getJSONSchemaSubset_ExclusiveMaximum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MINIMUM = eINSTANCE.getJSONSchemaSubset_Minimum();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAX_LENGTH = eINSTANCE.getJSONSchemaSubset_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MIN_ITEMS = eINSTANCE.getJSONSchemaSubset_MinItems();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__PATTERN = eINSTANCE.getJSONSchemaSubset_Pattern();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__EXCLUSIVE_MINIMUM = eINSTANCE.getJSONSchemaSubset_ExclusiveMinimum();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MAX_ITEMS = eINSTANCE.getJSONSchemaSubset_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__FORMAT = eINSTANCE.getJSONSchemaSubset_Format();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__TYPE = eINSTANCE.getJSONSchemaSubset_Type();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__DESCRIPTION = eINSTANCE.getJSONSchemaSubset_Description();

		/**
		 * The meta object literal for the '<em><b>Unique Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__UNIQUE_ITEMS = eINSTANCE.getJSONSchemaSubset_UniqueItems();

		/**
		 * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__DEFAULT = eINSTANCE.getJSONSchemaSubset_Default();

		/**
		 * The meta object literal for the '<em><b>Multipl Of</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JSON_SCHEMA_SUBSET__MULTIPL_OF = eINSTANCE.getJSONSchemaSubset_MultiplOf();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.XMLElementImpl <em>XML Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.XMLElementImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getXMLElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXMLElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__NAME = eINSTANCE.getXMLElement_Name();

		/**
		 * The meta object literal for the '<em><b>Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__NAMESPACE = eINSTANCE.getXMLElement_Namespace();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__PREFIX = eINSTANCE.getXMLElement_Prefix();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__ATTRIBUTE = eINSTANCE.getXMLElement_Attribute();

		/**
		 * The meta object literal for the '<em><b>Wrapped</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ELEMENT__WRAPPED = eINSTANCE.getXMLElement_Wrapped();

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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.HeaderImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getHeader()
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
		 * The meta object literal for the '<em><b>Min Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MIN_ITEMS = eINSTANCE.getHeader_MinItems();

		/**
		 * The meta object literal for the '<em><b>Pattern</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__PATTERN = eINSTANCE.getHeader_Pattern();

		/**
		 * The meta object literal for the '<em><b>Exclusive Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__EXCLUSIVE_MINIMUM = eINSTANCE.getHeader_ExclusiveMinimum();

		/**
		 * The meta object literal for the '<em><b>Minimum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MINIMUM = eINSTANCE.getHeader_Minimum();

		/**
		 * The meta object literal for the '<em><b>Min Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MIN_LENGTH = eINSTANCE.getHeader_MinLength();

		/**
		 * The meta object literal for the '<em><b>Max Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MAX_LENGTH = eINSTANCE.getHeader_MaxLength();

		/**
		 * The meta object literal for the '<em><b>Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MAXIMUM = eINSTANCE.getHeader_Maximum();

		/**
		 * The meta object literal for the '<em><b>Max Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__MAX_ITEMS = eINSTANCE.getHeader_MaxItems();

		/**
		 * The meta object literal for the '<em><b>Exclusive Maximum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__EXCLUSIVE_MAXIMUM = eINSTANCE.getHeader_ExclusiveMaximum();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.ExampleImpl <em>Example</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.ExampleImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getExample()
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
		 * The meta object literal for the '<em><b>License</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_INFO__LICENSE = eINSTANCE.getAPIInfo_License();

		/**
		 * The meta object literal for the '<em><b>Contact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_INFO__CONTACT = eINSTANCE.getAPIInfo_Contact();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference API_INFO__BASE_MODEL = eINSTANCE.getAPIInfo_Base_Model();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.LicenseImpl <em>License</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.LicenseImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getLicense()
		 * @generated
		 */
		EClass LICENSE = eINSTANCE.getLicense();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__NAME = eINSTANCE.getLicense_Name();

		/**
		 * The meta object literal for the '<em><b>License URL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LICENSE__LICENSE_URL = eINSTANCE.getLicense_LicenseURL();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.ContactImpl <em>Contact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.ContactImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getContact()
		 * @generated
		 */
		EClass CONTACT = eINSTANCE.getContact();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__URL = eINSTANCE.getContact_Url();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__NAME = eINSTANCE.getContact_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTACT__EMAIL = eINSTANCE.getContact_Email();

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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecuritySchemeImpl <em>Security Scheme</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecuritySchemeImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityScheme()
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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecurityScopeImpl <em>Security Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecurityScopeImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityScope()
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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecurityImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '<em><b>Security Requirements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__SECURITY_REQUIREMENTS = eINSTANCE.getSecurity_SecurityRequirements();

		/**
		 * The meta object literal for the '<em><b>Base Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__BASE_MODEL = eINSTANCE.getSecurity_Base_Model();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECURITY__BASE_OPERATION = eINSTANCE.getSecurity_Base_Operation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.SecurityRequirementImpl <em>Security Requirement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.SecurityRequirementImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecurityRequirement()
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

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.impl.TagImpl <em>Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.impl.TagImpl
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getTag()
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
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.SchemeType <em>Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.SchemeType
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSchemeType()
		 * @generated
		 */
		EEnum SCHEME_TYPE = eINSTANCE.getSchemeType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.JSONDataType <em>JSON Data Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.JSONDataType
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getJSONDataType()
		 * @generated
		 */
		EEnum JSON_DATA_TYPE = eINSTANCE.getJSONDataType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.HTTPMethod <em>HTTP Method</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.HTTPMethod
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getHTTPMethod()
		 * @generated
		 */
		EEnum HTTP_METHOD = eINSTANCE.getHTTPMethod();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.ParameterLocation <em>Parameter Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.ParameterLocation
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getParameterLocation()
		 * @generated
		 */
		EEnum PARAMETER_LOCATION = eINSTANCE.getParameterLocation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.CollectionFormat <em>Collection Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.CollectionFormat
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getCollectionFormat()
		 * @generated
		 */
		EEnum COLLECTION_FORMAT = eINSTANCE.getCollectionFormat();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.SecuritySchemeType <em>Security Scheme Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.SecuritySchemeType
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getSecuritySchemeType()
		 * @generated
		 */
		EEnum SECURITY_SCHEME_TYPE = eINSTANCE.getSecuritySchemeType();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.APIKeyLocation <em>API Key Location</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.APIKeyLocation
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getAPIKeyLocation()
		 * @generated
		 */
		EEnum API_KEY_LOCATION = eINSTANCE.getAPIKeyLocation();

		/**
		 * The meta object literal for the '{@link edu.som.uoc.openapiprofile.OAuth2FlowType <em>OAuth2 Flow Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.som.uoc.openapiprofile.OAuth2FlowType
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getOAuth2FlowType()
		 * @generated
		 */
		EEnum OAUTH2_FLOW_TYPE = eINSTANCE.getOAuth2FlowType();

		/**
		 * The meta object literal for the '<em>Integer</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getInteger()
		 * @generated
		 */
		EDataType INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '<em>Double</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Double
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getDouble()
		 * @generated
		 */
		EDataType DOUBLE = eINSTANCE.getDouble();

		/**
		 * The meta object literal for the '<em>Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Boolean
		 * @see edu.som.uoc.openapiprofile.impl.OpenapiprofilePackageImpl#getBoolean()
		 * @generated
		 */
		EDataType BOOLEAN = eINSTANCE.getBoolean();

	}

} //OpenapiprofilePackage
