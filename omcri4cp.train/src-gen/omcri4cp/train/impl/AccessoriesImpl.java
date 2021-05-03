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

import java.lang.reflect.InvocationTargetException;

import java.util.Map;

import omcri4cp.train.Accessories;
import omcri4cp.train.State;
import omcri4cp.train.TrainPackage;
import omcri4cp.train.TrainTables;

import org.eclipse.cmf.occi.core.Entity;

import org.eclipse.cmf.occi.core.impl.MixinBaseImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accessories</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.train.impl.AccessoriesImpl#getKlaxon <em>Klaxon</em>}</li>
 *   <li>{@link omcri4cp.train.impl.AccessoriesImpl#getLight <em>Light</em>}</li>
 *   <li>{@link omcri4cp.train.impl.AccessoriesImpl#getTrainNoise <em>Train Noise</em>}</li>
 *   <li>{@link omcri4cp.train.impl.AccessoriesImpl#getWagonNoise <em>Wagon Noise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccessoriesImpl extends MixinBaseImpl implements Accessories {
	/**
	 * The default value of the '{@link #getKlaxon() <em>Klaxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlaxon()
	 * @generated
	 * @ordered
	 */
	protected static final State KLAXON_EDEFAULT = State.OFF;

	/**
	 * The cached value of the '{@link #getKlaxon() <em>Klaxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKlaxon()
	 * @generated
	 * @ordered
	 */
	protected State klaxon = KLAXON_EDEFAULT;

	/**
	 * The default value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected static final State LIGHT_EDEFAULT = State.OFF;

	/**
	 * The cached value of the '{@link #getLight() <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLight()
	 * @generated
	 * @ordered
	 */
	protected State light = LIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getTrainNoise() <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNoise()
	 * @generated
	 * @ordered
	 */
	protected static final State TRAIN_NOISE_EDEFAULT = State.OFF;

	/**
	 * The cached value of the '{@link #getTrainNoise() <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrainNoise()
	 * @generated
	 * @ordered
	 */
	protected State trainNoise = TRAIN_NOISE_EDEFAULT;

	/**
	 * The default value of the '{@link #getWagonNoise() <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWagonNoise()
	 * @generated
	 * @ordered
	 */
	protected static final State WAGON_NOISE_EDEFAULT = State.OFF;

	/**
	 * The cached value of the '{@link #getWagonNoise() <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWagonNoise()
	 * @generated
	 * @ordered
	 */
	protected State wagonNoise = WAGON_NOISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessoriesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrainPackage.Literals.ACCESSORIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getKlaxon() {
		return klaxon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKlaxon(State newKlaxon) {
		State oldKlaxon = klaxon;
		klaxon = newKlaxon == null ? KLAXON_EDEFAULT : newKlaxon;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.ACCESSORIES__KLAXON, oldKlaxon, klaxon));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getLight() {
		return light;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLight(State newLight) {
		State oldLight = light;
		light = newLight == null ? LIGHT_EDEFAULT : newLight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.ACCESSORIES__LIGHT, oldLight, light));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getTrainNoise() {
		return trainNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrainNoise(State newTrainNoise) {
		State oldTrainNoise = trainNoise;
		trainNoise = newTrainNoise == null ? TRAIN_NOISE_EDEFAULT : newTrainNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.ACCESSORIES__TRAIN_NOISE, oldTrainNoise, trainNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getWagonNoise() {
		return wagonNoise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWagonNoise(State newWagonNoise) {
		State oldWagonNoise = wagonNoise;
		wagonNoise = newWagonNoise == null ? WAGON_NOISE_EDEFAULT : newWagonNoise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrainPackage.ACCESSORIES__WAGON_NOISE, oldWagonNoise, wagonNoise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setklaxon() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setklaxon()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setlight() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setlight()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void settrainnoise() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!settrainnoise()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setwagonnoise() {
		throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setwagonnoise()
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean appliesConstraint(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		/**
		 *
		 * inv appliesConstraint:
		 *   let severity : Integer[1] = 'Accessories::appliesConstraint'.getSeverity()
		 *   in
		 *     if severity <= 0
		 *     then true
		 *     else
		 *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Train)
		 *       in
		 *         'Accessories::appliesConstraint'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
		 *     endif
		 */
		final /*@NonInvalid*/ Executor executor = PivotUtilInternal.getExecutor(this);
		final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
		final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor, TrainTables.STR_Accessories_c_c_appliesConstraint);
		final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE.evaluate(executor, severity_0, TrainTables.INT_0).booleanValue();
		/*@NonInvalid*/ boolean symbol_0;
		if (le) {
			symbol_0 = ValueUtil.TRUE_VALUE;
		}
		else {
			final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_train_c_c_Train_0 = idResolver.getClass(TrainTables.CLSSid_Train, null);
			final /*@NonInvalid*/ Entity entity = this.getEntity();
			final /*@NonInvalid*/ boolean result = OclAnyOclIsKindOfOperation.INSTANCE.evaluate(executor, entity, TYP_train_c_c_Train_0).booleanValue();
			final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE.evaluate(executor, TypeId.BOOLEAN, TrainTables.STR_Accessories_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, TrainTables.INT_0).booleanValue();
			symbol_0 = logDiagnostic;
		}
		return Boolean.TRUE == symbol_0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrainPackage.ACCESSORIES__KLAXON:
				return getKlaxon();
			case TrainPackage.ACCESSORIES__LIGHT:
				return getLight();
			case TrainPackage.ACCESSORIES__TRAIN_NOISE:
				return getTrainNoise();
			case TrainPackage.ACCESSORIES__WAGON_NOISE:
				return getWagonNoise();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrainPackage.ACCESSORIES__KLAXON:
				setKlaxon((State)newValue);
				return;
			case TrainPackage.ACCESSORIES__LIGHT:
				setLight((State)newValue);
				return;
			case TrainPackage.ACCESSORIES__TRAIN_NOISE:
				setTrainNoise((State)newValue);
				return;
			case TrainPackage.ACCESSORIES__WAGON_NOISE:
				setWagonNoise((State)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrainPackage.ACCESSORIES__KLAXON:
				setKlaxon(KLAXON_EDEFAULT);
				return;
			case TrainPackage.ACCESSORIES__LIGHT:
				setLight(LIGHT_EDEFAULT);
				return;
			case TrainPackage.ACCESSORIES__TRAIN_NOISE:
				setTrainNoise(TRAIN_NOISE_EDEFAULT);
				return;
			case TrainPackage.ACCESSORIES__WAGON_NOISE:
				setWagonNoise(WAGON_NOISE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrainPackage.ACCESSORIES__KLAXON:
				return klaxon != KLAXON_EDEFAULT;
			case TrainPackage.ACCESSORIES__LIGHT:
				return light != LIGHT_EDEFAULT;
			case TrainPackage.ACCESSORIES__TRAIN_NOISE:
				return trainNoise != TRAIN_NOISE_EDEFAULT;
			case TrainPackage.ACCESSORIES__WAGON_NOISE:
				return wagonNoise != WAGON_NOISE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case TrainPackage.ACCESSORIES___SETKLAXON:
				setklaxon();
				return null;
			case TrainPackage.ACCESSORIES___SETLIGHT:
				setlight();
				return null;
			case TrainPackage.ACCESSORIES___SETTRAINNOISE:
				settrainnoise();
				return null;
			case TrainPackage.ACCESSORIES___SETWAGONNOISE:
				setwagonnoise();
				return null;
			case TrainPackage.ACCESSORIES___APPLIES_CONSTRAINT__DIAGNOSTICCHAIN_MAP:
				return appliesConstraint((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (klaxon: ");
		result.append(klaxon);
		result.append(", light: ");
		result.append(light);
		result.append(", trainNoise: ");
		result.append(trainNoise);
		result.append(", wagonNoise: ");
		result.append(wagonNoise);
		result.append(')');
		return result.toString();
	}

} //AccessoriesImpl
