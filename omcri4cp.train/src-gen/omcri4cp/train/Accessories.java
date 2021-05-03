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
package omcri4cp.train;

import java.util.Map;

import org.eclipse.cmf.occi.core.MixinBase;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accessories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link omcri4cp.train.Accessories#getKlaxon <em>Klaxon</em>}</li>
 *   <li>{@link omcri4cp.train.Accessories#getLight <em>Light</em>}</li>
 *   <li>{@link omcri4cp.train.Accessories#getTrainNoise <em>Train Noise</em>}</li>
 *   <li>{@link omcri4cp.train.Accessories#getWagonNoise <em>Wagon Noise</em>}</li>
 * </ul>
 *
 * @see omcri4cp.train.TrainPackage#getAccessories()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='appliesConstraint'"
 * @generated
 */
public interface Accessories extends MixinBase {
	/**
	 * Returns the value of the '<em><b>Klaxon</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link omcri4cp.train.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Klaxon</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #setKlaxon(State)
	 * @see omcri4cp.train.TrainPackage#getAccessories_Klaxon()
	 * @model default="OFF"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!klaxon'"
	 * @generated
	 */
	State getKlaxon();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Accessories#getKlaxon <em>Klaxon</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klaxon</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #getKlaxon()
	 * @generated
	 */
	void setKlaxon(State value);

	/**
	 * Returns the value of the '<em><b>Light</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link omcri4cp.train.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Light</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #setLight(State)
	 * @see omcri4cp.train.TrainPackage#getAccessories_Light()
	 * @model default="OFF"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!light'"
	 * @generated
	 */
	State getLight();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Accessories#getLight <em>Light</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Light</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #getLight()
	 * @generated
	 */
	void setLight(State value);

	/**
	 * Returns the value of the '<em><b>Train Noise</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link omcri4cp.train.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Train Noise</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #setTrainNoise(State)
	 * @see omcri4cp.train.TrainPackage#getAccessories_TrainNoise()
	 * @model default="OFF"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!trainNoise'"
	 * @generated
	 */
	State getTrainNoise();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Accessories#getTrainNoise <em>Train Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Train Noise</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #getTrainNoise()
	 * @generated
	 */
	void setTrainNoise(State value);

	/**
	 * Returns the value of the '<em><b>Wagon Noise</b></em>' attribute.
	 * The default value is <code>"OFF"</code>.
	 * The literals are from the enumeration {@link omcri4cp.train.State}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wagon Noise</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #setWagonNoise(State)
	 * @see omcri4cp.train.TrainPackage#getAccessories_WagonNoise()
	 * @model default="OFF"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!wagonNoise'"
	 * @generated
	 */
	State getWagonNoise();

	/**
	 * Sets the value of the '{@link omcri4cp.train.Accessories#getWagonNoise <em>Wagon Noise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wagon Noise</em>' attribute.
	 * @see omcri4cp.train.State
	 * @see #getWagonNoise()
	 * @generated
	 */
	void setWagonNoise(State value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setklaxon()'"
	 * @generated
	 */
	void setklaxon();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setlight()'"
	 * @generated
	 */
	void setlight();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!settrainnoise()'"
	 * @generated
	 */
	void settrainnoise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='throw new UnsupportedOperationException();  // FIXME Unimplemented http://cristal.org/omcri4cp/train/ecore!Accessories!setwagonnoise()'"
	 * @generated
	 */
	void setwagonnoise();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='/**\n *\n * inv appliesConstraint:\n *   let severity : Integer[1] = \'Accessories::appliesConstraint\'.getSeverity()\n *   in\n *     if severity &lt;= 0\n *     then true\n *     else\n *       let result : occi::Boolean[1] = self.entity.oclIsKindOf(Train)\n *       in\n *         \'Accessories::appliesConstraint\'.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)\n *     endif\n \052/\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.evaluation.Executor%&gt; executor = &lt;%org.eclipse.ocl.pivot.internal.utilities.PivotUtilInternal%&gt;.getExecutor(this);\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.ids.IdResolver%&gt; idResolver = executor.getIdResolver();\nfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.values.IntegerValue%&gt; severity_0 = &lt;%org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation%&gt;.INSTANCE.evaluate(executor, &lt;%omcri4cp.train.TrainTables%&gt;.STR_Accessories_c_c_appliesConstraint);\nfinal /*@NonInvalid\052/ boolean le = &lt;%org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation%&gt;.INSTANCE.evaluate(executor, severity_0, &lt;%omcri4cp.train.TrainTables%&gt;.INT_0).booleanValue();\n/*@NonInvalid\052/ boolean symbol_0;\nif (le) {\n\tsymbol_0 = &lt;%org.eclipse.ocl.pivot.utilities.ValueUtil%&gt;.TRUE_VALUE;\n}\nelse {\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.ocl.pivot.Class%&gt; TYP_train_c_c_Train_0 = idResolver.getClass(&lt;%omcri4cp.train.TrainTables%&gt;.CLSSid_Train, null);\n\tfinal /*@NonInvalid\052/ &lt;%org.eclipse.cmf.occi.core.Entity%&gt; entity = this.getEntity();\n\tfinal /*@NonInvalid\052/ boolean result = &lt;%org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation%&gt;.INSTANCE.evaluate(executor, entity, TYP_train_c_c_Train_0).booleanValue();\n\tfinal /*@NonInvalid\052/ boolean logDiagnostic = &lt;%org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation%&gt;.INSTANCE.evaluate(executor, &lt;%org.eclipse.ocl.pivot.ids.TypeId%&gt;.BOOLEAN, &lt;%omcri4cp.train.TrainTables%&gt;.STR_Accessories_c_c_appliesConstraint, this, (Object)null, diagnostics, context, (Object)null, severity_0, result, &lt;%omcri4cp.train.TrainTables%&gt;.INT_0).booleanValue();\n\tsymbol_0 = logDiagnostic;\n}\nreturn Boolean.TRUE == symbol_0;'"
	 * @generated
	 */
	boolean appliesConstraint(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Accessories
