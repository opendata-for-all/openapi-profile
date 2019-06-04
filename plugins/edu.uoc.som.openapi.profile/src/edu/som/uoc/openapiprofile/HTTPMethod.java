/**
 */
package edu.som.uoc.openapiprofile;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>HTTP Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see edu.som.uoc.openapiprofile.OpenapiprofilePackage#getHTTPMethod()
 * @model
 * @generated
 */
public enum HTTPMethod implements Enumerator {
	/**
	 * The '<em><b>Get</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET_VALUE
	 * @generated
	 * @ordered
	 */
	GET(0, "get", "get"),

	/**
	 * The '<em><b>Post</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_VALUE
	 * @generated
	 * @ordered
	 */
	POST(1, "post", "post"),

	/**
	 * The '<em><b>Put</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUT_VALUE
	 * @generated
	 * @ordered
	 */
	PUT(2, "put", "put"),

	/**
	 * The '<em><b>Patch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATCH_VALUE
	 * @generated
	 * @ordered
	 */
	PATCH(3, "patch", "patch"),

	/**
	 * The '<em><b>Options</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONS_VALUE
	 * @generated
	 * @ordered
	 */
	OPTIONS(4, "options", "options"),

	/**
	 * The '<em><b>Delete</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE_VALUE
	 * @generated
	 * @ordered
	 */
	DELETE(5, "delete", "delete");

	/**
	 * The '<em><b>Get</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GET
	 * @model name="get"
	 * @generated
	 * @ordered
	 */
	public static final int GET_VALUE = 0;

	/**
	 * The '<em><b>Post</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST
	 * @model name="post"
	 * @generated
	 * @ordered
	 */
	public static final int POST_VALUE = 1;

	/**
	 * The '<em><b>Put</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUT
	 * @model name="put"
	 * @generated
	 * @ordered
	 */
	public static final int PUT_VALUE = 2;

	/**
	 * The '<em><b>Patch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATCH
	 * @model name="patch"
	 * @generated
	 * @ordered
	 */
	public static final int PATCH_VALUE = 3;

	/**
	 * The '<em><b>Options</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPTIONS
	 * @model name="options"
	 * @generated
	 * @ordered
	 */
	public static final int OPTIONS_VALUE = 4;

	/**
	 * The '<em><b>Delete</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELETE
	 * @model name="delete"
	 * @generated
	 * @ordered
	 */
	public static final int DELETE_VALUE = 5;

	/**
	 * An array of all the '<em><b>HTTP Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HTTPMethod[] VALUES_ARRAY =
		new HTTPMethod[] {
			GET,
			POST,
			PUT,
			PATCH,
			OPTIONS,
			DELETE,
		};

	/**
	 * A public read-only list of all the '<em><b>HTTP Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HTTPMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>HTTP Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTPMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HTTPMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>HTTP Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static HTTPMethod get(int value) {
		switch (value) {
			case GET_VALUE: return GET;
			case POST_VALUE: return POST;
			case PUT_VALUE: return PUT;
			case PATCH_VALUE: return PATCH;
			case OPTIONS_VALUE: return OPTIONS;
			case DELETE_VALUE: return DELETE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private HTTPMethod(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //HTTPMethod
