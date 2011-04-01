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
 * A representation of the model object '<em><b>Data Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.DataConnection#getInputs <em>Inputs</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getDataConnection()
 * @model
 * @generated
 */
public interface DataConnection extends EObject {
	/**
	 * Returns the value of the '<em><b>Inputs</b></em>' reference list.
	 * The list contents are of type {@link iaca.DataInput}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inputs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inputs</em>' reference list.
	 * @see iaca.IacaPackage#getDataConnection_Inputs()
	 * @model required="true"
	 * @generated
	 */
	EList<DataInput> getInputs();

} // DataConnection
