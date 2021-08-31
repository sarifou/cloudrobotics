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
package omcri4cp.drone;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see omcri4cp.drone.DroneFactory
 * @model kind="package"
 * @generated
 */
public interface DronePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "drone";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cristal.org/omcri4cp/drone/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "drone";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DronePackage eINSTANCE = omcri4cp.drone.impl.DronePackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri4cp.drone.impl.DroneImpl <em>Drone</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.drone.impl.DroneImpl
	 * @see omcri4cp.drone.impl.DronePackageImpl#getDrone()
	 * @generated
	 */
	int DRONE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__USER = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__IP = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__PORT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__CONNECTION_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Drone Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONE_MODE = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Drone Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONE_BATTERY = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pose Linear X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__POSE_LINEAR_X = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Pose Linear Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__POSE_LINEAR_Y = OCCIPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Pose Linear Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__POSE_LINEAR_Z = OCCIPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Pose Angular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__POSE_ANGULAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Speed Linear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SPEED_LINEAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Speed Angular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__SPEED_ANGULAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Drone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE__DRONE_ID = OCCIPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___FORWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___BACKWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___LEFT = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___RIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___UP = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___DOWN = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set speed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___SET_SPEED = OCCIPackage.RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___STOP = OCCIPackage.RESOURCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Go to position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___GO_TO_POSITION = OCCIPackage.RESOURCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Turn left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___TURN_LEFT = OCCIPackage.RESOURCE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Turn right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___TURN_RIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Change mode</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___CHANGE_MODE = OCCIPackage.RESOURCE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Arm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___ARM = OCCIPackage.RESOURCE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Disarm</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE___DISARM = OCCIPackage.RESOURCE_OPERATION_COUNT + 13;

	/**
	 * The number of operations of the '<em>Drone</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRONE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 14;


	/**
	 * Returns the meta object for class '{@link omcri4cp.drone.Drone <em>Drone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drone</em>'.
	 * @see omcri4cp.drone.Drone
	 * @generated
	 */
	EClass getDrone();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri4cp.drone.Drone#getUser()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see omcri4cp.drone.Drone#getIp()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Ip();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see omcri4cp.drone.Drone#getPort()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_Port();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#isConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see omcri4cp.drone.Drone#isConnectionState()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_ConnectionState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getDroneMode <em>Drone Mode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drone Mode</em>'.
	 * @see omcri4cp.drone.Drone#getDroneMode()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_DroneMode();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getDroneBattery <em>Drone Battery</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drone Battery</em>'.
	 * @see omcri4cp.drone.Drone#getDroneBattery()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_DroneBattery();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getPoseLinearX <em>Pose Linear X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Linear X</em>'.
	 * @see omcri4cp.drone.Drone#getPoseLinearX()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_PoseLinearX();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getPoseLinearY <em>Pose Linear Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Linear Y</em>'.
	 * @see omcri4cp.drone.Drone#getPoseLinearY()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_PoseLinearY();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getPoseLinearZ <em>Pose Linear Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Linear Z</em>'.
	 * @see omcri4cp.drone.Drone#getPoseLinearZ()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_PoseLinearZ();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getPoseAngular <em>Pose Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Angular</em>'.
	 * @see omcri4cp.drone.Drone#getPoseAngular()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_PoseAngular();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getSpeedLinear <em>Speed Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Linear</em>'.
	 * @see omcri4cp.drone.Drone#getSpeedLinear()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_SpeedLinear();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getSpeedAngular <em>Speed Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Angular</em>'.
	 * @see omcri4cp.drone.Drone#getSpeedAngular()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_SpeedAngular();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.drone.Drone#getDroneId <em>Drone Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Drone Id</em>'.
	 * @see omcri4cp.drone.Drone#getDroneId()
	 * @see #getDrone()
	 * @generated
	 */
	EAttribute getDrone_DroneId();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#forward() <em>Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Forward</em>' operation.
	 * @see omcri4cp.drone.Drone#forward()
	 * @generated
	 */
	EOperation getDrone__Forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#backward() <em>Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Backward</em>' operation.
	 * @see omcri4cp.drone.Drone#backward()
	 * @generated
	 */
	EOperation getDrone__Backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#left() <em>Left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left</em>' operation.
	 * @see omcri4cp.drone.Drone#left()
	 * @generated
	 */
	EOperation getDrone__Left();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#right() <em>Right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right</em>' operation.
	 * @see omcri4cp.drone.Drone#right()
	 * @generated
	 */
	EOperation getDrone__Right();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#up() <em>Up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Up</em>' operation.
	 * @see omcri4cp.drone.Drone#up()
	 * @generated
	 */
	EOperation getDrone__Up();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#down() <em>Down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Down</em>' operation.
	 * @see omcri4cp.drone.Drone#down()
	 * @generated
	 */
	EOperation getDrone__Down();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#set_speed() <em>Set speed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set speed</em>' operation.
	 * @see omcri4cp.drone.Drone#set_speed()
	 * @generated
	 */
	EOperation getDrone__Set_speed();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcri4cp.drone.Drone#stop()
	 * @generated
	 */
	EOperation getDrone__Stop();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#go_to_position() <em>Go to position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Go to position</em>' operation.
	 * @see omcri4cp.drone.Drone#go_to_position()
	 * @generated
	 */
	EOperation getDrone__Go_to_position();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#turn_left() <em>Turn left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn left</em>' operation.
	 * @see omcri4cp.drone.Drone#turn_left()
	 * @generated
	 */
	EOperation getDrone__Turn_left();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#turn_right() <em>Turn right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn right</em>' operation.
	 * @see omcri4cp.drone.Drone#turn_right()
	 * @generated
	 */
	EOperation getDrone__Turn_right();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#change_mode() <em>Change mode</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change mode</em>' operation.
	 * @see omcri4cp.drone.Drone#change_mode()
	 * @generated
	 */
	EOperation getDrone__Change_mode();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#arm() <em>Arm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Arm</em>' operation.
	 * @see omcri4cp.drone.Drone#arm()
	 * @generated
	 */
	EOperation getDrone__Arm();

	/**
	 * Returns the meta object for the '{@link omcri4cp.drone.Drone#disarm() <em>Disarm</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disarm</em>' operation.
	 * @see omcri4cp.drone.Drone#disarm()
	 * @generated
	 */
	EOperation getDrone__Disarm();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DroneFactory getDroneFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link omcri4cp.drone.impl.DroneImpl <em>Drone</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.drone.impl.DroneImpl
		 * @see omcri4cp.drone.impl.DronePackageImpl#getDrone()
		 * @generated
		 */
		EClass DRONE = eINSTANCE.getDrone();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__USER = eINSTANCE.getDrone_User();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__IP = eINSTANCE.getDrone_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__PORT = eINSTANCE.getDrone_Port();

		/**
		 * The meta object literal for the '<em><b>Connection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__CONNECTION_STATE = eINSTANCE.getDrone_ConnectionState();

		/**
		 * The meta object literal for the '<em><b>Drone Mode</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__DRONE_MODE = eINSTANCE.getDrone_DroneMode();

		/**
		 * The meta object literal for the '<em><b>Drone Battery</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__DRONE_BATTERY = eINSTANCE.getDrone_DroneBattery();

		/**
		 * The meta object literal for the '<em><b>Pose Linear X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__POSE_LINEAR_X = eINSTANCE.getDrone_PoseLinearX();

		/**
		 * The meta object literal for the '<em><b>Pose Linear Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__POSE_LINEAR_Y = eINSTANCE.getDrone_PoseLinearY();

		/**
		 * The meta object literal for the '<em><b>Pose Linear Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__POSE_LINEAR_Z = eINSTANCE.getDrone_PoseLinearZ();

		/**
		 * The meta object literal for the '<em><b>Pose Angular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__POSE_ANGULAR = eINSTANCE.getDrone_PoseAngular();

		/**
		 * The meta object literal for the '<em><b>Speed Linear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__SPEED_LINEAR = eINSTANCE.getDrone_SpeedLinear();

		/**
		 * The meta object literal for the '<em><b>Speed Angular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__SPEED_ANGULAR = eINSTANCE.getDrone_SpeedAngular();

		/**
		 * The meta object literal for the '<em><b>Drone Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DRONE__DRONE_ID = eINSTANCE.getDrone_DroneId();

		/**
		 * The meta object literal for the '<em><b>Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___FORWARD = eINSTANCE.getDrone__Forward();

		/**
		 * The meta object literal for the '<em><b>Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___BACKWARD = eINSTANCE.getDrone__Backward();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___LEFT = eINSTANCE.getDrone__Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___RIGHT = eINSTANCE.getDrone__Right();

		/**
		 * The meta object literal for the '<em><b>Up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___UP = eINSTANCE.getDrone__Up();

		/**
		 * The meta object literal for the '<em><b>Down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___DOWN = eINSTANCE.getDrone__Down();

		/**
		 * The meta object literal for the '<em><b>Set speed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___SET_SPEED = eINSTANCE.getDrone__Set_speed();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___STOP = eINSTANCE.getDrone__Stop();

		/**
		 * The meta object literal for the '<em><b>Go to position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___GO_TO_POSITION = eINSTANCE.getDrone__Go_to_position();

		/**
		 * The meta object literal for the '<em><b>Turn left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___TURN_LEFT = eINSTANCE.getDrone__Turn_left();

		/**
		 * The meta object literal for the '<em><b>Turn right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___TURN_RIGHT = eINSTANCE.getDrone__Turn_right();

		/**
		 * The meta object literal for the '<em><b>Change mode</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___CHANGE_MODE = eINSTANCE.getDrone__Change_mode();

		/**
		 * The meta object literal for the '<em><b>Arm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___ARM = eINSTANCE.getDrone__Arm();

		/**
		 * The meta object literal for the '<em><b>Disarm</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DRONE___DISARM = eINSTANCE.getDrone__Disarm();

	}

} //DronePackage
