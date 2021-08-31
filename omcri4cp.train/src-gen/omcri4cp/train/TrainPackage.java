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
 * @see omcri4cp.train.TrainFactory
 * @model kind="package"
 * @generated
 */
public interface TrainPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "train";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cristal.org/omcri4cp/train/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "train";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrainPackage eINSTANCE = omcri4cp.train.impl.TrainPackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri4cp.train.impl.TrainImpl <em>Train</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.train.impl.TrainImpl
	 * @see omcri4cp.train.impl.TrainPackageImpl#getTrain()
	 * @generated
	 */
	int TRAIN = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__USER = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__IP = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__PORT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Light State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__LIGHT_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Honk State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__HONK_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Wagon Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__WAGON_NOISE = OCCIPackage.RESOURCE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Train Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_NAME = OCCIPackage.RESOURCE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Train Noise</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_NOISE = OCCIPackage.RESOURCE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Train Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_NUMBER = OCCIPackage.RESOURCE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Connection State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__CONNECTION_STATE = OCCIPackage.RESOURCE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Train Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN__TRAIN_SPEED = OCCIPackage.RESOURCE_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 11;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The operation id for the '<em>Faster</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___FASTER = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Slower</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SLOWER = OCCIPackage.RESOURCE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Reverse</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___REVERSE = OCCIPackage.RESOURCE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Setspeed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SETSPEED = OCCIPackage.RESOURCE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___STOP = OCCIPackage.RESOURCE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Set honk</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SET_HONK = OCCIPackage.RESOURCE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Set wagon noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SET_WAGON_NOISE = OCCIPackage.RESOURCE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Set train noise</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SET_TRAIN_NOISE = OCCIPackage.RESOURCE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Set light</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___SET_LIGHT = OCCIPackage.RESOURCE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Connect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___CONNECT = OCCIPackage.RESOURCE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Disconnect</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN___DISCONNECT = OCCIPackage.RESOURCE_OPERATION_COUNT + 10;

	/**
	 * The number of operations of the '<em>Train</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAIN_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 11;


	/**
	 * Returns the meta object for class '{@link omcri4cp.train.Train <em>Train</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Train</em>'.
	 * @see omcri4cp.train.Train
	 * @generated
	 */
	EClass getTrain();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri4cp.train.Train#getUser()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see omcri4cp.train.Train#getIp()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Ip();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port</em>'.
	 * @see omcri4cp.train.Train#getPort()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_Port();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#isLightState <em>Light State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Light State</em>'.
	 * @see omcri4cp.train.Train#isLightState()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_LightState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#isHonkState <em>Honk State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Honk State</em>'.
	 * @see omcri4cp.train.Train#isHonkState()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_HonkState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#isWagonNoise <em>Wagon Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wagon Noise</em>'.
	 * @see omcri4cp.train.Train#isWagonNoise()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_WagonNoise();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getTrainName <em>Train Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Name</em>'.
	 * @see omcri4cp.train.Train#getTrainName()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainName();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#isTrainNoise <em>Train Noise</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Noise</em>'.
	 * @see omcri4cp.train.Train#isTrainNoise()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainNoise();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getTrainNumber <em>Train Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Number</em>'.
	 * @see omcri4cp.train.Train#getTrainNumber()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainNumber();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#isConnectionState <em>Connection State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Connection State</em>'.
	 * @see omcri4cp.train.Train#isConnectionState()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_ConnectionState();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.train.Train#getTrainSpeed <em>Train Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Train Speed</em>'.
	 * @see omcri4cp.train.Train#getTrainSpeed()
	 * @see #getTrain()
	 * @generated
	 */
	EAttribute getTrain_TrainSpeed();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#faster() <em>Faster</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Faster</em>' operation.
	 * @see omcri4cp.train.Train#faster()
	 * @generated
	 */
	EOperation getTrain__Faster();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#slower() <em>Slower</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Slower</em>' operation.
	 * @see omcri4cp.train.Train#slower()
	 * @generated
	 */
	EOperation getTrain__Slower();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#reverse() <em>Reverse</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Reverse</em>' operation.
	 * @see omcri4cp.train.Train#reverse()
	 * @generated
	 */
	EOperation getTrain__Reverse();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#setspeed() <em>Setspeed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Setspeed</em>' operation.
	 * @see omcri4cp.train.Train#setspeed()
	 * @generated
	 */
	EOperation getTrain__Setspeed();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcri4cp.train.Train#stop()
	 * @generated
	 */
	EOperation getTrain__Stop();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#set_honk() <em>Set honk</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set honk</em>' operation.
	 * @see omcri4cp.train.Train#set_honk()
	 * @generated
	 */
	EOperation getTrain__Set_honk();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#set_wagon_noise() <em>Set wagon noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set wagon noise</em>' operation.
	 * @see omcri4cp.train.Train#set_wagon_noise()
	 * @generated
	 */
	EOperation getTrain__Set_wagon_noise();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#set_train_noise() <em>Set train noise</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set train noise</em>' operation.
	 * @see omcri4cp.train.Train#set_train_noise()
	 * @generated
	 */
	EOperation getTrain__Set_train_noise();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#set_light() <em>Set light</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set light</em>' operation.
	 * @see omcri4cp.train.Train#set_light()
	 * @generated
	 */
	EOperation getTrain__Set_light();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#connect() <em>Connect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Connect</em>' operation.
	 * @see omcri4cp.train.Train#connect()
	 * @generated
	 */
	EOperation getTrain__Connect();

	/**
	 * Returns the meta object for the '{@link omcri4cp.train.Train#disconnect() <em>Disconnect</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Disconnect</em>' operation.
	 * @see omcri4cp.train.Train#disconnect()
	 * @generated
	 */
	EOperation getTrain__Disconnect();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrainFactory getTrainFactory();

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
		 * The meta object literal for the '{@link omcri4cp.train.impl.TrainImpl <em>Train</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.train.impl.TrainImpl
		 * @see omcri4cp.train.impl.TrainPackageImpl#getTrain()
		 * @generated
		 */
		EClass TRAIN = eINSTANCE.getTrain();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__USER = eINSTANCE.getTrain_User();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__IP = eINSTANCE.getTrain_Ip();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__PORT = eINSTANCE.getTrain_Port();

		/**
		 * The meta object literal for the '<em><b>Light State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__LIGHT_STATE = eINSTANCE.getTrain_LightState();

		/**
		 * The meta object literal for the '<em><b>Honk State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__HONK_STATE = eINSTANCE.getTrain_HonkState();

		/**
		 * The meta object literal for the '<em><b>Wagon Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__WAGON_NOISE = eINSTANCE.getTrain_WagonNoise();

		/**
		 * The meta object literal for the '<em><b>Train Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_NAME = eINSTANCE.getTrain_TrainName();

		/**
		 * The meta object literal for the '<em><b>Train Noise</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_NOISE = eINSTANCE.getTrain_TrainNoise();

		/**
		 * The meta object literal for the '<em><b>Train Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_NUMBER = eINSTANCE.getTrain_TrainNumber();

		/**
		 * The meta object literal for the '<em><b>Connection State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__CONNECTION_STATE = eINSTANCE.getTrain_ConnectionState();

		/**
		 * The meta object literal for the '<em><b>Train Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRAIN__TRAIN_SPEED = eINSTANCE.getTrain_TrainSpeed();

		/**
		 * The meta object literal for the '<em><b>Faster</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___FASTER = eINSTANCE.getTrain__Faster();

		/**
		 * The meta object literal for the '<em><b>Slower</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SLOWER = eINSTANCE.getTrain__Slower();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___REVERSE = eINSTANCE.getTrain__Reverse();

		/**
		 * The meta object literal for the '<em><b>Setspeed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SETSPEED = eINSTANCE.getTrain__Setspeed();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___STOP = eINSTANCE.getTrain__Stop();

		/**
		 * The meta object literal for the '<em><b>Set honk</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SET_HONK = eINSTANCE.getTrain__Set_honk();

		/**
		 * The meta object literal for the '<em><b>Set wagon noise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SET_WAGON_NOISE = eINSTANCE.getTrain__Set_wagon_noise();

		/**
		 * The meta object literal for the '<em><b>Set train noise</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SET_TRAIN_NOISE = eINSTANCE.getTrain__Set_train_noise();

		/**
		 * The meta object literal for the '<em><b>Set light</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___SET_LIGHT = eINSTANCE.getTrain__Set_light();

		/**
		 * The meta object literal for the '<em><b>Connect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___CONNECT = eINSTANCE.getTrain__Connect();

		/**
		 * The meta object literal for the '<em><b>Disconnect</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRAIN___DISCONNECT = eINSTANCE.getTrain__Disconnect();

	}

} //TrainPackage
