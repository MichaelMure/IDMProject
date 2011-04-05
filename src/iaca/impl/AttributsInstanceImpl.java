/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca.impl;

import iaca.Attributs;
import iaca.AttributsInstance;
import iaca.IacaPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attributs Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iaca.impl.AttributsInstanceImpl#getAttributs <em>Attributs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributsInstanceImpl extends InstanceImpl implements AttributsInstance {
	/**
	 * The cached value of the '{@link #getAttributs() <em>Attributs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributs()
	 * @generated
	 * @ordered
	 */
	protected EList<Attributs> attributs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributsInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IacaPackage.Literals.ATTRIBUTS_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attributs> getAttributs() {
		if (attributs == null) {
			attributs = new EObjectResolvingEList<Attributs>(Attributs.class, this, IacaPackage.ATTRIBUTS_INSTANCE__ATTRIBUTS);
		}
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IacaPackage.ATTRIBUTS_INSTANCE__ATTRIBUTS:
				return getAttributs();
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
			case IacaPackage.ATTRIBUTS_INSTANCE__ATTRIBUTS:
				getAttributs().clear();
				getAttributs().addAll((Collection<? extends Attributs>)newValue);
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
			case IacaPackage.ATTRIBUTS_INSTANCE__ATTRIBUTS:
				getAttributs().clear();
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
			case IacaPackage.ATTRIBUTS_INSTANCE__ATTRIBUTS:
				return attributs != null && !attributs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AttributsInstanceImpl
