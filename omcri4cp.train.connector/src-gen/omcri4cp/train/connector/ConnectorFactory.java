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

/**
 * Connector EFactory for the OCCI extension:
 * - name: Train
 * - scheme: http://cristal.org/omcri4cp/train#
 */
public class ConnectorFactory extends omcri4cp.train.impl.TrainFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/train#
	 * - term: train
	 * - title: 
	 */
	@Override
	public omcri4cp.train.Train createTrain() {
		return new TrainConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/train#
	 * - term: motion
	 * - title: 
	 */
	@Override
	public omcri4cp.train.Motion createMotion() {
		return new MotionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/train#
	 * - term: accessories
	 * - title: 
	 */
	@Override
	public omcri4cp.train.Accessories createAccessories() {
		return new AccessoriesConnector();
	}

}
