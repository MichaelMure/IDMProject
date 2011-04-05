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
 * A representation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.ConnectionInstance#getDataC <em>Data C</em>}</li>
 *   <li>{@link iaca.ConnectionInstance#getEventC <em>Event C</em>}</li>
 *   <li>{@link iaca.ConnectionInstance#getIoinstance <em>Ioinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getConnectionInstance()
 * @model abstract="true"
 * @generated
 */
public interface ConnectionInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Data C</b></em>' reference list.
	 * The list contents are of type {@link iaca.DataConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data C</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data C</em>' reference list.
	 * @see iaca.IacaPackage#getConnectionInstance_DataC()
	 * @model
	 * @generated
	 */
	EList<DataConnection> getDataC();

	/**
	 * Returns the value of the '<em><b>Event C</b></em>' reference list.
	 * The list contents are of type {@link iaca.EventConnection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event C</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event C</em>' reference list.
	 * @see iaca.IacaPackage#getConnectionInstance_EventC()
	 * @model
	 * @generated
	 */
	EList<EventConnection> getEventC();

	/**
	 * Returns the value of the '<em><b>Ioinstance</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.IOInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioinstance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioinstance</em>' containment reference list.
	 * @see iaca.IacaPackage#getConnectionInstance_Ioinstance()
	 * @model containment="true" lower="2" upper="2"
	 * @generated
	 */
	EList<IOInstance> getIoinstance();

} // ConnectionInstance
