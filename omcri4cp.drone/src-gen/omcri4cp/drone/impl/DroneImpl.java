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

import java.lang.reflect.InvocationTargetException;

import omcri4cp.drone.Drone;
import omcri4cp.drone.DronePackage;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getDroneMode <em>Drone Mode</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getDroneBattery <em>Drone Battery</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getPoseLinearX <em>Pose Linear X</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getPoseLinearY <em>Pose Linear Y</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getPoseLinearZ <em>Pose Linear Z</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getPoseAngular <em>Pose Angular</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getSpeedLinear <em>Speed Linear</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getSpeedAngular <em>Speed Angular</em>}</li>
 *   <li>{@link omcri4cp.drone.impl.DroneImpl#getDroneId <em>Drone Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DroneImpl extends ResourceImpl implements Drone {
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
	 * The default value of the '{@link #getDroneMode() <em>Drone Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneMode()
	 * @generated
	 * @ordered
	 */
	protected static final String DRONE_MODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDroneMode() <em>Drone Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneMode()
	 * @generated
	 * @ordered
	 */
	protected String droneMode = DRONE_MODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDroneBattery() <em>Drone Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneBattery()
	 * @generated
	 * @ordered
	 */
	protected static final String DRONE_BATTERY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDroneBattery() <em>Drone Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneBattery()
	 * @generated
	 * @ordered
	 */
	protected String droneBattery = DRONE_BATTERY_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseLinearX() <em>Pose Linear X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearX()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_LINEAR_X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseLinearX() <em>Pose Linear X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearX()
	 * @generated
	 * @ordered
	 */
	protected int poseLinearX = POSE_LINEAR_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseLinearY() <em>Pose Linear Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearY()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_LINEAR_Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseLinearY() <em>Pose Linear Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearY()
	 * @generated
	 * @ordered
	 */
	protected int poseLinearY = POSE_LINEAR_Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoseLinearZ() <em>Pose Linear Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearZ()
	 * @generated
	 * @ordered
	 */
	protected static final int POSE_LINEAR_Z_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoseLinearZ() <em>Pose Linear Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseLinearZ()
	 * @generated
	 * @ordered
	 */
	protected int poseLinearZ = POSE_LINEAR_Z_EDEFAULT;

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
	 * The default value of the '{@link #getDroneId() <em>Drone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneId()
	 * @generated
	 * @ordered
	 */
	protected static final String DRONE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDroneId() <em>Drone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDroneId()
	 * @generated
	 * @ordered
	 */
	protected String droneId = DRONE_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DroneImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DronePackage.Literals.DRONE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__PORT, oldPort, port));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__CONNECTION_STATE, oldConnectionState, connectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDroneMode() {
		return droneMode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroneMode(String newDroneMode) {
		String oldDroneMode = droneMode;
		droneMode = newDroneMode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__DRONE_MODE, oldDroneMode, droneMode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDroneBattery() {
		return droneBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroneBattery(String newDroneBattery) {
		String oldDroneBattery = droneBattery;
		droneBattery = newDroneBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__DRONE_BATTERY, oldDroneBattery, droneBattery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseLinearX() {
		return poseLinearX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseLinearX(int newPoseLinearX) {
		int oldPoseLinearX = poseLinearX;
		poseLinearX = newPoseLinearX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__POSE_LINEAR_X, oldPoseLinearX, poseLinearX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseLinearY() {
		return poseLinearY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseLinearY(int newPoseLinearY) {
		int oldPoseLinearY = poseLinearY;
		poseLinearY = newPoseLinearY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__POSE_LINEAR_Y, oldPoseLinearY, poseLinearY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoseLinearZ() {
		return poseLinearZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoseLinearZ(int newPoseLinearZ) {
		int oldPoseLinearZ = poseLinearZ;
		poseLinearZ = newPoseLinearZ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__POSE_LINEAR_Z, oldPoseLinearZ, poseLinearZ));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__POSE_ANGULAR, oldPoseAngular, poseAngular));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__SPEED_LINEAR, oldSpeedLinear, speedLinear));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__SPEED_ANGULAR, oldSpeedAngular, speedAngular));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDroneId() {
		return droneId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDroneId(String newDroneId) {
		String oldDroneId = droneId;
		droneId = newDroneId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DronePackage.DRONE__DRONE_ID, oldDroneId, droneId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void forward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!forward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void backward() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!backward()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void left() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!left()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void right() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!right()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void up() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!up()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void down() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!down()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_speed() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!set_speed()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void go_to_position() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!go_to_position()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turn_left() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!turn_left()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void turn_right() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!turn_right()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void change_mode() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!change_mode()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void arm() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!arm()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disarm() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!disarm()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DronePackage.DRONE__USER:
				return getUser();
			case DronePackage.DRONE__IP:
				return getIp();
			case DronePackage.DRONE__PORT:
				return getPort();
			case DronePackage.DRONE__CONNECTION_STATE:
				return isConnectionState();
			case DronePackage.DRONE__DRONE_MODE:
				return getDroneMode();
			case DronePackage.DRONE__DRONE_BATTERY:
				return getDroneBattery();
			case DronePackage.DRONE__POSE_LINEAR_X:
				return getPoseLinearX();
			case DronePackage.DRONE__POSE_LINEAR_Y:
				return getPoseLinearY();
			case DronePackage.DRONE__POSE_LINEAR_Z:
				return getPoseLinearZ();
			case DronePackage.DRONE__POSE_ANGULAR:
				return getPoseAngular();
			case DronePackage.DRONE__SPEED_LINEAR:
				return getSpeedLinear();
			case DronePackage.DRONE__SPEED_ANGULAR:
				return getSpeedAngular();
			case DronePackage.DRONE__DRONE_ID:
				return getDroneId();
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
			case DronePackage.DRONE__USER:
				setUser((String)newValue);
				return;
			case DronePackage.DRONE__IP:
				setIp((String)newValue);
				return;
			case DronePackage.DRONE__PORT:
				setPort((Integer)newValue);
				return;
			case DronePackage.DRONE__CONNECTION_STATE:
				setConnectionState((Boolean)newValue);
				return;
			case DronePackage.DRONE__DRONE_MODE:
				setDroneMode((String)newValue);
				return;
			case DronePackage.DRONE__DRONE_BATTERY:
				setDroneBattery((String)newValue);
				return;
			case DronePackage.DRONE__POSE_LINEAR_X:
				setPoseLinearX((Integer)newValue);
				return;
			case DronePackage.DRONE__POSE_LINEAR_Y:
				setPoseLinearY((Integer)newValue);
				return;
			case DronePackage.DRONE__POSE_LINEAR_Z:
				setPoseLinearZ((Integer)newValue);
				return;
			case DronePackage.DRONE__POSE_ANGULAR:
				setPoseAngular((Integer)newValue);
				return;
			case DronePackage.DRONE__SPEED_LINEAR:
				setSpeedLinear((Integer)newValue);
				return;
			case DronePackage.DRONE__SPEED_ANGULAR:
				setSpeedAngular((Integer)newValue);
				return;
			case DronePackage.DRONE__DRONE_ID:
				setDroneId((String)newValue);
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
			case DronePackage.DRONE__USER:
				setUser(USER_EDEFAULT);
				return;
			case DronePackage.DRONE__IP:
				setIp(IP_EDEFAULT);
				return;
			case DronePackage.DRONE__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case DronePackage.DRONE__CONNECTION_STATE:
				setConnectionState(CONNECTION_STATE_EDEFAULT);
				return;
			case DronePackage.DRONE__DRONE_MODE:
				setDroneMode(DRONE_MODE_EDEFAULT);
				return;
			case DronePackage.DRONE__DRONE_BATTERY:
				setDroneBattery(DRONE_BATTERY_EDEFAULT);
				return;
			case DronePackage.DRONE__POSE_LINEAR_X:
				setPoseLinearX(POSE_LINEAR_X_EDEFAULT);
				return;
			case DronePackage.DRONE__POSE_LINEAR_Y:
				setPoseLinearY(POSE_LINEAR_Y_EDEFAULT);
				return;
			case DronePackage.DRONE__POSE_LINEAR_Z:
				setPoseLinearZ(POSE_LINEAR_Z_EDEFAULT);
				return;
			case DronePackage.DRONE__POSE_ANGULAR:
				setPoseAngular(POSE_ANGULAR_EDEFAULT);
				return;
			case DronePackage.DRONE__SPEED_LINEAR:
				setSpeedLinear(SPEED_LINEAR_EDEFAULT);
				return;
			case DronePackage.DRONE__SPEED_ANGULAR:
				setSpeedAngular(SPEED_ANGULAR_EDEFAULT);
				return;
			case DronePackage.DRONE__DRONE_ID:
				setDroneId(DRONE_ID_EDEFAULT);
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
			case DronePackage.DRONE__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case DronePackage.DRONE__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case DronePackage.DRONE__PORT:
				return port != PORT_EDEFAULT;
			case DronePackage.DRONE__CONNECTION_STATE:
				return connectionState != CONNECTION_STATE_EDEFAULT;
			case DronePackage.DRONE__DRONE_MODE:
				return DRONE_MODE_EDEFAULT == null ? droneMode != null : !DRONE_MODE_EDEFAULT.equals(droneMode);
			case DronePackage.DRONE__DRONE_BATTERY:
				return DRONE_BATTERY_EDEFAULT == null ? droneBattery != null : !DRONE_BATTERY_EDEFAULT.equals(droneBattery);
			case DronePackage.DRONE__POSE_LINEAR_X:
				return poseLinearX != POSE_LINEAR_X_EDEFAULT;
			case DronePackage.DRONE__POSE_LINEAR_Y:
				return poseLinearY != POSE_LINEAR_Y_EDEFAULT;
			case DronePackage.DRONE__POSE_LINEAR_Z:
				return poseLinearZ != POSE_LINEAR_Z_EDEFAULT;
			case DronePackage.DRONE__POSE_ANGULAR:
				return poseAngular != POSE_ANGULAR_EDEFAULT;
			case DronePackage.DRONE__SPEED_LINEAR:
				return speedLinear != SPEED_LINEAR_EDEFAULT;
			case DronePackage.DRONE__SPEED_ANGULAR:
				return speedAngular != SPEED_ANGULAR_EDEFAULT;
			case DronePackage.DRONE__DRONE_ID:
				return DRONE_ID_EDEFAULT == null ? droneId != null : !DRONE_ID_EDEFAULT.equals(droneId);
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
			case DronePackage.DRONE___FORWARD:
				forward();
				return null;
			case DronePackage.DRONE___BACKWARD:
				backward();
				return null;
			case DronePackage.DRONE___LEFT:
				left();
				return null;
			case DronePackage.DRONE___RIGHT:
				right();
				return null;
			case DronePackage.DRONE___UP:
				up();
				return null;
			case DronePackage.DRONE___DOWN:
				down();
				return null;
			case DronePackage.DRONE___SET_SPEED:
				set_speed();
				return null;
			case DronePackage.DRONE___STOP:
				stop();
				return null;
			case DronePackage.DRONE___GO_TO_POSITION:
				go_to_position();
				return null;
			case DronePackage.DRONE___TURN_LEFT:
				turn_left();
				return null;
			case DronePackage.DRONE___TURN_RIGHT:
				turn_right();
				return null;
			case DronePackage.DRONE___CHANGE_MODE:
				change_mode();
				return null;
			case DronePackage.DRONE___ARM:
				arm();
				return null;
			case DronePackage.DRONE___DISARM:
				disarm();
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
		result.append(", droneMode: ");
		result.append(droneMode);
		result.append(", droneBattery: ");
		result.append(droneBattery);
		result.append(", poseLinearX: ");
		result.append(poseLinearX);
		result.append(", poseLinearY: ");
		result.append(poseLinearY);
		result.append(", poseLinearZ: ");
		result.append(poseLinearZ);
		result.append(", poseAngular: ");
		result.append(poseAngular);
		result.append(", speedLinear: ");
		result.append(speedLinear);
		result.append(", speedAngular: ");
		result.append(speedAngular);
		result.append(", droneId: ");
		result.append(droneId);
		result.append(')');
		return result.toString();
	}

} //DroneImpl
