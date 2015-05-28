/**
 */
package org.gemoc.agro.simulation.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.gemoc.agro.simulation.Simulation;
import org.gemoc.agro.simulation.SimulationFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simulation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulationTest extends TestCase {

	/**
	 * The fixture for this Simulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simulation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimulationTest.class);
	}

	/**
	 * Constructs a new Simulation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Simulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Simulation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Simulation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simulation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(SimulationFactory.eINSTANCE.createSimulation());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //SimulationTest
