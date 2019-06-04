/**
 */
package edu.som.uoc.openapiprofile.util;

import edu.som.uoc.openapiprofile.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage
 * @generated
 */
public class OpenapiprofileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenapiprofilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofileSwitch() {
		if (modelPackage == null) {
			modelPackage = OpenapiprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OpenapiprofilePackage.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_PROPERTY: {
				APIProperty apiProperty = (APIProperty)theEObject;
				T result = caseAPIProperty(apiProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.XML_FORMAT: {
				XMLFormat xmlFormat = (XMLFormat)theEObject;
				T result = caseXMLFormat(xmlFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.JSON_SCHEMA_CONSTRAINTS: {
				JSONSchemaConstraints jsonSchemaConstraints = (JSONSchemaConstraints)theEObject;
				T result = caseJSONSchemaConstraints(jsonSchemaConstraints);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_DATA_TYPE: {
				APIDataType apiDataType = (APIDataType)theEObject;
				T result = caseAPIDataType(apiDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_OPERATION: {
				APIOperation apiOperation = (APIOperation)theEObject;
				T result = caseAPIOperation(apiOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_PARAMETER: {
				APIParameter apiParameter = (APIParameter)theEObject;
				T result = caseAPIParameter(apiParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_RESPONSE: {
				APIResponse apiResponse = (APIResponse)theEObject;
				T result = caseAPIResponse(apiResponse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.API_INFO: {
				APIInfo apiInfo = (APIInfo)theEObject;
				T result = caseAPIInfo(apiInfo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SECURITY_DEFINITIONS: {
				SecurityDefinitions securityDefinitions = (SecurityDefinitions)theEObject;
				T result = caseSecurityDefinitions(securityDefinitions);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SECURITY_SCHEME: {
				SecurityScheme securityScheme = (SecurityScheme)theEObject;
				T result = caseSecurityScheme(securityScheme);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SECURITY_SCOPE: {
				SecurityScope securityScope = (SecurityScope)theEObject;
				T result = caseSecurityScope(securityScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SECURITY: {
				Security security = (Security)theEObject;
				T result = caseSecurity(security);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.TAGS: {
				Tags tags = (Tags)theEObject;
				T result = caseTags(tags);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OpenapiprofilePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIProperty(APIProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLFormat(XMLFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Schema Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Schema Constraints</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONSchemaConstraints(JSONSchemaConstraints object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIDataType(APIDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIOperation(APIOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIParameter(APIParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIResponse(APIResponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIInfo(APIInfo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocs(ExternalDocs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Definitions</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Definitions</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityDefinitions(SecurityDefinitions object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scheme</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScheme(SecurityScheme object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScope(SecurityScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tags</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTags(Tags object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OpenapiprofileSwitch
