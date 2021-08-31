/**
 * Copyright (c) 2015-2017 Obeo, Inria
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 	
 * Contributors:
 * - William Piers <william.piers@obeo.fr>
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 */
package omcri4cp.drone.impl;

import omcri4cp.drone.Drone;
import omcri4cp.drone.DroneFactory;
import omcri4cp.drone.DronePackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DronePackageImpl extends EPackageImpl implements DronePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass droneEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see omcri4cp.drone.DronePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DronePackageImpl() {
		super(eNS_URI, DroneFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link DronePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DronePackage init() {
		if (isInited) return (DronePackage)EPackage.Registry.INSTANCE.getEPackage(DronePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredDronePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		DronePackageImpl theDronePackage = registeredDronePackage instanceof DronePackageImpl ? (DronePackageImpl)registeredDronePackage : new DronePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDronePackage.createPackageContents();

		// Initialize created meta-data
		theDronePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDronePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DronePackage.eNS_URI, theDronePackage);
		return theDronePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrone() {
		return droneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_User() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Ip() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_Port() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_ConnectionState() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_DroneMode() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_DroneBattery() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_PoseLinearX() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_PoseLinearY() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_PoseLinearZ() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_PoseAngular() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_SpeedLinear() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_SpeedAngular() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDrone_DroneId() {
		return (EAttribute)droneEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Forward() {
		return droneEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Backward() {
		return droneEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Left() {
		return droneEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Right() {
		return droneEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Up() {
		return droneEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Down() {
		return droneEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Set_speed() {
		return droneEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Stop() {
		return droneEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Go_to_position() {
		return droneEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Turn_left() {
		return droneEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Turn_right() {
		return droneEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Change_mode() {
		return droneEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Arm() {
		return droneEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDrone__Disarm() {
		return droneEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DroneFactory getDroneFactory() {
		return (DroneFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		droneEClass = createEClass(DRONE);
		createEAttribute(droneEClass, DRONE__USER);
		createEAttribute(droneEClass, DRONE__IP);
		createEAttribute(droneEClass, DRONE__PORT);
		createEAttribute(droneEClass, DRONE__CONNECTION_STATE);
		createEAttribute(droneEClass, DRONE__DRONE_MODE);
		createEAttribute(droneEClass, DRONE__DRONE_BATTERY);
		createEAttribute(droneEClass, DRONE__POSE_LINEAR_X);
		createEAttribute(droneEClass, DRONE__POSE_LINEAR_Y);
		createEAttribute(droneEClass, DRONE__POSE_LINEAR_Z);
		createEAttribute(droneEClass, DRONE__POSE_ANGULAR);
		createEAttribute(droneEClass, DRONE__SPEED_LINEAR);
		createEAttribute(droneEClass, DRONE__SPEED_ANGULAR);
		createEAttribute(droneEClass, DRONE__DRONE_ID);
		createEOperation(droneEClass, DRONE___FORWARD);
		createEOperation(droneEClass, DRONE___BACKWARD);
		createEOperation(droneEClass, DRONE___LEFT);
		createEOperation(droneEClass, DRONE___RIGHT);
		createEOperation(droneEClass, DRONE___UP);
		createEOperation(droneEClass, DRONE___DOWN);
		createEOperation(droneEClass, DRONE___SET_SPEED);
		createEOperation(droneEClass, DRONE___STOP);
		createEOperation(droneEClass, DRONE___GO_TO_POSITION);
		createEOperation(droneEClass, DRONE___TURN_LEFT);
		createEOperation(droneEClass, DRONE___TURN_RIGHT);
		createEOperation(droneEClass, DRONE___CHANGE_MODE);
		createEOperation(droneEClass, DRONE___ARM);
		createEOperation(droneEClass, DRONE___DISARM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		OCCIPackage theOCCIPackage = (OCCIPackage)EPackage.Registry.INSTANCE.getEPackage(OCCIPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		droneEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(droneEClass, Drone.class, "Drone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDrone_User(), ecorePackage.getEString(), "user", "root", 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Ip(), ecorePackage.getEString(), "ip", "127.0.0.1", 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_Port(), ecorePackage.getEInt(), "port", "9090", 1, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_ConnectionState(), ecorePackage.getEBoolean(), "connectionState", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_DroneMode(), ecorePackage.getEString(), "droneMode", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_DroneBattery(), ecorePackage.getEString(), "droneBattery", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_PoseLinearX(), ecorePackage.getEInt(), "poseLinearX", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_PoseLinearY(), ecorePackage.getEInt(), "poseLinearY", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_PoseLinearZ(), ecorePackage.getEInt(), "poseLinearZ", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_PoseAngular(), ecorePackage.getEInt(), "poseAngular", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_SpeedLinear(), ecorePackage.getEInt(), "speedLinear", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_SpeedAngular(), ecorePackage.getEInt(), "speedAngular", "0", 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDrone_DroneId(), ecorePackage.getEString(), "droneId", null, 0, 1, Drone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDrone__Forward(), null, "forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Backward(), null, "backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Left(), null, "left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Right(), null, "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Up(), null, "up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Down(), null, "down", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Set_speed(), null, "set_speed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Go_to_position(), null, "go_to_position", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Turn_left(), null, "turn_left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Turn_right(), null, "turn_right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Change_mode(), null, "change_mode", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Arm(), null, "arm", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDrone__Disarm(), null, "disarm", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";
		addAnnotation
		  (this,
		   source,
		   new String[] {
		   });
	}

} //DronePackageImpl
