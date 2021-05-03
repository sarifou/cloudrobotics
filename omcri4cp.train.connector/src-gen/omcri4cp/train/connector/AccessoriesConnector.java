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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/train#
 * - term: accessories
 * - title: 
 */
public class AccessoriesConnector extends omcri4cp.train.impl.AccessoriesImpl
{
	private static Logger LOGGER = LoggerFactory.getLogger(AccessoriesConnector.class);

	// Start of user code Accessoriesconnector_constructor
	AccessoriesConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}

	// Start of user code Accessories_Mixin_setKlaxon_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/accessories/action#
     * - term: setklaxon
     * - title: 
	 */
	@Override
	public void setklaxon()
	{
		LOGGER.debug("Action setklaxon() called on " + this);
		if (klaxon.equals("ON")) {
			TrainConnector.train.klaxon(true);
			
			System.out.println(TrainConnector.train.getResponse());
		} else {
			TrainConnector.train.klaxon(false);
			System.out.println(TrainConnector.train.getResponse());
		}
		
	}
	// End of user code
	// Start of user code Accessories_Mixin_setlight_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/accessories/action#
     * - term: setlight
     * - title: 
	 */
	@SuppressWarnings("unlikely-arg-type")
	@Override
	public void setlight()
	{
		LOGGER.debug("Action setlight() called on " + this);
		if (light.equals("ON")) {
			TrainConnector.train.light(true);
			System.out.println(TrainConnector.train.getResponse());
		} else {
			TrainConnector.train.light(false);
			System.out.println(TrainConnector.train.getResponse());
		}
	}
	// End of user code
	// Start of user code Accessories_Mixin_settrainnoise_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/accessories/action#
     * - term: settrainnoise
     * - title: 
	 */
	@Override
	public void settrainnoise()
	{
		LOGGER.debug("Action settrainnoise() called on " + this);
		if (trainNoise.equals("ON")) {
			TrainConnector.train.train_noise(true);
			System.out.println(TrainConnector.train.getResponse());
		} else {
			TrainConnector.train.train_noise(false);
			System.out.println(TrainConnector.train.getResponse());
		}
	}
	// End of user code
	// Start of user code Accessories_Mixin_setwagonnoise_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/accessories/action#
     * - term: setwagonnoise
     * - title: 
	 */
	@Override
	public void setwagonnoise()
	{
		LOGGER.debug("Action setwagonnoise() called on " + this);
		if (wagonNoise.equals("ON")) {
			TrainConnector.train.wagon_noise(true);
			System.out.println(TrainConnector.train.getResponse());
		} else {
			TrainConnector.train.wagon_noise(false);
			System.out.println(TrainConnector.train.getResponse());
		}
	}
	// End of user code
}	
