/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Ouput</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.EventOuput#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getEventOuput()
 * @model
 * @generated
 */
public interface EventOuput extends Output {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(EventConnection)
	 * @see iaca.IacaPackage#getEventOuput_Connection()
	 * @model containment="true"
	 * @generated
	 */
	EventConnection getConnection();

	/**
	 * Sets the value of the '{@link iaca.EventOuput#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(EventConnection value);

} // EventOuput
