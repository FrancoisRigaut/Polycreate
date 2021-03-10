/**
 */
package fr.polytech.mlg.releaze.house.polycreate.impl;

import fr.polytech.mlg.releaze.house.polycreate.Event;
import fr.polytech.mlg.releaze.house.polycreate.Function;
import fr.polytech.mlg.releaze.house.polycreate.PolycreatePackage;
import fr.polytech.mlg.releaze.house.polycreate.Program;
import fr.polytech.mlg.releaze.house.polycreate.State;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl#getName <em>Name</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl#getStates <em>States</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl#getCurrentStateName <em>Current State Name</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link fr.polytech.mlg.releaze.house.polycreate.impl.ProgramImpl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The default value of the '{@link #getCurrentStateName() <em>Current State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStateName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_STATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentStateName() <em>Current State Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentStateName()
	 * @generated
	 * @ordered
	 */
	protected String currentStateName = CURRENT_STATE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getEvents() <em>Events</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvents()
	 * @generated
	 * @ordered
	 */
	protected EList<Event> events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PolycreatePackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.PROGRAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, PolycreatePackage.PROGRAM__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentStateName() {
		return currentStateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentStateName(String newCurrentStateName) {
		String oldCurrentStateName = currentStateName;
		currentStateName = newCurrentStateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PolycreatePackage.PROGRAM__CURRENT_STATE_NAME,
					oldCurrentStateName, currentStateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this,
					PolycreatePackage.PROGRAM__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Event> getEvents() {
		if (events == null) {
			events = new EObjectContainmentEList<Event>(Event.class, this, PolycreatePackage.PROGRAM__EVENTS);
		}
		return events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case PolycreatePackage.PROGRAM__STATES:
			return ((InternalEList<?>) getStates()).basicRemove(otherEnd, msgs);
		case PolycreatePackage.PROGRAM__FUNCTIONS:
			return ((InternalEList<?>) getFunctions()).basicRemove(otherEnd, msgs);
		case PolycreatePackage.PROGRAM__EVENTS:
			return ((InternalEList<?>) getEvents()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case PolycreatePackage.PROGRAM__NAME:
			return getName();
		case PolycreatePackage.PROGRAM__STATES:
			return getStates();
		case PolycreatePackage.PROGRAM__CURRENT_STATE_NAME:
			return getCurrentStateName();
		case PolycreatePackage.PROGRAM__FUNCTIONS:
			return getFunctions();
		case PolycreatePackage.PROGRAM__EVENTS:
			return getEvents();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case PolycreatePackage.PROGRAM__NAME:
			setName((String) newValue);
			return;
		case PolycreatePackage.PROGRAM__STATES:
			getStates().clear();
			getStates().addAll((Collection<? extends State>) newValue);
			return;
		case PolycreatePackage.PROGRAM__CURRENT_STATE_NAME:
			setCurrentStateName((String) newValue);
			return;
		case PolycreatePackage.PROGRAM__FUNCTIONS:
			getFunctions().clear();
			getFunctions().addAll((Collection<? extends Function>) newValue);
			return;
		case PolycreatePackage.PROGRAM__EVENTS:
			getEvents().clear();
			getEvents().addAll((Collection<? extends Event>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case PolycreatePackage.PROGRAM__NAME:
			setName(NAME_EDEFAULT);
			return;
		case PolycreatePackage.PROGRAM__STATES:
			getStates().clear();
			return;
		case PolycreatePackage.PROGRAM__CURRENT_STATE_NAME:
			setCurrentStateName(CURRENT_STATE_NAME_EDEFAULT);
			return;
		case PolycreatePackage.PROGRAM__FUNCTIONS:
			getFunctions().clear();
			return;
		case PolycreatePackage.PROGRAM__EVENTS:
			getEvents().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case PolycreatePackage.PROGRAM__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case PolycreatePackage.PROGRAM__STATES:
			return states != null && !states.isEmpty();
		case PolycreatePackage.PROGRAM__CURRENT_STATE_NAME:
			return CURRENT_STATE_NAME_EDEFAULT == null ? currentStateName != null
					: !CURRENT_STATE_NAME_EDEFAULT.equals(currentStateName);
		case PolycreatePackage.PROGRAM__FUNCTIONS:
			return functions != null && !functions.isEmpty();
		case PolycreatePackage.PROGRAM__EVENTS:
			return events != null && !events.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", currentStateName: ");
		result.append(currentStateName);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl
