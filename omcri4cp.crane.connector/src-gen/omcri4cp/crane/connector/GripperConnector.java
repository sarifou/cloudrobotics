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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import omcri4cp.crane.State;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/crane#
 * - term: gripper
 * - title: 
 */
public class GripperConnector extends omcri4cp.crane.impl.GripperImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(GripperConnector.class);

	// Start of user code Gripperconnector_constructor
	/**
	 * Constructs a gripper connector.
	 */
	GripperConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Gripper_Mixin_open_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/mixin2/action#
     * - term: open
     * - title: 
	 */
	@Override
	public void open()
	{
		LOGGER.debug("Action open() called on " + this);

		// Gripper State Machine.
		switch(getState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
	// Start of user code Gripper_Mixin_close_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/mixin2/action#
     * - term: close
     * - title: 
	 */
	@Override
	public void close()
	{
		LOGGER.debug("Action close() called on " + this);

		// Gripper State Machine.
		switch(getState().getValue()) {
		default:
			break;
		}
	}
	// End of user code
}	
