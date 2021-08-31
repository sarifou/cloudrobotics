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

import omcri4cp.train.Train;
import omcri4cp.train.TrainFactory;
import omcri4cp.train.TrainPackage;

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
public class TrainPackageImpl extends EPackageImpl implements TrainPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trainEClass = null;

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
	 * @see omcri4cp.train.TrainPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrainPackageImpl() {
		super(eNS_URI, TrainFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TrainPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrainPackage init() {
		if (isInited) return (TrainPackage)EPackage.Registry.INSTANCE.getEPackage(TrainPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrainPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrainPackageImpl theTrainPackage = registeredTrainPackage instanceof TrainPackageImpl ? (TrainPackageImpl)registeredTrainPackage : new TrainPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTrainPackage.createPackageContents();

		// Initialize created meta-data
		theTrainPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrainPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrainPackage.eNS_URI, theTrainPackage);
		return theTrainPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrain() {
		return trainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_User() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_Ip() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_Port() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_LightState() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_HonkState() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_WagonNoise() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainName() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainNoise() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainNumber() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_ConnectionState() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainSpeed() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Faster() {
		return trainEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Slower() {
		return trainEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Reverse() {
		return trainEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Setspeed() {
		return trainEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Stop() {
		return trainEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Set_honk() {
		return trainEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Set_wagon_noise() {
		return trainEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Set_train_noise() {
		return trainEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Set_light() {
		return trainEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Connect() {
		return trainEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTrain__Disconnect() {
		return trainEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrainFactory getTrainFactory() {
		return (TrainFactory)getEFactoryInstance();
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
		trainEClass = createEClass(TRAIN);
		createEAttribute(trainEClass, TRAIN__USER);
		createEAttribute(trainEClass, TRAIN__IP);
		createEAttribute(trainEClass, TRAIN__PORT);
		createEAttribute(trainEClass, TRAIN__LIGHT_STATE);
		createEAttribute(trainEClass, TRAIN__HONK_STATE);
		createEAttribute(trainEClass, TRAIN__WAGON_NOISE);
		createEAttribute(trainEClass, TRAIN__TRAIN_NAME);
		createEAttribute(trainEClass, TRAIN__TRAIN_NOISE);
		createEAttribute(trainEClass, TRAIN__TRAIN_NUMBER);
		createEAttribute(trainEClass, TRAIN__CONNECTION_STATE);
		createEAttribute(trainEClass, TRAIN__TRAIN_SPEED);
		createEOperation(trainEClass, TRAIN___FASTER);
		createEOperation(trainEClass, TRAIN___SLOWER);
		createEOperation(trainEClass, TRAIN___REVERSE);
		createEOperation(trainEClass, TRAIN___SETSPEED);
		createEOperation(trainEClass, TRAIN___STOP);
		createEOperation(trainEClass, TRAIN___SET_HONK);
		createEOperation(trainEClass, TRAIN___SET_WAGON_NOISE);
		createEOperation(trainEClass, TRAIN___SET_TRAIN_NOISE);
		createEOperation(trainEClass, TRAIN___SET_LIGHT);
		createEOperation(trainEClass, TRAIN___CONNECT);
		createEOperation(trainEClass, TRAIN___DISCONNECT);
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
		trainEClass.getESuperTypes().add(theOCCIPackage.getResource());

		// Initialize classes, features, and operations; add parameters
		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_User(), ecorePackage.getEString(), "user", "root", 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Ip(), ecorePackage.getEString(), "ip", "127.0.0.1", 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Port(), ecorePackage.getEInt(), "port", "9090", 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_LightState(), ecorePackage.getEBoolean(), "lightState", "false", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_HonkState(), ecorePackage.getEBoolean(), "honkState", "false", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_WagonNoise(), ecorePackage.getEBoolean(), "wagonNoise", "false", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainName(), ecorePackage.getEString(), "trainName", "DCC0", 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainNoise(), ecorePackage.getEBoolean(), "trainNoise", "false", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainNumber(), ecorePackage.getEString(), "trainNumber", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_ConnectionState(), ecorePackage.getEBoolean(), "connectionState", "false", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainSpeed(), ecorePackage.getEInt(), "trainSpeed", "0", 0, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTrain__Faster(), null, "faster", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Slower(), null, "slower", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Reverse(), null, "reverse", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Setspeed(), null, "setspeed", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Set_honk(), null, "set_honk", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Set_wagon_noise(), null, "set_wagon_noise", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Set_train_noise(), null, "set_train_noise", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Set_light(), null, "set_light", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Connect(), null, "connect", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTrain__Disconnect(), null, "disconnect", 0, 1, IS_UNIQUE, IS_ORDERED);

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

} //TrainPackageImpl
