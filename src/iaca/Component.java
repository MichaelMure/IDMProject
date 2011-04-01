/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;

import java.lang.String;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.Component#getName <em>Name</em>}</li>
 *   <li>{@link iaca.Component#getAtt <em>Att</em>}</li>
 *   <li>{@link iaca.Component#getIOs <em>IOs</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iaca.IacaPackage#getComponent_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iaca.Component#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Att</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.Attributs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Att</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Att</em>' containment reference list.
	 * @see iaca.IacaPackage#getComponent_Att()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attributs> getAtt();

	/**
	 * Returns the value of the '<em><b>IOs</b></em>' containment reference list.
	 * The list contents are of type {@link iaca.IO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IOs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IOs</em>' containment reference list.
	 * @see iaca.IacaPackage#getComponent_IOs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<IO> getIOs();

} // Component
