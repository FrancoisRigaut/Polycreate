/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Event#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends InstructionsSet {
	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.mlg.releaze.house.polycreate.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getEvent_States()
	 * @model containment="true"
	 * @generated
	 */
	EList<State> getStates();

} // Event
