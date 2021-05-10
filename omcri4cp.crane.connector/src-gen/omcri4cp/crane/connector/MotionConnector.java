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



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/crane#
 * - term: motion
 * - title: 
 */
public class MotionConnector extends omcri4cp.crane.impl.MotionImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(MotionConnector.class);

	// Start of user code Motionconnector_constructor
	/**
	 * Constructs a motion connector.
	 */
	MotionConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code


	// Start of user code Motion_Mixin_move_forward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/motion/action#
     * - term: move_forward
     * - title: 
	 */
	@Override
	public void move_forward()
	{
		LOGGER.debug("Action move_forward() called on " + this);

		// TODO: Implement how to move_forward this motion.
	}
	// End of user code
	// Start of user code Motion_Mixin_move_backward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/motion/action#
     * - term: move_backward
     * - title: 
	 */
	@Override
	public void move_backward()
	{
		LOGGER.debug("Action move_backward() called on " + this);

		// TODO: Implement how to move_backward this motion.
	}
	// End of user code
	// Start of user code Motion_Mixin_move_up_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/motion/action#
     * - term: move_up
     * - title: 
	 */
	@Override
	public void move_up()
	{
		LOGGER.debug("Action move_up() called on " + this);

		// TODO: Implement how to move_up this motion.
	}
	// End of user code
	// Start of user code Motion_Mixin_move_down_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/crane/motion/action#
     * - term: move_down
     * - title: 
	 */
	@Override
	public void move_down()
	{
		LOGGER.debug("Action move_down() called on " + this);

		// TODO: Implement how to move_down this motion.
	}
	// End of user code
}	
