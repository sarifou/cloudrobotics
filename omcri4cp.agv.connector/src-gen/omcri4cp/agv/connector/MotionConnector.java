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

import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.messages.std.Int64MultiArray;
import edu.wpi.rail.jrosbridge.messages.std.MultiArrayDimension;
import edu.wpi.rail.jrosbridge.messages.std.MultiArrayLayout;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/agv#
 * - term: motion
 * - title: 
 */
public class MotionConnector extends omcri4cp.agv.impl.MotionImpl
{
	//Initialize the logger.
	
	private static Logger LOGGER = LoggerFactory.getLogger(MotionConnector.class);
	
	private Int64MultiArray request ;
	
	private long[] msg ;
	
	private Topic publisher ;

	// Constructs a motion connector.
	MotionConnector()
	{
		
	}
	
	public void publish(long[] msg) {
		try {
			publisher = new Topic(AgvConnector.ros, "tquad/driver", "std_msgs/Int64MultiArray");
			request = new Int64MultiArray(new MultiArrayLayout(
					new MultiArrayDimension[] {
						new MultiArrayDimension("test", 1,0)	
					}, 0), msg);
			System.out.println(request);
			publisher.publish(request);
		}catch (Exception error) {
			LOGGER.error("An error occured" + error);
		}
	}
	// Implement OCCI action to move forward AGV
	@Override
	public void move_forward()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	// Implement OCCI action to move backward AGV
	@Override
	public void move_backward()
	{
		msg = new long[] {-speed, -speed, -speed, -speed};
		publish(msg);
	}
	// Implement OCCI action to move left translation
	@Override
	public void left_translation()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	@Override
	public void right_translation()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	@Override
	public void turn_left()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	@Override
	public void turn_right()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	@Override
	public void left_diago_forward()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	
	@Override
	public void left_diago_backward()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	@Override
	public void right_diago_forward()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	
	@Override
	public void right_diago_backward()
	{
		msg = new long[] {speed, speed,speed, speed};
		publish(msg);
	}
	
	@Override
	public void stop()
	{
		msg = new long[] {0, 0,0, 0};
		publish(msg);
	}
	
}	
