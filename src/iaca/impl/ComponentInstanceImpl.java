/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca.impl;

import iaca.AttributsInstance;
import iaca.Component;
import iaca.ComponentInstance;
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
 * An implementation of the model object '<em><b>Component Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link iaca.impl.ComponentInstanceImpl#getComponents <em>Components</em>}</li>
 *   <li>{@link iaca.impl.ComponentInstanceImpl#getAttInstance <em>Att Instance</em>}</li>
 *   <li>{@link iaca.impl.ComponentInstanceImpl#getIoinstance <em>Ioinstance</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ComponentInstanceImpl extends InstanceImpl implements ComponentInstance {
	/**
	 * The cached value of the '{@link #getComponents() <em>Components</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponents()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> components;

	/**
	 * The cached value of the '{@link #getAttInstance() <em>Att Instance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttInstance()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributsInstance> attInstance;

	/**
	 * The cached value of the '{@link #getIoinstance() <em>Ioinstance</em>}' reference list.
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
	protected ComponentInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IacaPackage.Literals.COMPONENT_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponents() {
		if (components == null) {
			components = new EObjectResolvingEList<Component>(Component.class, this, IacaPackage.COMPONENT_INSTANCE__COMPONENTS);
		}
		return components;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributsInstance> getAttInstance() {
		if (attInstance == null) {
			attInstance = new EObjectContainmentEList<AttributsInstance>(AttributsInstance.class, this, IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE);
		}
		return attInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IOInstance> getIoinstance() {
		if (ioinstance == null) {
			ioinstance = new EObjectResolvingEList<IOInstance>(IOInstance.class, this, IacaPackage.COMPONENT_INSTANCE__IOINSTANCE);
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
			case IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE:
				return ((InternalEList<?>)getAttInstance()).basicRemove(otherEnd, msgs);
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
			case IacaPackage.COMPONENT_INSTANCE__COMPONENTS:
				return getComponents();
			case IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE:
				return getAttInstance();
			case IacaPackage.COMPONENT_INSTANCE__IOINSTANCE:
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
			case IacaPackage.COMPONENT_INSTANCE__COMPONENTS:
				getComponents().clear();
				getComponents().addAll((Collection<? extends Component>)newValue);
				return;
			case IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE:
				getAttInstance().clear();
				getAttInstance().addAll((Collection<? extends AttributsInstance>)newValue);
				return;
			case IacaPackage.COMPONENT_INSTANCE__IOINSTANCE:
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
			case IacaPackage.COMPONENT_INSTANCE__COMPONENTS:
				getComponents().clear();
				return;
			case IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE:
				getAttInstance().clear();
				return;
			case IacaPackage.COMPONENT_INSTANCE__IOINSTANCE:
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
			case IacaPackage.COMPONENT_INSTANCE__COMPONENTS:
				return components != null && !components.isEmpty();
			case IacaPackage.COMPONENT_INSTANCE__ATT_INSTANCE:
				return attInstance != null && !attInstance.isEmpty();
			case IacaPackage.COMPONENT_INSTANCE__IOINSTANCE:
				return ioinstance != null && !ioinstance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentInstanceImpl
