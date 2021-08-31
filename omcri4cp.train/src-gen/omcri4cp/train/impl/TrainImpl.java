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
package omcri4cp.train.impl;

import java.lang.reflect.InvocationTargetException;

import omcri4cp.train.Train;
import omcri4cp.train.TrainPackage;

import org.eclipse.cmf.occi.core.impl.ResourceImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Train</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#isLightState <em>Light State</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#isHonkState <em>Honk State</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#isWagonNoise <em>Wagon Noise</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getTrainName <em>Train Name</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#isTrainNoise <em>Train Noise</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getTrainNumber <em>Train Number</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.train.impl.TrainImpl#getTrainSpeed <em>Train Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrainImpl extends ResourceImpl implements Train {
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
	 * The default value of the '{@link #isLightState() <em>Light State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLightState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LIGHT_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLightState() <em>Light State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLightState()
	 * @generated
	 * @ordered
	 */
	protected boolean lightState = LIGHT_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isHonkState() <em>Honk State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonkState()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HONK_STATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHonkState() <em>Honk State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHonkState()
	 * @generated
	 * @ordered
	 */
	protected boolean honkState = HONK_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isWagonNoise() <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWagonNoise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WAGON_NOISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWagonNoise() <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWagonNoise()
	 * @generated
	 * @ordered
	 */
	protected boolean wagonNoise = WAGON_NOISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainName() <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainName()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_NAME_EDEFAULT = "DCC0";

	/**
	 * The cached value of the '{@link #getTrainName() <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainName()
	 * @generated
	 * @ordered
	 */
	protected String trainName = TRAIN_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isTrainNoise() <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainNoise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRAIN_NOISE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTrainNoise() <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTrainNoise()
	 * @generated
	 * @ordered
	 */
	protected boolean trainNoise = TRAIN_NOISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainNumber() <em>Train Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String TRAIN_NUMBER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTrainNumber() <em>Train Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNumber()
	 * @generated
	 * @ordered
	 */
	protected String trainNumber = TRAIN_NUMBER_EDEFAULT;

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
	 * The default value of the '{@link #getTrainSpeed() <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final int TRAIN_SPEED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTrainSpeed() <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainSpeed()
	 * @generated
	 * @ordered
	 */
	protected int trainSpeed = TRAIN_SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrainPackage.Literals.TRAIN;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__USER, oldUser, user));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__IP, oldIp, ip));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLightState() {
		return lightState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLightState(boolean newLightState) {
		boolean oldLightState = lightState;
		lightState = newLightState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__LIGHT_STATE, oldLightState, lightState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHonkState() {
		return honkState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHonkState(boolean newHonkState) {
		boolean oldHonkState = honkState;
		honkState = newHonkState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__HONK_STATE, oldHonkState, honkState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWagonNoise() {
		return wagonNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWagonNoise(boolean newWagonNoise) {
		boolean oldWagonNoise = wagonNoise;
		wagonNoise = newWagonNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__WAGON_NOISE, oldWagonNoise, wagonNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainName(String newTrainName) {
		String oldTrainName = trainName;
		trainName = newTrainName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__TRAIN_NAME, oldTrainName, trainName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTrainNoise() {
		return trainNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainNoise(boolean newTrainNoise) {
		boolean oldTrainNoise = trainNoise;
		trainNoise = newTrainNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__TRAIN_NOISE, oldTrainNoise, trainNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTrainNumber() {
		return trainNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainNumber(String newTrainNumber) {
		String oldTrainNumber = trainNumber;
		trainNumber = newTrainNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__TRAIN_NUMBER, oldTrainNumber, trainNumber));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__CONNECTION_STATE, oldConnectionState, connectionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTrainSpeed() {
		return trainSpeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainSpeed(int newTrainSpeed) {
		int oldTrainSpeed = trainSpeed;
		trainSpeed = newTrainSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.TRAIN__TRAIN_SPEED, oldTrainSpeed, trainSpeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void faster() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!faster()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void slower() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!slower()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void reverse() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!reverse()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setspeed() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!setspeed()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void stop() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!stop()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_honk() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_honk()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_wagon_noise() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_wagon_noise()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_train_noise() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_train_noise()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_light() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_light()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void connect() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!connect()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void disconnect() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!disconnect()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrainPackage.TRAIN__USER:
				return getUser();
			case TrainPackage.TRAIN__IP:
				return getIp();
			case TrainPackage.TRAIN__PORT:
				return getPort();
			case TrainPackage.TRAIN__LIGHT_STATE:
				return isLightState();
			case TrainPackage.TRAIN__HONK_STATE:
				return isHonkState();
			case TrainPackage.TRAIN__WAGON_NOISE:
				return isWagonNoise();
			case TrainPackage.TRAIN__TRAIN_NAME:
				return getTrainName();
			case TrainPackage.TRAIN__TRAIN_NOISE:
				return isTrainNoise();
			case TrainPackage.TRAIN__TRAIN_NUMBER:
				return getTrainNumber();
			case TrainPackage.TRAIN__CONNECTION_STATE:
				return isConnectionState();
			case TrainPackage.TRAIN__TRAIN_SPEED:
				return getTrainSpeed();
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
			case TrainPackage.TRAIN__USER:
				setUser((String)newValue);
				return;
			case TrainPackage.TRAIN__IP:
				setIp((String)newValue);
				return;
			case TrainPackage.TRAIN__PORT:
				setPort((Integer)newValue);
				return;
			case TrainPackage.TRAIN__LIGHT_STATE:
				setLightState((Boolean)newValue);
				return;
			case TrainPackage.TRAIN__HONK_STATE:
				setHonkState((Boolean)newValue);
				return;
			case TrainPackage.TRAIN__WAGON_NOISE:
				setWagonNoise((Boolean)newValue);
				return;
			case TrainPackage.TRAIN__TRAIN_NAME:
				setTrainName((String)newValue);
				return;
			case TrainPackage.TRAIN__TRAIN_NOISE:
				setTrainNoise((Boolean)newValue);
				return;
			case TrainPackage.TRAIN__TRAIN_NUMBER:
				setTrainNumber((String)newValue);
				return;
			case TrainPackage.TRAIN__CONNECTION_STATE:
				setConnectionState((Boolean)newValue);
				return;
			case TrainPackage.TRAIN__TRAIN_SPEED:
				setTrainSpeed((Integer)newValue);
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
			case TrainPackage.TRAIN__USER:
				setUser(USER_EDEFAULT);
				return;
			case TrainPackage.TRAIN__IP:
				setIp(IP_EDEFAULT);
				return;
			case TrainPackage.TRAIN__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case TrainPackage.TRAIN__LIGHT_STATE:
				setLightState(LIGHT_STATE_EDEFAULT);
				return;
			case TrainPackage.TRAIN__HONK_STATE:
				setHonkState(HONK_STATE_EDEFAULT);
				return;
			case TrainPackage.TRAIN__WAGON_NOISE:
				setWagonNoise(WAGON_NOISE_EDEFAULT);
				return;
			case TrainPackage.TRAIN__TRAIN_NAME:
				setTrainName(TRAIN_NAME_EDEFAULT);
				return;
			case TrainPackage.TRAIN__TRAIN_NOISE:
				setTrainNoise(TRAIN_NOISE_EDEFAULT);
				return;
			case TrainPackage.TRAIN__TRAIN_NUMBER:
				setTrainNumber(TRAIN_NUMBER_EDEFAULT);
				return;
			case TrainPackage.TRAIN__CONNECTION_STATE:
				setConnectionState(CONNECTION_STATE_EDEFAULT);
				return;
			case TrainPackage.TRAIN__TRAIN_SPEED:
				setTrainSpeed(TRAIN_SPEED_EDEFAULT);
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
			case TrainPackage.TRAIN__USER:
				return USER_EDEFAULT == null ? user != null : !USER_EDEFAULT.equals(user);
			case TrainPackage.TRAIN__IP:
				return IP_EDEFAULT == null ? ip != null : !IP_EDEFAULT.equals(ip);
			case TrainPackage.TRAIN__PORT:
				return port != PORT_EDEFAULT;
			case TrainPackage.TRAIN__LIGHT_STATE:
				return lightState != LIGHT_STATE_EDEFAULT;
			case TrainPackage.TRAIN__HONK_STATE:
				return honkState != HONK_STATE_EDEFAULT;
			case TrainPackage.TRAIN__WAGON_NOISE:
				return wagonNoise != WAGON_NOISE_EDEFAULT;
			case TrainPackage.TRAIN__TRAIN_NAME:
				return TRAIN_NAME_EDEFAULT == null ? trainName != null : !TRAIN_NAME_EDEFAULT.equals(trainName);
			case TrainPackage.TRAIN__TRAIN_NOISE:
				return trainNoise != TRAIN_NOISE_EDEFAULT;
			case TrainPackage.TRAIN__TRAIN_NUMBER:
				return TRAIN_NUMBER_EDEFAULT == null ? trainNumber != null : !TRAIN_NUMBER_EDEFAULT.equals(trainNumber);
			case TrainPackage.TRAIN__CONNECTION_STATE:
				return connectionState != CONNECTION_STATE_EDEFAULT;
			case TrainPackage.TRAIN__TRAIN_SPEED:
				return trainSpeed != TRAIN_SPEED_EDEFAULT;
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
			case TrainPackage.TRAIN___FASTER:
				faster();
				return null;
			case TrainPackage.TRAIN___SLOWER:
				slower();
				return null;
			case TrainPackage.TRAIN___REVERSE:
				reverse();
				return null;
			case TrainPackage.TRAIN___SETSPEED:
				setspeed();
				return null;
			case TrainPackage.TRAIN___STOP:
				stop();
				return null;
			case TrainPackage.TRAIN___SET_HONK:
				set_honk();
				return null;
			case TrainPackage.TRAIN___SET_WAGON_NOISE:
				set_wagon_noise();
				return null;
			case TrainPackage.TRAIN___SET_TRAIN_NOISE:
				set_train_noise();
				return null;
			case TrainPackage.TRAIN___SET_LIGHT:
				set_light();
				return null;
			case TrainPackage.TRAIN___CONNECT:
				connect();
				return null;
			case TrainPackage.TRAIN___DISCONNECT:
				disconnect();
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
		result.append(", lightState: ");
		result.append(lightState);
		result.append(", honkState: ");
		result.append(honkState);
		result.append(", wagonNoise: ");
		result.append(wagonNoise);
		result.append(", trainName: ");
		result.append(trainName);
		result.append(", trainNoise: ");
		result.append(trainNoise);
		result.append(", trainNumber: ");
		result.append(trainNumber);
		result.append(", connectionState: ");
		result.append(connectionState);
		result.append(", trainSpeed: ");
		result.append(trainSpeed);
		result.append(')');
		return result.toString();
	}

} //TrainImpl
