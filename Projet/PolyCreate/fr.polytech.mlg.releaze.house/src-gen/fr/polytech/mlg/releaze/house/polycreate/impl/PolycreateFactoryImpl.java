/**
 */
package fr.polytech.mlg.releaze.house.polycreate.impl;

import fr.polytech.mlg.releaze.house.polycreate.*;

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
public class PolycreateFactoryImpl extends EFactoryImpl implements PolycreateFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PolycreateFactory init() {
		try {
			PolycreateFactory thePolycreateFactory = (PolycreateFactory) EPackage.Registry.INSTANCE
					.getEFactory(PolycreatePackage.eNS_URI);
			if (thePolycreateFactory != null) {
				return thePolycreateFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PolycreateFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateFactoryImpl() {
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
		case PolycreatePackage.PROGRAM:
			return createProgram();
		case PolycreatePackage.STATE:
			return createState();
		case PolycreatePackage.TURN:
			return createTurn();
		case PolycreatePackage.GO_FORWARD:
			return createGoForward();
		case PolycreatePackage.FUNCTION:
			return createFunction();
		case PolycreatePackage.OPEN_GRIP:
			return createOpenGrip();
		case PolycreatePackage.CLOSE_GRIP:
			return createCloseGrip();
		case PolycreatePackage.BUMP_RIGHT:
			return createBumpRight();
		case PolycreatePackage.BUMP_LEFT:
			return createBumpLeft();
		case PolycreatePackage.CLIFF_RIGHT:
			return createCliffRight();
		case PolycreatePackage.CLIFF_LEFT:
			return createCliffLeft();
		case PolycreatePackage.AT_STARTING_POINT:
			return createAtStartingPoint();
		case PolycreatePackage.CLIFF_FRONT:
			return createCliffFront();
		case PolycreatePackage.OBJECT_GRABBABLE:
			return createObjectGrabbable();
		case PolycreatePackage.NUMERAL_VALUE:
			return createNumeralValue();
		case PolycreatePackage.RANDOM_VALUE:
			return createRandomValue();
		case PolycreatePackage.GO_TO:
			return createGoTo();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Program createProgram() {
		ProgramImpl program = new ProgramImpl();
		return program;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turn createTurn() {
		TurnImpl turn = new TurnImpl();
		return turn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoForward createGoForward() {
		GoForwardImpl goForward = new GoForwardImpl();
		return goForward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenGrip createOpenGrip() {
		OpenGripImpl openGrip = new OpenGripImpl();
		return openGrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CloseGrip createCloseGrip() {
		CloseGripImpl closeGrip = new CloseGripImpl();
		return closeGrip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BumpRight createBumpRight() {
		BumpRightImpl bumpRight = new BumpRightImpl();
		return bumpRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BumpLeft createBumpLeft() {
		BumpLeftImpl bumpLeft = new BumpLeftImpl();
		return bumpLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliffRight createCliffRight() {
		CliffRightImpl cliffRight = new CliffRightImpl();
		return cliffRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliffLeft createCliffLeft() {
		CliffLeftImpl cliffLeft = new CliffLeftImpl();
		return cliffLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtStartingPoint createAtStartingPoint() {
		AtStartingPointImpl atStartingPoint = new AtStartingPointImpl();
		return atStartingPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CliffFront createCliffFront() {
		CliffFrontImpl cliffFront = new CliffFrontImpl();
		return cliffFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectGrabbable createObjectGrabbable() {
		ObjectGrabbableImpl objectGrabbable = new ObjectGrabbableImpl();
		return objectGrabbable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumeralValue createNumeralValue() {
		NumeralValueImpl numeralValue = new NumeralValueImpl();
		return numeralValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RandomValue createRandomValue() {
		RandomValueImpl randomValue = new RandomValueImpl();
		return randomValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoTo createGoTo() {
		GoToImpl goTo = new GoToImpl();
		return goTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreatePackage getPolycreatePackage() {
		return (PolycreatePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PolycreatePackage getPackage() {
		return PolycreatePackage.eINSTANCE;
	}

} //PolycreateFactoryImpl
