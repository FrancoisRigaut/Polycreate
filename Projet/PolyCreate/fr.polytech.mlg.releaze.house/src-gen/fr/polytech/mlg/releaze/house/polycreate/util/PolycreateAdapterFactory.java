/**
 */
package fr.polytech.mlg.releaze.house.polycreate.util;

import fr.polytech.mlg.releaze.house.polycreate.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage
 * @generated
 */
public class PolycreateAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PolycreatePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolycreateAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PolycreatePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PolycreateSwitch<Adapter> modelSwitch = new PolycreateSwitch<Adapter>() {
		@Override
		public Adapter caseProgram(Program object) {
			return createProgramAdapter();
		}

		@Override
		public Adapter caseState(State object) {
			return createStateAdapter();
		}

		@Override
		public Adapter caseInstruction(Instruction object) {
			return createInstructionAdapter();
		}

		@Override
		public Adapter caseTurn(Turn object) {
			return createTurnAdapter();
		}

		@Override
		public Adapter caseGoForward(GoForward object) {
			return createGoForwardAdapter();
		}

		@Override
		public Adapter caseFunction(Function object) {
			return createFunctionAdapter();
		}

		@Override
		public Adapter caseOpenGrip(OpenGrip object) {
			return createOpenGripAdapter();
		}

		@Override
		public Adapter caseCloseGrip(CloseGrip object) {
			return createCloseGripAdapter();
		}

		@Override
		public Adapter caseEvent(Event object) {
			return createEventAdapter();
		}

		@Override
		public Adapter caseBumpRight(BumpRight object) {
			return createBumpRightAdapter();
		}

		@Override
		public Adapter caseBumpLeft(BumpLeft object) {
			return createBumpLeftAdapter();
		}

		@Override
		public Adapter caseCliffRight(CliffRight object) {
			return createCliffRightAdapter();
		}

		@Override
		public Adapter caseCliffLeft(CliffLeft object) {
			return createCliffLeftAdapter();
		}

		@Override
		public Adapter caseAtStartingPoint(AtStartingPoint object) {
			return createAtStartingPointAdapter();
		}

		@Override
		public Adapter caseCliffFront(CliffFront object) {
			return createCliffFrontAdapter();
		}

		@Override
		public Adapter caseObjectGrabbable(ObjectGrabbable object) {
			return createObjectGrabbableAdapter();
		}

		@Override
		public Adapter caseValue(Value object) {
			return createValueAdapter();
		}

		@Override
		public Adapter caseNumeralValue(NumeralValue object) {
			return createNumeralValueAdapter();
		}

		@Override
		public Adapter caseRandomValue(RandomValue object) {
			return createRandomValueAdapter();
		}

		@Override
		public Adapter caseGoTo(GoTo object) {
			return createGoToAdapter();
		}

		@Override
		public Adapter caseInstructionsSet(InstructionsSet object) {
			return createInstructionsSetAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Program <em>Program</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Program
	 * @generated
	 */
	public Adapter createProgramAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Instruction <em>Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Instruction
	 * @generated
	 */
	public Adapter createInstructionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Turn <em>Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Turn
	 * @generated
	 */
	public Adapter createTurnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.GoForward <em>Go Forward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoForward
	 * @generated
	 */
	public Adapter createGoForwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.OpenGrip <em>Open Grip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.OpenGrip
	 * @generated
	 */
	public Adapter createOpenGripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.CloseGrip <em>Close Grip</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CloseGrip
	 * @generated
	 */
	public Adapter createCloseGripAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.BumpRight <em>Bump Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.BumpRight
	 * @generated
	 */
	public Adapter createBumpRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.BumpLeft <em>Bump Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.BumpLeft
	 * @generated
	 */
	public Adapter createBumpLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffRight <em>Cliff Right</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffRight
	 * @generated
	 */
	public Adapter createCliffRightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffLeft <em>Cliff Left</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffLeft
	 * @generated
	 */
	public Adapter createCliffLeftAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint <em>At Starting Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.AtStartingPoint
	 * @generated
	 */
	public Adapter createAtStartingPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.CliffFront <em>Cliff Front</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.CliffFront
	 * @generated
	 */
	public Adapter createCliffFrontAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable <em>Object Grabbable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.ObjectGrabbable
	 * @generated
	 */
	public Adapter createObjectGrabbableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.Value <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.Value
	 * @generated
	 */
	public Adapter createValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.NumeralValue <em>Numeral Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.NumeralValue
	 * @generated
	 */
	public Adapter createNumeralValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.RandomValue <em>Random Value</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.RandomValue
	 * @generated
	 */
	public Adapter createRandomValueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.GoTo <em>Go To</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.GoTo
	 * @generated
	 */
	public Adapter createGoToAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link fr.polytech.mlg.releaze.house.polycreate.InstructionsSet <em>Instructions Set</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see fr.polytech.mlg.releaze.house.polycreate.InstructionsSet
	 * @generated
	 */
	public Adapter createInstructionsSetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PolycreateAdapterFactory
