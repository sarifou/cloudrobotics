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
 * Generated at Mon May 10 15:19:28 CEST 2021 from platform:/resource/omcri4cp.agv/model/agv.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.agv.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.wpi.rail.jrosbridge.Ros;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/agv#
 * - term: agv
 * - title: 
 */
public class AgvConnector extends omcri4cp.agv.impl.AgvImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AgvConnector.class);

	public static Ros ros ;
	/**
	 * Constructs a agv connector.
	 */
	AgvConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	/**
	 * Called when this Agv instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		
		try {
			ros = new Ros(ipAddress);
			ros.connect();
		} catch (Exception e) {
			LOGGER.error("Cannot connect agv resource to the rosbridge server");
		}
	}
	
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		try {
			ros.disconnect();
		} catch (Exception e) {
			LOGGER.error("Cannot disconnet agv resource");
		}
	}
	
}	
