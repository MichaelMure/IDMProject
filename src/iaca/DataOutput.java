/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.DataOutput#getConnection <em>Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getDataOutput()
 * @model
 * @generated
 */
public interface DataOutput extends Output {
	/**
	 * Returns the value of the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection</em>' containment reference.
	 * @see #setConnection(DataConnection)
	 * @see iaca.IacaPackage#getDataOutput_Connection()
	 * @model containment="true"
	 * @generated
	 */
	DataConnection getConnection();

	/**
	 * Sets the value of the '{@link iaca.DataOutput#getConnection <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection</em>' containment reference.
	 * @see #getConnection()
	 * @generated
	 */
	void setConnection(DataConnection value);

} // DataOutput
