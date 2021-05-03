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

import omcri4cp.agv.Agv;
import omcri4cp.agv.AgvFactory;
import omcri4cp.agv.AgvPackage;
import omcri4cp.agv.Ir;
import omcri4cp.agv.Motion;
import omcri4cp.agv.Sensors;
import omcri4cp.agv.Ultrasonic;

import omcri4cp.agv.util.AgvValidator;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
public class AgvPackageImpl extends EPackageImpl implements AgvPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agvEClass = null;

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
	private EClass sensorsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass irEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ultrasonicEClass = null;

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
	 * @see omcri4cp.agv.AgvPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgvPackageImpl() {
		super(eNS_URI, AgvFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AgvPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgvPackage init() {
		if (isInited) return (AgvPackage)EPackage.Registry.INSTANCE.getEPackage(AgvPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredAgvPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		AgvPackageImpl theAgvPackage = registeredAgvPackage instanceof AgvPackageImpl ? (AgvPackageImpl)registeredAgvPackage : new AgvPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgvPackage.createPackageContents();

		// Initialize created meta-data
		theAgvPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theAgvPackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return AgvValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theAgvPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgvPackage.eNS_URI, theAgvPackage);
		return theAgvPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgv() {
		return agvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_User() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_Password() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgv_IpAddress() {
		return (EAttribute)agvEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getMotion_Duration() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Speed() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMotion_Angle() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Move_forward() {
		return motionEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Move_backward() {
		return motionEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Left() {
		return motionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Right() {
		return motionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Left_diago_forward() {
		return motionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Left_diago_backward() {
		return motionEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Right_diago_forward() {
		return motionEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Right_diago_backward() {
		return motionEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Turn_left() {
		return motionEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Turn_right() {
		return motionEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Stop() {
		return motionEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__AppliesConstraint__DiagnosticChain_Map() {
		return motionEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensors() {
		return sensorsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSensors__AppliesConstraint__DiagnosticChain_Map() {
		return sensorsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIr() {
		return irEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIr__Sense_line() {
		return irEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUltrasonic() {
		return ultrasonicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUltrasonic_Distance() {
		return (EAttribute)ultrasonicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUltrasonic__Sense_distance() {
		return ultrasonicEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgvFactory getAgvFactory() {
		return (AgvFactory)getEFactoryInstance();
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
		agvEClass = createEClass(AGV);
		createEAttribute(agvEClass, AGV__USER);
		createEAttribute(agvEClass, AGV__PASSWORD);
		createEAttribute(agvEClass, AGV__IP_ADDRESS);

		motionEClass = createEClass(MOTION);
		createEAttribute(motionEClass, MOTION__DURATION);
		createEAttribute(motionEClass, MOTION__SPEED);
		createEAttribute(motionEClass, MOTION__ANGLE);
		createEOperation(motionEClass, MOTION___MOVE_FORWARD);
		createEOperation(motionEClass, MOTION___MOVE_BACKWARD);
		createEOperation(motionEClass, MOTION___LEFT);
		createEOperation(motionEClass, MOTION___RIGHT);
		createEOperation(motionEClass, MOTION___LEFT_DIAGO_FORWARD);
		createEOperation(motionEClass, MOTION___LEFT_DIAGO_BACKWARD);
		createEOperation(motionEClass, MOTION___RIGHT_DIAGO_FORWARD);
		createEOperation(motionEClass, MOTION___RIGHT_DIAGO_BACKWARD);
		createEOperation(motionEClass, MOTION___TURN_LEFT);
		createEOperation(motionEClass, MOTION___TURN_RIGHT);
		createEOperation(motionEClass, MOTION___STOP);
		createEOperation(motionEClass, MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		sensorsEClass = createEClass(SENSORS);
		createEOperation(sensorsEClass, SENSORS___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		irEClass = createEClass(IR);
		createEOperation(irEClass, IR___SENSE_LINE);

		ultrasonicEClass = createEClass(ULTRASONIC);
		createEAttribute(ultrasonicEClass, ULTRASONIC__DISTANCE);
		createEOperation(ultrasonicEClass, ULTRASONIC___SENSE_DISTANCE);
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
		agvEClass.getESuperTypes().add(theOCCIPackage.getResource());
		motionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		sensorsEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		irEClass.getESuperTypes().add(this.getSensors());
		irEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		ultrasonicEClass.getESuperTypes().add(this.getSensors());
		ultrasonicEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(agvEClass, Agv.class, "Agv", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgv_User(), ecorePackage.getEString(), "user", null, 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_Password(), ecorePackage.getEString(), "password", null, 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAgv_IpAddress(), ecorePackage.getEString(), "ipAddress", null, 1, 1, Agv.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionEClass, Motion.class, "Motion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotion_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Angle(), ecorePackage.getEInt(), "angle", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMotion__Move_forward(), null, "move_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Move_backward(), null, "move_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Left(), null, "left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Right(), null, "right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Left_diago_forward(), null, "left_diago_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Left_diago_backward(), null, "left_diago_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Right_diago_forward(), null, "right_diago_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Right_diago_backward(), null, "right_diago_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Turn_left(), null, "turn_left", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Turn_right(), null, "turn_right", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Stop(), null, "stop", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getMotion__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sensorsEClass, Sensors.class, "Sensors", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSensors__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(irEClass, Ir.class, "Ir", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIr__Sense_line(), null, "sense_line", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(ultrasonicEClass, Ultrasonic.class, "Ultrasonic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUltrasonic_Distance(), ecorePackage.getEInt(), "distance", null, 0, 1, Ultrasonic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUltrasonic__Sense_distance(), null, "sense_distance", 0, 1, IS_UNIQUE, IS_ORDERED);

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
		  (sensorsEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

} //AgvPackageImpl
