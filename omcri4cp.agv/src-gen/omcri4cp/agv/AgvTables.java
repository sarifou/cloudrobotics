/*******************************************************************************
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
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /omcri4cp.agv/model/agv.ecore
 * using:
 *   /omcri4cp.agv/model/agv.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcri4cp.agv;

import omcri4cp.agv.AgvTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;

/**
 * AgvTables provides the dispatch tables for the agv for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class AgvTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(AgvPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_agv_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://cristal.org/omcri4cp/agv/ecore", null, omcri4cp.agv.AgvPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Agv = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_agv_s_ecore.getClassId("Agv", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = omcri4cp.agv.AgvTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Motion = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_agv_s_ecore.getClassId("Motion", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Sensors = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_agv_s_ecore.getClassId("Sensors", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Motion_c_c_appliesConstraint = "Motion::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Sensors_c_c_appliesConstraint = "Sensors::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			AgvTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final /*@NonNull*/ EcoreExecutorType _Agv = new EcoreExecutorType(AgvPackage.Literals.AGV, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ir = new EcoreExecutorType(AgvPackage.Literals.IR, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Motion = new EcoreExecutorType(AgvPackage.Literals.MOTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Sensors = new EcoreExecutorType(AgvPackage.Literals.SENSORS, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Ultrasonic = new EcoreExecutorType(AgvPackage.Literals.ULTRASONIC, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Agv,
			_Ir,
			_Motion,
			_Sensors,
			_Ultrasonic
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final /*@NonNull*/ ExecutorFragment _Agv__Agv = new ExecutorFragment(Types._Agv, AgvTables.Types._Agv);
		private static final /*@NonNull*/ ExecutorFragment _Agv__Entity = new ExecutorFragment(Types._Agv, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Agv__OclAny = new ExecutorFragment(Types._Agv, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Agv__OclElement = new ExecutorFragment(Types._Agv, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Agv__Resource = new ExecutorFragment(Types._Agv, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Ir__Ir = new ExecutorFragment(Types._Ir, AgvTables.Types._Ir);
		private static final /*@NonNull*/ ExecutorFragment _Ir__MixinBase = new ExecutorFragment(Types._Ir, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ir__OclAny = new ExecutorFragment(Types._Ir, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ir__OclElement = new ExecutorFragment(Types._Ir, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ir__Sensors = new ExecutorFragment(Types._Ir, AgvTables.Types._Sensors);

		private static final /*@NonNull*/ ExecutorFragment _Motion__MixinBase = new ExecutorFragment(Types._Motion, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Motion__Motion = new ExecutorFragment(Types._Motion, AgvTables.Types._Motion);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclAny = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclElement = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Sensors__MixinBase = new ExecutorFragment(Types._Sensors, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Sensors__OclAny = new ExecutorFragment(Types._Sensors, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Sensors__OclElement = new ExecutorFragment(Types._Sensors, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Sensors__Sensors = new ExecutorFragment(Types._Sensors, AgvTables.Types._Sensors);

		private static final /*@NonNull*/ ExecutorFragment _Ultrasonic__MixinBase = new ExecutorFragment(Types._Ultrasonic, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonic__OclAny = new ExecutorFragment(Types._Ultrasonic, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonic__OclElement = new ExecutorFragment(Types._Ultrasonic, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonic__Sensors = new ExecutorFragment(Types._Ultrasonic, AgvTables.Types._Sensors);
		private static final /*@NonNull*/ ExecutorFragment _Ultrasonic__Ultrasonic = new ExecutorFragment(Types._Ultrasonic, AgvTables.Types._Ultrasonic);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}


		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final /*@NonNull*/ ExecutorOperation _Ir__sense_line = new ExecutorOperation("sense_line", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Ir,
			0, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Motion__left = new ExecutorOperation("left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__left_diago_backward = new ExecutorOperation("left_diago_backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__left_diago_forward = new ExecutorOperation("left_diago_forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__move_backward = new ExecutorOperation("move_backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__move_forward = new ExecutorOperation("move_forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__right = new ExecutorOperation("right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__right_diago_backward = new ExecutorOperation("right_diago_backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__right_diago_forward = new ExecutorOperation("right_diago_forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			7, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			8, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__turn_left = new ExecutorOperation("turn_left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			9, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__turn_right = new ExecutorOperation("turn_right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			10, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Ultrasonic__sense_distance = new ExecutorOperation("sense_distance", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Ultrasonic,
			0, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final /*@NonNull*/ ExecutorProperty _Agv__ipAddress = new EcoreExecutorProperty(AgvPackage.Literals.AGV__IP_ADDRESS, Types._Agv, 0);
		public static final /*@NonNull*/ ExecutorProperty _Agv__password = new EcoreExecutorProperty(AgvPackage.Literals.AGV__PASSWORD, Types._Agv, 1);
		public static final /*@NonNull*/ ExecutorProperty _Agv__user = new EcoreExecutorProperty(AgvPackage.Literals.AGV__USER, Types._Agv, 2);

		public static final /*@NonNull*/ ExecutorProperty _Motion__angle = new EcoreExecutorProperty(AgvPackage.Literals.MOTION__ANGLE, Types._Motion, 0);
		public static final /*@NonNull*/ ExecutorProperty _Motion__duration = new EcoreExecutorProperty(AgvPackage.Literals.MOTION__DURATION, Types._Motion, 1);
		public static final /*@NonNull*/ ExecutorProperty _Motion__speed = new EcoreExecutorProperty(AgvPackage.Literals.MOTION__SPEED, Types._Motion, 2);

		public static final /*@NonNull*/ ExecutorProperty _Ultrasonic__distance = new EcoreExecutorProperty(AgvPackage.Literals.ULTRASONIC__DISTANCE, Types._Ultrasonic, 0);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Agv =
			{
				Fragments._Agv__OclAny /* 0 */,
				Fragments._Agv__OclElement /* 1 */,
				Fragments._Agv__Entity /* 2 */,
				Fragments._Agv__Resource /* 3 */,
				Fragments._Agv__Agv /* 4 */
			};
		private static final int /*@NonNull*/ [] __Agv = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ir =
			{
				Fragments._Ir__OclAny /* 0 */,
				Fragments._Ir__OclElement /* 1 */,
				Fragments._Ir__MixinBase /* 2 */,
				Fragments._Ir__Sensors /* 3 */,
				Fragments._Ir__Ir /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ir = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Motion =
			{
				Fragments._Motion__OclAny /* 0 */,
				Fragments._Motion__OclElement /* 1 */,
				Fragments._Motion__MixinBase /* 2 */,
				Fragments._Motion__Motion /* 3 */
			};
		private static final int /*@NonNull*/ [] __Motion = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Sensors =
			{
				Fragments._Sensors__OclAny /* 0 */,
				Fragments._Sensors__OclElement /* 1 */,
				Fragments._Sensors__MixinBase /* 2 */,
				Fragments._Sensors__Sensors /* 3 */
			};
		private static final int /*@NonNull*/ [] __Sensors = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Ultrasonic =
			{
				Fragments._Ultrasonic__OclAny /* 0 */,
				Fragments._Ultrasonic__OclElement /* 1 */,
				Fragments._Ultrasonic__MixinBase /* 2 */,
				Fragments._Ultrasonic__Sensors /* 3 */,
				Fragments._Ultrasonic__Ultrasonic /* 4 */
			};
		private static final int /*@NonNull*/ [] __Ultrasonic = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Agv.initFragments(_Agv, __Agv);
			Types._Ir.initFragments(_Ir, __Ir);
			Types._Motion.initFragments(_Motion, __Motion);
			Types._Sensors.initFragments(_Sensors, __Sensors);
			Types._Ultrasonic.initFragments(_Ultrasonic, __Ultrasonic);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__Agv = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ir__Ir = {
			AgvTables.Operations._Ir__sense_line /* sense_line() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ir__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ir__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ir__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ir__Sensors = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__Motion = {
			AgvTables.Operations._Motion__left /* left() */,
			AgvTables.Operations._Motion__left_diago_backward /* left_diago_backward() */,
			AgvTables.Operations._Motion__left_diago_forward /* left_diago_forward() */,
			AgvTables.Operations._Motion__move_backward /* move_backward() */,
			AgvTables.Operations._Motion__move_forward /* move_forward() */,
			AgvTables.Operations._Motion__right /* right() */,
			AgvTables.Operations._Motion__right_diago_backward /* right_diago_backward() */,
			AgvTables.Operations._Motion__right_diago_forward /* right_diago_forward() */,
			AgvTables.Operations._Motion__stop /* stop() */,
			AgvTables.Operations._Motion__turn_left /* turn_left() */,
			AgvTables.Operations._Motion__turn_right /* turn_right() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensors__Sensors = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensors__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensors__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Sensors__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonic__Ultrasonic = {
			AgvTables.Operations._Ultrasonic__sense_distance /* sense_distance() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonic__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonic__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[?]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonic__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Ultrasonic__Sensors = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agv__Agv.initOperations(_Agv__Agv);
			Fragments._Agv__Entity.initOperations(_Agv__Entity);
			Fragments._Agv__OclAny.initOperations(_Agv__OclAny);
			Fragments._Agv__OclElement.initOperations(_Agv__OclElement);
			Fragments._Agv__Resource.initOperations(_Agv__Resource);

			Fragments._Ir__Ir.initOperations(_Ir__Ir);
			Fragments._Ir__MixinBase.initOperations(_Ir__MixinBase);
			Fragments._Ir__OclAny.initOperations(_Ir__OclAny);
			Fragments._Ir__OclElement.initOperations(_Ir__OclElement);
			Fragments._Ir__Sensors.initOperations(_Ir__Sensors);

			Fragments._Motion__MixinBase.initOperations(_Motion__MixinBase);
			Fragments._Motion__Motion.initOperations(_Motion__Motion);
			Fragments._Motion__OclAny.initOperations(_Motion__OclAny);
			Fragments._Motion__OclElement.initOperations(_Motion__OclElement);

			Fragments._Sensors__MixinBase.initOperations(_Sensors__MixinBase);
			Fragments._Sensors__OclAny.initOperations(_Sensors__OclAny);
			Fragments._Sensors__OclElement.initOperations(_Sensors__OclElement);
			Fragments._Sensors__Sensors.initOperations(_Sensors__Sensors);

			Fragments._Ultrasonic__MixinBase.initOperations(_Ultrasonic__MixinBase);
			Fragments._Ultrasonic__OclAny.initOperations(_Ultrasonic__OclAny);
			Fragments._Ultrasonic__OclElement.initOperations(_Ultrasonic__OclElement);
			Fragments._Ultrasonic__Sensors.initOperations(_Ultrasonic__Sensors);
			Fragments._Ultrasonic__Ultrasonic.initOperations(_Ultrasonic__Ultrasonic);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Agv = {
			AgvTables.Properties._Agv__ipAddress,
			AgvTables.Properties._Agv__password,
			AgvTables.Properties._Agv__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ir = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Motion = {
			AgvTables.Properties._Motion__angle,
			AgvTables.Properties._Motion__duration,
			AgvTables.Properties._Motion__speed
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Sensors = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Ultrasonic = {
			AgvTables.Properties._Ultrasonic__distance
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agv__Agv.initProperties(_Agv);
			Fragments._Ir__Ir.initProperties(_Ir);
			Fragments._Motion__Motion.initProperties(_Motion);
			Fragments._Sensors__Sensors.initProperties(_Sensors);
			Fragments._Ultrasonic__Ultrasonic.initProperties(_Ultrasonic);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of AgvTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual cobstruction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual cobstruction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {}
}
