/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go Forward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.GoForward#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getGoForward()
 * @model
 * @generated
 */
public interface GoForward extends Instruction {
	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(Value)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getGoForward_Time()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Value getTime();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.GoForward#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(Value value);

} // GoForward
