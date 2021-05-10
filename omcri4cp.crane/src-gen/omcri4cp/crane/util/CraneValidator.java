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
package omcri4cp.crane.util;

import java.util.Map;

import omcri4cp.crane.*;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see omcri4cp.crane.CranePackage
 * @generated
 */
public class CraneValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CraneValidator INSTANCE = new CraneValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "omcri4cp.crane";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Motion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTION__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Gripper'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int GRIPPER__APPLIES_CONSTRAINT = 2;

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
	public CraneValidator() {
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
	  return CranePackage.eINSTANCE;
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
			case CranePackage.CRANE:
				return validateCrane((Crane)value, diagnostics, context);
			case CranePackage.MOTION:
				return validateMotion((Motion)value, diagnostics, context);
			case CranePackage.GRIPPER:
				return validateGripper((Gripper)value, diagnostics, context);
			case CranePackage.STATE:
				return validateState((State)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCrane(Crane crane, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(crane, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(crane, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(crane, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(crane, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(crane, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(crane, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(crane, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(crane, diagnostics, context);
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
	public boolean validateGripper(Gripper gripper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gripper, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gripper, diagnostics, context);
		if (result || diagnostics != null) result &= validateGripper_appliesConstraint(gripper, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Gripper</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGripper_appliesConstraint(Gripper gripper, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return gripper.appliesConstraint(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateState(State state, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
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

} //CraneValidator
