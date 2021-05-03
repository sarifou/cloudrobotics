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
package omcri4cp.agv.util;

import java.util.Map;

import omcri4cp.agv.*;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see omcri4cp.agv.AgvPackage
 * @generated
 */
public class AgvValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final AgvValidator INSTANCE = new AgvValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "omcri4cp.agv";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Motion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTION__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Sensors'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int SENSORS__APPLIES_CONSTRAINT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 2;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OCCIValidator occiValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgvValidator() {
		super();
		occiValidator = OCCIValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return AgvPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case AgvPackage.AGV:
				return validateAgv((Agv)value, diagnostics, context);
			case AgvPackage.MOTION:
				return validateMotion((Motion)value, diagnostics, context);
			case AgvPackage.SENSORS:
				return validateSensors((Sensors)value, diagnostics, context);
			case AgvPackage.IR:
				return validateIr((Ir)value, diagnostics, context);
			case AgvPackage.ULTRASONIC:
				return validateUltrasonic((Ultrasonic)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAgv(Agv agv, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(agv, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(agv, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(agv, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(agv, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(agv, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(agv, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(agv, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(agv, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotion(Motion motion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(motion, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(motion, diagnostics, context);
		if (result || diagnostics != null) result &= validateMotion_appliesConstraint(motion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Motion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMotion_appliesConstraint(Motion motion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return motion.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensors(Sensors sensors, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sensors, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sensors, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensors_appliesConstraint(sensors, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Sensors</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSensors_appliesConstraint(Sensors sensors, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return sensors.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIr(Ir ir, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ir, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ir, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensors_appliesConstraint(ir, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUltrasonic(Ultrasonic ultrasonic, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(ultrasonic, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(ultrasonic, diagnostics, context);
		if (result || diagnostics != null) result &= validateSensors_appliesConstraint(ultrasonic, diagnostics, context);
		return result;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //AgvValidator
