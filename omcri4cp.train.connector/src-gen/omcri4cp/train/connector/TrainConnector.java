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

import edu.wpi.rail.jrosbridge.Ros;
import train.controller.Train;


/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/train#
 * - term: train
 * - title: 
 */
public class TrainConnector extends omcri4cp.train.impl.TrainImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(TrainConnector.class);

	public static Train train ;
	
	public static Ros ros;
	/**
	 * Constructs a train connector.
	 */
	TrainConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code TrainocciCreate
	/**
	 * Called when this Train instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		
		try {
			train = new Train(ipAddress, port, trainAddress);
			ros = new Ros(ipAddress);
			ros.connect();
		} catch (Exception e) {
			LOGGER.error("Cannot create train" );
		}
	}
	// End of user code

	// Start of user code Train_occiRetrieve_method
	/**
	 * Called when this Train instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Train_occiUpdate_method
	/**
	 * Called when this Train instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code TrainocciDelete_method
	/**
	 * Called when this Train instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Train actions.
	//

}	
