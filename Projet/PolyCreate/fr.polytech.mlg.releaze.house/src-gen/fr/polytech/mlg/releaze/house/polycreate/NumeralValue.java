/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeral Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.NumeralValue#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getNumeralValue()
 * @model
 * @generated
 */
public interface NumeralValue extends Value {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage#getNumeralValue_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.polytech.mlg.releaze.house.polycreate.NumeralValue#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // NumeralValue
