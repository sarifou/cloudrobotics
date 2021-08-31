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
package omcri4cp.train;

import org.eclipse.cmf.occi.core.Resource;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Train</b></em>'.
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
 *   <li>{@link omcri4cp.train.Train#getUser <em>User</em>}</li>
 *   <li>{@link omcri4cp.train.Train#getIp <em>Ip</em>}</li>
 *   <li>{@link omcri4cp.train.Train#getPort <em>Port</em>}</li>
 *   <li>{@link omcri4cp.train.Train#isLightState <em>Light State</em>}</li>
 *   <li>{@link omcri4cp.train.Train#isHonkState <em>Honk State</em>}</li>
 *   <li>{@link omcri4cp.train.Train#isWagonNoise <em>Wagon Noise</em>}</li>
 *   <li>{@link omcri4cp.train.Train#getTrainName <em>Train Name</em>}</li>
 *   <li>{@link omcri4cp.train.Train#isTrainNoise <em>Train Noise</em>}</li>
 *   <li>{@link omcri4cp.train.Train#getTrainNumber <em>Train Number</em>}</li>
 *   <li>{@link omcri4cp.train.Train#isConnectionState <em>Connection State</em>}</li>
 *   <li>{@link omcri4cp.train.Train#getTrainSpeed <em>Train Speed</em>}</li>
 * </ul>
 *
 * @see omcri4cp.train.TrainPackage#getTrain()
 * @model
 * @generated
 */
public interface Train extends Resource {
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
	 * @see omcri4cp.train.TrainPackage#getTrain_User()
	 * @model default="root" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!user'"
	 * @generated
	 */
	String getUser();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getUser <em>User</em>}' attribute.
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
	 * @see omcri4cp.train.TrainPackage#getTrain_Ip()
	 * @model default="127.0.0.1" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!ip'"
	 * @generated
	 */
	String getIp();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getIp <em>Ip</em>}' attribute.
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
	 * @see omcri4cp.train.TrainPackage#getTrain_Port()
	 * @model default="9090" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!port'"
	 * @generated
	 */
	int getPort();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getPort <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' attribute.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(int value);

	/**
	 * Returns the value of the '<em><b>Light State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light State</em>' attribute.
	 * @see #setLightState(boolean)
	 * @see omcri4cp.train.TrainPackage#getTrain_LightState()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!lightState'"
	 * @generated
	 */
	boolean isLightState();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#isLightState <em>Light State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light State</em>' attribute.
	 * @see #isLightState()
	 * @generated
	 */
	void setLightState(boolean value);

	/**
	 * Returns the value of the '<em><b>Honk State</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Honk State</em>' attribute.
	 * @see #setHonkState(boolean)
	 * @see omcri4cp.train.TrainPackage#getTrain_HonkState()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!honkState'"
	 * @generated
	 */
	boolean isHonkState();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#isHonkState <em>Honk State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Honk State</em>' attribute.
	 * @see #isHonkState()
	 * @generated
	 */
	void setHonkState(boolean value);

	/**
	 * Returns the value of the '<em><b>Wagon Noise</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wagon Noise</em>' attribute.
	 * @see #setWagonNoise(boolean)
	 * @see omcri4cp.train.TrainPackage#getTrain_WagonNoise()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!wagonNoise'"
	 * @generated
	 */
	boolean isWagonNoise();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#isWagonNoise <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wagon Noise</em>' attribute.
	 * @see #isWagonNoise()
	 * @generated
	 */
	void setWagonNoise(boolean value);

	/**
	 * Returns the value of the '<em><b>Train Name</b></em>' attribute.
	 * The default value is <code>"DCC0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train Name</em>' attribute.
	 * @see #setTrainName(String)
	 * @see omcri4cp.train.TrainPackage#getTrain_TrainName()
	 * @model default="DCC0" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!trainName'"
	 * @generated
	 */
	String getTrainName();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getTrainName <em>Train Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Name</em>' attribute.
	 * @see #getTrainName()
	 * @generated
	 */
	void setTrainName(String value);

	/**
	 * Returns the value of the '<em><b>Train Noise</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train Noise</em>' attribute.
	 * @see #setTrainNoise(boolean)
	 * @see omcri4cp.train.TrainPackage#getTrain_TrainNoise()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!trainNoise'"
	 * @generated
	 */
	boolean isTrainNoise();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#isTrainNoise <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Noise</em>' attribute.
	 * @see #isTrainNoise()
	 * @generated
	 */
	void setTrainNoise(boolean value);

	/**
	 * Returns the value of the '<em><b>Train Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train Number</em>' attribute.
	 * @see #setTrainNumber(String)
	 * @see omcri4cp.train.TrainPackage#getTrain_TrainNumber()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!trainNumber'"
	 * @generated
	 */
	String getTrainNumber();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getTrainNumber <em>Train Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Number</em>' attribute.
	 * @see #getTrainNumber()
	 * @generated
	 */
	void setTrainNumber(String value);

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
	 * @see omcri4cp.train.TrainPackage#getTrain_ConnectionState()
	 * @model default="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!connectionState'"
	 * @generated
	 */
	boolean isConnectionState();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#isConnectionState <em>Connection State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection State</em>' attribute.
	 * @see #isConnectionState()
	 * @generated
	 */
	void setConnectionState(boolean value);

	/**
	 * Returns the value of the '<em><b>Train Speed</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train Speed</em>' attribute.
	 * @see #setTrainSpeed(int)
	 * @see omcri4cp.train.TrainPackage#getTrain_TrainSpeed()
	 * @model default="0"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!trainSpeed'"
	 * @generated
	 */
	int getTrainSpeed();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Train#getTrainSpeed <em>Train Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Speed</em>' attribute.
	 * @see #getTrainSpeed()
	 * @generated
	 */
	void setTrainSpeed(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!faster()'"
	 * @generated
	 */
	void faster();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!slower()'"
	 * @generated
	 */
	void slower();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!reverse()'"
	 * @generated
	 */
	void reverse();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!setspeed()'"
	 * @generated
	 */
	void setspeed();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!stop()'"
	 * @generated
	 */
	void stop();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_honk()'"
	 * @generated
	 */
	void set_honk();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_wagon_noise()'"
	 * @generated
	 */
	void set_wagon_noise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_train_noise()'"
	 * @generated
	 */
	void set_train_noise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!set_light()'"
	 * @generated
	 */
	void set_light();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!connect()'"
	 * @generated
	 */
	void connect();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Train!disconnect()'"
	 * @generated
	 */
	void disconnect();

} // Train
