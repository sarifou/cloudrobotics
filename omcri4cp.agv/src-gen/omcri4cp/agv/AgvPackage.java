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
 * @see omcri4cp.agv.AgvFactory
 * @model kind="package"
 * @generated
 */
public interface AgvPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "agv";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://cristal.org/omcri4cp/agv/ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "agv";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AgvPackage eINSTANCE = omcri4cp.agv.impl.AgvPackageImpl.init();

	/**
	 * The meta object id for the '{@link omcri4cp.agv.impl.AgvImpl <em>Agv</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.agv.impl.AgvImpl
	 * @see omcri4cp.agv.impl.AgvPackageImpl#getAgv()
	 * @generated
	 */
	int AGV = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__ID = OCCIPackage.RESOURCE__ID;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__TITLE = OCCIPackage.RESOURCE__TITLE;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__KIND = OCCIPackage.RESOURCE__KIND;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LOCATION = OCCIPackage.RESOURCE__LOCATION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__ATTRIBUTES = OCCIPackage.RESOURCE__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Mixins</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__MIXINS = OCCIPackage.RESOURCE__MIXINS;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PARTS = OCCIPackage.RESOURCE__PARTS;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__SUMMARY = OCCIPackage.RESOURCE__SUMMARY;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__LINKS = OCCIPackage.RESOURCE__LINKS;

	/**
	 * The feature id for the '<em><b>Rlinks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__RLINKS = OCCIPackage.RESOURCE__RLINKS;

	/**
	 * The feature id for the '<em><b>User</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__USER = OCCIPackage.RESOURCE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__IP_ADDRESS = OCCIPackage.RESOURCE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV__PASSWORD = OCCIPackage.RESOURCE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Agv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_FEATURE_COUNT = OCCIPackage.RESOURCE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Occi Create</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_CREATE = OCCIPackage.RESOURCE___OCCI_CREATE;

	/**
	 * The operation id for the '<em>Occi Retrieve</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_RETRIEVE = OCCIPackage.RESOURCE___OCCI_RETRIEVE;

	/**
	 * The operation id for the '<em>Occi Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_UPDATE = OCCIPackage.RESOURCE___OCCI_UPDATE;

	/**
	 * The operation id for the '<em>Occi Delete</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV___OCCI_DELETE = OCCIPackage.RESOURCE___OCCI_DELETE;

	/**
	 * The number of operations of the '<em>Agv</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGV_OPERATION_COUNT = OCCIPackage.RESOURCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link omcri4cp.agv.impl.MotionImpl <em>Motion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see omcri4cp.agv.impl.MotionImpl
	 * @see omcri4cp.agv.impl.AgvPackageImpl#getMotion()
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
	 * The feature id for the '<em><b>Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION__ANGLE = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_FEATURE_COUNT = OCCIPackage.MIXIN_BASE_FEATURE_COUNT + 3;

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
	 * The operation id for the '<em>Left translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___LEFT_TRANSLATION = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Right translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___RIGHT_TRANSLATION = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Turn left</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___TURN_LEFT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Turn right</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___TURN_RIGHT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Left diago forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___LEFT_DIAGO_FORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Left diago backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___LEFT_DIAGO_BACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Right diago forward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___RIGHT_DIAGO_FORWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Right diago backward</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___RIGHT_DIAGO_BACKWARD = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___STOP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Applies Constraint</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>Motion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOTION_OPERATION_COUNT = OCCIPackage.MIXIN_BASE_OPERATION_COUNT + 12;


	/**
	 * Returns the meta object for class '{@link omcri4cp.agv.Agv <em>Agv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agv</em>'.
	 * @see omcri4cp.agv.Agv
	 * @generated
	 */
	EClass getAgv();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User</em>'.
	 * @see omcri4cp.agv.Agv#getUser()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_User();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see omcri4cp.agv.Agv#getIpAddress()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_IpAddress();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Agv#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see omcri4cp.agv.Agv#getPassword()
	 * @see #getAgv()
	 * @generated
	 */
	EAttribute getAgv_Password();

	/**
	 * Returns the meta object for class '{@link omcri4cp.agv.Motion <em>Motion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Motion</em>'.
	 * @see omcri4cp.agv.Motion
	 * @generated
	 */
	EClass getMotion();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Motion#getSpeed <em>Speed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speed</em>'.
	 * @see omcri4cp.agv.Motion#getSpeed()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Speed();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Motion#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see omcri4cp.agv.Motion#getDuration()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Duration();

	/**
	 * Returns the meta object for the attribute '{@link omcri4cp.agv.Motion#getAngle <em>Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Angle</em>'.
	 * @see omcri4cp.agv.Motion#getAngle()
	 * @see #getMotion()
	 * @generated
	 */
	EAttribute getMotion_Angle();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#move_forward() <em>Move forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move forward</em>' operation.
	 * @see omcri4cp.agv.Motion#move_forward()
	 * @generated
	 */
	EOperation getMotion__Move_forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#move_backward() <em>Move backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move backward</em>' operation.
	 * @see omcri4cp.agv.Motion#move_backward()
	 * @generated
	 */
	EOperation getMotion__Move_backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#left_translation() <em>Left translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left translation</em>' operation.
	 * @see omcri4cp.agv.Motion#left_translation()
	 * @generated
	 */
	EOperation getMotion__Left_translation();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#right_translation() <em>Right translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right translation</em>' operation.
	 * @see omcri4cp.agv.Motion#right_translation()
	 * @generated
	 */
	EOperation getMotion__Right_translation();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#turn_left() <em>Turn left</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn left</em>' operation.
	 * @see omcri4cp.agv.Motion#turn_left()
	 * @generated
	 */
	EOperation getMotion__Turn_left();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#turn_right() <em>Turn right</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Turn right</em>' operation.
	 * @see omcri4cp.agv.Motion#turn_right()
	 * @generated
	 */
	EOperation getMotion__Turn_right();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#left_diago_forward() <em>Left diago forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left diago forward</em>' operation.
	 * @see omcri4cp.agv.Motion#left_diago_forward()
	 * @generated
	 */
	EOperation getMotion__Left_diago_forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#left_diago_backward() <em>Left diago backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Left diago backward</em>' operation.
	 * @see omcri4cp.agv.Motion#left_diago_backward()
	 * @generated
	 */
	EOperation getMotion__Left_diago_backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#right_diago_forward() <em>Right diago forward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right diago forward</em>' operation.
	 * @see omcri4cp.agv.Motion#right_diago_forward()
	 * @generated
	 */
	EOperation getMotion__Right_diago_forward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#right_diago_backward() <em>Right diago backward</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Right diago backward</em>' operation.
	 * @see omcri4cp.agv.Motion#right_diago_backward()
	 * @generated
	 */
	EOperation getMotion__Right_diago_backward();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see omcri4cp.agv.Motion#stop()
	 * @generated
	 */
	EOperation getMotion__Stop();

	/**
	 * Returns the meta object for the '{@link omcri4cp.agv.Motion#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Applies Constraint</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Applies Constraint</em>' operation.
	 * @see omcri4cp.agv.Motion#appliesConstraint(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 */
	EOperation getMotion__AppliesConstraint__DiagnosticChain_Map();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AgvFactory getAgvFactory();

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
		 * The meta object literal for the '{@link omcri4cp.agv.impl.AgvImpl <em>Agv</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.agv.impl.AgvImpl
		 * @see omcri4cp.agv.impl.AgvPackageImpl#getAgv()
		 * @generated
		 */
		EClass AGV = eINSTANCE.getAgv();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__USER = eINSTANCE.getAgv_User();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__IP_ADDRESS = eINSTANCE.getAgv_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGV__PASSWORD = eINSTANCE.getAgv_Password();

		/**
		 * The meta object literal for the '{@link omcri4cp.agv.impl.MotionImpl <em>Motion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see omcri4cp.agv.impl.MotionImpl
		 * @see omcri4cp.agv.impl.AgvPackageImpl#getMotion()
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
		 * The meta object literal for the '<em><b>Angle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOTION__ANGLE = eINSTANCE.getMotion_Angle();

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
		 * The meta object literal for the '<em><b>Left translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___LEFT_TRANSLATION = eINSTANCE.getMotion__Left_translation();

		/**
		 * The meta object literal for the '<em><b>Right translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___RIGHT_TRANSLATION = eINSTANCE.getMotion__Right_translation();

		/**
		 * The meta object literal for the '<em><b>Turn left</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___TURN_LEFT = eINSTANCE.getMotion__Turn_left();

		/**
		 * The meta object literal for the '<em><b>Turn right</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___TURN_RIGHT = eINSTANCE.getMotion__Turn_right();

		/**
		 * The meta object literal for the '<em><b>Left diago forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___LEFT_DIAGO_FORWARD = eINSTANCE.getMotion__Left_diago_forward();

		/**
		 * The meta object literal for the '<em><b>Left diago backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___LEFT_DIAGO_BACKWARD = eINSTANCE.getMotion__Left_diago_backward();

		/**
		 * The meta object literal for the '<em><b>Right diago forward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___RIGHT_DIAGO_FORWARD = eINSTANCE.getMotion__Right_diago_forward();

		/**
		 * The meta object literal for the '<em><b>Right diago backward</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___RIGHT_DIAGO_BACKWARD = eINSTANCE.getMotion__Right_diago_backward();

		/**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___STOP = eINSTANCE.getMotion__Stop();

		/**
		 * The meta object literal for the '<em><b>Applies Constraint</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MOTION___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP = eINSTANCE.getMotion__AppliesConstraint__DiagnosticChain_Map();

	}

} //AgvPackage
