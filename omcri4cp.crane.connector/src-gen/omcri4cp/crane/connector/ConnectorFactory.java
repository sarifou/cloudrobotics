/**
 * Copyright (c) 2016-2017 Inria
 *  
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * - Philippe Merle <philippe.merle@inria.fr>
 * - Faiez Zalila <faiez.zalila@inria.fr>
 *
 * Generated at Mon May 10 10:23:51 CEST 2021 from platform:/resource/omcri4cp.crane/model/crane.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.crane.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: Crane
 * - scheme: http://cristal.org/omcri4cp/crane#
 */
public class ConnectorFactory extends omcri4cp.crane.impl.CraneFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/crane#
	 * - term: crane
	 * - title: 
	 */
	@Override
	public omcri4cp.crane.Crane createCrane() {
		return new CraneConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/crane#
	 * - term: motion
	 * - title: 
	 */
	@Override
	public omcri4cp.crane.Motion createMotion() {
		return new MotionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/crane#
	 * - term: gripper
	 * - title: 
	 */
	@Override
	public omcri4cp.crane.Gripper createGripper() {
		return new GripperConnector();
	}

}
