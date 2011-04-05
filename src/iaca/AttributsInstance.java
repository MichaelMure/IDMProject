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
 * A representation of the model object '<em><b>Attributs Instance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link iaca.AttributsInstance#getAttributs <em>Attributs</em>}</li>
 * </ul>
 * </p>
 *
 * @see iaca.IacaPackage#getAttributsInstance()
 * @model
 * @generated
 */
public interface AttributsInstance extends Instance {
	/**
	 * Returns the value of the '<em><b>Attributs</b></em>' reference list.
	 * The list contents are of type {@link iaca.Attributs}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributs</em>' reference list.
	 * @see iaca.IacaPackage#getAttributsInstance_Attributs()
	 * @model
	 * @generated
	 */
	EList<Attributs> getAttributs();

} // AttributsInstance
