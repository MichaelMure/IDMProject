/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca.impl;

import iaca.Attributs;
import iaca.Bit;
import iaca.Char;
import iaca.Component;
import iaca.DataConnection;
import iaca.DataInput;
import iaca.DataOutput;
import iaca.EventConnection;
import iaca.EventInput;
import iaca.EventOuput;
import iaca.IacaFactory;
import iaca.IacaPackage;
import iaca.Library;
import iaca.Real;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IacaFactoryImpl extends EFactoryImpl implements IacaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IacaFactory init() {
		try {
			IacaFactory theIacaFactory = (IacaFactory)EPackage.Registry.INSTANCE.getEFactory("http://iaca/1.0"); 
			if (theIacaFactory != null) {
				return theIacaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new IacaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IacaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case IacaPackage.ATTRIBUTS: return createAttributs();
			case IacaPackage.COMPONENT: return createComponent();
			case IacaPackage.LIBRARY: return createLibrary();
			case IacaPackage.BIT: return createBit();
			case IacaPackage.INTEGER: return createInteger();
			case IacaPackage.LONG: return createLong();
			case IacaPackage.REAL: return createReal();
			case IacaPackage.CHAR: return createChar();
			case IacaPackage.STRING: return createString();
			case IacaPackage.DATA_INPUT: return createDataInput();
			case IacaPackage.DATA_OUTPUT: return createDataOutput();
			case IacaPackage.EVENT_INPUT: return createEventInput();
			case IacaPackage.EVENT_OUPUT: return createEventOuput();
			case IacaPackage.DATA_CONNECTION: return createDataConnection();
			case IacaPackage.EVENT_CONNECTION: return createEventConnection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attributs createAttributs() {
		AttributsImpl attributs = new AttributsImpl();
		return attributs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bit createBit() {
		BitImpl bit = new BitImpl();
		return bit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iaca.Integer createInteger() {
		IntegerImpl integer = new IntegerImpl();
		return integer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iaca.Long createLong() {
		LongImpl long_ = new LongImpl();
		return long_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Real createReal() {
		RealImpl real = new RealImpl();
		return real;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Char createChar() {
		CharImpl char_ = new CharImpl();
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public iaca.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataInput createDataInput() {
		DataInputImpl dataInput = new DataInputImpl();
		return dataInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataOutput createDataOutput() {
		DataOutputImpl dataOutput = new DataOutputImpl();
		return dataOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventInput createEventInput() {
		EventInputImpl eventInput = new EventInputImpl();
		return eventInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventOuput createEventOuput() {
		EventOuputImpl eventOuput = new EventOuputImpl();
		return eventOuput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataConnection createDataConnection() {
		DataConnectionImpl dataConnection = new DataConnectionImpl();
		return dataConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventConnection createEventConnection() {
		EventConnectionImpl eventConnection = new EventConnectionImpl();
		return eventConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IacaPackage getIacaPackage() {
		return (IacaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static IacaPackage getPackage() {
		return IacaPackage.eINSTANCE;
	}

} //IacaFactoryImpl
