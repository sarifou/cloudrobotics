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
package omcri4cp.train.util;

import java.util.Map;

import omcri4cp.train.*;

import org.eclipse.cmf.occi.core.util.OCCIValidator;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see omcri4cp.train.TrainPackage
 * @generated
 */
public class TrainValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TrainValidator INSTANCE = new TrainValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "omcri4cp.train";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Motion'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MOTION__APPLIES_CONSTRAINT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Applies Constraint' of 'Accessories'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int ACCESSORIES__APPLIES_CONSTRAINT = 2;

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
	public TrainValidator() {
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
	  return TrainPackage.eINSTANCE;
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
			case TrainPackage.TRAIN:
				return validateTrain((Train)value, diagnostics, context);
			case TrainPackage.MOTION:
				return validateMotion((Motion)value, diagnostics, context);
			case TrainPackage.ACCESSORIES:
				return validateAccessories((Accessories)value, diagnostics, context);
			case TrainPackage.STATE:
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
	public boolean validateTrain(Train train, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(train, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_IdUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_AttributesNameUnique(train, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_KindCompatibleWithOneAppliesOfEachMixin(train, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateEntity_DifferentMixins(train, diagnostics, context);
		if (result || diagnostics != null) result &= occiValidator.validateResource_ResourceKindIsInParent(train, diagnostics, context);
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
	public boolean validateAccessories(Accessories accessories, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(accessories, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(accessories, diagnostics, context);
		if (result || diagnostics != null) result &= validateAccessories_appliesConstraint(accessories, diagnostics, context);
		return result;
	}

	/**
	 * Validates the appliesConstraint constraint of '<em>Accessories</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAccessories_appliesConstraint(Accessories accessories, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return accessories.appliesConstraint(diagnostics, context);
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

} //TrainValidator
