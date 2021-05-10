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
package omcri4cp.crane.impl;

import omcri4cp.crane.Crane;
import omcri4cp.crane.CraneFactory;
import omcri4cp.crane.CranePackage;
import omcri4cp.crane.Gripper;
import omcri4cp.crane.Motion;
import omcri4cp.crane.State;

import omcri4cp.crane.util.CraneValidator;

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
public class CranePackageImpl extends EPackageImpl implements CranePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass craneEClass = null;

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
	private EClass gripperEClass = null;

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
	 * @see omcri4cp.crane.CranePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CranePackageImpl() {
		super(eNS_URI, CraneFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link CranePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CranePackage init() {
		if (isInited) return (CranePackage)EPackage.Registry.INSTANCE.getEPackage(CranePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredCranePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		CranePackageImpl theCranePackage = registeredCranePackage instanceof CranePackageImpl ? (CranePackageImpl)registeredCranePackage : new CranePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		OCCIPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCranePackage.createPackageContents();

		// Initialize created meta-data
		theCranePackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theCranePackage,
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return CraneValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theCranePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CranePackage.eNS_URI, theCranePackage);
		return theCranePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCrane() {
		return craneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrane_User() {
		return (EAttribute)craneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCrane_Address() {
		return (EAttribute)craneEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMotion_Duration() {
		return (EAttribute)motionEClass.getEStructuralFeatures().get(1);
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
	public EOperation getMotion__Move_up() {
		return motionEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__Move_down() {
		return motionEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMotion__AppliesConstraint__DiagnosticChain_Map() {
		return motionEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGripper() {
		return gripperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGripper_State() {
		return (EAttribute)gripperEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGripper__Open() {
		return gripperEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGripper__Close() {
		return gripperEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGripper__AppliesConstraint__DiagnosticChain_Map() {
		return gripperEClass.getEOperations().get(2);
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
	public CraneFactory getCraneFactory() {
		return (CraneFactory)getEFactoryInstance();
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
		craneEClass = createEClass(CRANE);
		createEAttribute(craneEClass, CRANE__USER);
		createEAttribute(craneEClass, CRANE__ADDRESS);

		motionEClass = createEClass(MOTION);
		createEAttribute(motionEClass, MOTION__SPEED);
		createEAttribute(motionEClass, MOTION__DURATION);
		createEOperation(motionEClass, MOTION___MOVE_FORWARD);
		createEOperation(motionEClass, MOTION___MOVE_BACKWARD);
		createEOperation(motionEClass, MOTION___MOVE_UP);
		createEOperation(motionEClass, MOTION___MOVE_DOWN);
		createEOperation(motionEClass, MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

		gripperEClass = createEClass(GRIPPER);
		createEAttribute(gripperEClass, GRIPPER__STATE);
		createEOperation(gripperEClass, GRIPPER___OPEN);
		createEOperation(gripperEClass, GRIPPER___CLOSE);
		createEOperation(gripperEClass, GRIPPER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP);

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
		craneEClass.getESuperTypes().add(theOCCIPackage.getResource());
		motionEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());
		gripperEClass.getESuperTypes().add(theOCCIPackage.getMixinBase());

		// Initialize classes, features, and operations; add parameters
		initEClass(craneEClass, Crane.class, "Crane", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCrane_User(), ecorePackage.getEString(), "user", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCrane_Address(), ecorePackage.getEString(), "address", null, 1, 1, Crane.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(motionEClass, Motion.class, "Motion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMotion_Speed(), ecorePackage.getEInt(), "speed", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMotion_Duration(), ecorePackage.getEInt(), "duration", null, 0, 1, Motion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMotion__Move_forward(), null, "move_forward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Move_backward(), null, "move_backward", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Move_up(), null, "move_up", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMotion__Move_down(), null, "move_down", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getMotion__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(gripperEClass, Gripper.class, "Gripper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGripper_State(), this.getState(), "state", "Open", 0, 1, Gripper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getGripper__Open(), null, "open", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getGripper__Close(), null, "close", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getGripper__AppliesConstraint__DiagnosticChain_Map(), ecorePackage.getEBoolean(), "appliesConstraint", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(stateEEnum, State.class, "State");
		addEEnumLiteral(stateEEnum, State.OPEN);
		addEEnumLiteral(stateEEnum, State.CLOSED);

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
		  (gripperEClass,
		   source,
		   new String[] {
			   "constraints", "appliesConstraint"
		   });
	}

} //CranePackageImpl
