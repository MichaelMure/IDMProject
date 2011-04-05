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
 * A representation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.ComponentInstance#getComponents <em>Components</em>}</li>
 *   <li>{@link iaca.ComponentInstance#getAttInstance <em>Att Instance</em>}</li>
 *   <li>{@link iaca.ComponentInstance#getIoinstance <em>Ioinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getComponentInstance()
 * @model
 * @generated
 */
public interface ComponentInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' reference list.
	 * The list contents are of type {@link iaca.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' reference list.
	 * @see iaca.IacaPackage#getComponentInstance_Components()
	 * @model
	 * @generated
	 */
	EList<Component> getComponents();

	/**
	 * Returns the value of the '<em><b>Att Instance</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.AttributsInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att Instance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att Instance</em>' containment reference list.
	 * @see iaca.IacaPackage#getComponentInstance_AttInstance()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<AttributsInstance> getAttInstance();

	/**
	 * Returns the value of the '<em><b>Ioinstance</b></em>' reference list.
	 * The list contents are of type {@link iaca.IOInstance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ioinstance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ioinstance</em>' reference list.
	 * @see iaca.IacaPackage#getComponentInstance_Ioinstance()
	 * @model required="true"
	 * @generated
	 */
	EList<IOInstance> getIoinstance();

} // ComponentInstance
