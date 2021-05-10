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
package omcri4cp.crane;

import org.eclipse.cmf.occi.core.OCCIPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see omcri4cp.crane.CraneFactory
 * @model kind="package"
 * @generated
 */
public interface CranePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "crane";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cristal.org/omcri4cp/crane/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "crane";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CranePackage eINSTANCE = omcri4cp.crane.impl.CranePackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri4cp.crane.impl.CraneImpl <em>Crane</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.crane.impl.CraneImpl
	 * @see omcri4cp.crane.impl.CranePackageImpl#getCrane()
	 * @generated
	 */
	int CRANE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__USER = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE__ADDRESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Crane</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CRANE_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri4cp.crane.impl.MotionImpl <em>Motion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.crane.impl.MotionImpl
	 * @see omcri4cp.crane.impl.CranePackageImpl#getMotion()
	 * @generated
	 */
	int MOTION = 1;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Speed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__SPEED = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__DURATION = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Move forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___MOVE_FORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Move backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___MOVE_BACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Move up</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___MOVE_UP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Move down</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___MOVE_DOWN = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link omcri4cp.crane.impl.GripperImpl <em>Gripper</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.crane.impl.GripperImpl
	 * @see omcri4cp.crane.impl.CranePackageImpl#getGripper()
	 * @generated
	 */
	int GRIPPER = 2;

	/**
	 * The feature id for the '<em><b>Mixin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER__MIXIN = OCCIPackage.MIXIN_BASE__MIXIN;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER__ENTITY = OCCIPackage.MIXIN_BASE__ENTITY;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER__ATTRIBUTES = OCCIPackage.MIXIN_BASE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER__STATE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Open</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER___OPEN = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Close</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER___CLOSE = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Gripper</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRIPPER_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link omcri4cp.crane.State <em>State</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.crane.State
	 * @see omcri4cp.crane.impl.CranePackageImpl#getState()
	 * @generated
	 */
	int STATE = 3;


	/**
	 * Returns the meta object for class '{@link omcri4cp.crane.Crane <em>Crane</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Crane</em>'.
	 * @see omcri4cp.crane.Crane
	 * @generated
	 */
	EClass getCrane();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.crane.Crane#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri4cp.crane.Crane#getUser()
	 * @see #getCrane()
	 * @generated
	 */
	EAttribute getCrane_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.crane.Crane#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see omcri4cp.crane.Crane#getAddress()
	 * @see #getCrane()
	 * @generated
	 */
	EAttribute getCrane_Address();

	/**
	 * Returns the meta object for class '{@link omcri4cp.crane.Motion <em>Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion</em>'.
	 * @see omcri4cp.crane.Motion
	 * @generated
	 */
	EClass getMotion();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.crane.Motion#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see omcri4cp.crane.Motion#getSpeed()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Speed();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.crane.Motion#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see omcri4cp.crane.Motion#getDuration()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Duration();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Motion#move_forward() <em>Move forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move forward</em>' operation.
	 * @see omcri4cp.crane.Motion#move_forward()
	 * @generated
	 */
	EOperation getMotion__Move_forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Motion#move_backward() <em>Move backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move backward</em>' operation.
	 * @see omcri4cp.crane.Motion#move_backward()
	 * @generated
	 */
	EOperation getMotion__Move_backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Motion#move_up() <em>Move up</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move up</em>' operation.
	 * @see omcri4cp.crane.Motion#move_up()
	 * @generated
	 */
	EOperation getMotion__Move_up();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Motion#move_down() <em>Move down</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move down</em>' operation.
	 * @see omcri4cp.crane.Motion#move_down()
	 * @generated
	 */
	EOperation getMotion__Move_down();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Motion#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri4cp.crane.Motion#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMotion__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for class '{@link omcri4cp.crane.Gripper <em>Gripper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gripper</em>'.
	 * @see omcri4cp.crane.Gripper
	 * @generated
	 */
	EClass getGripper();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.crane.Gripper#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see omcri4cp.crane.Gripper#getState()
	 * @see #getGripper()
	 * @generated
	 */
	EAttribute getGripper_State();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Gripper#open() <em>Open</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open</em>' operation.
	 * @see omcri4cp.crane.Gripper#open()
	 * @generated
	 */
	EOperation getGripper__Open();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Gripper#close() <em>Close</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close</em>' operation.
	 * @see omcri4cp.crane.Gripper#close()
	 * @generated
	 */
	EOperation getGripper__Close();

	/**
	 * Returns the meta object for the '{@link omcri4cp.crane.Gripper#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri4cp.crane.Gripper#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getGripper__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the meta object for enum '{@link omcri4cp.crane.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>State</em>'.
	 * @see omcri4cp.crane.State
	 * @generated
	 */
	EEnum getState();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CraneFactory getCraneFactory();

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
		 * The meta object literal for the '{@link omcri4cp.crane.impl.CraneImpl <em>Crane</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.crane.impl.CraneImpl
		 * @see omcri4cp.crane.impl.CranePackageImpl#getCrane()
		 * @generated
		 */
		EClass CRANE = eINSTANCE.getCrane();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRANE__USER = eINSTANCE.getCrane_User();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CRANE__ADDRESS = eINSTANCE.getCrane_Address();

		/**
		 * The meta object literal for the '{@link omcri4cp.crane.impl.MotionImpl <em>Motion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.crane.impl.MotionImpl
		 * @see omcri4cp.crane.impl.CranePackageImpl#getMotion()
		 * @generated
		 */
		EClass MOTION = eINSTANCE.getMotion();

		/**
		 * The meta object literal for the '<em><b>Speed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__SPEED = eINSTANCE.getMotion_Speed();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__DURATION = eINSTANCE.getMotion_Duration();

		/**
		 * The meta object literal for the '<em><b>Move forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___MOVE_FORWARD = eINSTANCE.getMotion__Move_forward();

		/**
		 * The meta object literal for the '<em><b>Move backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___MOVE_BACKWARD = eINSTANCE.getMotion__Move_backward();

		/**
		 * The meta object literal for the '<em><b>Move up</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___MOVE_UP = eINSTANCE.getMotion__Move_up();

		/**
		 * The meta object literal for the '<em><b>Move down</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___MOVE_DOWN = eINSTANCE.getMotion__Move_down();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMotion__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri4cp.crane.impl.GripperImpl <em>Gripper</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.crane.impl.GripperImpl
		 * @see omcri4cp.crane.impl.CranePackageImpl#getGripper()
		 * @generated
		 */
		EClass GRIPPER = eINSTANCE.getGripper();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRIPPER__STATE = eINSTANCE.getGripper_State();

		/**
		 * The meta object literal for the '<em><b>Open</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRIPPER___OPEN = eINSTANCE.getGripper__Open();

		/**
		 * The meta object literal for the '<em><b>Close</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRIPPER___CLOSE = eINSTANCE.getGripper__Close();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRIPPER___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getGripper__AppliesConstraint__DiagnosticChain_Map();

		/**
		 * The meta object literal for the '{@link omcri4cp.crane.State <em>State</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.crane.State
		 * @see omcri4cp.crane.impl.CranePackageImpl#getState()
		 * @generated
		 */
		EEnum STATE = eINSTANCE.getState();

	}

} //CranePackage
