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
 * Generated at Thu Apr 29 23:39:22 CEST 2021 from platform:/resource/omcri4cp.train/model/train.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.train.connector;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/train#
 * - term: motion
 * - title: 
 */
public class MotionConnector extends omcri4cp.train.impl.MotionImpl
{
	
	private static Logger LOGGER = LoggerFactory.getLogger(MotionConnector.class);


	MotionConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/motion/action#
     * - term: faster
     * - title: 
	 */
	@Override
	public void faster()
	{
		LOGGER.debug("Action faster() called on " + this);
		try {
			TrainConnector.train.faster();
			speed += 1;
			System.out.println(TrainConnector.train.getResponse());
		}catch (IOException e) {
			LOGGER.error("");
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/motion/action#
     * - term: slower
     * - title: 
	 */
	@Override
	public void slower()
	{
		LOGGER.debug("Action slower() called on " + this);
		try {
			TrainConnector.train.slower();
			speed -= 1;
			System.out.println(TrainConnector.train.getResponse());
		}catch (Exception e) {
			LOGGER.error("");
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/motion/action#
     * - term: reverse
     * - title: 
	 */
	@Override
	public void reverse()
	{
		LOGGER.debug("Action reverse() called on " + this);
		try {
			TrainConnector.train.reverse();
			System.out.println(TrainConnector.train.getResponse());
		}catch (Exception e) {
			LOGGER.error("");
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/motion/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);
		try {
			TrainConnector.train.stop();
			System.out.println(TrainConnector.train.getResponse());
		}catch (Exception e) {
			LOGGER.error("");
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/motion/action#
     * - term: setspeed
     * - title: 
	 */
	@Override
	public void setspeed()
	{
		LOGGER.debug("Action setspeed() called on " + this);
		try {
			TrainConnector.train.setSpeed(speed);
			System.out.println(TrainConnector.train.getResponse());
		}catch (Exception e) {
			LOGGER.error("");
		}
	}
}	
