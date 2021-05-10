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
 * - term: crane
 * - title: 
 */
public class CraneConnector extends omcri4cp.crane.impl.CraneImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(CraneConnector.class);

	// Start of user code Craneconnector_constructor
	/**
	 * Constructs a crane connector.
	 */
	CraneConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code CraneocciCreate
	/**
	 * Called when this Crane instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Crane_occiRetrieve_method
	/**
	 * Called when this Crane instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Crane_occiUpdate_method
	/**
	 * Called when this Crane instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code CraneocciDelete_method
	/**
	 * Called when this Crane instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Crane actions.
	//

}	
