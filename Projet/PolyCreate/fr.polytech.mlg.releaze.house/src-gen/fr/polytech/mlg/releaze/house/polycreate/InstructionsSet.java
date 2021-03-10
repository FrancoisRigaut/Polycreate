/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instructions Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.InstructionsSet#getInstructions <em>Instructions</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getInstructionsSet()
 * @model abstract="true"
 * @generated
 */
public interface InstructionsSet extends EObject {

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.mlg.releaze.house.polycreate.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getInstructionsSet_Instructions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();
} // InstructionsSet
