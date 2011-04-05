/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca.impl;

import iaca.IO;
import iaca.IOInstance;
import iaca.IacaPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IO Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iaca.impl.IOInstanceImpl#getIo <em>Io</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IOInstanceImpl extends InstanceImpl implements IOInstance {
	/**
	 * The cached value of the '{@link #getIo() <em>Io</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIo()
	 * @generated
	 * @ordered
	 */
	protected EList<IO> io;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IOInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IacaPackage.Literals.IO_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IO> getIo() {
		if (io == null) {
			io = new EObjectResolvingEList<IO>(IO.class, this, IacaPackage.IO_INSTANCE__IO);
		}
		return io;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IacaPackage.IO_INSTANCE__IO:
				return getIo();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case IacaPackage.IO_INSTANCE__IO:
				getIo().clear();
				getIo().addAll((Collection<? extends IO>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case IacaPackage.IO_INSTANCE__IO:
				getIo().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case IacaPackage.IO_INSTANCE__IO:
				return io != null && !io.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IOInstanceImpl
