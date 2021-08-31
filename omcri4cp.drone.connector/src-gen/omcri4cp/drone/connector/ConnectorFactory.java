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
 * Generated at Mon Aug 23 16:19:12 CEST 2021 from platform:/resource/omcri4cp.drone/model/drone.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.drone.connector;

/**
 * Connector EFactory for the OCCI extension:
 * - name: drone
 * - scheme: http://cristal.org/omcri4cp/drone#
 */
public class ConnectorFactory extends omcri4cp.drone.impl.DroneFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/drone#
	 * - term: drone
	 * - title: 
	 */
	@Override
	public omcri4cp.drone.Drone createDrone() {
		return new DroneConnector();
	}

}
