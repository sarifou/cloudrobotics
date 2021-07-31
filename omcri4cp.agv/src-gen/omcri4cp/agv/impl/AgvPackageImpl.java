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
package omcri4cp.agv.impl;

import omcri4cp.agv.Agv;
import omcri4cp.agv.AgvFactory;
import omcri4cp.agv.AgvPackage;

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
public class AgvPackageImpl extends EPackageImpl implements AgvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agvEClass = null;

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
	 * @see omcri4cp.agv.AgvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgvPackageImpl() {
		super(eNS_URI, AgvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgvPackage init() {
		if (isInited) return (AgvPackage)EPackage.Registry.INSTANCE.getEPackage(AgvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgvPackageImpl theAgvPackage = registeredAgvPackage instanceof AgvPackageImpl ? (AgvPackageImpl)registeredAgvPackage : new AgvPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgvPackage.createPackageContents();

		// Initialize created meta-data
		theAgvPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgvPackage.eNS_URI, theAgvPackage);
		return theAgvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgv() {
		return agvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_User() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_Ip() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_Port() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_ConnectionState() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_PoseX() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_PoseY() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_PoseAngular() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_SpeedLinear() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_SpeedAngular() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_GripperState() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_GripperX() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_GripperY() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_GripperZ() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_Distance() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_LineRight() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_LineMiddle() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_LineLeft() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Connect() {
		return agvEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Disconnect() {
		return agvEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Get_distance() {
		return agvEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Get_line_sensors() {
		return agvEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Forward() {
		return agvEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Backward() {
		return agvEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Right() {
		return agvEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Left() {
		return agvEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Right_up() {
		return agvEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Right_bottom() {
		return agvEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Left_up() {
		return agvEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Left_bottom() {
		return agvEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Turn_left() {
		return agvEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Turn_right() {
		return agvEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Turn_around() {
		return agvEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Stop() {
		return agvEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Open_gripper() {
		return agvEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Close_gripper() {
		return agvEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Go_to_position() {
		return agvEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAgv__Set_gripper_position() {
		return agvEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgvFactory getAgvFactory() {
		return (AgvFactory)getEFactoryInstance();
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
		agvEClass = createEClass(AGV);
		createEAttribute(agvEClass, AGV__USER);
		createEAttribute(agvEClass, AGV__IP);
		createEAttribute(agvEClass, AGV__PORT);
		createEAttribute(agvEClass, AGV__CONNECTION_STATE);
		createEAttribute(agvEClass, AGV__POSE_X);
		createEAttribute(agvEClass, AGV__POSE_Y);
		createEAttribute(agvEClass, AGV__POSE_ANGULAR);
		createEAttribute(agvEClass, AGV__SPEED_LINEAR);
		createEAttribute(agvEClass, AGV__SPEED_ANGULAR);
		createEAttribute(agvEClass, AGV__GRIPPER_STATE);
		createEAttribute(agvEClass, AGV__GRIPPER_X);
		createEAttribute(agvEClass, AGV__GRIPPER_Y);
		createEAttribute(agvEClass, AGV__GRIPPER_Z);
		createEAttribute(agvEClass, AGV__DISTANCE);
		createEAttribute(agvEClass, AGV__LINE_RIGHT);
		createEAttribute(agvEClass, AGV__LINE_MIDDLE);
		createEAttribute(agvEClass, AGV__LINE_LEFT);
		createEOperation(agvEClass, AGV___CONNECT);
		createEOperation(agvEClass, AGV___DISCONNECT);
		createEOperation(agvEClass, AGV___GET_DISTANCE);
		createEOperation(agvEClass, AGV___GET_LINE_SENSORS);
		createEOperation(agvEClass, AGV___FORWARD);
		createEOperation(agvEClass, AGV___BACKWARD);
		createEOperation(agvEClass, AGV___RIGHT);
		createEOperation(agvEClass, AGV___LEFT);
		createEOperation(agvEClass, AGV___RIGHT_UP);
		createEOperation(agvEClass, AGV___RIGHT_BOTTOM);
		createEOperation(agvEClass, AGV___LEFT_UP);
		createEOperation(agvEClass, AGV___LEFT_BOTTOM);
		createEOperation(agvEClass, AGV___TURN_LEFT);
		createEOperation(agvEClass, AGV___TURN_RIGHT);
		createEOperation(agvEClass, AGV___TURN_AROUND);
		createEOperation(agvEClass, AGV___STOP);
		createEOperation(agvEClass, AGV___OPEN_GRIPPER);
		createEOperation(agvEClass, AGV___CLOSE_GRIPPER);
		createEOperation(agvEClass, AGV___GO_TO_POSITION);
		createEOperation(agvEClass, AGV___SET_GRIPPER_POSITION);
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
		agvEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(agvEClass, Agv.class, "Agv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgv_User(), ecorePackage.getEString(), "user", "root", 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_Ip(), ecorePackage.getEString(), "ip", "127.0.0.1", 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_Port(), ecorePackage.getEInt(), "port", "9090", 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_ConnectionState(), ecorePackage.getEBoolean(), "connectionState", "false", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_PoseX(), ecorePackage.getEInt(), "poseX", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_PoseY(), ecorePackage.getEInt(), "poseY", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_PoseAngular(), ecorePackage.getEInt(), "poseAngular", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_SpeedLinear(), ecorePackage.getEInt(), "speedLinear", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_SpeedAngular(), ecorePackage.getEInt(), "speedAngular", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_GripperState(), ecorePackage.getEBoolean(), "gripperState", "false", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_GripperX(), ecorePackage.getEInt(), "gripperX", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_GripperY(), ecorePackage.getEInt(), "gripperY", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_GripperZ(), ecorePackage.getEInt(), "gripperZ", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_Distance(), ecorePackage.getEInt(), "distance", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_LineRight(), ecorePackage.getEInt(), "lineRight", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_LineMiddle(), ecorePackage.getEInt(), "lineMiddle", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_LineLeft(), ecorePackage.getEInt(), "lineLeft", "0", 0, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAgv__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Get_distance(), null, "get_distance", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Get_line_sensors(), null, "get_line_sensors", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Forward(), null, "forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Backward(), null, "backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Right(), null, "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Left(), null, "left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Right_up(), null, "right_up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Right_bottom(), null, "right_bottom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Left_up(), null, "left_up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Left_bottom(), null, "left_bottom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Turn_left(), null, "turn_left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Turn_right(), null, "turn_right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Turn_around(), null, "turn_around", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Open_gripper(), null, "open_gripper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Close_gripper(), null, "close_gripper", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Go_to_position(), null, "go_to_position", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAgv__Set_gripper_position(), null, "set_gripper_position", 0, 1, IS_UNIQUE, IS_ORDERED);

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

} //AgvPackageImpl
