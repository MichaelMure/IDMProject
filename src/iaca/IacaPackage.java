/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package iaca;

import java.lang.String;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see iaca.IacaFactory
 * @model kind="package"
 * @generated
 */
public interface IacaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "iaca";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://iaca/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "iaca";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	IacaPackage eINSTANCE = iaca.impl.IacaPackageImpl.init();

	/**
	 * The meta object id for the '{@link iaca.impl.AttributsImpl <em>Attributs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.AttributsImpl
	 * @see iaca.impl.IacaPackageImpl#getAttributs()
	 * @generated
	 */
	int ATTRIBUTS = 0;

	/**
	 * The feature id for the '<em><b>T</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS__T = 0;

	/**
	 * The feature id for the '<em><b>EReference0</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS__EREFERENCE0 = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS__NAME = 3;

	/**
	 * The number of structural features of the '<em>Attributs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link iaca.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.ComponentImpl
	 * @see iaca.impl.IacaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Att</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__ATT = 1;

	/**
	 * The feature id for the '<em><b>IOs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__IOS = 2;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link iaca.impl.LibraryImpl <em>Library</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.LibraryImpl
	 * @see iaca.impl.IacaPackageImpl#getLibrary()
	 * @generated
	 */
	int LIBRARY = 2;

	/**
	 * The feature id for the '<em><b>C</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY__C = 0;

	/**
	 * The number of structural features of the '<em>Library</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIBRARY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iaca.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.TypeImpl
	 * @see iaca.impl.IacaPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link iaca.impl.BitImpl <em>Bit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.BitImpl
	 * @see iaca.impl.IacaPackageImpl#getBit()
	 * @generated
	 */
	int BIT = 4;

	/**
	 * The number of structural features of the '<em>Bit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.IntegerImpl <em>Integer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.IntegerImpl
	 * @see iaca.impl.IacaPackageImpl#getInteger()
	 * @generated
	 */
	int INTEGER = 5;

	/**
	 * The number of structural features of the '<em>Integer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.LongImpl <em>Long</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.LongImpl
	 * @see iaca.impl.IacaPackageImpl#getLong()
	 * @generated
	 */
	int LONG = 6;

	/**
	 * The number of structural features of the '<em>Long</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LONG_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.RealImpl <em>Real</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.RealImpl
	 * @see iaca.impl.IacaPackageImpl#getReal()
	 * @generated
	 */
	int REAL = 7;

	/**
	 * The number of structural features of the '<em>Real</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.CharImpl <em>Char</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.CharImpl
	 * @see iaca.impl.IacaPackageImpl#getChar()
	 * @generated
	 */
	int CHAR = 8;

	/**
	 * The number of structural features of the '<em>Char</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.StringImpl <em>String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.StringImpl
	 * @see iaca.impl.IacaPackageImpl#getString()
	 * @generated
	 */
	int STRING = 9;

	/**
	 * The number of structural features of the '<em>String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.IOImpl <em>IO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.IOImpl
	 * @see iaca.impl.IacaPackageImpl#getIO()
	 * @generated
	 */
	int IO = 16;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO__NAME = 1;

	/**
	 * The number of structural features of the '<em>IO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link iaca.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.InputImpl
	 * @see iaca.impl.IacaPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TYPE = IO__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = IO__NAME;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = IO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.OutputImpl
	 * @see iaca.impl.IacaPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TYPE = IO__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = IO__NAME;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = IO_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.DataInputImpl <em>Data Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.DataInputImpl
	 * @see iaca.impl.IacaPackageImpl#getDataInput()
	 * @generated
	 */
	int DATA_INPUT = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT__CONNECTIONS = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.DataOutputImpl <em>Data Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.DataOutputImpl
	 * @see iaca.impl.IacaPackageImpl#getDataOutput()
	 * @generated
	 */
	int DATA_OUTPUT = 13;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__TYPE = OUTPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__NAME = OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT__CONNECTION = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Data Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OUTPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.EventInputImpl <em>Event Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.EventInputImpl
	 * @see iaca.impl.IacaPackageImpl#getEventInput()
	 * @generated
	 */
	int EVENT_INPUT = 14;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INPUT__TYPE = INPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INPUT__NAME = INPUT__NAME;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INPUT__CONNECTIONS = INPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INPUT_FEATURE_COUNT = INPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.EventOuputImpl <em>Event Ouput</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.EventOuputImpl
	 * @see iaca.impl.IacaPackageImpl#getEventOuput()
	 * @generated
	 */
	int EVENT_OUPUT = 15;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUPUT__TYPE = OUTPUT__TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUPUT__NAME = OUTPUT__NAME;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUPUT__CONNECTION = OUTPUT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event Ouput</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OUPUT_FEATURE_COUNT = OUTPUT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.DataConnectionImpl <em>Data Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.DataConnectionImpl
	 * @see iaca.impl.IacaPackageImpl#getDataConnection()
	 * @generated
	 */
	int DATA_CONNECTION = 17;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Data Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_CONNECTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link iaca.impl.EventConnectionImpl <em>Event Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.EventConnectionImpl
	 * @see iaca.impl.IacaPackageImpl#getEventConnection()
	 * @generated
	 */
	int EVENT_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONNECTION__INPUTS = 0;

	/**
	 * The number of structural features of the '<em>Event Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_CONNECTION_FEATURE_COUNT = 1;


	/**
	 * The meta object id for the '{@link iaca.impl.InstanceImpl <em>Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.InstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getInstance()
	 * @generated
	 */
	int INSTANCE = 27;

	/**
	 * The number of structural features of the '<em>Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link iaca.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.ComponentInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getComponentInstance()
	 * @generated
	 */
	int COMPONENT_INSTANCE = 19;

	/**
	 * The feature id for the '<em><b>Components</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__COMPONENTS = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Att Instance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__ATT_INSTANCE = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ioinstance</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE__IOINSTANCE = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Component Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link iaca.impl.InputInstanceImpl <em>Input Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.InputInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getInputInstance()
	 * @generated
	 */
	int INPUT_INSTANCE = 20;

	/**
	 * The number of structural features of the '<em>Input Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_INSTANCE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link iaca.impl.IOInstanceImpl <em>IO Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.IOInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getIOInstance()
	 * @generated
	 */
	int IO_INSTANCE = 21;

	/**
	 * The feature id for the '<em><b>Io</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_INSTANCE__IO = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>IO Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IO_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.AttributsInstanceImpl <em>Attributs Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.AttributsInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getAttributsInstance()
	 * @generated
	 */
	int ATTRIBUTS_INSTANCE = 22;

	/**
	 * The feature id for the '<em><b>Attributs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS_INSTANCE__ATTRIBUTS = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attributs Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTS_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link iaca.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.ConnectionInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getConnectionInstance()
	 * @generated
	 */
	int CONNECTION_INSTANCE = 23;

	/**
	 * The feature id for the '<em><b>Data C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__DATA_C = INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Event C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__EVENT_C = INSTANCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ioinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE__IOINSTANCE = INSTANCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Connection Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_INSTANCE_FEATURE_COUNT = INSTANCE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link iaca.impl.DataInstanceImpl <em>Data Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.DataInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getDataInstance()
	 * @generated
	 */
	int DATA_INSTANCE = 24;

	/**
	 * The feature id for the '<em><b>Data C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTANCE__DATA_C = CONNECTION_INSTANCE__DATA_C;

	/**
	 * The feature id for the '<em><b>Event C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTANCE__EVENT_C = CONNECTION_INSTANCE__EVENT_C;

	/**
	 * The feature id for the '<em><b>Ioinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTANCE__IOINSTANCE = CONNECTION_INSTANCE__IOINSTANCE;

	/**
	 * The number of structural features of the '<em>Data Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_INSTANCE_FEATURE_COUNT = CONNECTION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.EventInstanceImpl <em>Event Instance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.EventInstanceImpl
	 * @see iaca.impl.IacaPackageImpl#getEventInstance()
	 * @generated
	 */
	int EVENT_INSTANCE = 25;

	/**
	 * The feature id for the '<em><b>Data C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__DATA_C = CONNECTION_INSTANCE__DATA_C;

	/**
	 * The feature id for the '<em><b>Event C</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__EVENT_C = CONNECTION_INSTANCE__EVENT_C;

	/**
	 * The feature id for the '<em><b>Ioinstance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE__IOINSTANCE = CONNECTION_INSTANCE__IOINSTANCE;

	/**
	 * The number of structural features of the '<em>Event Instance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_INSTANCE_FEATURE_COUNT = CONNECTION_INSTANCE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link iaca.impl.ProcessImpl <em>Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see iaca.impl.ProcessImpl
	 * @see iaca.impl.IacaPackageImpl#getProcess()
	 * @generated
	 */
	int PROCESS = 26;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROCESS_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link iaca.Attributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributs</em>'.
	 * @see iaca.Attributs
	 * @generated
	 */
	EClass getAttributs();

	/**
	 * Returns the meta object for the attribute '{@link iaca.Attributs#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iaca.Attributs#getName()
	 * @see #getAttributs()
	 * @generated
	 */
	EAttribute getAttributs_Name();

	/**
	 * Returns the meta object for the reference '{@link iaca.Attributs#getT <em>T</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>T</em>'.
	 * @see iaca.Attributs#getT()
	 * @see #getAttributs()
	 * @generated
	 */
	EReference getAttributs_T();

	/**
	 * Returns the meta object for the reference '{@link iaca.Attributs#getEReference0 <em>EReference0</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>EReference0</em>'.
	 * @see iaca.Attributs#getEReference0()
	 * @see #getAttributs()
	 * @generated
	 */
	EReference getAttributs_EReference0();

	/**
	 * Returns the meta object for the containment reference '{@link iaca.Attributs#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see iaca.Attributs#getType()
	 * @see #getAttributs()
	 * @generated
	 */
	EReference getAttributs_Type();

	/**
	 * Returns the meta object for class '{@link iaca.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see iaca.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the attribute '{@link iaca.Component#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iaca.Component#getName()
	 * @see #getComponent()
	 * @generated
	 */
	EAttribute getComponent_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.Component#getAtt <em>Att</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att</em>'.
	 * @see iaca.Component#getAtt()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Att();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.Component#getIOs <em>IOs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>IOs</em>'.
	 * @see iaca.Component#getIOs()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_IOs();

	/**
	 * Returns the meta object for class '{@link iaca.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Library</em>'.
	 * @see iaca.Library
	 * @generated
	 */
	EClass getLibrary();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.Library#getC <em>C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>C</em>'.
	 * @see iaca.Library#getC()
	 * @see #getLibrary()
	 * @generated
	 */
	EReference getLibrary_C();

	/**
	 * Returns the meta object for class '{@link iaca.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see iaca.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for class '{@link iaca.Bit <em>Bit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bit</em>'.
	 * @see iaca.Bit
	 * @generated
	 */
	EClass getBit();

	/**
	 * Returns the meta object for class '{@link iaca.Integer <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer</em>'.
	 * @see iaca.Integer
	 * @generated
	 */
	EClass getInteger();

	/**
	 * Returns the meta object for class '{@link iaca.Long <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Long</em>'.
	 * @see iaca.Long
	 * @generated
	 */
	EClass getLong();

	/**
	 * Returns the meta object for class '{@link iaca.Real <em>Real</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real</em>'.
	 * @see iaca.Real
	 * @generated
	 */
	EClass getReal();

	/**
	 * Returns the meta object for class '{@link iaca.Char <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char</em>'.
	 * @see iaca.Char
	 * @generated
	 */
	EClass getChar();

	/**
	 * Returns the meta object for class '{@link iaca.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String</em>'.
	 * @see iaca.String
	 * @generated
	 */
	EClass getString();

	/**
	 * Returns the meta object for class '{@link iaca.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see iaca.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for class '{@link iaca.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see iaca.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for class '{@link iaca.DataInput <em>Data Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Input</em>'.
	 * @see iaca.DataInput
	 * @generated
	 */
	EClass getDataInput();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.DataInput#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see iaca.DataInput#getConnections()
	 * @see #getDataInput()
	 * @generated
	 */
	EReference getDataInput_Connections();

	/**
	 * Returns the meta object for class '{@link iaca.DataOutput <em>Data Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Output</em>'.
	 * @see iaca.DataOutput
	 * @generated
	 */
	EClass getDataOutput();

	/**
	 * Returns the meta object for the containment reference '{@link iaca.DataOutput#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see iaca.DataOutput#getConnection()
	 * @see #getDataOutput()
	 * @generated
	 */
	EReference getDataOutput_Connection();

	/**
	 * Returns the meta object for class '{@link iaca.EventInput <em>Event Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Input</em>'.
	 * @see iaca.EventInput
	 * @generated
	 */
	EClass getEventInput();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.EventInput#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see iaca.EventInput#getConnections()
	 * @see #getEventInput()
	 * @generated
	 */
	EReference getEventInput_Connections();

	/**
	 * Returns the meta object for class '{@link iaca.EventOuput <em>Event Ouput</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Ouput</em>'.
	 * @see iaca.EventOuput
	 * @generated
	 */
	EClass getEventOuput();

	/**
	 * Returns the meta object for the containment reference '{@link iaca.EventOuput#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Connection</em>'.
	 * @see iaca.EventOuput#getConnection()
	 * @see #getEventOuput()
	 * @generated
	 */
	EReference getEventOuput_Connection();

	/**
	 * Returns the meta object for class '{@link iaca.IO <em>IO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO</em>'.
	 * @see iaca.IO
	 * @generated
	 */
	EClass getIO();

	/**
	 * Returns the meta object for the containment reference '{@link iaca.IO#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see iaca.IO#getType()
	 * @see #getIO()
	 * @generated
	 */
	EReference getIO_Type();

	/**
	 * Returns the meta object for the attribute '{@link iaca.IO#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see iaca.IO#getName()
	 * @see #getIO()
	 * @generated
	 */
	EAttribute getIO_Name();

	/**
	 * Returns the meta object for class '{@link iaca.DataConnection <em>Data Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Connection</em>'.
	 * @see iaca.DataConnection
	 * @generated
	 */
	EClass getDataConnection();

	/**
	 * Returns the meta object for the reference list '{@link iaca.DataConnection#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see iaca.DataConnection#getInputs()
	 * @see #getDataConnection()
	 * @generated
	 */
	EReference getDataConnection_Inputs();

	/**
	 * Returns the meta object for class '{@link iaca.EventConnection <em>Event Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Connection</em>'.
	 * @see iaca.EventConnection
	 * @generated
	 */
	EClass getEventConnection();

	/**
	 * Returns the meta object for the reference list '{@link iaca.EventConnection#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inputs</em>'.
	 * @see iaca.EventConnection#getInputs()
	 * @see #getEventConnection()
	 * @generated
	 */
	EReference getEventConnection_Inputs();

	/**
	 * Returns the meta object for class '{@link iaca.ComponentInstance <em>Component Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component Instance</em>'.
	 * @see iaca.ComponentInstance
	 * @generated
	 */
	EClass getComponentInstance();

	/**
	 * Returns the meta object for the reference list '{@link iaca.ComponentInstance#getComponents <em>Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Components</em>'.
	 * @see iaca.ComponentInstance#getComponents()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Components();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.ComponentInstance#getAttInstance <em>Att Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Att Instance</em>'.
	 * @see iaca.ComponentInstance#getAttInstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_AttInstance();

	/**
	 * Returns the meta object for the reference list '{@link iaca.ComponentInstance#getIoinstance <em>Ioinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ioinstance</em>'.
	 * @see iaca.ComponentInstance#getIoinstance()
	 * @see #getComponentInstance()
	 * @generated
	 */
	EReference getComponentInstance_Ioinstance();

	/**
	 * Returns the meta object for class '{@link iaca.InputInstance <em>Input Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Instance</em>'.
	 * @see iaca.InputInstance
	 * @generated
	 */
	EClass getInputInstance();

	/**
	 * Returns the meta object for class '{@link iaca.IOInstance <em>IO Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IO Instance</em>'.
	 * @see iaca.IOInstance
	 * @generated
	 */
	EClass getIOInstance();

	/**
	 * Returns the meta object for the reference list '{@link iaca.IOInstance#getIo <em>Io</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Io</em>'.
	 * @see iaca.IOInstance#getIo()
	 * @see #getIOInstance()
	 * @generated
	 */
	EReference getIOInstance_Io();

	/**
	 * Returns the meta object for class '{@link iaca.AttributsInstance <em>Attributs Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attributs Instance</em>'.
	 * @see iaca.AttributsInstance
	 * @generated
	 */
	EClass getAttributsInstance();

	/**
	 * Returns the meta object for the reference list '{@link iaca.AttributsInstance#getAttributs <em>Attributs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributs</em>'.
	 * @see iaca.AttributsInstance#getAttributs()
	 * @see #getAttributsInstance()
	 * @generated
	 */
	EReference getAttributsInstance_Attributs();

	/**
	 * Returns the meta object for class '{@link iaca.ConnectionInstance <em>Connection Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection Instance</em>'.
	 * @see iaca.ConnectionInstance
	 * @generated
	 */
	EClass getConnectionInstance();

	/**
	 * Returns the meta object for the reference list '{@link iaca.ConnectionInstance#getDataC <em>Data C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Data C</em>'.
	 * @see iaca.ConnectionInstance#getDataC()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_DataC();

	/**
	 * Returns the meta object for the reference list '{@link iaca.ConnectionInstance#getEventC <em>Event C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Event C</em>'.
	 * @see iaca.ConnectionInstance#getEventC()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_EventC();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.ConnectionInstance#getIoinstance <em>Ioinstance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ioinstance</em>'.
	 * @see iaca.ConnectionInstance#getIoinstance()
	 * @see #getConnectionInstance()
	 * @generated
	 */
	EReference getConnectionInstance_Ioinstance();

	/**
	 * Returns the meta object for class '{@link iaca.DataInstance <em>Data Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Instance</em>'.
	 * @see iaca.DataInstance
	 * @generated
	 */
	EClass getDataInstance();

	/**
	 * Returns the meta object for class '{@link iaca.EventInstance <em>Event Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event Instance</em>'.
	 * @see iaca.EventInstance
	 * @generated
	 */
	EClass getEventInstance();

	/**
	 * Returns the meta object for class '{@link iaca.Process <em>Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Process</em>'.
	 * @see iaca.Process
	 * @generated
	 */
	EClass getProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link iaca.Process#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instances</em>'.
	 * @see iaca.Process#getInstances()
	 * @see #getProcess()
	 * @generated
	 */
	EReference getProcess_Instances();

	/**
	 * Returns the meta object for class '{@link iaca.Instance <em>Instance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance</em>'.
	 * @see iaca.Instance
	 * @generated
	 */
	EClass getInstance();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	IacaFactory getIacaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link iaca.impl.AttributsImpl <em>Attributs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.AttributsImpl
		 * @see iaca.impl.IacaPackageImpl#getAttributs()
		 * @generated
		 */
		EClass ATTRIBUTS = eINSTANCE.getAttributs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTS__NAME = eINSTANCE.getAttributs_Name();

		/**
		 * The meta object literal for the '<em><b>T</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTS__T = eINSTANCE.getAttributs_T();

		/**
		 * The meta object literal for the '<em><b>EReference0</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTS__EREFERENCE0 = eINSTANCE.getAttributs_EReference0();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTS__TYPE = eINSTANCE.getAttributs_Type();

		/**
		 * The meta object literal for the '{@link iaca.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.ComponentImpl
		 * @see iaca.impl.IacaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPONENT__NAME = eINSTANCE.getComponent_Name();

		/**
		 * The meta object literal for the '<em><b>Att</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__ATT = eINSTANCE.getComponent_Att();

		/**
		 * The meta object literal for the '<em><b>IOs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__IOS = eINSTANCE.getComponent_IOs();

		/**
		 * The meta object literal for the '{@link iaca.impl.LibraryImpl <em>Library</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.LibraryImpl
		 * @see iaca.impl.IacaPackageImpl#getLibrary()
		 * @generated
		 */
		EClass LIBRARY = eINSTANCE.getLibrary();

		/**
		 * The meta object literal for the '<em><b>C</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIBRARY__C = eINSTANCE.getLibrary_C();

		/**
		 * The meta object literal for the '{@link iaca.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.TypeImpl
		 * @see iaca.impl.IacaPackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '{@link iaca.impl.BitImpl <em>Bit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.BitImpl
		 * @see iaca.impl.IacaPackageImpl#getBit()
		 * @generated
		 */
		EClass BIT = eINSTANCE.getBit();

		/**
		 * The meta object literal for the '{@link iaca.impl.IntegerImpl <em>Integer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.IntegerImpl
		 * @see iaca.impl.IacaPackageImpl#getInteger()
		 * @generated
		 */
		EClass INTEGER = eINSTANCE.getInteger();

		/**
		 * The meta object literal for the '{@link iaca.impl.LongImpl <em>Long</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.LongImpl
		 * @see iaca.impl.IacaPackageImpl#getLong()
		 * @generated
		 */
		EClass LONG = eINSTANCE.getLong();

		/**
		 * The meta object literal for the '{@link iaca.impl.RealImpl <em>Real</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.RealImpl
		 * @see iaca.impl.IacaPackageImpl#getReal()
		 * @generated
		 */
		EClass REAL = eINSTANCE.getReal();

		/**
		 * The meta object literal for the '{@link iaca.impl.CharImpl <em>Char</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.CharImpl
		 * @see iaca.impl.IacaPackageImpl#getChar()
		 * @generated
		 */
		EClass CHAR = eINSTANCE.getChar();

		/**
		 * The meta object literal for the '{@link iaca.impl.StringImpl <em>String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.StringImpl
		 * @see iaca.impl.IacaPackageImpl#getString()
		 * @generated
		 */
		EClass STRING = eINSTANCE.getString();

		/**
		 * The meta object literal for the '{@link iaca.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.InputImpl
		 * @see iaca.impl.IacaPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '{@link iaca.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.OutputImpl
		 * @see iaca.impl.IacaPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '{@link iaca.impl.DataInputImpl <em>Data Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.DataInputImpl
		 * @see iaca.impl.IacaPackageImpl#getDataInput()
		 * @generated
		 */
		EClass DATA_INPUT = eINSTANCE.getDataInput();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_INPUT__CONNECTIONS = eINSTANCE.getDataInput_Connections();

		/**
		 * The meta object literal for the '{@link iaca.impl.DataOutputImpl <em>Data Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.DataOutputImpl
		 * @see iaca.impl.IacaPackageImpl#getDataOutput()
		 * @generated
		 */
		EClass DATA_OUTPUT = eINSTANCE.getDataOutput();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_OUTPUT__CONNECTION = eINSTANCE.getDataOutput_Connection();

		/**
		 * The meta object literal for the '{@link iaca.impl.EventInputImpl <em>Event Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.EventInputImpl
		 * @see iaca.impl.IacaPackageImpl#getEventInput()
		 * @generated
		 */
		EClass EVENT_INPUT = eINSTANCE.getEventInput();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_INPUT__CONNECTIONS = eINSTANCE.getEventInput_Connections();

		/**
		 * The meta object literal for the '{@link iaca.impl.EventOuputImpl <em>Event Ouput</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.EventOuputImpl
		 * @see iaca.impl.IacaPackageImpl#getEventOuput()
		 * @generated
		 */
		EClass EVENT_OUPUT = eINSTANCE.getEventOuput();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_OUPUT__CONNECTION = eINSTANCE.getEventOuput_Connection();

		/**
		 * The meta object literal for the '{@link iaca.impl.IOImpl <em>IO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.IOImpl
		 * @see iaca.impl.IacaPackageImpl#getIO()
		 * @generated
		 */
		EClass IO = eINSTANCE.getIO();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO__TYPE = eINSTANCE.getIO_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IO__NAME = eINSTANCE.getIO_Name();

		/**
		 * The meta object literal for the '{@link iaca.impl.DataConnectionImpl <em>Data Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.DataConnectionImpl
		 * @see iaca.impl.IacaPackageImpl#getDataConnection()
		 * @generated
		 */
		EClass DATA_CONNECTION = eINSTANCE.getDataConnection();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_CONNECTION__INPUTS = eINSTANCE.getDataConnection_Inputs();

		/**
		 * The meta object literal for the '{@link iaca.impl.EventConnectionImpl <em>Event Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.EventConnectionImpl
		 * @see iaca.impl.IacaPackageImpl#getEventConnection()
		 * @generated
		 */
		EClass EVENT_CONNECTION = eINSTANCE.getEventConnection();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT_CONNECTION__INPUTS = eINSTANCE.getEventConnection_Inputs();

		/**
		 * The meta object literal for the '{@link iaca.impl.ComponentInstanceImpl <em>Component Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.ComponentInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getComponentInstance()
		 * @generated
		 */
		EClass COMPONENT_INSTANCE = eINSTANCE.getComponentInstance();

		/**
		 * The meta object literal for the '<em><b>Components</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__COMPONENTS = eINSTANCE.getComponentInstance_Components();

		/**
		 * The meta object literal for the '<em><b>Att Instance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__ATT_INSTANCE = eINSTANCE.getComponentInstance_AttInstance();

		/**
		 * The meta object literal for the '<em><b>Ioinstance</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT_INSTANCE__IOINSTANCE = eINSTANCE.getComponentInstance_Ioinstance();

		/**
		 * The meta object literal for the '{@link iaca.impl.InputInstanceImpl <em>Input Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.InputInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getInputInstance()
		 * @generated
		 */
		EClass INPUT_INSTANCE = eINSTANCE.getInputInstance();

		/**
		 * The meta object literal for the '{@link iaca.impl.IOInstanceImpl <em>IO Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.IOInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getIOInstance()
		 * @generated
		 */
		EClass IO_INSTANCE = eINSTANCE.getIOInstance();

		/**
		 * The meta object literal for the '<em><b>Io</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IO_INSTANCE__IO = eINSTANCE.getIOInstance_Io();

		/**
		 * The meta object literal for the '{@link iaca.impl.AttributsInstanceImpl <em>Attributs Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.AttributsInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getAttributsInstance()
		 * @generated
		 */
		EClass ATTRIBUTS_INSTANCE = eINSTANCE.getAttributsInstance();

		/**
		 * The meta object literal for the '<em><b>Attributs</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTS_INSTANCE__ATTRIBUTS = eINSTANCE.getAttributsInstance_Attributs();

		/**
		 * The meta object literal for the '{@link iaca.impl.ConnectionInstanceImpl <em>Connection Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.ConnectionInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getConnectionInstance()
		 * @generated
		 */
		EClass CONNECTION_INSTANCE = eINSTANCE.getConnectionInstance();

		/**
		 * The meta object literal for the '<em><b>Data C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__DATA_C = eINSTANCE.getConnectionInstance_DataC();

		/**
		 * The meta object literal for the '<em><b>Event C</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__EVENT_C = eINSTANCE.getConnectionInstance_EventC();

		/**
		 * The meta object literal for the '<em><b>Ioinstance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION_INSTANCE__IOINSTANCE = eINSTANCE.getConnectionInstance_Ioinstance();

		/**
		 * The meta object literal for the '{@link iaca.impl.DataInstanceImpl <em>Data Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.DataInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getDataInstance()
		 * @generated
		 */
		EClass DATA_INSTANCE = eINSTANCE.getDataInstance();

		/**
		 * The meta object literal for the '{@link iaca.impl.EventInstanceImpl <em>Event Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.EventInstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getEventInstance()
		 * @generated
		 */
		EClass EVENT_INSTANCE = eINSTANCE.getEventInstance();

		/**
		 * The meta object literal for the '{@link iaca.impl.ProcessImpl <em>Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.ProcessImpl
		 * @see iaca.impl.IacaPackageImpl#getProcess()
		 * @generated
		 */
		EClass PROCESS = eINSTANCE.getProcess();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROCESS__INSTANCES = eINSTANCE.getProcess_Instances();

		/**
		 * The meta object literal for the '{@link iaca.impl.InstanceImpl <em>Instance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see iaca.impl.InstanceImpl
		 * @see iaca.impl.IacaPackageImpl#getInstance()
		 * @generated
		 */
		EClass INSTANCE = eINSTANCE.getInstance();

	}

} //IacaPackage
