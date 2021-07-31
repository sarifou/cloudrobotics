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

import java.lang.reflect.InvocationTargetException;

import omcri4cp.agv.Agv;
import omcri4cp.agv.AgvPackage;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agv</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getPoseX <em>Pose X</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getPoseY <em>Pose Y</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getPoseAngular <em>Pose Angular</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getSpeedLinear <em>Speed Linear</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getSpeedAngular <em>Speed Angular</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#isGripperState <em>Gripper State</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getGripperX <em>Gripper X</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getGripperY <em>Gripper Y</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getGripperZ <em>Gripper Z</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getLineRight <em>Line Right</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getLineMiddle <em>Line Middle</em>}</li>
 *   <li>{@link omcri4cp.agv.impl.AgvImpl#getLineLeft <em>Line Left</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AgvImpl extends ResourceImpl implements Agv {
	/**
	 * The default value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_EDEFAULT = "root";

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected String user = USER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected static final String IP_EDEFAULT = "127.0.0.1";

	/**
	 * The cached value of the '{@link #getIp() <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIp()
	 * @generated
	 * @ordered
	 */
	protected String ip = IP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 9090;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #isConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectionState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONNECTION_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConnectionState() <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConnectionState()
	 * @generated
	 * @ordered
	 */
	protected boolean connectionState = CONNECTION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseX() <em>Pose X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseX()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseX() <em>Pose X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseX()
	 * @generated
	 * @ordered
	 */
	protected int poseX = POSE_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseY() <em>Pose Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseY()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseY() <em>Pose Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseY()
	 * @generated
	 * @ordered
	 */
	protected int poseY = POSE_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseAngular() <em>Pose Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseAngular()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_ANGULAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseAngular() <em>Pose Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseAngular()
	 * @generated
	 * @ordered
	 */
	protected int poseAngular = POSE_ANGULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedLinear() <em>Speed Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedLinear()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_LINEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeedLinear() <em>Speed Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedLinear()
	 * @generated
	 * @ordered
	 */
	protected int speedLinear = SPEED_LINEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedAngular() <em>Speed Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedAngular()
	 * @generated
	 * @ordered
	 */
	protected static final int SPEED_ANGULAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSpeedAngular() <em>Speed Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedAngular()
	 * @generated
	 * @ordered
	 */
	protected int speedAngular = SPEED_ANGULAR_EDEFAULT;

	/**
	 * The default value of the '{@link #isGripperState() <em>Gripper State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGripperState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean GRIPPER_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isGripperState() <em>Gripper State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isGripperState()
	 * @generated
	 * @ordered
	 */
	protected boolean gripperState = GRIPPER_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGripperX() <em>Gripper X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperX()
	 * @generated
	 * @ordered
	 */
	protected static final int GRIPPER_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGripperX() <em>Gripper X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperX()
	 * @generated
	 * @ordered
	 */
	protected int gripperX = GRIPPER_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getGripperY() <em>Gripper Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperY()
	 * @generated
	 * @ordered
	 */
	protected static final int GRIPPER_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGripperY() <em>Gripper Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperY()
	 * @generated
	 * @ordered
	 */
	protected int gripperY = GRIPPER_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getGripperZ() <em>Gripper Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperZ()
	 * @generated
	 * @ordered
	 */
	protected static final int GRIPPER_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGripperZ() <em>Gripper Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGripperZ()
	 * @generated
	 * @ordered
	 */
	protected int gripperZ = GRIPPER_Z_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final int DISTANCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected int distance = DISTANCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineRight() <em>Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRight()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_RIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineRight() <em>Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineRight()
	 * @generated
	 * @ordered
	 */
	protected int lineRight = LINE_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineMiddle() <em>Line Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineMiddle()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_MIDDLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineMiddle() <em>Line Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineMiddle()
	 * @generated
	 * @ordered
	 */
	protected int lineMiddle = LINE_MIDDLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLineLeft() <em>Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLeft()
	 * @generated
	 * @ordered
	 */
	protected static final int LINE_LEFT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLineLeft() <em>Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineLeft()
	 * @generated
	 * @ordered
	 */
	protected int lineLeft = LINE_LEFT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgvImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgvPackage.Literals.AGV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUser() {
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUser(String newUser) {
		String oldUser = user;
		user = newUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__USER, oldUser, user));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIp(String newIp) {
		String oldIp = ip;
		ip = newIp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__IP, oldIp, ip));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConnectionState() {
		return connectionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionState(boolean newConnectionState) {
		boolean oldConnectionState = connectionState;
		connectionState = newConnectionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__CONNECTION_STATE, oldConnectionState, connectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseX() {
		return poseX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseX(int newPoseX) {
		int oldPoseX = poseX;
		poseX = newPoseX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__POSE_X, oldPoseX, poseX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseY() {
		return poseY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseY(int newPoseY) {
		int oldPoseY = poseY;
		poseY = newPoseY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__POSE_Y, oldPoseY, poseY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseAngular() {
		return poseAngular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseAngular(int newPoseAngular) {
		int oldPoseAngular = poseAngular;
		poseAngular = newPoseAngular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__POSE_ANGULAR, oldPoseAngular, poseAngular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeedLinear() {
		return speedLinear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedLinear(int newSpeedLinear) {
		int oldSpeedLinear = speedLinear;
		speedLinear = newSpeedLinear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__SPEED_LINEAR, oldSpeedLinear, speedLinear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSpeedAngular() {
		return speedAngular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedAngular(int newSpeedAngular) {
		int oldSpeedAngular = speedAngular;
		speedAngular = newSpeedAngular;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__SPEED_ANGULAR, oldSpeedAngular, speedAngular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isGripperState() {
		return gripperState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGripperState(boolean newGripperState) {
		boolean oldGripperState = gripperState;
		gripperState = newGripperState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__GRIPPER_STATE, oldGripperState, gripperState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGripperX() {
		return gripperX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGripperX(int newGripperX) {
		int oldGripperX = gripperX;
		gripperX = newGripperX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__GRIPPER_X, oldGripperX, gripperX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGripperY() {
		return gripperY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGripperY(int newGripperY) {
		int oldGripperY = gripperY;
		gripperY = newGripperY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__GRIPPER_Y, oldGripperY, gripperY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGripperZ() {
		return gripperZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGripperZ(int newGripperZ) {
		int oldGripperZ = gripperZ;
		gripperZ = newGripperZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__GRIPPER_Z, oldGripperZ, gripperZ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDistance(int newDistance) {
		int oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineRight() {
		return lineRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineRight(int newLineRight) {
		int oldLineRight = lineRight;
		lineRight = newLineRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__LINE_RIGHT, oldLineRight, lineRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineMiddle() {
		return lineMiddle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineMiddle(int newLineMiddle) {
		int oldLineMiddle = lineMiddle;
		lineMiddle = newLineMiddle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__LINE_MIDDLE, oldLineMiddle, lineMiddle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLineLeft() {
		return lineLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineLeft(int newLineLeft) {
		int oldLineLeft = lineLeft;
		lineLeft = newLineLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgvPackage.AGV__LINE_LEFT, oldLineLeft, lineLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!connect()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnect() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!disconnect()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get_distance() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!get_distance()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void get_line_sensors() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!get_line_sensors()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void forward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!forward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void backward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!backward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void right() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void left() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void right_up() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right_up()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void right_bottom() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right_bottom()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void left_up() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left_up()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void left_bottom() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left_bottom()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turn_left() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_left()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turn_right() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_right()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turn_around() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_around()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void open_gripper() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!open_gripper()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void close_gripper() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!close_gripper()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void go_to_position() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!go_to_position()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_gripper_position() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!set_gripper_position()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgvPackage.AGV__USER:
				return getUser();
			case AgvPackage.AGV__IP:
				return getIp();
			case AgvPackage.AGV__PORT:
				return getPort();
			case AgvPackage.AGV__CONNECTION_STATE:
				return isConnectionState();
			case AgvPackage.AGV__POSE_X:
				return getPoseX();
			case AgvPackage.AGV__POSE_Y:
				return getPoseY();
			case AgvPackage.AGV__POSE_ANGULAR:
				return getPoseAngular();
			case AgvPackage.AGV__SPEED_LINEAR:
				return getSpeedLinear();
			case AgvPackage.AGV__SPEED_ANGULAR:
				return getSpeedAngular();
			case AgvPackage.AGV__GRIPPER_STATE:
				return isGripperState();
			case AgvPackage.AGV__GRIPPER_X:
				return getGripperX();
			case AgvPackage.AGV__GRIPPER_Y:
				return getGripperY();
			case AgvPackage.AGV__GRIPPER_Z:
				return getGripperZ();
			case AgvPackage.AGV__DISTANCE:
				return getDistance();
			case AgvPackage.AGV__LINE_RIGHT:
				return getLineRight();
			case AgvPackage.AGV__LINE_MIDDLE:
				return getLineMiddle();
			case AgvPackage.AGV__LINE_LEFT:
				return getLineLeft();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AgvPackage.AGV__USER:
				setUser((String)newValue);
				return;
			case AgvPackage.AGV__IP:
				setIp((String)newValue);
				return;
			case AgvPackage.AGV__PORT:
				setPort((Integer)newValue);
				return;
			case AgvPackage.AGV__CONNECTION_STATE:
				setConnectionState((Boolean)newValue);
				return;
			case AgvPackage.AGV__POSE_X:
				setPoseX((Integer)newValue);
				return;
			case AgvPackage.AGV__POSE_Y:
				setPoseY((Integer)newValue);
				return;
			case AgvPackage.AGV__POSE_ANGULAR:
				setPoseAngular((Integer)newValue);
				return;
			case AgvPackage.AGV__SPEED_LINEAR:
				setSpeedLinear((Integer)newValue);
				return;
			case AgvPackage.AGV__SPEED_ANGULAR:
				setSpeedAngular((Integer)newValue);
				return;
			case AgvPackage.AGV__GRIPPER_STATE:
				setGripperState((Boolean)newValue);
				return;
			case AgvPackage.AGV__GRIPPER_X:
				setGripperX((Integer)newValue);
				return;
			case AgvPackage.AGV__GRIPPER_Y:
				setGripperY((Integer)newValue);
				return;
			case AgvPackage.AGV__GRIPPER_Z:
				setGripperZ((Integer)newValue);
				return;
			case AgvPackage.AGV__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case AgvPackage.AGV__LINE_RIGHT:
				setLineRight((Integer)newValue);
				return;
			case AgvPackage.AGV__LINE_MIDDLE:
				setLineMiddle((Integer)newValue);
				return;
			case AgvPackage.AGV__LINE_LEFT:
				setLineLeft((Integer)newValue);
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
			case AgvPackage.AGV__USER:
				setUser(USER_EDEFAULT);
				return;
			case AgvPackage.AGV__IP:
				setIp(IP_EDEFAULT);
				return;
			case AgvPackage.AGV__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AgvPackage.AGV__CONNECTION_STATE:
				setConnectionState(CONNECTION_STATE_EDEFAULT);
				return;
			case AgvPackage.AGV__POSE_X:
				setPoseX(POSE_X_EDEFAULT);
				return;
			case AgvPackage.AGV__POSE_Y:
				setPoseY(POSE_Y_EDEFAULT);
				return;
			case AgvPackage.AGV__POSE_ANGULAR:
				setPoseAngular(POSE_ANGULAR_EDEFAULT);
				return;
			case AgvPackage.AGV__SPEED_LINEAR:
				setSpeedLinear(SPEED_LINEAR_EDEFAULT);
				return;
			case AgvPackage.AGV__SPEED_ANGULAR:
				setSpeedAngular(SPEED_ANGULAR_EDEFAULT);
				return;
			case AgvPackage.AGV__GRIPPER_STATE:
				setGripperState(GRIPPER_STATE_EDEFAULT);
				return;
			case AgvPackage.AGV__GRIPPER_X:
				setGripperX(GRIPPER_X_EDEFAULT);
				return;
			case AgvPackage.AGV__GRIPPER_Y:
				setGripperY(GRIPPER_Y_EDEFAULT);
				return;
			case AgvPackage.AGV__GRIPPER_Z:
				setGripperZ(GRIPPER_Z_EDEFAULT);
				return;
			case AgvPackage.AGV__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case AgvPackage.AGV__LINE_RIGHT:
				setLineRight(LINE_RIGHT_EDEFAULT);
				return;
			case AgvPackage.AGV__LINE_MIDDLE:
				setLineMiddle(LINE_MIDDLE_EDEFAULT);
				return;
			case AgvPackage.AGV__LINE_LEFT:
				setLineLeft(LINE_LEFT_EDEFAULT);
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
			case AgvPackage.AGV__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case AgvPackage.AGV__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case AgvPackage.AGV__PORT:
				return port != PORT_EDEFAULT;
			case AgvPackage.AGV__CONNECTION_STATE:
				return connectionState != CONNECTION_STATE_EDEFAULT;
			case AgvPackage.AGV__POSE_X:
				return poseX != POSE_X_EDEFAULT;
			case AgvPackage.AGV__POSE_Y:
				return poseY != POSE_Y_EDEFAULT;
			case AgvPackage.AGV__POSE_ANGULAR:
				return poseAngular != POSE_ANGULAR_EDEFAULT;
			case AgvPackage.AGV__SPEED_LINEAR:
				return speedLinear != SPEED_LINEAR_EDEFAULT;
			case AgvPackage.AGV__SPEED_ANGULAR:
				return speedAngular != SPEED_ANGULAR_EDEFAULT;
			case AgvPackage.AGV__GRIPPER_STATE:
				return gripperState != GRIPPER_STATE_EDEFAULT;
			case AgvPackage.AGV__GRIPPER_X:
				return gripperX != GRIPPER_X_EDEFAULT;
			case AgvPackage.AGV__GRIPPER_Y:
				return gripperY != GRIPPER_Y_EDEFAULT;
			case AgvPackage.AGV__GRIPPER_Z:
				return gripperZ != GRIPPER_Z_EDEFAULT;
			case AgvPackage.AGV__DISTANCE:
				return distance != DISTANCE_EDEFAULT;
			case AgvPackage.AGV__LINE_RIGHT:
				return lineRight != LINE_RIGHT_EDEFAULT;
			case AgvPackage.AGV__LINE_MIDDLE:
				return lineMiddle != LINE_MIDDLE_EDEFAULT;
			case AgvPackage.AGV__LINE_LEFT:
				return lineLeft != LINE_LEFT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case AgvPackage.AGV___CONNECT:
				connect();
				return null;
			case AgvPackage.AGV___DISCONNECT:
				disconnect();
				return null;
			case AgvPackage.AGV___GET_DISTANCE:
				get_distance();
				return null;
			case AgvPackage.AGV___GET_LINE_SENSORS:
				get_line_sensors();
				return null;
			case AgvPackage.AGV___FORWARD:
				forward();
				return null;
			case AgvPackage.AGV___BACKWARD:
				backward();
				return null;
			case AgvPackage.AGV___RIGHT:
				right();
				return null;
			case AgvPackage.AGV___LEFT:
				left();
				return null;
			case AgvPackage.AGV___RIGHT_UP:
				right_up();
				return null;
			case AgvPackage.AGV___RIGHT_BOTTOM:
				right_bottom();
				return null;
			case AgvPackage.AGV___LEFT_UP:
				left_up();
				return null;
			case AgvPackage.AGV___LEFT_BOTTOM:
				left_bottom();
				return null;
			case AgvPackage.AGV___TURN_LEFT:
				turn_left();
				return null;
			case AgvPackage.AGV___TURN_RIGHT:
				turn_right();
				return null;
			case AgvPackage.AGV___TURN_AROUND:
				turn_around();
				return null;
			case AgvPackage.AGV___STOP:
				stop();
				return null;
			case AgvPackage.AGV___OPEN_GRIPPER:
				open_gripper();
				return null;
			case AgvPackage.AGV___CLOSE_GRIPPER:
				close_gripper();
				return null;
			case AgvPackage.AGV___GO_TO_POSITION:
				go_to_position();
				return null;
			case AgvPackage.AGV___SET_GRIPPER_POSITION:
				set_gripper_position();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (user: ");
		result.append(user);
		result.append(", ip: ");
		result.append(ip);
		result.append(", port: ");
		result.append(port);
		result.append(", connectionState: ");
		result.append(connectionState);
		result.append(", poseX: ");
		result.append(poseX);
		result.append(", poseY: ");
		result.append(poseY);
		result.append(", poseAngular: ");
		result.append(poseAngular);
		result.append(", speedLinear: ");
		result.append(speedLinear);
		result.append(", speedAngular: ");
		result.append(speedAngular);
		result.append(", gripperState: ");
		result.append(gripperState);
		result.append(", gripperX: ");
		result.append(gripperX);
		result.append(", gripperY: ");
		result.append(gripperY);
		result.append(", gripperZ: ");
		result.append(gripperZ);
		result.append(", distance: ");
		result.append(distance);
		result.append(", lineRight: ");
		result.append(lineRight);
		result.append(", lineMiddle: ");
		result.append(lineMiddle);
		result.append(", lineLeft: ");
		result.append(lineLeft);
		result.append(')');
		return result.toString();
	}

} //AgvImpl
