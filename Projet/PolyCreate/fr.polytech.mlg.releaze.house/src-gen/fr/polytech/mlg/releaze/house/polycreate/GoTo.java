/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.GoTo#getStateName <em>State Name</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getGoTo()
 * @model
 * @generated
 */
public interface GoTo extends Instruction {
	/**
	 * Returns the value of the '<em><b>State Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Name</em>' attribute.
	 * @see #setStateName(String)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getGoTo_StateName()
	 * @model
	 * @generated
	 */
	String getStateName();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.GoTo#getStateName <em>State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Name</em>' attribute.
	 * @see #getStateName()
	 * @generated
	 */
	void setStateName(String value);

} // GoTo
