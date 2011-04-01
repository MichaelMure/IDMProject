/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.Library#getC <em>C</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>C</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>C</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>C</em>' containment reference list.
	 * @see iaca.IacaPackage#getLibrary_C()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Component> getC();

} // Library
