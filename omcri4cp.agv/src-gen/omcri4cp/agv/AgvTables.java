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
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.agv.AgvTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

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

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Agv
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

		public static final /*@NonNull*/ ExecutorOperation _Agv__backward = new ExecutorOperation("backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__close_gripper = new ExecutorOperation("close_gripper", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__connect = new ExecutorOperation("connect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__disconnect = new ExecutorOperation("disconnect", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__forward = new ExecutorOperation("forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__get_distance = new ExecutorOperation("get_distance", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__get_line_sensors = new ExecutorOperation("get_line_sensors", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__go_to_position = new ExecutorOperation("go_to_position", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			7, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__left = new ExecutorOperation("left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			8, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__left_bottom = new ExecutorOperation("left_bottom", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			9, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__left_up = new ExecutorOperation("left_up", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			10, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__open_gripper = new ExecutorOperation("open_gripper", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			11, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__right = new ExecutorOperation("right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			12, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__right_bottom = new ExecutorOperation("right_bottom", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			13, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__right_up = new ExecutorOperation("right_up", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			14, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__set_gripper_position = new ExecutorOperation("set_gripper_position", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			15, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			16, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__turn_around = new ExecutorOperation("turn_around", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			17, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__turn_left = new ExecutorOperation("turn_left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			18, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Agv__turn_right = new ExecutorOperation("turn_right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Agv,
			19, TemplateParameters.EMPTY_LIST, null);

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

		public static final /*@NonNull*/ ExecutorProperty _Agv__connectionState = new EcoreExecutorProperty(AgvPackage.Literals.AGV__CONNECTION_STATE, Types._Agv, 0);
		public static final /*@NonNull*/ ExecutorProperty _Agv__distance = new EcoreExecutorProperty(AgvPackage.Literals.AGV__DISTANCE, Types._Agv, 1);
		public static final /*@NonNull*/ ExecutorProperty _Agv__gripperState = new EcoreExecutorProperty(AgvPackage.Literals.AGV__GRIPPER_STATE, Types._Agv, 2);
		public static final /*@NonNull*/ ExecutorProperty _Agv__gripperX = new EcoreExecutorProperty(AgvPackage.Literals.AGV__GRIPPER_X, Types._Agv, 3);
		public static final /*@NonNull*/ ExecutorProperty _Agv__gripperY = new EcoreExecutorProperty(AgvPackage.Literals.AGV__GRIPPER_Y, Types._Agv, 4);
		public static final /*@NonNull*/ ExecutorProperty _Agv__gripperZ = new EcoreExecutorProperty(AgvPackage.Literals.AGV__GRIPPER_Z, Types._Agv, 5);
		public static final /*@NonNull*/ ExecutorProperty _Agv__ip = new EcoreExecutorProperty(AgvPackage.Literals.AGV__IP, Types._Agv, 6);
		public static final /*@NonNull*/ ExecutorProperty _Agv__lineLeft = new EcoreExecutorProperty(AgvPackage.Literals.AGV__LINE_LEFT, Types._Agv, 7);
		public static final /*@NonNull*/ ExecutorProperty _Agv__lineMiddle = new EcoreExecutorProperty(AgvPackage.Literals.AGV__LINE_MIDDLE, Types._Agv, 8);
		public static final /*@NonNull*/ ExecutorProperty _Agv__lineRight = new EcoreExecutorProperty(AgvPackage.Literals.AGV__LINE_RIGHT, Types._Agv, 9);
		public static final /*@NonNull*/ ExecutorProperty _Agv__port = new EcoreExecutorProperty(AgvPackage.Literals.AGV__PORT, Types._Agv, 10);
		public static final /*@NonNull*/ ExecutorProperty _Agv__poseAngular = new EcoreExecutorProperty(AgvPackage.Literals.AGV__POSE_ANGULAR, Types._Agv, 11);
		public static final /*@NonNull*/ ExecutorProperty _Agv__poseX = new EcoreExecutorProperty(AgvPackage.Literals.AGV__POSE_X, Types._Agv, 12);
		public static final /*@NonNull*/ ExecutorProperty _Agv__poseY = new EcoreExecutorProperty(AgvPackage.Literals.AGV__POSE_Y, Types._Agv, 13);
		public static final /*@NonNull*/ ExecutorProperty _Agv__speedAngular = new EcoreExecutorProperty(AgvPackage.Literals.AGV__SPEED_ANGULAR, Types._Agv, 14);
		public static final /*@NonNull*/ ExecutorProperty _Agv__speedLinear = new EcoreExecutorProperty(AgvPackage.Literals.AGV__SPEED_LINEAR, Types._Agv, 15);
		public static final /*@NonNull*/ ExecutorProperty _Agv__user = new EcoreExecutorProperty(AgvPackage.Literals.AGV__USER, Types._Agv, 16);
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

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Agv.initFragments(_Agv, __Agv);

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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Agv__Agv = {
			AgvTables.Operations._Agv__backward /* backward() */,
			AgvTables.Operations._Agv__close_gripper /* close_gripper() */,
			AgvTables.Operations._Agv__connect /* connect() */,
			AgvTables.Operations._Agv__disconnect /* disconnect() */,
			AgvTables.Operations._Agv__forward /* forward() */,
			AgvTables.Operations._Agv__get_distance /* get_distance() */,
			AgvTables.Operations._Agv__get_line_sensors /* get_line_sensors() */,
			AgvTables.Operations._Agv__go_to_position /* go_to_position() */,
			AgvTables.Operations._Agv__left /* left() */,
			AgvTables.Operations._Agv__left_bottom /* left_bottom() */,
			AgvTables.Operations._Agv__left_up /* left_up() */,
			AgvTables.Operations._Agv__open_gripper /* open_gripper() */,
			AgvTables.Operations._Agv__right /* right() */,
			AgvTables.Operations._Agv__right_bottom /* right_bottom() */,
			AgvTables.Operations._Agv__right_up /* right_up() */,
			AgvTables.Operations._Agv__set_gripper_position /* set_gripper_position() */,
			AgvTables.Operations._Agv__stop /* stop() */,
			AgvTables.Operations._Agv__turn_around /* turn_around() */,
			AgvTables.Operations._Agv__turn_left /* turn_left() */,
			AgvTables.Operations._Agv__turn_right /* turn_right() */
		};
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agv__Agv.initOperations(_Agv__Agv);
			Fragments._Agv__Entity.initOperations(_Agv__Entity);
			Fragments._Agv__OclAny.initOperations(_Agv__OclAny);
			Fragments._Agv__OclElement.initOperations(_Agv__OclElement);
			Fragments._Agv__Resource.initOperations(_Agv__Resource);

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
			AgvTables.Properties._Agv__connectionState,
			AgvTables.Properties._Agv__distance,
			AgvTables.Properties._Agv__gripperState,
			AgvTables.Properties._Agv__gripperX,
			AgvTables.Properties._Agv__gripperY,
			AgvTables.Properties._Agv__gripperZ,
			AgvTables.Properties._Agv__ip,
			AgvTables.Properties._Agv__lineLeft,
			AgvTables.Properties._Agv__lineMiddle,
			AgvTables.Properties._Agv__lineRight,
			AgvTables.Properties._Agv__port,
			AgvTables.Properties._Agv__poseAngular,
			AgvTables.Properties._Agv__poseX,
			AgvTables.Properties._Agv__poseY,
			AgvTables.Properties._Agv__speedAngular,
			AgvTables.Properties._Agv__speedLinear,
			AgvTables.Properties._Agv__user
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Agv__Agv.initProperties(_Agv);

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
