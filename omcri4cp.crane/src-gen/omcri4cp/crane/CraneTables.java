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
 *   /omcri4cp.crane/model/crane.ecore
 * using:
 *   /omcri4cp.crane/model/crane.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package omcri4cp.crane;

import omcri4cp.crane.CraneTables;
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
 * CraneTables provides the dispatch tables for the crane for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class CraneTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final /*@NonNull*/ EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(CranePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final /*@NonNull*/ ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.RootPackageId PACKid_$metamodel$ = org.eclipse.ocl.pivot.ids.IdManager.getRootPackageId("$metamodel$");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_crane_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://cristal.org/omcri4cp/crane/ecore", null, omcri4cp.crane.CranePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://schemas.ogf.org/occi/core/ecore", "occi", org.eclipse.cmf.occi.core.OCCIPackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.NsURIPackageId PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore = org.eclipse.ocl.pivot.ids.IdManager.getNsURIPackageId("http://www.eclipse.org/emf/2002/Ecore", null, org.eclipse.emf.ecore.EcorePackage.eINSTANCE);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Class = omcri4cp.crane.CraneTables.PACKid_$metamodel$.getClassId("Class", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Crane = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_crane_s_ecore.getClassId("Crane", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Entity = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_schemas_ogf_org_s_occi_s_core_s_ecore.getClassId("Entity", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Gripper = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_crane_s_ecore.getClassId("Gripper", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.ClassId CLSSid_Motion = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_crane_s_ecore.getClassId("Motion", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.DataTypeId DATAid_EInt = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_www_eclipse_org_s_emf_s_2002_s_Ecore.getDataTypeId("EInt", 0);
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.ids.EnumerationId ENUMid_State = omcri4cp.crane.CraneTables.PACKid_http_c_s_s_cristal_org_s_omcri4cp_s_crane_s_ecore.getEnumerationId("State");
	public static final /*@NonInvalid*/ org.eclipse.ocl.pivot.values.IntegerValue INT_0 = org.eclipse.ocl.pivot.utilities.ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ java.lang.String STR_Gripper_c_c_appliesConstraint = "Gripper::appliesConstraint";
	public static final /*@NonInvalid*/ java.lang.String STR_Motion_c_c_appliesConstraint = "Motion::appliesConstraint";

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			CraneTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::TypeParameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorType _Crane = new EcoreExecutorType(CranePackage.Literals.CRANE, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Gripper = new EcoreExecutorType(CranePackage.Literals.GRIPPER, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorType _Motion = new EcoreExecutorType(CranePackage.Literals.MOTION, PACKAGE, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumeration _State = new EcoreExecutorEnumeration(CranePackage.Literals.STATE, PACKAGE, 0);

		private static final /*@NonNull*/ EcoreExecutorType /*@NonNull*/ [] types = {
			_Crane,
			_Gripper,
			_Motion,
			_State
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::Types and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment _Crane__Crane = new ExecutorFragment(Types._Crane, CraneTables.Types._Crane);
		private static final /*@NonNull*/ ExecutorFragment _Crane__Entity = new ExecutorFragment(Types._Crane, OCCITables.Types._Entity);
		private static final /*@NonNull*/ ExecutorFragment _Crane__OclAny = new ExecutorFragment(Types._Crane, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Crane__OclElement = new ExecutorFragment(Types._Crane, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _Crane__Resource = new ExecutorFragment(Types._Crane, OCCITables.Types._Resource);

		private static final /*@NonNull*/ ExecutorFragment _Gripper__Gripper = new ExecutorFragment(Types._Gripper, CraneTables.Types._Gripper);
		private static final /*@NonNull*/ ExecutorFragment _Gripper__MixinBase = new ExecutorFragment(Types._Gripper, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Gripper__OclAny = new ExecutorFragment(Types._Gripper, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Gripper__OclElement = new ExecutorFragment(Types._Gripper, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _Motion__MixinBase = new ExecutorFragment(Types._Motion, OCCITables.Types._MixinBase);
		private static final /*@NonNull*/ ExecutorFragment _Motion__Motion = new ExecutorFragment(Types._Motion, CraneTables.Types._Motion);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclAny = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _Motion__OclElement = new ExecutorFragment(Types._Motion, OCLstdlibTables.Types._OclElement);

		private static final /*@NonNull*/ ExecutorFragment _State__OclAny = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclAny);
		private static final /*@NonNull*/ ExecutorFragment _State__OclElement = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclElement);
		private static final /*@NonNull*/ ExecutorFragment _State__OclEnumeration = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclEnumeration);
		private static final /*@NonNull*/ ExecutorFragment _State__OclType = new ExecutorFragment(Types._State, OCLstdlibTables.Types._OclType);
		private static final /*@NonNull*/ ExecutorFragment _State__State = new ExecutorFragment(Types._State, CraneTables.Types._State);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::Fragments and all preceding sub-packages.
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
		 * Force initialization of the fields of CraneTables::Parameters and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorOperation _Gripper__close = new ExecutorOperation("close", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Gripper,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Gripper__open = new ExecutorOperation("open", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Gripper,
			1, TemplateParameters.EMPTY_LIST, null);

		public static final /*@NonNull*/ ExecutorOperation _Motion__move_backward = new ExecutorOperation("move_backward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__move_down = new ExecutorOperation("move_down", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__move_forward = new ExecutorOperation("move_forward", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final /*@NonNull*/ ExecutorOperation _Motion__move_up = new ExecutorOperation("move_up", TypeUtil.EMPTY_PARAMETER_TYPES, Types._Motion,
			3, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::Operations and all preceding sub-packages.
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

		public static final /*@NonNull*/ ExecutorProperty _Crane__address = new EcoreExecutorProperty(CranePackage.Literals.CRANE__ADDRESS, Types._Crane, 0);
		public static final /*@NonNull*/ ExecutorProperty _Crane__user = new EcoreExecutorProperty(CranePackage.Literals.CRANE__USER, Types._Crane, 1);

		public static final /*@NonNull*/ ExecutorProperty _Gripper__state = new EcoreExecutorProperty(CranePackage.Literals.GRIPPER__STATE, Types._Gripper, 0);

		public static final /*@NonNull*/ ExecutorProperty _Motion__duration = new EcoreExecutorProperty(CranePackage.Literals.MOTION__DURATION, Types._Motion, 0);
		public static final /*@NonNull*/ ExecutorProperty _Motion__speed = new EcoreExecutorProperty(CranePackage.Literals.MOTION__SPEED, Types._Motion, 1);
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::Properties and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Crane =
			{
				Fragments._Crane__OclAny /* 0 */,
				Fragments._Crane__OclElement /* 1 */,
				Fragments._Crane__Entity /* 2 */,
				Fragments._Crane__Resource /* 3 */,
				Fragments._Crane__Crane /* 4 */
			};
		private static final int /*@NonNull*/ [] __Crane = { 1,1,1,1,1 };

		private static final /*@NonNull*/ ExecutorFragment /*@NonNull*/ [] _Gripper =
			{
				Fragments._Gripper__OclAny /* 0 */,
				Fragments._Gripper__OclElement /* 1 */,
				Fragments._Gripper__MixinBase /* 2 */,
				Fragments._Gripper__Gripper /* 3 */
			};
		private static final int /*@NonNull*/ [] __Gripper = { 1,1,1,1 };

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

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Crane.initFragments(_Crane, __Crane);
			Types._Gripper.initFragments(_Gripper, __Gripper);
			Types._Motion.initFragments(_Motion, __Motion);
			Types._State.initFragments(_State, __State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::TypeFragments and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Crane__Crane = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Crane__Entity = {
			OCCITables.Operations._Entity__occiCreate /* occiCreate() */,
			OCCITables.Operations._Entity__occiDelete /* occiDelete() */,
			OCCITables.Operations._Entity__occiRetrieve /* occiRetrieve() */,
			OCCITables.Operations._Entity__occiUpdate /* occiUpdate() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Crane__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Crane__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Crane__Resource = {};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gripper__Gripper = {
			CraneTables.Operations._Gripper__close /* close() */,
			CraneTables.Operations._Gripper__open /* open() */
		};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gripper__MixinBase = {};
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gripper__OclAny = {
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
		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Gripper__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances() */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[?]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[?]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final /*@NonNull*/ ExecutorOperation /*@NonNull*/ [] _Motion__Motion = {
			CraneTables.Operations._Motion__move_backward /* move_backward() */,
			CraneTables.Operations._Motion__move_down /* move_down() */,
			CraneTables.Operations._Motion__move_forward /* move_forward() */,
			CraneTables.Operations._Motion__move_up /* move_up() */
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

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Crane__Crane.initOperations(_Crane__Crane);
			Fragments._Crane__Entity.initOperations(_Crane__Entity);
			Fragments._Crane__OclAny.initOperations(_Crane__OclAny);
			Fragments._Crane__OclElement.initOperations(_Crane__OclElement);
			Fragments._Crane__Resource.initOperations(_Crane__Resource);

			Fragments._Gripper__Gripper.initOperations(_Gripper__Gripper);
			Fragments._Gripper__MixinBase.initOperations(_Gripper__MixinBase);
			Fragments._Gripper__OclAny.initOperations(_Gripper__OclAny);
			Fragments._Gripper__OclElement.initOperations(_Gripper__OclElement);

			Fragments._Motion__MixinBase.initOperations(_Motion__MixinBase);
			Fragments._Motion__Motion.initOperations(_Motion__Motion);
			Fragments._Motion__OclAny.initOperations(_Motion__OclAny);
			Fragments._Motion__OclElement.initOperations(_Motion__OclElement);

			Fragments._State__OclAny.initOperations(_State__OclAny);
			Fragments._State__OclElement.initOperations(_State__OclElement);
			Fragments._State__OclEnumeration.initOperations(_State__OclEnumeration);
			Fragments._State__OclType.initOperations(_State__OclType);
			Fragments._State__State.initOperations(_State__State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::FragmentOperations and all preceding sub-packages.
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

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Crane = {
			CraneTables.Properties._Crane__address,
			CraneTables.Properties._Crane__user
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Gripper = {
			CraneTables.Properties._Gripper__state
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _Motion = {
			CraneTables.Properties._Motion__duration,
			CraneTables.Properties._Motion__speed
		};

		private static final /*@NonNull*/ ExecutorProperty /*@NonNull*/ [] _State = {};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Crane__Crane.initProperties(_Crane);
			Fragments._Gripper__Gripper.initProperties(_Gripper);
			Fragments._Motion__Motion.initProperties(_Motion);
			Fragments._State__State.initProperties(_State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::FragmentProperties and all preceding sub-packages.
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

		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _State__Open = new EcoreExecutorEnumerationLiteral(CranePackage.Literals.STATE.getEEnumLiteral("Open"), Types._State, 0);
		public static final /*@NonNull*/ EcoreExecutorEnumerationLiteral _State__Closed = new EcoreExecutorEnumerationLiteral(CranePackage.Literals.STATE.getEEnumLiteral("Closed"), Types._State, 1);
		private static final /*@NonNull*/ EcoreExecutorEnumerationLiteral /*@NonNull*/ [] _State = {
			_State__Open,
			_State__Closed
		};

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {
			Types._State.initLiterals(_State);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of CraneTables::EnumerationLiterals and all preceding sub-packages.
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
