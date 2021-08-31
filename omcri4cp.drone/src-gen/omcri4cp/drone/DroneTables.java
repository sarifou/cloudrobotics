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
 *   /omcri4cp.drone/model/drone.ecore
 * using:
 *   /omcri4cp.drone/model/drone.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcri4cp.drone;

import omcri4cp.drone.DroneTables;
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
 * DroneTables provides the dispatch tables for the drone for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DroneTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DronePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.drone.DroneTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DroneTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Drone = new EcoreExecutorType(DronePackage.Literals.DRONE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Drone
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Drone__Drone = new ExecutorFragment(Types._Drone, DroneTables.Types._Drone);
		private static final /*@NonNull*/ ExecutorFragment _Drone__Entity = new ExecutorFragment(Types._Drone, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Drone__OclAny = new ExecutorFragment(Types._Drone, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Drone__OclElement = new ExecutorFragment(Types._Drone, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Drone__Resource = new ExecutorFragment(Types._Drone, OCCITables.Types._Resource);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of DroneTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Drone__arm = new ExecutorOperation("arm", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__backward = new ExecutorOperation("backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__change_mode = new ExecutorOperation("change_mode", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__disarm = new ExecutorOperation("disarm", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__down = new ExecutorOperation("down", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__forward = new ExecutorOperation("forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			5, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__go_to_position = new ExecutorOperation("go_to_position", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			6, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__left = new ExecutorOperation("left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			7, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__right = new ExecutorOperation("right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			8, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__set_speed = new ExecutorOperation("set_speed", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			9, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__stop = new ExecutorOperation("stop", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			10, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__turn_left = new ExecutorOperation("turn_left", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			11, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__turn_right = new ExecutorOperation("turn_right", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			12, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Drone__up = new ExecutorOperation("up", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Drone,
			13, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Drone__connectionState = new EcoreExecutorProperty(DronePackage.Literals.DRONE__CONNECTION_STATE, Types._Drone, 0);
		public static final /*@NonNull*/ ExecutorProperty _Drone__droneBattery = new EcoreExecutorProperty(DronePackage.Literals.DRONE__DRONE_BATTERY, Types._Drone, 1);
		public static final /*@NonNull*/ ExecutorProperty _Drone__droneId = new EcoreExecutorProperty(DronePackage.Literals.DRONE__DRONE_ID, Types._Drone, 2);
		public static final /*@NonNull*/ ExecutorProperty _Drone__droneMode = new EcoreExecutorProperty(DronePackage.Literals.DRONE__DRONE_MODE, Types._Drone, 3);
		public static final /*@NonNull*/ ExecutorProperty _Drone__ip = new EcoreExecutorProperty(DronePackage.Literals.DRONE__IP, Types._Drone, 4);
		public static final /*@NonNull*/ ExecutorProperty _Drone__port = new EcoreExecutorProperty(DronePackage.Literals.DRONE__PORT, Types._Drone, 5);
		public static final /*@NonNull*/ ExecutorProperty _Drone__poseAngular = new EcoreExecutorProperty(DronePackage.Literals.DRONE__POSE_ANGULAR, Types._Drone, 6);
		public static final /*@NonNull*/ ExecutorProperty _Drone__poseLinearX = new EcoreExecutorProperty(DronePackage.Literals.DRONE__POSE_LINEAR_X, Types._Drone, 7);
		public static final /*@NonNull*/ ExecutorProperty _Drone__poseLinearY = new EcoreExecutorProperty(DronePackage.Literals.DRONE__POSE_LINEAR_Y, Types._Drone, 8);
		public static final /*@NonNull*/ ExecutorProperty _Drone__poseLinearZ = new EcoreExecutorProperty(DronePackage.Literals.DRONE__POSE_LINEAR_Z, Types._Drone, 9);
		public static final /*@NonNull*/ ExecutorProperty _Drone__speedAngular = new EcoreExecutorProperty(DronePackage.Literals.DRONE__SPEED_ANGULAR, Types._Drone, 10);
		public static final /*@NonNull*/ ExecutorProperty _Drone__speedLinear = new EcoreExecutorProperty(DronePackage.Literals.DRONE__SPEED_LINEAR, Types._Drone, 11);
		public static final /*@NonNull*/ ExecutorProperty _Drone__user = new EcoreExecutorProperty(DronePackage.Literals.DRONE__USER, Types._Drone, 12);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Drone =
			{
				Fragments._Drone__OclAny /* 0 */,
				Fragments._Drone__OclElement /* 1 */,
				Fragments._Drone__Entity /* 2 */,
				Fragments._Drone__Resource /* 3 */,
				Fragments._Drone__Drone /* 4 */
			};
		private static final int /*@NonNull*/ [] __Drone = { 1,1,1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Drone.initFragments(_Drone, __Drone);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Drone__Drone = {
			DroneTables.Operations._Drone__arm /* arm() */,
			DroneTables.Operations._Drone__backward /* backward() */,
			DroneTables.Operations._Drone__change_mode /* change_mode() */,
			DroneTables.Operations._Drone__disarm /* disarm() */,
			DroneTables.Operations._Drone__down /* down() */,
			DroneTables.Operations._Drone__forward /* forward() */,
			DroneTables.Operations._Drone__go_to_position /* go_to_position() */,
			DroneTables.Operations._Drone__left /* left() */,
			DroneTables.Operations._Drone__right /* right() */,
			DroneTables.Operations._Drone__set_speed /* set_speed() */,
			DroneTables.Operations._Drone__stop /* stop() */,
			DroneTables.Operations._Drone__turn_left /* turn_left() */,
			DroneTables.Operations._Drone__turn_right /* turn_right() */,
			DroneTables.Operations._Drone__up /* up() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Drone__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Drone__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Drone__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Drone__Resource = {};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Drone__Drone.initOperations(_Drone__Drone);
			Fragments._Drone__Entity.initOperations(_Drone__Entity);
			Fragments._Drone__OclAny.initOperations(_Drone__OclAny);
			Fragments._Drone__OclElement.initOperations(_Drone__OclElement);
			Fragments._Drone__Resource.initOperations(_Drone__Resource);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Drone = {
			DroneTables.Properties._Drone__connectionState,
			DroneTables.Properties._Drone__droneBattery,
			DroneTables.Properties._Drone__droneId,
			DroneTables.Properties._Drone__droneMode,
			DroneTables.Properties._Drone__ip,
			DroneTables.Properties._Drone__port,
			DroneTables.Properties._Drone__poseAngular,
			DroneTables.Properties._Drone__poseLinearX,
			DroneTables.Properties._Drone__poseLinearY,
			DroneTables.Properties._Drone__poseLinearZ,
			DroneTables.Properties._Drone__speedAngular,
			DroneTables.Properties._Drone__speedLinear,
			DroneTables.Properties._Drone__user
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Drone__Drone.initProperties(_Drone);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DroneTables::FragmentProperties and all preceding sub-packages.
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
		 * Force initialization of the fields of DroneTables::EnumerationLiterals and all preceding sub-packages.
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
