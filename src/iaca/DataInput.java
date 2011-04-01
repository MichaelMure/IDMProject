/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.DataInput#getConnections <em>Connections</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getDataInput()
 * @model
 * @generated
 */
public interface DataInput extends Input {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.DataConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see iaca.IacaPackage#getDataInput_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<DataConnection> getConnections();

} // DataInput
