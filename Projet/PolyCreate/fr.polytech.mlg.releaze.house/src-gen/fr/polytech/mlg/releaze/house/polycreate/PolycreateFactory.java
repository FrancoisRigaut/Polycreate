/**
 */
package fr.polytech.mlg.releaze.house.polycreate;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage
 * @generated
 */
public interface PolycreateFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PolycreateFactory eINSTANCE = fr.polytech.mlg.releaze.house.polycreate.impl.PolycreateFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program</em>'.
	 * @generated
	 */
	Program createProgram();

	/**
	 * Returns a new object of class '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>State</em>'.
	 * @generated
	 */
	State createState();

	/**
	 * Returns a new object of class '<em>Turn</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turn</em>'.
	 * @generated
	 */
	Turn createTurn();

	/**
	 * Returns a new object of class '<em>Go Forward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go Forward</em>'.
	 * @generated
	 */
	GoForward createGoForward();

	/**
	 * Returns a new object of class '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Function</em>'.
	 * @generated
	 */
	Function createFunction();

	/**
	 * Returns a new object of class '<em>Open Grip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Open Grip</em>'.
	 * @generated
	 */
	OpenGrip createOpenGrip();

	/**
	 * Returns a new object of class '<em>Close Grip</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Close Grip</em>'.
	 * @generated
	 */
	CloseGrip createCloseGrip();

	/**
	 * Returns a new object of class '<em>Bump Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bump Right</em>'.
	 * @generated
	 */
	BumpRight createBumpRight();

	/**
	 * Returns a new object of class '<em>Bump Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bump Left</em>'.
	 * @generated
	 */
	BumpLeft createBumpLeft();

	/**
	 * Returns a new object of class '<em>Cliff Right</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliff Right</em>'.
	 * @generated
	 */
	CliffRight createCliffRight();

	/**
	 * Returns a new object of class '<em>Cliff Left</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliff Left</em>'.
	 * @generated
	 */
	CliffLeft createCliffLeft();

	/**
	 * Returns a new object of class '<em>At Starting Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>At Starting Point</em>'.
	 * @generated
	 */
	AtStartingPoint createAtStartingPoint();

	/**
	 * Returns a new object of class '<em>Cliff Front</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cliff Front</em>'.
	 * @generated
	 */
	CliffFront createCliffFront();

	/**
	 * Returns a new object of class '<em>Object Grabbable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Object Grabbable</em>'.
	 * @generated
	 */
	ObjectGrabbable createObjectGrabbable();

	/**
	 * Returns a new object of class '<em>Numeral Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeral Value</em>'.
	 * @generated
	 */
	NumeralValue createNumeralValue();

	/**
	 * Returns a new object of class '<em>Random Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Random Value</em>'.
	 * @generated
	 */
	RandomValue createRandomValue();

	/**
	 * Returns a new object of class '<em>Go To</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Go To</em>'.
	 * @generated
	 */
	GoTo createGoTo();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PolycreatePackage getPolycreatePackage();

} //PolycreateFactory
