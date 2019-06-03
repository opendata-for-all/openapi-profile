/**
 */
package edu.som.uoc.openapiprofile.util;

import edu.som.uoc.openapiprofile.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage
 * @generated
 */
public class OpenapiprofileAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenapiprofilePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofileAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = OpenapiprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OpenapiprofileSwitch<Adapter> modelSwitch =
		new OpenapiprofileSwitch<Adapter>() {
			@Override
			public Adapter caseAPI(API object) {
				return createAPIAdapter();
			}
			@Override
			public Adapter caseSchema(Schema object) {
				return createSchemaAdapter();
			}
			@Override
			public Adapter caseAPIProperty(APIProperty object) {
				return createAPIPropertyAdapter();
			}
			@Override
			public Adapter caseXMLFormat(XMLFormat object) {
				return createXMLFormatAdapter();
			}
			@Override
			public Adapter caseJSONSchemaConstraints(JSONSchemaConstraints object) {
				return createJSONSchemaConstraintsAdapter();
			}
			@Override
			public Adapter caseAPIDataType(APIDataType object) {
				return createAPIDataTypeAdapter();
			}
			@Override
			public Adapter caseAPIOperation(APIOperation object) {
				return createAPIOperationAdapter();
			}
			@Override
			public Adapter caseAPIParameter(APIParameter object) {
				return createAPIParameterAdapter();
			}
			@Override
			public Adapter caseAPIResponse(APIResponse object) {
				return createAPIResponseAdapter();
			}
			@Override
			public Adapter caseHeader(Header object) {
				return createHeaderAdapter();
			}
			@Override
			public Adapter caseExample(Example object) {
				return createExampleAdapter();
			}
			@Override
			public Adapter caseAPIInfo(APIInfo object) {
				return createAPIInfoAdapter();
			}
			@Override
			public Adapter caseExternalDocs(ExternalDocs object) {
				return createExternalDocsAdapter();
			}
			@Override
			public Adapter caseSecurityScheme(SecurityScheme object) {
				return createSecuritySchemeAdapter();
			}
			@Override
			public Adapter caseSecurityScope(SecurityScope object) {
				return createSecurityScopeAdapter();
			}
			@Override
			public Adapter caseSecurityRequirement(SecurityRequirement object) {
				return createSecurityRequirementAdapter();
			}
			@Override
			public Adapter caseSecurityDefinitions(SecurityDefinitions object) {
				return createSecurityDefinitionsAdapter();
			}
			@Override
			public Adapter caseSecurityRequirements(SecurityRequirements object) {
				return createSecurityRequirementsAdapter();
			}
			@Override
			public Adapter caseTags(Tags object) {
				return createTagsAdapter();
			}
			@Override
			public Adapter caseTag(Tag object) {
				return createTagAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.API <em>API</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.API
	 * @generated
	 */
	public Adapter createAPIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.Schema
	 * @generated
	 */
	public Adapter createSchemaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIProperty <em>API Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIProperty
	 * @generated
	 */
	public Adapter createAPIPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.XMLFormat <em>XML Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.XMLFormat
	 * @generated
	 */
	public Adapter createXMLFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.JSONSchemaConstraints <em>JSON Schema Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.JSONSchemaConstraints
	 * @generated
	 */
	public Adapter createJSONSchemaConstraintsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIDataType <em>API Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIDataType
	 * @generated
	 */
	public Adapter createAPIDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIOperation <em>API Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIOperation
	 * @generated
	 */
	public Adapter createAPIOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIParameter <em>API Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIParameter
	 * @generated
	 */
	public Adapter createAPIParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIResponse <em>API Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIResponse
	 * @generated
	 */
	public Adapter createAPIResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.Header
	 * @generated
	 */
	public Adapter createHeaderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.Example <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.Example
	 * @generated
	 */
	public Adapter createExampleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.APIInfo <em>API Info</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.APIInfo
	 * @generated
	 */
	public Adapter createAPIInfoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.ExternalDocs <em>External Docs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.ExternalDocs
	 * @generated
	 */
	public Adapter createExternalDocsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.SecurityScheme <em>Security Scheme</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.SecurityScheme
	 * @generated
	 */
	public Adapter createSecuritySchemeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.SecurityScope <em>Security Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.SecurityScope
	 * @generated
	 */
	public Adapter createSecurityScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.SecurityRequirement <em>Security Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirement
	 * @generated
	 */
	public Adapter createSecurityRequirementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.SecurityDefinitions <em>Security Definitions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.SecurityDefinitions
	 * @generated
	 */
	public Adapter createSecurityDefinitionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.SecurityRequirements <em>Security Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.SecurityRequirements
	 * @generated
	 */
	public Adapter createSecurityRequirementsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.Tags <em>Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.Tags
	 * @generated
	 */
	public Adapter createTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link edu.som.uoc.openapiprofile.Tag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see edu.som.uoc.openapiprofile.Tag
	 * @generated
	 */
	public Adapter createTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //OpenapiprofileAdapterFactory
