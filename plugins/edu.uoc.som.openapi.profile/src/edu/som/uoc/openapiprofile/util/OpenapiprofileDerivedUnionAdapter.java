/**
 */
package edu.som.uoc.openapiprofile.util;

import edu.som.uoc.openapiprofile.OpenapiprofilePackage;
import edu.som.uoc.openapiprofile.Schema;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.impl.AdapterImpl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An adapter that propagates notifications for derived unions.
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage
 * @generated
 */
public class OpenapiprofileDerivedUnionAdapter extends AdapterImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OpenapiprofilePackage modelPackage;

	/**
	 * Creates an instance of the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenapiprofileDerivedUnionAdapter() {
		if (modelPackage == null) {
			modelPackage = OpenapiprofilePackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>notifyChanged</code> with the appropriate model class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification) {
		Object notifier = notification.getNotifier();
		if (notifier instanceof EObject) {
			EClass eClass = ((EObject)notifier).eClass();
			if (eClass.eContainer() == modelPackage) {
				notifyChanged(notification, eClass);
			}
		}
	}

	/**
	 * Calls <code>notifyXXXChanged</code> for the corresponding class of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifyChanged(Notification notification, EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenapiprofilePackage.SCHEMA:
				notifySchemaChanged(notification, eClass);
				break;
		}
	}

	/**
	 * Does nothing; clients may override so that it does something.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @param derivedUnion the derived union affected by the change.
	 * @generated
	 */
	public void notifyChanged(Notification notification, EClass eClass, EStructuralFeature derivedUnion) {
		// Do nothing.
	}

	/**
	 * Calls <code>notifyChanged</code> for each affected derived union.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param notification a description of the change.
	 * @param eClass the Ecore class of the notifier.
	 * @generated
	 */
	protected void notifySchemaChanged(Notification notification, EClass eClass) {
		switch (notification.getFeatureID(Schema.class)) {
			case OpenapiprofilePackage.SCHEMA__OWNED_COMMENT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__NAME_EXPRESSION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__NAMESPACE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_RULE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__ELEMENT_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__PACKAGE_IMPORT:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__IMPORTED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNING_TEMPLATE_PARAMETER:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OpenapiprofilePackage.SCHEMA__PACKAGE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMED_ELEMENT__NAMESPACE);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNER);
				break;
			case OpenapiprofilePackage.SCHEMA__TEMPLATE_BINDING:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_TEMPLATE_SIGNATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__FEATURE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__COLLABORATION_USE:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__GENERALIZATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__INHERITED_MEMBER:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_USE_CASE:
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				break;
			case OpenapiprofilePackage.SCHEMA__REDEFINED_CLASSIFIER:
				notifyChanged(notification, eClass, UMLPackage.Literals.REDEFINABLE_ELEMENT__REDEFINED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__REPRESENTATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__SUBSTITUTION:
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_ATTRIBUTE:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__ATTRIBUTE);
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
			case OpenapiprofilePackage.SCHEMA__OWNED_OPERATION:
				notifyChanged(notification, eClass, UMLPackage.Literals.CLASSIFIER__FEATURE);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.NAMESPACE__OWNED_MEMBER);
				notifyChanged(notification, eClass, UMLPackage.Literals.ELEMENT__OWNED_ELEMENT);
				break;
		}
	}

} //OpenapiprofileDerivedUnionAdapter
