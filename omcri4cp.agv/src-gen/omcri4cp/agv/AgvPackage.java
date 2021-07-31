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
package omcri4cp.agv;

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
 * @see omcri4cp.agv.AgvFactory
 * @model kind="package"
 * @generated
 */
public interface AgvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cristal.org/omcri4cp/agv/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgvPackage eINSTANCE = omcri4cp.agv.impl.AgvPackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri4cp.agv.impl.AgvImpl <em>Agv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.agv.impl.AgvImpl
	 * @see omcri4cp.agv.impl.AgvPackageImpl#getAgv()
	 * @generated
	 */
	int AGV = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__USER = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__IP = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PORT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__CONNECTION_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Pose X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__POSE_X = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Pose Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__POSE_Y = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Pose Angular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__POSE_ANGULAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Speed Linear</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__SPEED_LINEAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Speed Angular</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__SPEED_ANGULAR = OCCIPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Gripper State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__GRIPPER_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Gripper X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__GRIPPER_X = OCCIPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Gripper Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__GRIPPER_Y = OCCIPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Gripper Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__GRIPPER_Z = OCCIPackage.RESOURCE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__DISTANCE = OCCIPackage.RESOURCE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Line Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LINE_RIGHT = OCCIPackage.RESOURCE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Line Middle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LINE_MIDDLE = OCCIPackage.RESOURCE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Line Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LINE_LEFT = OCCIPackage.RESOURCE_FEATURE_COUNT + 16;

	/**
	 * The number of structural features of the '<em>Agv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 17;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___CONNECT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___DISCONNECT = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Get distance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___GET_DISTANCE = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get line sensors</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___GET_LINE_SENSORS = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___FORWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___BACKWARD = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___RIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___LEFT = OCCIPackage.RESOURCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Right up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___RIGHT_UP = OCCIPackage.RESOURCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Right bottom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___RIGHT_BOTTOM = OCCIPackage.RESOURCE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Left up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___LEFT_UP = OCCIPackage.RESOURCE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Left bottom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___LEFT_BOTTOM = OCCIPackage.RESOURCE_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Turn left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___TURN_LEFT = OCCIPackage.RESOURCE_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Turn right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___TURN_RIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Turn around</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___TURN_AROUND = OCCIPackage.RESOURCE_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___STOP = OCCIPackage.RESOURCE_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Open gripper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OPEN_GRIPPER = OCCIPackage.RESOURCE_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Close gripper</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___CLOSE_GRIPPER = OCCIPackage.RESOURCE_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Go to position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___GO_TO_POSITION = OCCIPackage.RESOURCE_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Set gripper position</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___SET_GRIPPER_POSITION = OCCIPackage.RESOURCE_OPERATION_COUNT + 19;

	/**
	 * The number of operations of the '<em>Agv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 20;


	/**
	 * Returns the meta object for class '{@link omcri4cp.agv.Agv <em>Agv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agv</em>'.
	 * @see omcri4cp.agv.Agv
	 * @generated
	 */
	EClass getAgv();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri4cp.agv.Agv#getUser()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see omcri4cp.agv.Agv#getIp()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_Ip();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see omcri4cp.agv.Agv#getPort()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_Port();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#isConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see omcri4cp.agv.Agv#isConnectionState()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_ConnectionState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getPoseX <em>Pose X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose X</em>'.
	 * @see omcri4cp.agv.Agv#getPoseX()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_PoseX();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getPoseY <em>Pose Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Y</em>'.
	 * @see omcri4cp.agv.Agv#getPoseY()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_PoseY();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getPoseAngular <em>Pose Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pose Angular</em>'.
	 * @see omcri4cp.agv.Agv#getPoseAngular()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_PoseAngular();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getSpeedLinear <em>Speed Linear</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Linear</em>'.
	 * @see omcri4cp.agv.Agv#getSpeedLinear()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_SpeedLinear();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getSpeedAngular <em>Speed Angular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed Angular</em>'.
	 * @see omcri4cp.agv.Agv#getSpeedAngular()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_SpeedAngular();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#isGripperState <em>Gripper State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gripper State</em>'.
	 * @see omcri4cp.agv.Agv#isGripperState()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_GripperState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getGripperX <em>Gripper X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gripper X</em>'.
	 * @see omcri4cp.agv.Agv#getGripperX()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_GripperX();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getGripperY <em>Gripper Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gripper Y</em>'.
	 * @see omcri4cp.agv.Agv#getGripperY()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_GripperY();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getGripperZ <em>Gripper Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Gripper Z</em>'.
	 * @see omcri4cp.agv.Agv#getGripperZ()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_GripperZ();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see omcri4cp.agv.Agv#getDistance()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_Distance();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getLineRight <em>Line Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Right</em>'.
	 * @see omcri4cp.agv.Agv#getLineRight()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_LineRight();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getLineMiddle <em>Line Middle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Middle</em>'.
	 * @see omcri4cp.agv.Agv#getLineMiddle()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_LineMiddle();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getLineLeft <em>Line Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Left</em>'.
	 * @see omcri4cp.agv.Agv#getLineLeft()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_LineLeft();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see omcri4cp.agv.Agv#connect()
	 * @generated
	 */
	EOperation getAgv__Connect();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see omcri4cp.agv.Agv#disconnect()
	 * @generated
	 */
	EOperation getAgv__Disconnect();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#get_distance() <em>Get distance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get distance</em>' operation.
	 * @see omcri4cp.agv.Agv#get_distance()
	 * @generated
	 */
	EOperation getAgv__Get_distance();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#get_line_sensors() <em>Get line sensors</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get line sensors</em>' operation.
	 * @see omcri4cp.agv.Agv#get_line_sensors()
	 * @generated
	 */
	EOperation getAgv__Get_line_sensors();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#forward() <em>Forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Forward</em>' operation.
	 * @see omcri4cp.agv.Agv#forward()
	 * @generated
	 */
	EOperation getAgv__Forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#backward() <em>Backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Backward</em>' operation.
	 * @see omcri4cp.agv.Agv#backward()
	 * @generated
	 */
	EOperation getAgv__Backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#right() <em>Right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right</em>' operation.
	 * @see omcri4cp.agv.Agv#right()
	 * @generated
	 */
	EOperation getAgv__Right();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#left() <em>Left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left</em>' operation.
	 * @see omcri4cp.agv.Agv#left()
	 * @generated
	 */
	EOperation getAgv__Left();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#right_up() <em>Right up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right up</em>' operation.
	 * @see omcri4cp.agv.Agv#right_up()
	 * @generated
	 */
	EOperation getAgv__Right_up();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#right_bottom() <em>Right bottom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right bottom</em>' operation.
	 * @see omcri4cp.agv.Agv#right_bottom()
	 * @generated
	 */
	EOperation getAgv__Right_bottom();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#left_up() <em>Left up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left up</em>' operation.
	 * @see omcri4cp.agv.Agv#left_up()
	 * @generated
	 */
	EOperation getAgv__Left_up();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#left_bottom() <em>Left bottom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left bottom</em>' operation.
	 * @see omcri4cp.agv.Agv#left_bottom()
	 * @generated
	 */
	EOperation getAgv__Left_bottom();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#turn_left() <em>Turn left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn left</em>' operation.
	 * @see omcri4cp.agv.Agv#turn_left()
	 * @generated
	 */
	EOperation getAgv__Turn_left();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#turn_right() <em>Turn right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn right</em>' operation.
	 * @see omcri4cp.agv.Agv#turn_right()
	 * @generated
	 */
	EOperation getAgv__Turn_right();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#turn_around() <em>Turn around</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn around</em>' operation.
	 * @see omcri4cp.agv.Agv#turn_around()
	 * @generated
	 */
	EOperation getAgv__Turn_around();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcri4cp.agv.Agv#stop()
	 * @generated
	 */
	EOperation getAgv__Stop();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#open_gripper() <em>Open gripper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open gripper</em>' operation.
	 * @see omcri4cp.agv.Agv#open_gripper()
	 * @generated
	 */
	EOperation getAgv__Open_gripper();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#close_gripper() <em>Close gripper</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close gripper</em>' operation.
	 * @see omcri4cp.agv.Agv#close_gripper()
	 * @generated
	 */
	EOperation getAgv__Close_gripper();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#go_to_position() <em>Go to position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Go to position</em>' operation.
	 * @see omcri4cp.agv.Agv#go_to_position()
	 * @generated
	 */
	EOperation getAgv__Go_to_position();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Agv#set_gripper_position() <em>Set gripper position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set gripper position</em>' operation.
	 * @see omcri4cp.agv.Agv#set_gripper_position()
	 * @generated
	 */
	EOperation getAgv__Set_gripper_position();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgvFactory getAgvFactory();

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
		 * The meta object literal for the '{@link omcri4cp.agv.impl.AgvImpl <em>Agv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.agv.impl.AgvImpl
		 * @see omcri4cp.agv.impl.AgvPackageImpl#getAgv()
		 * @generated
		 */
		EClass AGV = eINSTANCE.getAgv();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__USER = eINSTANCE.getAgv_User();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__IP = eINSTANCE.getAgv_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__PORT = eINSTANCE.getAgv_Port();

		/**
		 * The meta object literal for the '<em><b>Connection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__CONNECTION_STATE = eINSTANCE.getAgv_ConnectionState();

		/**
		 * The meta object literal for the '<em><b>Pose X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__POSE_X = eINSTANCE.getAgv_PoseX();

		/**
		 * The meta object literal for the '<em><b>Pose Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__POSE_Y = eINSTANCE.getAgv_PoseY();

		/**
		 * The meta object literal for the '<em><b>Pose Angular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__POSE_ANGULAR = eINSTANCE.getAgv_PoseAngular();

		/**
		 * The meta object literal for the '<em><b>Speed Linear</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__SPEED_LINEAR = eINSTANCE.getAgv_SpeedLinear();

		/**
		 * The meta object literal for the '<em><b>Speed Angular</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__SPEED_ANGULAR = eINSTANCE.getAgv_SpeedAngular();

		/**
		 * The meta object literal for the '<em><b>Gripper State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__GRIPPER_STATE = eINSTANCE.getAgv_GripperState();

		/**
		 * The meta object literal for the '<em><b>Gripper X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__GRIPPER_X = eINSTANCE.getAgv_GripperX();

		/**
		 * The meta object literal for the '<em><b>Gripper Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__GRIPPER_Y = eINSTANCE.getAgv_GripperY();

		/**
		 * The meta object literal for the '<em><b>Gripper Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__GRIPPER_Z = eINSTANCE.getAgv_GripperZ();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__DISTANCE = eINSTANCE.getAgv_Distance();

		/**
		 * The meta object literal for the '<em><b>Line Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__LINE_RIGHT = eINSTANCE.getAgv_LineRight();

		/**
		 * The meta object literal for the '<em><b>Line Middle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__LINE_MIDDLE = eINSTANCE.getAgv_LineMiddle();

		/**
		 * The meta object literal for the '<em><b>Line Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__LINE_LEFT = eINSTANCE.getAgv_LineLeft();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___CONNECT = eINSTANCE.getAgv__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___DISCONNECT = eINSTANCE.getAgv__Disconnect();

		/**
		 * The meta object literal for the '<em><b>Get distance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___GET_DISTANCE = eINSTANCE.getAgv__Get_distance();

		/**
		 * The meta object literal for the '<em><b>Get line sensors</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___GET_LINE_SENSORS = eINSTANCE.getAgv__Get_line_sensors();

		/**
		 * The meta object literal for the '<em><b>Forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___FORWARD = eINSTANCE.getAgv__Forward();

		/**
		 * The meta object literal for the '<em><b>Backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___BACKWARD = eINSTANCE.getAgv__Backward();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___RIGHT = eINSTANCE.getAgv__Right();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___LEFT = eINSTANCE.getAgv__Left();

		/**
		 * The meta object literal for the '<em><b>Right up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___RIGHT_UP = eINSTANCE.getAgv__Right_up();

		/**
		 * The meta object literal for the '<em><b>Right bottom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___RIGHT_BOTTOM = eINSTANCE.getAgv__Right_bottom();

		/**
		 * The meta object literal for the '<em><b>Left up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___LEFT_UP = eINSTANCE.getAgv__Left_up();

		/**
		 * The meta object literal for the '<em><b>Left bottom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___LEFT_BOTTOM = eINSTANCE.getAgv__Left_bottom();

		/**
		 * The meta object literal for the '<em><b>Turn left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___TURN_LEFT = eINSTANCE.getAgv__Turn_left();

		/**
		 * The meta object literal for the '<em><b>Turn right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___TURN_RIGHT = eINSTANCE.getAgv__Turn_right();

		/**
		 * The meta object literal for the '<em><b>Turn around</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___TURN_AROUND = eINSTANCE.getAgv__Turn_around();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___STOP = eINSTANCE.getAgv__Stop();

		/**
		 * The meta object literal for the '<em><b>Open gripper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___OPEN_GRIPPER = eINSTANCE.getAgv__Open_gripper();

		/**
		 * The meta object literal for the '<em><b>Close gripper</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___CLOSE_GRIPPER = eINSTANCE.getAgv__Close_gripper();

		/**
		 * The meta object literal for the '<em><b>Go to position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___GO_TO_POSITION = eINSTANCE.getAgv__Go_to_position();

		/**
		 * The meta object literal for the '<em><b>Set gripper position</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AGV___SET_GRIPPER_POSITION = eINSTANCE.getAgv__Set_gripper_position();

	}

} //AgvPackage
