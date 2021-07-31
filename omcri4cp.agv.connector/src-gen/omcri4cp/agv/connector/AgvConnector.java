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
 * Generated at Sat Jul 31 18:04:06 CEST 2021 from platform:/resource/omcri4cp.agv/model/agv.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.agv.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.wpi.rail.jrosbridge.Ros;
import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.messages.geometry.Twist;
import edu.wpi.rail.jrosbridge.messages.geometry.Vector3;



/**
 * Connector implementation for the OCCI kind:
 * - scheme: http://cristal.org/omcri4cp/agv#
 * - term: agv
 * - title: 
 */
public class AgvConnector extends omcri4cp.agv.impl.AgvImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(AgvConnector.class);
	
	private Ros ros ;
	
	private Topic drivePub ;
	
	private Twist driveMessage ;
	
	private final String DRIVE_TOPIC = "tquad/drive";
	
	private final String DRIVE_MESSAGE_TYPE = "geometry_msgs/Twist";
	
	private Topic gripperPub ;

	/**
	 * Constructs a agv connector.
	 */
	AgvConnector()
	{
		LOGGER.debug("Constructor called on " + this);
	}
	/**
	 * Called when this Agv instance is completely created.
	 */
	@Override
	public void occiCreate()
	{
		LOGGER.debug("occiCreate() called on " + this);
		try {
			this.ros = new Ros(ip, port);
		}catch(Exception e) {
			LOGGER.error("An error occurred");
			LOGGER.error("Error --> : "+e);
		}
	}
	/**
	 * Called when this Agv instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	/**
	 * Called when this Agv instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	/**
	 * Called when this Agv instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	/*
	 * 
	 */
	public void driver_publisher(Vector3 linear, Vector3 angular) {
		try {
			this.drivePub = new Topic (this.ros, this.DRIVE_TOPIC, this.DRIVE_MESSAGE_TYPE);
			this.driveMessage = new Twist(linear, angular);
			LOGGER.info("Message "+ this.driveMessage);
			if(connectionState) {
				this.drivePub.publish(this.driveMessage);
			}
		}catch(Exception e) {
			LOGGER.error("An error occurred");
			LOGGER.error("Error --> : "+e);
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: forward
     * - title: 
	 */
	@Override
	public void forward()
	{
		LOGGER.debug("Action forward() called on " + this);
		try {
			Vector3 linear = new Vector3(0,speedLinear, 0);
			Vector3 angular = new Vector3(0,0,0);
			this.driver_publisher(linear, angular);
		}catch(Exception e) {
			LOGGER.error("An error occurred");
			LOGGER.error("Error --> : "+e);
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: backward
     * - title: 
	 */
	@Override
	public void backward()
	{
		LOGGER.debug("Action backward() called on " + this);
		try {
			Vector3 linear = new Vector3(0,-speedLinear, 0);
			Vector3 angular = new Vector3(0,0,0);
			this.driver_publisher(linear, angular);
		}catch(Exception e) {
			LOGGER.error("An error occurred");
			LOGGER.error("Error --> : "+e);
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: right
     * - title: 
	 */
	@Override
	public void right()
	{
		LOGGER.debug("Action right() called on " + this);
		Vector3 linear = new Vector3(speedLinear,0, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular);
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: left
     * - title: 
	 */
	@Override
	public void left()
	{
		LOGGER.debug("Action left() called on " + this);
		Vector3 linear = new Vector3(-speedLinear,0, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular);
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: right_bottom
     * - title: 
	 */
	@Override
	public void right_bottom()
	{
		LOGGER.debug("Action right_bottom() called on " + this);

		// TODO: Implement how to right_bottom this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: right_up
     * - title: 
	 */
	@Override
	public void right_up()
	{
		LOGGER.debug("Action right_up() called on " + this);

		// TODO: Implement how to right_up this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: left_up
     * - title: 
	 */
	@Override
	public void left_up()
	{
		LOGGER.debug("Action left_up() called on " + this);

		// TODO: Implement how to left_up this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this agv.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: get_distance
     * - title: 
	 */
	@Override
	public void get_distance()
	{
		LOGGER.debug("Action get_distance() called on " + this);

		// TODO: Implement how to get_distance this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: connect
     * - title: 
	 */
	@Override
	public void connect()
	{
		LOGGER.debug("Action connect() called on " + this);
		try {
			this.ros.connect();
			connectionState = this.ros.isConnected();
			if(connectionState) {
				LOGGER.info("Connection successful");
			}
		}catch(Exception e) {
			LOGGER.error("An occurred");
			LOGGER.error("error --> : "+e);
		}
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: left_bottom
     * - title: 
	 */
	@Override
	public void left_bottom()
	{
		LOGGER.debug("Action left_bottom() called on " + this);

		// TODO: Implement how to left_bottom this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: open_gripper
     * - title: 
	 */
	@Override
	public void open_gripper()
	{
		LOGGER.debug("Action open_gripper() called on " + this);

		// TODO: Implement how to open_gripper this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: get_line_sensors
     * - title: 
	 */
	@Override
	public void get_line_sensors()
	{
		LOGGER.debug("Action get_line_sensors() called on " + this);

		// TODO: Implement how to get_line_sensors this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: disconnect
     * - title: 
	 */
	@Override
	public void disconnect()
	{
		LOGGER.debug("Action disconnect() called on " + this);

		// TODO: Implement how to disconnect this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: turn_left
     * - title: 
	 */
	@Override
	public void turn_left()
	{
		LOGGER.debug("Action turn_left() called on " + this);

		// TODO: Implement how to turn_left this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: turn_right
     * - title: 
	 */
	@Override
	public void turn_right()
	{
		LOGGER.debug("Action turn_right() called on " + this);

		// TODO: Implement how to turn_right this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: go_to_position
     * - title: 
	 */
	@Override
	public void go_to_position()
	{
		LOGGER.debug("Action go_to_position() called on " + this);

		// TODO: Implement how to go_to_position this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: set_gripper_position
     * - title: 
	 */
	@Override
	public void set_gripper_position()
	{
		LOGGER.debug("Action set_gripper_position() called on " + this);

		// TODO: Implement how to set_gripper_position this agv.
	}

	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: turn_around
     * - title: 
	 */
	@Override
	public void turn_around()
	{
		LOGGER.debug("Action turn_around() called on " + this);

		// TODO: Implement how to turn_around this agv.
	}
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/agv/agv/action#
     * - term: close_gripper
     * - title: 
	 */
	@Override
	public void close_gripper()
	{
		LOGGER.debug("Action close_gripper() called on " + this);

		// TODO: Implement how to close_gripper this agv.
	}

}	
