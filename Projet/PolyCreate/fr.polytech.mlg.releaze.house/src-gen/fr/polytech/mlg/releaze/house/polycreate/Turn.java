/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turn</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.Turn#getAngle <em>Angle</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getTurn()
 * @model
 * @generated
 */
public interface Turn extends Instruction {
	/**
	 * Returns the value of the '<em><b>Angle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angle</em>' containment reference.
	 * @see #setAngle(Value)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getTurn_Angle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getAngle();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.Turn#getAngle <em>Angle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angle</em>' containment reference.
	 * @see #getAngle()
	 * @generated
	 */
	void setAngle(Value value);

} // Turn
