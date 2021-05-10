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

import omcri4cp.train.Accessories;
import omcri4cp.train.Motion;
import omcri4cp.train.State;
import omcri4cp.train.Train;
import omcri4cp.train.TrainFactory;
import omcri4cp.train.TrainPackage;

import omcri4cp.train.util.TrainValidator;

import omcricore.OmcricorePackage;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass motionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass accessoriesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTrainPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TrainValidator.INSTANCE;
				 }
			 });

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
	public EAttribute getTrain_IpAddress() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_TrainAddress() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrain_Port() {
		return (EAttribute)trainEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMotion() {
		return motionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Speed() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Faster() {
		return motionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Slower() {
		return motionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Reverse() {
		return motionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Stop() {
		return motionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Setspeed() {
		return motionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__AppliesConstraint__DiagnosticChain_Map() {
		return motionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAccessories() {
		return accessoriesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_Klaxon() {
		return (EAttribute)accessoriesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_Light() {
		return (EAttribute)accessoriesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_TrainNoise() {
		return (EAttribute)accessoriesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAccessories_WagonNoise() {
		return (EAttribute)accessoriesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__Setklaxon() {
		return accessoriesEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__Setlight() {
		return accessoriesEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__Settrainnoise() {
		return accessoriesEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__Setwagonnoise() {
		return accessoriesEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAccessories__AppliesConstraint__DiagnosticChain_Map() {
		return accessoriesEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		return stateEEnum;
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
		createEAttribute(trainEClass, TRAIN__IP_ADDRESS);
		createEAttribute(trainEClass, TRAIN__TRAIN_ADDRESS);
		createEAttribute(trainEClass, TRAIN__PORT);

		motionEClass = createEClass(MOTION);
		createEAttribute(motionEClass, MOTION__SPEED);
		createEOperation(motionEClass, MOTION___FASTER);
		createEOperation(motionEClass, MOTION___SLOWER);
		createEOperation(motionEClass, MOTION___REVERSE);
		createEOperation(motionEClass, MOTION___STOP);
		createEOperation(motionEClass, MOTION___SETSPEED);
		createEOperation(motionEClass, MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		accessoriesEClass = createEClass(ACCESSORIES);
		createEAttribute(accessoriesEClass, ACCESSORIES__KLAXON);
		createEAttribute(accessoriesEClass, ACCESSORIES__LIGHT);
		createEAttribute(accessoriesEClass, ACCESSORIES__TRAIN_NOISE);
		createEAttribute(accessoriesEClass, ACCESSORIES__WAGON_NOISE);
		createEOperation(accessoriesEClass, ACCESSORIES___SETKLAXON);
		createEOperation(accessoriesEClass, ACCESSORIES___SETLIGHT);
		createEOperation(accessoriesEClass, ACCESSORIES___SETTRAINNOISE);
		createEOperation(accessoriesEClass, ACCESSORIES___SETWAGONNOISE);
		createEOperation(accessoriesEClass, ACCESSORIES___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		// Create enums
		stateEEnum = createEEnum(STATE);
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
		motionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		accessoriesEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(trainEClass, Train.class, "Train", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrain_User(), ecorePackage.getEString(), "user", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_TrainAddress(), ecorePackage.getEInt(), "trainAddress", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrain_Port(), ecorePackage.getEInt(), "port", null, 1, 1, Train.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionEClass, Motion.class, "Motion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotion_Speed(), ecorePackage.getEInt(), "speed", null, 1, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMotion__Faster(), null, "faster", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Slower(), null, "slower", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Reverse(), null, "reverse", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Setspeed(), null, "setspeed", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getMotion__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(accessoriesEClass, Accessories.class, "Accessories", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAccessories_Klaxon(), this.getState(), "klaxon", "OFF", 0, 1, Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessories_Light(), this.getState(), "light", "OFF", 0, 1, Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessories_TrainNoise(), this.getState(), "trainNoise", "OFF", 0, 1, Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAccessories_WagonNoise(), this.getState(), "wagonNoise", "OFF", 0, 1, Accessories.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getAccessories__Setklaxon(), null, "setklaxon", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAccessories__Setlight(), null, "setlight", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAccessories__Settrainnoise(), null, "settrainnoise", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAccessories__Setwagonnoise(), null, "setwagonnoise", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAccessories__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.ON);
		addEEnumLiteral(stateEEnum, State.OFF);

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
		addAnnotation
		  (motionEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
		addAnnotation
		  (accessoriesEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

} //TrainPackageImpl
