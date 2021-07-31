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

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agv</b></em>'.
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
 *   <li>{@link omcri4cp.agv.Agv#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getPoseX <em>Pose X</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getPoseY <em>Pose Y</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getPoseAngular <em>Pose Angular</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getSpeedLinear <em>Speed Linear</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getSpeedAngular <em>Speed Angular</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#isGripperState <em>Gripper State</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getGripperX <em>Gripper X</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getGripperY <em>Gripper Y</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getGripperZ <em>Gripper Z</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getDistance <em>Distance</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getLineRight <em>Line Right</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getLineMiddle <em>Line Middle</em>}</li>
 *   <li>{@link omcri4cp.agv.Agv#getLineLeft <em>Line Left</em>}</li>
 * </ul>
 *
 * @see omcri4cp.agv.AgvPackage#getAgv()
 * @model
 * @generated
 */
public interface Agv extends Resource {
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
	 * @see omcri4cp.agv.AgvPackage#getAgv_User()
	 * @model default="root" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getUser <em>User</em>}' attribute.
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
	 * @see omcri4cp.agv.AgvPackage#getAgv_Ip()
	 * @model default="127.0.0.1" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!ip'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getIp <em>Ip</em>}' attribute.
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
	 * @see omcri4cp.agv.AgvPackage#getAgv_Port()
	 * @model default="9090" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Connection State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connection State</em>' attribute.
	 * @see #setConnectionState(boolean)
	 * @see omcri4cp.agv.AgvPackage#getAgv_ConnectionState()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!connectionState'"
	 * @generated
	 */
	boolean isConnectionState();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#isConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection State</em>' attribute.
	 * @see #isConnectionState()
	 * @generated
	 */
	void setConnectionState(boolean value);

	/**
	 * Returns the value of the '<em><b>Pose X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose X</em>' attribute.
	 * @see #setPoseX(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_PoseX()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!poseX'"
	 * @generated
	 */
	int getPoseX();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getPoseX <em>Pose X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose X</em>' attribute.
	 * @see #getPoseX()
	 * @generated
	 */
	void setPoseX(int value);

	/**
	 * Returns the value of the '<em><b>Pose Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pose Y</em>' attribute.
	 * @see #setPoseY(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_PoseY()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!poseY'"
	 * @generated
	 */
	int getPoseY();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getPoseY <em>Pose Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pose Y</em>' attribute.
	 * @see #getPoseY()
	 * @generated
	 */
	void setPoseY(int value);

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
	 * @see omcri4cp.agv.AgvPackage#getAgv_PoseAngular()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!poseAngular'"
	 * @generated
	 */
	int getPoseAngular();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getPoseAngular <em>Pose Angular</em>}' attribute.
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
	 * @see omcri4cp.agv.AgvPackage#getAgv_SpeedLinear()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!speedLinear'"
	 * @generated
	 */
	int getSpeedLinear();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getSpeedLinear <em>Speed Linear</em>}' attribute.
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
	 * @see omcri4cp.agv.AgvPackage#getAgv_SpeedAngular()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!speedAngular'"
	 * @generated
	 */
	int getSpeedAngular();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getSpeedAngular <em>Speed Angular</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed Angular</em>' attribute.
	 * @see #getSpeedAngular()
	 * @generated
	 */
	void setSpeedAngular(int value);

	/**
	 * Returns the value of the '<em><b>Gripper State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gripper State</em>' attribute.
	 * @see #setGripperState(boolean)
	 * @see omcri4cp.agv.AgvPackage#getAgv_GripperState()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!gripperState'"
	 * @generated
	 */
	boolean isGripperState();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#isGripperState <em>Gripper State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gripper State</em>' attribute.
	 * @see #isGripperState()
	 * @generated
	 */
	void setGripperState(boolean value);

	/**
	 * Returns the value of the '<em><b>Gripper X</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gripper X</em>' attribute.
	 * @see #setGripperX(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_GripperX()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!gripperX'"
	 * @generated
	 */
	int getGripperX();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getGripperX <em>Gripper X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gripper X</em>' attribute.
	 * @see #getGripperX()
	 * @generated
	 */
	void setGripperX(int value);

	/**
	 * Returns the value of the '<em><b>Gripper Y</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gripper Y</em>' attribute.
	 * @see #setGripperY(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_GripperY()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!gripperY'"
	 * @generated
	 */
	int getGripperY();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getGripperY <em>Gripper Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gripper Y</em>' attribute.
	 * @see #getGripperY()
	 * @generated
	 */
	void setGripperY(int value);

	/**
	 * Returns the value of the '<em><b>Gripper Z</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gripper Z</em>' attribute.
	 * @see #setGripperZ(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_GripperZ()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!gripperZ'"
	 * @generated
	 */
	int getGripperZ();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getGripperZ <em>Gripper Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gripper Z</em>' attribute.
	 * @see #getGripperZ()
	 * @generated
	 */
	void setGripperZ(int value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_Distance()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!distance'"
	 * @generated
	 */
	int getDistance();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(int value);

	/**
	 * Returns the value of the '<em><b>Line Right</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Right</em>' attribute.
	 * @see #setLineRight(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_LineRight()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!lineRight'"
	 * @generated
	 */
	int getLineRight();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getLineRight <em>Line Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Right</em>' attribute.
	 * @see #getLineRight()
	 * @generated
	 */
	void setLineRight(int value);

	/**
	 * Returns the value of the '<em><b>Line Middle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Middle</em>' attribute.
	 * @see #setLineMiddle(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_LineMiddle()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!lineMiddle'"
	 * @generated
	 */
	int getLineMiddle();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getLineMiddle <em>Line Middle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Middle</em>' attribute.
	 * @see #getLineMiddle()
	 * @generated
	 */
	void setLineMiddle(int value);

	/**
	 * Returns the value of the '<em><b>Line Left</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Left</em>' attribute.
	 * @see #setLineLeft(int)
	 * @see omcri4cp.agv.AgvPackage#getAgv_LineLeft()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!lineLeft'"
	 * @generated
	 */
	int getLineLeft();

	/**
	 * Sets the value of the '{@link omcri4cp.agv.Agv#getLineLeft <em>Line Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Left</em>' attribute.
	 * @see #getLineLeft()
	 * @generated
	 */
	void setLineLeft(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!connect()'"
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!disconnect()'"
	 * @generated
	 */
	void disconnect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!get_distance()'"
	 * @generated
	 */
	void get_distance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!get_line_sensors()'"
	 * @generated
	 */
	void get_line_sensors();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!forward()'"
	 * @generated
	 */
	void forward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!backward()'"
	 * @generated
	 */
	void backward();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right()'"
	 * @generated
	 */
	void right();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left()'"
	 * @generated
	 */
	void left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right_up()'"
	 * @generated
	 */
	void right_up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!right_bottom()'"
	 * @generated
	 */
	void right_bottom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left_up()'"
	 * @generated
	 */
	void left_up();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!left_bottom()'"
	 * @generated
	 */
	void left_bottom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_left()'"
	 * @generated
	 */
	void turn_left();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_right()'"
	 * @generated
	 */
	void turn_right();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!turn_around()'"
	 * @generated
	 */
	void turn_around();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!stop()'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!open_gripper()'"
	 * @generated
	 */
	void open_gripper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!close_gripper()'"
	 * @generated
	 */
	void close_gripper();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!go_to_position()'"
	 * @generated
	 */
	void go_to_position();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/agv/ecore!Agv!set_gripper_position()'"
	 * @generated
	 */
	void set_gripper_position();

} // Agv
