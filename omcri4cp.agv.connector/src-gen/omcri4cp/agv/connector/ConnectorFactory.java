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

/**
 * Connector EFactory for the OCCI extension:
 * - name: AGV
 * - scheme: http://cristal.org/omcri4cp/agv#
 */
public class ConnectorFactory extends omcri4cp.agv.impl.AgvFactoryImpl
{
	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/agv#
	 * - term: agv
	 * - title: 
	 */
	@Override
	public omcri4cp.agv.Agv createAgv() {
		return new AgvConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/agv#
	 * - term: motion
	 * - title: 
	 */
	@Override
	public omcri4cp.agv.Motion createMotion() {
		return new MotionConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/agv#
	 * - term: sensors
	 * - title: 
	 */
	@Override
	public omcri4cp.agv.Sensors createSensors() {
		return new SensorsConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/agv#
	 * - term: ir
	 * - title: 
	 */
	@Override
	public omcri4cp.agv.Ir createIr() {
		return new IrConnector();
	}

	/**
	 * EFactory method for OCCI kind:
	 * - scheme: http://cristal.org/omcri4cp/agv#
	 * - term: ultrasonic
	 * - title: 
	 */
	@Override
	public omcri4cp.agv.Ultrasonic createUltrasonic() {
		return new UltrasonicConnector();
	}

}