/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca.impl;

import iaca.ConnectionInstance;
import iaca.DataConnection;
import iaca.EventConnection;
import iaca.IOInstance;
import iaca.IacaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iaca.impl.ConnectionInstanceImpl#getDataC <em>Data C</em>}</li>
 *   <li>{@link iaca.impl.ConnectionInstanceImpl#getEventC <em>Event C</em>}</li>
 *   <li>{@link iaca.impl.ConnectionInstanceImpl#getIoinstance <em>Ioinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ConnectionInstanceImpl extends InstanceImpl implements ConnectionInstance {
	/**
	 * The cached value of the '{@link #getDataC() <em>Data C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataC()
	 * @generated
	 * @ordered
	 */
	protected EList<DataConnection> dataC;

	/**
	 * The cached value of the '{@link #getEventC() <em>Event C</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventC()
	 * @generated
	 * @ordered
	 */
	protected EList<EventConnection> eventC;

	/**
	 * The cached value of the '{@link #getIoinstance() <em>Ioinstance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoinstance()
	 * @generated
	 * @ordered
	 */
	protected EList<IOInstance> ioinstance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IacaPackage.Literals.CONNECTION_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataConnection> getDataC() {
		if (dataC == null) {
			dataC = new EObjectResolvingEList<DataConnection>(DataConnection.class, this, IacaPackage.CONNECTION_INSTANCE__DATA_C);
		}
		return dataC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EventConnection> getEventC() {
		if (eventC == null) {
			eventC = new EObjectResolvingEList<EventConnection>(EventConnection.class, this, IacaPackage.CONNECTION_INSTANCE__EVENT_C);
		}
		return eventC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOInstance> getIoinstance() {
		if (ioinstance == null) {
			ioinstance = new EObjectContainmentEList<IOInstance>(IOInstance.class, this, IacaPackage.CONNECTION_INSTANCE__IOINSTANCE);
		}
		return ioinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IacaPackage.CONNECTION_INSTANCE__IOINSTANCE:
				return ((InternalEList<?>)getIoinstance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IacaPackage.CONNECTION_INSTANCE__DATA_C:
				return getDataC();
			case IacaPackage.CONNECTION_INSTANCE__EVENT_C:
				return getEventC();
			case IacaPackage.CONNECTION_INSTANCE__IOINSTANCE:
				return getIoinstance();
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
			case IacaPackage.CONNECTION_INSTANCE__DATA_C:
				getDataC().clear();
				getDataC().addAll((Collection<? extends DataConnection>)newValue);
				return;
			case IacaPackage.CONNECTION_INSTANCE__EVENT_C:
				getEventC().clear();
				getEventC().addAll((Collection<? extends EventConnection>)newValue);
				return;
			case IacaPackage.CONNECTION_INSTANCE__IOINSTANCE:
				getIoinstance().clear();
				getIoinstance().addAll((Collection<? extends IOInstance>)newValue);
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
			case IacaPackage.CONNECTION_INSTANCE__DATA_C:
				getDataC().clear();
				return;
			case IacaPackage.CONNECTION_INSTANCE__EVENT_C:
				getEventC().clear();
				return;
			case IacaPackage.CONNECTION_INSTANCE__IOINSTANCE:
				getIoinstance().clear();
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
			case IacaPackage.CONNECTION_INSTANCE__DATA_C:
				return dataC != null && !dataC.isEmpty();
			case IacaPackage.CONNECTION_INSTANCE__EVENT_C:
				return eventC != null && !eventC.isEmpty();
			case IacaPackage.CONNECTION_INSTANCE__IOINSTANCE:
				return ioinstance != null && !ioinstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConnectionInstanceImpl
