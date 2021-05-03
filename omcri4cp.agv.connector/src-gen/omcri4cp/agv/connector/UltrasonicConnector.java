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
 * Generated at Mon May 03 19:06:20 CEST 2021 from platform:/resource/omcri4cp.agv/model/agv.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.agv.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/agv#
 * - term: ultrasonic
 * - title: 
 */
public class UltrasonicConnector extends omcri4cp.agv.impl.UltrasonicImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(UltrasonicConnector.class);

	// Start of user code Ultrasonicconnector_constructor
	/**
	 * Constructs a ultrasonic connector.
	 */
	UltrasonicConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Ultrasonic_Mixin_sense_distance_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/ultrasonic/action#
     * - term: sense_distance
     * - title: 
	 */
	@Override
	public void sense_distance()
	{
		LOGGER.debug("Action sense_distance() called on " + this);

		// TODO: Implement how to sense_distance this ultrasonic.
	}
	// End of user code
}	
