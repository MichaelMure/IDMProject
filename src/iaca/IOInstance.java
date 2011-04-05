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
 * A representation of the model object '<em><b>IO Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.IOInstance#getIo <em>Io</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getIOInstance()
 * @model
 * @generated
 */
public interface IOInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Io</b></em>' reference list.
	 * The list contents are of type {@link iaca.IO}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Io</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Io</em>' reference list.
	 * @see iaca.IacaPackage#getIOInstance_Io()
	 * @model
	 * @generated
	 */
	EList<IO> getIo();

} // IOInstance
