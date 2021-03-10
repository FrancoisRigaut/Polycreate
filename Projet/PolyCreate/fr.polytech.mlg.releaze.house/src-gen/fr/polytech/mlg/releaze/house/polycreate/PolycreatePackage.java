/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreateFactory
 * @model kind="package"
 * @generated
 */
public interface PolycreatePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "polycreate";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.releaze-house.org/polycreate";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "polycreate";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreatePackage eINSTANCE = fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl <em>Program</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getProgram()
	 * @generated
	 */
	int PROGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__STATES = 1;

	/**
	 * The feature id for the '<em><b>Current State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__CURRENT_STATE_NAME = 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__FUNCTIONS = 3;

	/**
	 * The feature id for the '<em><b>Events</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM__EVENTS = 4;

	/**
	 * The number of structural features of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Program</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.InstructionsSetImpl <em>Instructions Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.InstructionsSetImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getInstructionsSet()
	 * @generated
	 */
	int INSTRUCTIONS_SET = 20;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_SET__INSTRUCTIONS = 0;

	/**
	 * The number of structural features of the '<em>Instructions Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_SET_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Instructions Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTIONS_SET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.StateImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INSTRUCTIONS = INSTRUCTIONS_SET__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = INSTRUCTIONS_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = INSTRUCTIONS_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = INSTRUCTIONS_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.InstructionImpl <em>Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.InstructionImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getInstruction()
	 * @generated
	 */
	int INSTRUCTION = 2;

	/**
	 * The number of structural features of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTRUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.TurnImpl <em>Turn</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.TurnImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getTurn()
	 * @generated
	 */
	int TURN = 3;

	/**
	 * The feature id for the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN__ANGLE = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Turn</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURN_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.GoForwardImpl <em>Go Forward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.GoForwardImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getGoForward()
	 * @generated
	 */
	int GO_FORWARD = 4;

	/**
	 * The feature id for the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD__TIME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go Forward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_FORWARD_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.FunctionImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__INSTRUCTIONS = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.OpenGripImpl <em>Open Grip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.OpenGripImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getOpenGrip()
	 * @generated
	 */
	int OPEN_GRIP = 6;

	/**
	 * The number of structural features of the '<em>Open Grip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_GRIP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Open Grip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPEN_GRIP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CloseGripImpl <em>Close Grip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CloseGripImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCloseGrip()
	 * @generated
	 */
	int CLOSE_GRIP = 7;

	/**
	 * The number of structural features of the '<em>Close Grip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_GRIP_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Close Grip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOSE_GRIP_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.EventImpl <em>Event</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.EventImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getEvent()
	 * @generated
	 */
	int EVENT = 8;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__INSTRUCTIONS = INSTRUCTIONS_SET__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT__STATES = INSTRUCTIONS_SET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_FEATURE_COUNT = INSTRUCTIONS_SET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Event</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENT_OPERATION_COUNT = INSTRUCTIONS_SET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.BumpRightImpl <em>Bump Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.BumpRightImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getBumpRight()
	 * @generated
	 */
	int BUMP_RIGHT = 9;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_RIGHT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_RIGHT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Bump Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_RIGHT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bump Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_RIGHT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.BumpLeftImpl <em>Bump Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.BumpLeftImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getBumpLeft()
	 * @generated
	 */
	int BUMP_LEFT = 10;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_LEFT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_LEFT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Bump Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_LEFT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bump Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BUMP_LEFT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffRightImpl <em>Cliff Right</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffRightImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffRight()
	 * @generated
	 */
	int CLIFF_RIGHT = 11;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_RIGHT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_RIGHT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Cliff Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_RIGHT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cliff Right</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_RIGHT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffLeftImpl <em>Cliff Left</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffLeftImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffLeft()
	 * @generated
	 */
	int CLIFF_LEFT = 12;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_LEFT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_LEFT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Cliff Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_LEFT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cliff Left</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_LEFT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.AtStartingPointImpl <em>At Starting Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.AtStartingPointImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getAtStartingPoint()
	 * @generated
	 */
	int AT_STARTING_POINT = 13;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_STARTING_POINT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_STARTING_POINT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>At Starting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_STARTING_POINT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>At Starting Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AT_STARTING_POINT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffFrontImpl <em>Cliff Front</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffFrontImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffFront()
	 * @generated
	 */
	int CLIFF_FRONT = 14;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_FRONT__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_FRONT__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Cliff Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_FRONT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Cliff Front</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLIFF_FRONT_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ObjectGrabbableImpl <em>Object Grabbable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ObjectGrabbableImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getObjectGrabbable()
	 * @generated
	 */
	int OBJECT_GRABBABLE = 15;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_GRABBABLE__INSTRUCTIONS = EVENT__INSTRUCTIONS;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_GRABBABLE__STATES = EVENT__STATES;

	/**
	 * The number of structural features of the '<em>Object Grabbable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_GRABBABLE_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Object Grabbable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_GRABBABLE_OPERATION_COUNT = EVENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ValueImpl <em>Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ValueImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getValue()
	 * @generated
	 */
	int VALUE = 16;

	/**
	 * The number of structural features of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE___GET = 0;

	/**
	 * The number of operations of the '<em>Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALUE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.NumeralValueImpl <em>Numeral Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.NumeralValueImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getNumeralValue()
	 * @generated
	 */
	int NUMERAL_VALUE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERAL_VALUE__VALUE = VALUE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Numeral Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERAL_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERAL_VALUE___GET = VALUE___GET;

	/**
	 * The number of operations of the '<em>Numeral Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERAL_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.RandomValueImpl <em>Random Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.RandomValueImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getRandomValue()
	 * @generated
	 */
	int RANDOM_VALUE = 18;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE__LOWER_BOUND = VALUE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE__UPPER_BOUND = VALUE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Random Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_FEATURE_COUNT = VALUE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE___GET = VALUE___GET;

	/**
	 * The number of operations of the '<em>Random Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RANDOM_VALUE_OPERATION_COUNT = VALUE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.GoToImpl <em>Go To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.GoToImpl
	 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getGoTo()
	 * @generated
	 */
	int GO_TO = 19;

	/**
	 * The feature id for the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO__STATE_NAME = INSTRUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_FEATURE_COUNT = INSTRUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Go To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GO_TO_OPERATION_COUNT = INSTRUCTION_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Program</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program
	 * @generated
	 */
	EClass getProgram();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program#getName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program#getStates()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_States();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getCurrentStateName <em>Current State Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current State Name</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program#getCurrentStateName()
	 * @see #getProgram()
	 * @generated
	 */
	EAttribute getProgram_CurrentStateName();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program#getFunctions()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getEvents <em>Events</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Events</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program#getEvents()
	 * @see #getProgram()
	 * @generated
	 */
	EReference getProgram_Events();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.State#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.State#getName()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Name();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instruction</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Instruction
	 * @generated
	 */
	EClass getInstruction();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turn</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Turn
	 * @generated
	 */
	EClass getTurn();

	/**
	 * Returns the meta object for the containment reference '{@link fr.polytech.mlg.releaze.house.polycreate.Turn#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Angle</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Turn#getAngle()
	 * @see #getTurn()
	 * @generated
	 */
	EReference getTurn_Angle();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go Forward</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoForward
	 * @generated
	 */
	EClass getGoForward();

	/**
	 * Returns the meta object for the containment reference '{@link fr.polytech.mlg.releaze.house.polycreate.GoForward#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Time</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoForward#getTime()
	 * @see #getGoForward()
	 * @generated
	 */
	EReference getGoForward_Time();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.OpenGrip <em>Open Grip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Open Grip</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.OpenGrip
	 * @generated
	 */
	EClass getOpenGrip();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.CloseGrip <em>Close Grip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Close Grip</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CloseGrip
	 * @generated
	 */
	EClass getCloseGrip();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Event</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Event
	 * @generated
	 */
	EClass getEvent();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.mlg.releaze.house.polycreate.Event#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Event#getStates()
	 * @see #getEvent()
	 * @generated
	 */
	EReference getEvent_States();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.BumpRight <em>Bump Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bump Right</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.BumpRight
	 * @generated
	 */
	EClass getBumpRight();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.BumpLeft <em>Bump Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bump Left</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.BumpLeft
	 * @generated
	 */
	EClass getBumpLeft();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffRight <em>Cliff Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliff Right</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffRight
	 * @generated
	 */
	EClass getCliffRight();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffLeft <em>Cliff Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliff Left</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffLeft
	 * @generated
	 */
	EClass getCliffLeft();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint <em>At Starting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>At Starting Point</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint
	 * @generated
	 */
	EClass getAtStartingPoint();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffFront <em>Cliff Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cliff Front</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffFront
	 * @generated
	 */
	EClass getCliffFront();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable <em>Object Grabbable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Grabbable</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable
	 * @generated
	 */
	EClass getObjectGrabbable();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Value</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Value
	 * @generated
	 */
	EClass getValue();

	/**
	 * Returns the meta object for the '{@link fr.polytech.mlg.releaze.house.polycreate.Value#get() <em>Get</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get</em>' operation.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Value#get()
	 * @generated
	 */
	EOperation getValue__Get();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.NumeralValue <em>Numeral Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeral Value</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.NumeralValue
	 * @generated
	 */
	EClass getNumeralValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.NumeralValue#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.NumeralValue#getValue()
	 * @see #getNumeralValue()
	 * @generated
	 */
	EAttribute getNumeralValue_Value();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.RandomValue <em>Random Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Random Value</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.RandomValue
	 * @generated
	 */
	EClass getRandomValue();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.RandomValue#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.RandomValue#getLowerBound()
	 * @see #getRandomValue()
	 * @generated
	 */
	EAttribute getRandomValue_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.RandomValue#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.RandomValue#getUpperBound()
	 * @see #getRandomValue()
	 * @generated
	 */
	EAttribute getRandomValue_UpperBound();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Go To</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoTo
	 * @generated
	 */
	EClass getGoTo();

	/**
	 * Returns the meta object for the attribute '{@link fr.polytech.mlg.releaze.house.polycreate.GoTo#getStateName <em>State Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State Name</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoTo#getStateName()
	 * @see #getGoTo()
	 * @generated
	 */
	EAttribute getGoTo_StateName();

	/**
	 * Returns the meta object for class '{@link fr.polytech.mlg.releaze.house.polycreate.InstructionsSet <em>Instructions Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instructions Set</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.InstructionsSet
	 * @generated
	 */
	EClass getInstructionsSet();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.polytech.mlg.releaze.house.polycreate.InstructionsSet#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see fr.polytech.mlg.releaze.house.polycreate.InstructionsSet#getInstructions()
	 * @see #getInstructionsSet()
	 * @generated
	 */
	EReference getInstructionsSet_Instructions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PolycreateFactory getPolycreateFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl <em>Program</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getProgram()
		 * @generated
		 */
		EClass PROGRAM = eINSTANCE.getProgram();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__NAME = eINSTANCE.getProgram_Name();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__STATES = eINSTANCE.getProgram_States();

		/**
		 * The meta object literal for the '<em><b>Current State Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAM__CURRENT_STATE_NAME = eINSTANCE.getProgram_CurrentStateName();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__FUNCTIONS = eINSTANCE.getProgram_Functions();

		/**
		 * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAM__EVENTS = eINSTANCE.getProgram_Events();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.StateImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__NAME = eINSTANCE.getState_Name();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.InstructionImpl <em>Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.InstructionImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getInstruction()
		 * @generated
		 */
		EClass INSTRUCTION = eINSTANCE.getInstruction();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.TurnImpl <em>Turn</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.TurnImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getTurn()
		 * @generated
		 */
		EClass TURN = eINSTANCE.getTurn();

		/**
		 * The meta object literal for the '<em><b>Angle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURN__ANGLE = eINSTANCE.getTurn_Angle();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.GoForwardImpl <em>Go Forward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.GoForwardImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getGoForward()
		 * @generated
		 */
		EClass GO_FORWARD = eINSTANCE.getGoForward();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GO_FORWARD__TIME = eINSTANCE.getGoForward_Time();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.FunctionImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.OpenGripImpl <em>Open Grip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.OpenGripImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getOpenGrip()
		 * @generated
		 */
		EClass OPEN_GRIP = eINSTANCE.getOpenGrip();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CloseGripImpl <em>Close Grip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CloseGripImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCloseGrip()
		 * @generated
		 */
		EClass CLOSE_GRIP = eINSTANCE.getCloseGrip();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.EventImpl <em>Event</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.EventImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getEvent()
		 * @generated
		 */
		EClass EVENT = eINSTANCE.getEvent();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENT__STATES = eINSTANCE.getEvent_States();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.BumpRightImpl <em>Bump Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.BumpRightImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getBumpRight()
		 * @generated
		 */
		EClass BUMP_RIGHT = eINSTANCE.getBumpRight();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.BumpLeftImpl <em>Bump Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.BumpLeftImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getBumpLeft()
		 * @generated
		 */
		EClass BUMP_LEFT = eINSTANCE.getBumpLeft();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffRightImpl <em>Cliff Right</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffRightImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffRight()
		 * @generated
		 */
		EClass CLIFF_RIGHT = eINSTANCE.getCliffRight();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffLeftImpl <em>Cliff Left</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffLeftImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffLeft()
		 * @generated
		 */
		EClass CLIFF_LEFT = eINSTANCE.getCliffLeft();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.AtStartingPointImpl <em>At Starting Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.AtStartingPointImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getAtStartingPoint()
		 * @generated
		 */
		EClass AT_STARTING_POINT = eINSTANCE.getAtStartingPoint();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.CliffFrontImpl <em>Cliff Front</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.CliffFrontImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getCliffFront()
		 * @generated
		 */
		EClass CLIFF_FRONT = eINSTANCE.getCliffFront();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ObjectGrabbableImpl <em>Object Grabbable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ObjectGrabbableImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getObjectGrabbable()
		 * @generated
		 */
		EClass OBJECT_GRABBABLE = eINSTANCE.getObjectGrabbable();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.ValueImpl <em>Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.ValueImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getValue()
		 * @generated
		 */
		EClass VALUE = eINSTANCE.getValue();

		/**
		 * The meta object literal for the '<em><b>Get</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VALUE___GET = eINSTANCE.getValue__Get();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.NumeralValueImpl <em>Numeral Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.NumeralValueImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getNumeralValue()
		 * @generated
		 */
		EClass NUMERAL_VALUE = eINSTANCE.getNumeralValue();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMERAL_VALUE__VALUE = eINSTANCE.getNumeralValue_Value();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.RandomValueImpl <em>Random Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.RandomValueImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getRandomValue()
		 * @generated
		 */
		EClass RANDOM_VALUE = eINSTANCE.getRandomValue();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_VALUE__LOWER_BOUND = eINSTANCE.getRandomValue_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RANDOM_VALUE__UPPER_BOUND = eINSTANCE.getRandomValue_UpperBound();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.GoToImpl <em>Go To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.GoToImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getGoTo()
		 * @generated
		 */
		EClass GO_TO = eINSTANCE.getGoTo();

		/**
		 * The meta object literal for the '<em><b>State Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GO_TO__STATE_NAME = eINSTANCE.getGoTo_StateName();

		/**
		 * The meta object literal for the '{@link fr.polytech.mlg.releaze.house.polycreate.impl.InstructionsSetImpl <em>Instructions Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.InstructionsSetImpl
		 * @see fr.polytech.mlg.releaze.house.polycreate.impl.PolycreatePackageImpl#getInstructionsSet()
		 * @generated
		 */
		EClass INSTRUCTIONS_SET = eINSTANCE.getInstructionsSet();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTRUCTIONS_SET__INSTRUCTIONS = eINSTANCE.getInstructionsSet_Instructions();

	}

} //PolycreatePackage
