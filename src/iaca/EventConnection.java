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
 * A representation of the model object '<em><b>Event Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.EventConnection#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getEventConnection()
 * @model
 * @generated
 */
public interface EventConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link iaca.EventInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see iaca.IacaPackage#getEventConnection_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<EventInput> getInputs();

} // EventConnection
