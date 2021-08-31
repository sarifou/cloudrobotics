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
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.train.TrainTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

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

		public static final /*@NonNull*/ EcoreExecutorType _Train = new EcoreExecutorType(TrainPackage.Literals.TRAIN, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
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

		private static final /*@NonNull*/ ExecutorFragment _Train__Entity = new ExecutorFragment(Types._Train, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Train__OclAny = new ExecutorFragment(Types._Train, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Train__OclElement = new ExecutorFragment(Types._Train, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Train__Resource = new ExecutorFragment(Types._Train, OCCITables.Types._Resource);
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

		public static final /*@NonNull*/ ExecutorOperation _Train__connect = new ExecutorOperation("connect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__disconnect = new ExecutorOperation("disconnect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__faster = new ExecutorOperation("faster", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__reverse = new ExecutorOperation("reverse", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__set_honk = new ExecutorOperation("set_honk", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__set_light = new ExecutorOperation("set_light", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__set_train_noise = new ExecutorOperation("set_train_noise", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__set_wagon_noise = new ExecutorOperation("set_wagon_noise", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			7, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__setspeed = new ExecutorOperation("setspeed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			8, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__slower = new ExecutorOperation("slower", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			9, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Train__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Train,
			10, TemplateParameters.EMPTY_LIST, null);

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

		public static final /*@NonNull*/ ExecutorProperty _Train__connectionState = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__CONNECTION_STATE, Types._Train, 0);
		public static final /*@NonNull*/ ExecutorProperty _Train__honkState = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__HONK_STATE, Types._Train, 1);
		public static final /*@NonNull*/ ExecutorProperty _Train__ip = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__IP, Types._Train, 2);
		public static final /*@NonNull*/ ExecutorProperty _Train__lightState = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__LIGHT_STATE, Types._Train, 3);
		public static final /*@NonNull*/ ExecutorProperty _Train__port = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__PORT, Types._Train, 4);
		public static final /*@NonNull*/ ExecutorProperty _Train__trainName = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__TRAIN_NAME, Types._Train, 5);
		public static final /*@NonNull*/ ExecutorProperty _Train__trainNoise = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__TRAIN_NOISE, Types._Train, 6);
		public static final /*@NonNull*/ ExecutorProperty _Train__trainNumber = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__TRAIN_NUMBER, Types._Train, 7);
		public static final /*@NonNull*/ ExecutorProperty _Train__trainSpeed = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__TRAIN_SPEED, Types._Train, 8);
		public static final /*@NonNull*/ ExecutorProperty _Train__user = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__USER, Types._Train, 9);
		public static final /*@NonNull*/ ExecutorProperty _Train__wagonNoise = new EcoreExecutorProperty(TrainPackage.Literals.TRAIN__WAGON_NOISE, Types._Train, 10);
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Train =
			{
				Fragments._Train__OclAny /* 0 */,
				Fragments._Train__OclElement /* 1 */,
				Fragments._Train__Entity /* 2 */,
				Fragments._Train__Resource /* 3 */,
				Fragments._Train__Train /* 4 */
			};
		private static final int /*@NonNull*/ [] __Train = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Train = {
			TrainTables.Operations._Train__connect /* connect() */,
			TrainTables.Operations._Train__disconnect /* disconnect() */,
			TrainTables.Operations._Train__faster /* faster() */,
			TrainTables.Operations._Train__reverse /* reverse() */,
			TrainTables.Operations._Train__set_honk /* set_honk() */,
			TrainTables.Operations._Train__set_light /* set_light() */,
			TrainTables.Operations._Train__set_train_noise /* set_train_noise() */,
			TrainTables.Operations._Train__set_wagon_noise /* set_wagon_noise() */,
			TrainTables.Operations._Train__setspeed /* setspeed() */,
			TrainTables.Operations._Train__slower /* slower() */,
			TrainTables.Operations._Train__stop /* stop() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Train__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Train__Entity.initOperations(_Train__Entity);
			Fragments._Train__OclAny.initOperations(_Train__OclAny);
			Fragments._Train__OclElement.initOperations(_Train__OclElement);
			Fragments._Train__Resource.initOperations(_Train__Resource);
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Train = {
			TrainTables.Properties._Train__connectionState,
			TrainTables.Properties._Train__honkState,
			TrainTables.Properties._Train__ip,
			TrainTables.Properties._Train__lightState,
			TrainTables.Properties._Train__port,
			TrainTables.Properties._Train__trainName,
			TrainTables.Properties._Train__trainNoise,
			TrainTables.Properties._Train__trainNumber,
			TrainTables.Properties._Train__trainSpeed,
			TrainTables.Properties._Train__user,
			TrainTables.Properties._Train__wagonNoise
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
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

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

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
