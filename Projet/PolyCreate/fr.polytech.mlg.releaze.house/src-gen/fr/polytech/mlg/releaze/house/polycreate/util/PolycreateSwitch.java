/**
 */
package fr.polytech.mlg.releaze.house.polycreate.util;

import fr.polytech.mlg.releaze.house.polycreate.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateSwitch() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case PolycreatePackage.PROGRAM: {
			Program program = (Program) theEObject;
			T result = caseProgram(program);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.STATE: {
			State state = (State) theEObject;
			T result = caseState(state);
			if (result == null)
				result = caseInstructionsSet(state);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.TURN: {
			Turn turn = (Turn) theEObject;
			T result = caseTurn(turn);
			if (result == null)
				result = caseInstruction(turn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.GO_FORWARD: {
			GoForward goForward = (GoForward) theEObject;
			T result = caseGoForward(goForward);
			if (result == null)
				result = caseInstruction(goForward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.FUNCTION: {
			Function function = (Function) theEObject;
			T result = caseFunction(function);
			if (result == null)
				result = caseInstruction(function);
			if (result == null)
				result = caseInstructionsSet(function);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.OPEN_GRIP: {
			OpenGrip openGrip = (OpenGrip) theEObject;
			T result = caseOpenGrip(openGrip);
			if (result == null)
				result = caseInstruction(openGrip);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CLOSE_GRIP: {
			CloseGrip closeGrip = (CloseGrip) theEObject;
			T result = caseCloseGrip(closeGrip);
			if (result == null)
				result = caseInstruction(closeGrip);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.EVENT: {
			Event event = (Event) theEObject;
			T result = caseEvent(event);
			if (result == null)
				result = caseInstructionsSet(event);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.BUMP_RIGHT: {
			BumpRight bumpRight = (BumpRight) theEObject;
			T result = caseBumpRight(bumpRight);
			if (result == null)
				result = caseEvent(bumpRight);
			if (result == null)
				result = caseInstructionsSet(bumpRight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.BUMP_LEFT: {
			BumpLeft bumpLeft = (BumpLeft) theEObject;
			T result = caseBumpLeft(bumpLeft);
			if (result == null)
				result = caseEvent(bumpLeft);
			if (result == null)
				result = caseInstructionsSet(bumpLeft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CLIFF_RIGHT: {
			CliffRight cliffRight = (CliffRight) theEObject;
			T result = caseCliffRight(cliffRight);
			if (result == null)
				result = caseEvent(cliffRight);
			if (result == null)
				result = caseInstructionsSet(cliffRight);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CLIFF_LEFT: {
			CliffLeft cliffLeft = (CliffLeft) theEObject;
			T result = caseCliffLeft(cliffLeft);
			if (result == null)
				result = caseEvent(cliffLeft);
			if (result == null)
				result = caseInstructionsSet(cliffLeft);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.AT_STARTING_POINT: {
			AtStartingPoint atStartingPoint = (AtStartingPoint) theEObject;
			T result = caseAtStartingPoint(atStartingPoint);
			if (result == null)
				result = caseEvent(atStartingPoint);
			if (result == null)
				result = caseInstructionsSet(atStartingPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.CLIFF_FRONT: {
			CliffFront cliffFront = (CliffFront) theEObject;
			T result = caseCliffFront(cliffFront);
			if (result == null)
				result = caseEvent(cliffFront);
			if (result == null)
				result = caseInstructionsSet(cliffFront);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.OBJECT_GRABBABLE: {
			ObjectGrabbable objectGrabbable = (ObjectGrabbable) theEObject;
			T result = caseObjectGrabbable(objectGrabbable);
			if (result == null)
				result = caseEvent(objectGrabbable);
			if (result == null)
				result = caseInstructionsSet(objectGrabbable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.VALUE: {
			Value value = (Value) theEObject;
			T result = caseValue(value);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.NUMERAL_VALUE: {
			NumeralValue numeralValue = (NumeralValue) theEObject;
			T result = caseNumeralValue(numeralValue);
			if (result == null)
				result = caseValue(numeralValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.RANDOM_VALUE: {
			RandomValue randomValue = (RandomValue) theEObject;
			T result = caseRandomValue(randomValue);
			if (result == null)
				result = caseValue(randomValue);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.GO_TO: {
			GoTo goTo = (GoTo) theEObject;
			T result = caseGoTo(goTo);
			if (result == null)
				result = caseInstruction(goTo);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case PolycreatePackage.INSTRUCTIONS_SET: {
			InstructionsSet instructionsSet = (InstructionsSet) theEObject;
			T result = caseInstructionsSet(instructionsSet);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgram(Program object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Turn</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTurn(Turn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoForward(GoForward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Open Grip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Open Grip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOpenGrip(OpenGrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Close Grip</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Close Grip</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloseGrip(CloseGrip object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Event</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEvent(Event object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bump Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bump Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBumpRight(BumpRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bump Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bump Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBumpLeft(BumpLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliff Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliff Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliffRight(CliffRight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliff Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliff Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliffLeft(CliffLeft object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>At Starting Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>At Starting Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAtStartingPoint(AtStartingPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cliff Front</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cliff Front</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCliffFront(CliffFront object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Grabbable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Grabbable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectGrabbable(ObjectGrabbable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValue(Value object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Numeral Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Numeral Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNumeralValue(NumeralValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Random Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Random Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRandomValue(RandomValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Go To</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGoTo(GoTo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instructions Set</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instructions Set</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstructionsSet(InstructionsSet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //PolycreateSwitch
