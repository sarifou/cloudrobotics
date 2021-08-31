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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.drone.Drone#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getDroneMode <em>Drone Mode</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getDroneBattery <em>Drone Battery</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getPoseLinearX <em>Pose Linear X</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getPoseLinearY <em>Pose Linear Y</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getPoseLinearZ <em>Pose Linear Z</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getPoseAngular <em>Pose Angular</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getSpeedLinear <em>Speed Linear</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getSpeedAngular <em>Speed Angular</em>}</li>
 *   <li>{@link omcri4cp.drone.Drone#getDroneId <em>Drone Id</em>}</li>
 * </ul>
 *
 * @see omcri4cp.drone.DronePackage#getDrone()
 * @model
 * @generated
 */
public interface Drone extends Resource {
	/**
	 * Returns the value of the '<em><b>User</b></em>' attribute.
	 * The default value is <code>"root"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>User</em>' attribute.
	 * @see #setUser(String)
	 * @see omcri4cp.drone.DronePackage#getDrone_User()
	 * @model default="root" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getUser <em>User</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' attribute.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(String value);

	/**
	 * Returns the value of the '<em><b>Ip</b></em>' attribute.
	 * The default value is <code>"127.0.0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ip</em>' attribute.
	 * @see #setIp(String)
	 * @see omcri4cp.drone.DronePackage#getDrone_Ip()
	 * @model default="127.0.0.1" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!ip'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getIp <em>Ip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip</em>' attribute.
	 * @see #getIp()
	 * @generated
	 */
	void setIp(String value);

	/**
	 * Returns the value of the '<em><b>Port</b></em>' attribute.
	 * The default value is <code>"9090"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port</em>' attribute.
	 * @see #setPort(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_Port()
	 * @model default="9090" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection State</em>' attribute.
	 * @see #setConnectionState(boolean)
	 * @see omcri4cp.drone.DronePackage#getDrone_ConnectionState()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!connectionState'"
	 * @generated
	 */
	boolean isConnectionState();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#isConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection State</em>' attribute.
	 * @see #isConnectionState()
	 * @generated
	 */
	void setConnectionState(boolean value);

	/**
	 * Returns the value of the '<em><b>Drone Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drone Mode</em>' attribute.
	 * @see #setDroneMode(String)
	 * @see omcri4cp.drone.DronePackage#getDrone_DroneMode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!droneMode'"
	 * @generated
	 */
	String getDroneMode();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getDroneMode <em>Drone Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone Mode</em>' attribute.
	 * @see #getDroneMode()
	 * @generated
	 */
	void setDroneMode(String value);

	/**
	 * Returns the value of the '<em><b>Drone Battery</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drone Battery</em>' attribute.
	 * @see #setDroneBattery(String)
	 * @see omcri4cp.drone.DronePackage#getDrone_DroneBattery()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!droneBattery'"
	 * @generated
	 */
	String getDroneBattery();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getDroneBattery <em>Drone Battery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone Battery</em>' attribute.
	 * @see #getDroneBattery()
	 * @generated
	 */
	void setDroneBattery(String value);

	/**
	 * Returns the value of the '<em><b>Pose Linear X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Linear X</em>' attribute.
	 * @see #setPoseLinearX(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_PoseLinearX()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!poseLinearX'"
	 * @generated
	 */
	int getPoseLinearX();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getPoseLinearX <em>Pose Linear X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Linear X</em>' attribute.
	 * @see #getPoseLinearX()
	 * @generated
	 */
	void setPoseLinearX(int value);

	/**
	 * Returns the value of the '<em><b>Pose Linear Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Linear Y</em>' attribute.
	 * @see #setPoseLinearY(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_PoseLinearY()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!poseLinearY'"
	 * @generated
	 */
	int getPoseLinearY();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getPoseLinearY <em>Pose Linear Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Linear Y</em>' attribute.
	 * @see #getPoseLinearY()
	 * @generated
	 */
	void setPoseLinearY(int value);

	/**
	 * Returns the value of the '<em><b>Pose Linear Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Linear Z</em>' attribute.
	 * @see #setPoseLinearZ(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_PoseLinearZ()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!poseLinearZ'"
	 * @generated
	 */
	int getPoseLinearZ();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getPoseLinearZ <em>Pose Linear Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Linear Z</em>' attribute.
	 * @see #getPoseLinearZ()
	 * @generated
	 */
	void setPoseLinearZ(int value);

	/**
	 * Returns the value of the '<em><b>Pose Angular</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Angular</em>' attribute.
	 * @see #setPoseAngular(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_PoseAngular()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!poseAngular'"
	 * @generated
	 */
	int getPoseAngular();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getPoseAngular <em>Pose Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Angular</em>' attribute.
	 * @see #getPoseAngular()
	 * @generated
	 */
	void setPoseAngular(int value);

	/**
	 * Returns the value of the '<em><b>Speed Linear</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Linear</em>' attribute.
	 * @see #setSpeedLinear(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_SpeedLinear()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!speedLinear'"
	 * @generated
	 */
	int getSpeedLinear();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getSpeedLinear <em>Speed Linear</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Linear</em>' attribute.
	 * @see #getSpeedLinear()
	 * @generated
	 */
	void setSpeedLinear(int value);

	/**
	 * Returns the value of the '<em><b>Speed Angular</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed Angular</em>' attribute.
	 * @see #setSpeedAngular(int)
	 * @see omcri4cp.drone.DronePackage#getDrone_SpeedAngular()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!speedAngular'"
	 * @generated
	 */
	int getSpeedAngular();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getSpeedAngular <em>Speed Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Angular</em>' attribute.
	 * @see #getSpeedAngular()
	 * @generated
	 */
	void setSpeedAngular(int value);

	/**
	 * Returns the value of the '<em><b>Drone Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Drone Id</em>' attribute.
	 * @see #setDroneId(String)
	 * @see omcri4cp.drone.DronePackage#getDrone_DroneId()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!droneId'"
	 * @generated
	 */
	String getDroneId();

	/**
	 * Sets the value of the '{@link omcri4cp.drone.Drone#getDroneId <em>Drone Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Drone Id</em>' attribute.
	 * @see #getDroneId()
	 * @generated
	 */
	void setDroneId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!forward()'"
	 * @generated
	 */
	void forward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!backward()'"
	 * @generated
	 */
	void backward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!left()'"
	 * @generated
	 */
	void left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!right()'"
	 * @generated
	 */
	void right();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!up()'"
	 * @generated
	 */
	void up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!down()'"
	 * @generated
	 */
	void down();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!set_speed()'"
	 * @generated
	 */
	void set_speed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!stop()'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!go_to_position()'"
	 * @generated
	 */
	void go_to_position();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!turn_left()'"
	 * @generated
	 */
	void turn_left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!turn_right()'"
	 * @generated
	 */
	void turn_right();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!change_mode()'"
	 * @generated
	 */
	void change_mode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!arm()'"
	 * @generated
	 */
	void arm();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/drone/ecore!Drone!disarm()'"
	 * @generated
	 */
	void disarm();

} // Drone
