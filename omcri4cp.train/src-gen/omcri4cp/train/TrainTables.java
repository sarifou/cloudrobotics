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
 *   /omcri4cp.train/model/train.ecore
 * using:
 *   /omcri4cp.train/model/train.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcri4cp.train;

import omcri4cp.train.TrainTables;
import omcricore.OmcricoreTables;
import org.eclipse.cmf.occi.core.OCCITables;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumeration;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorEnumerationLiteral;
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
 * TrainTables provides the dispatch tables for the train for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class TrainTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(TrainPackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_train_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://cristal.org/omcri4cp/train/ecore", null, omcri4cp.train.TrainPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Accessories = omcri4cp.train.TrainTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_train_s_ecore.getClassId("Accessories", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = omcri4cp.train.TrainTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = omcri4cp.train.TrainTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Motion = omcri4cp.train.TrainTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_train_s_ecore.getClassId("Motion", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Train = omcri4cp.train.TrainTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_train_s_ecore.getClassId("Train", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.train.TrainTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_State = omcri4cp.train.TrainTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_train_s_ecore.getEnumerationId("State");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Accessories_c_c_appliesConstraint = "Accessories::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Motion_c_c_appliesConstraint = "Motion::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			TrainTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Accessories = new EcoreExecutorType(TrainPackage.Literals.ACCESSORIES, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Motion = new EcoreExecutorType(TrainPackage.Literals.MOTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _State = new EcoreExecutorEnumeration(TrainPackage.Literals.STATE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Train = new EcoreExecutorType(TrainPackage.Literals.TRAIN, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Accessories,
			_Motion,
			_State,
			_Train
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Accessories__Accessories = new ExecutorFragment(Types._Accessories, TrainTables.Types._Accessories);
		private static final /*@NonNull*/ ExecutorFragment _Accessories__MixinBase = new ExecutorFragment(Types._Accessories, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Accessories__OclAny = new ExecutorFragment(Types._Accessories, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Accessories__OclElement = new ExecutorFragment(Types._Accessories, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Motion__MixinBase = new ExecutorFragment(Types._Motion, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Motion__Motion = new ExecutorFragment(Types._Motion, TrainTables.Types._Motion);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclAny = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclElement = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _State__OclEnumeration = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _State__OclType = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _State__State = new ExecutorFragment(Types._State, TrainTables.Types._State);

		private static final /*@NonNull*/ ExecutorFragment _Train__Entity = new ExecutorFragment(Types._Train, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Train__OclAny = new ExecutorFragment(Types._Train, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Train__OclElement = new ExecutorFragment(Types._Train, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Train__Resource = new ExecutorFragment(Types._Train, OCCITables.Types._Resource);
		private static final /*@NonNull*/ ExecutorFragment _Train__Robot = new ExecutorFragment(Types._Train, OmcricoreTables.Types._Robot);
		private static final /*@NonNull*/ ExecutorFragment _Train__Train = new ExecutorFragment(Types._Train, TrainTables.Types._Train);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of TrainTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Accessories__setklaxon = new ExecutorOperation("setklaxon", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Accessories,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Accessories__setlight = new ExecutorOperation("setlight", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Accessories,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Accessories__settrainnoise = new ExecutorOperation("settrainnoise", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Accessories,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Accessories__setwagonnoise = new ExecutorOperation("setwagonnoise", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Accessories,
			3, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Motion__faster = new ExecutorOperation("faster", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__reverse = new ExecutorOperation("reverse", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__setspeed = new ExecutorOperation("setspeed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__slower = new ExecutorOperation("slower", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			4, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Accessories__klaxon = new EcoreExecutorProperty(TrainPackage.Literals.ACCESSORIES__KLAXON, Types._Accessories, 0);
		public static final /*@NonNull*/ ExecutorProperty _Accessories__light = new EcoreExecutorProperty(TrainPackage.Literals.ACCESSORIES__LIGHT, Types._Accessories, 1);
		public static final /*@NonNull*/ ExecutorProperty _Accessories__trainNoise = new EcoreExecutorProperty(TrainPackage.Literals.ACCESSORIES__TRAIN_NOISE, Types._Accessories, 2);
		public static final /*@NonNull*/ ExecutorProperty _Accessories__wagonNoise = new EcoreExecutorProperty(TrainPackage.Literals.ACCESSORIES__WAGON_NOISE, Types._Accessories, 3);

		public static final /*@NonNull*/ ExecutorProperty _Motion__speed = new EcoreExecutorProperty(TrainPackage.Literals.MOTION__SPEED, Types._Motion, 0);

		public static final /*@NonNull*/ ExecutorProperty _Train__ipAddress = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__IP_ADDRESS, Types._Train, 0);
		public static final /*@NonNull*/ ExecutorProperty _Train__port = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__PORT, Types._Train, 1);
		public static final /*@NonNull*/ ExecutorProperty _Train__trainAddress = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__TRAIN_ADDRESS, Types._Train, 2);
		public static final /*@NonNull*/ ExecutorProperty _Train__user = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__USER, Types._Train, 3);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Accessories =
			{
				Fragments._Accessories__OclAny /* 0 */,
				Fragments._Accessories__OclElement /* 1 */,
				Fragments._Accessories__MixinBase /* 2 */,
				Fragments._Accessories__Accessories /* 3 */
			};
		private static final int /*@NonNull*/ [] __Accessories = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Motion =
			{
				Fragments._Motion__OclAny /* 0 */,
				Fragments._Motion__OclElement /* 1 */,
				Fragments._Motion__MixinBase /* 2 */,
				Fragments._Motion__Motion /* 3 */
			};
		private static final int /*@NonNull*/ [] __Motion = { 1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _State =
			{
				Fragments._State__OclAny /* 0 */,
				Fragments._State__OclElement /* 1 */,
				Fragments._State__OclType /* 2 */,
				Fragments._State__OclEnumeration /* 3 */,
				Fragments._State__State /* 4 */
			};
		private static final int /*@NonNull*/ [] __State = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Train =
			{
				Fragments._Train__OclAny /* 0 */,
				Fragments._Train__OclElement /* 1 */,
				Fragments._Train__Entity /* 2 */,
				Fragments._Train__Resource /* 3 */,
				Fragments._Train__Robot /* 4 */,
				Fragments._Train__Train /* 5 */
			};
		private static final int /*@NonNull*/ [] __Train = { 1,1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Accessories.initFragments(_Accessories, __Accessories);
			Types._Motion.initFragments(_Motion, __Motion);
			Types._State.initFragments(_State, __State);
			Types._Train.initFragments(_Train, __Train);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Accessories__Accessories = {
			TrainTables.Operations._Accessories__setklaxon /* setklaxon() */,
			TrainTables.Operations._Accessories__setlight /* setlight() */,
			TrainTables.Operations._Accessories__settrainnoise /* settrainnoise() */,
			TrainTables.Operations._Accessories__setwagonnoise /* setwagonnoise() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Accessories__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Accessories__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Accessories__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__Motion = {
			TrainTables.Operations._Motion__faster /* faster() */,
			TrainTables.Operations._Motion__reverse /* reverse() */,
			TrainTables.Operations._Motion__setspeed /* setspeed() */,
			TrainTables.Operations._Motion__slower /* slower() */,
			TrainTables.Operations._Motion__stop /* stop() */
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__State = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclElement = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclEnumeration = {
			OCLstdlibTables.Operations._OclEnumeration__allInstances /* allInstances() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _State__OclType = {
			OCLstdlibTables.Operations._OclType__conformsTo /* conformsTo(OclType[?]) */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Train = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Resource = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Robot = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Accessories__Accessories.initOperations(_Accessories__Accessories);
			Fragments._Accessories__MixinBase.initOperations(_Accessories__MixinBase);
			Fragments._Accessories__OclAny.initOperations(_Accessories__OclAny);
			Fragments._Accessories__OclElement.initOperations(_Accessories__OclElement);

			Fragments._Motion__MixinBase.initOperations(_Motion__MixinBase);
			Fragments._Motion__Motion.initOperations(_Motion__Motion);
			Fragments._Motion__OclAny.initOperations(_Motion__OclAny);
			Fragments._Motion__OclElement.initOperations(_Motion__OclElement);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__OclEnumeration.initOperations(_State__OclEnumeration);
			Fragments._State__OclType.initOperations(_State__OclType);
			Fragments._State__State.initOperations(_State__State);

			Fragments._Train__Entity.initOperations(_Train__Entity);
			Fragments._Train__OclAny.initOperations(_Train__OclAny);
			Fragments._Train__OclElement.initOperations(_Train__OclElement);
			Fragments._Train__Resource.initOperations(_Train__Resource);
			Fragments._Train__Robot.initOperations(_Train__Robot);
			Fragments._Train__Train.initOperations(_Train__Train);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Accessories = {
			TrainTables.Properties._Accessories__klaxon,
			TrainTables.Properties._Accessories__light,
			TrainTables.Properties._Accessories__trainNoise,
			TrainTables.Properties._Accessories__wagonNoise
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Motion = {
			TrainTables.Properties._Motion__speed
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _State = {};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Train = {
			TrainTables.Properties._Train__ipAddress,
			TrainTables.Properties._Train__port,
			TrainTables.Properties._Train__trainAddress,
			TrainTables.Properties._Train__user
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Accessories__Accessories.initProperties(_Accessories);
			Fragments._Motion__Motion.initProperties(_Motion);
			Fragments._State__State.initProperties(_State);
			Fragments._Train__Train.initProperties(_Train);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _State__ON = new EcoreExecutorEnumerationLiteral(TrainPackage.Literals.STATE.getEEnumLiteral("ON"), Types._State, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _State__OFF = new EcoreExecutorEnumerationLiteral(TrainPackage.Literals.STATE.getEEnumLiteral("OFF"), Types._State, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _State = {
			_State__ON,
			_State__OFF
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._State.initLiterals(_State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of TrainTables::EnumerationLiterals and all preceding sub-packages.
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
