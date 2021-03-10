/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Program#getName <em>Name</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Program#getStates <em>States</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Program#getCurrentStateName <em>Current State Name</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Program#getFunctions <em>Functions</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Program#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Current State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current State Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current State Name</em>' attribute.
	 * @see #setCurrentStateName(String)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram_CurrentStateName()
	 * @model
	 * @generated
	 */
	String getCurrentStateName();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.Program#getCurrentStateName <em>Current State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current State Name</em>' attribute.
	 * @see #getCurrentStateName()
	 * @generated
	 */
	void setCurrentStateName(String value);

	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.mlg.releaze.house.polycreate.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram_Functions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Events</b></em>' containment reference list.
	 * The list contents are of type {@link fr.polytech.mlg.releaze.house.polycreate.Event}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Events</em>' containment reference list.
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getProgram_Events()
	 * @model containment="true"
	 * @generated
	 */
	EList<Event> getEvents();

} // Program
