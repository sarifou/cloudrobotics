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
import edu.wpi.rail.jrosbridge.messages.geometry.Point;
import edu.wpi.rail.jrosbridge.messages.geometry.Pose2D;
import edu.wpi.rail.jrosbridge.messages.geometry.Quaternion;
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
	
	private Topic pubCmdVel ;
	
	private Topic pubPose ;
	
	private Topic pubGripperPose ;
	
	private Topic pubGripperState ;
	
	private Twist driveMessage ;
	
	private final String DRIVE_TOPIC = "tquad/cmd_vel";
	
	private final String POSE_TOPIC = "tquad/pose";
	
	private final String GRIPPER_TOPIC = "tquad/gripper_pose";
	
	private final String GRIPPER_STATE_TOPIC = "tquad/gripper_state";
	
	private final String DRIVE_MESSAGE_TYPE = "geometry_msgs/Twist";
	
	private final String POSE_MESSAGE_TYPE = "geometry_msgs/Pose2D";
	
	private final String GRIPPER_POSE_MSG_TYPE = "geometry_msgs/Point";
	
	private final String GRIPPER_STATE_MSG_TYPE = "std_msgs/Bool";
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
			this.ros = new Ros(this.getIp(), this.getPort());
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
			if(!ros.isConnected()) {
				this.ros.connect();
				this.setConnectionState(this.ros.isConnected());
				if(this.connectionState) {
					LOGGER.info("Connection successful");
				}
			}
		}catch(Exception e) {
			LOGGER.error("An occurred");
			LOGGER.error("error --> : "+e);
		}
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
		try {
			if(this.connectionState) {
				this.ros.disconnect();
				this.setConnectionState(this.ros.isConnected());
				if(!this.connectionState) {
					LOGGER.info("Disconnection successful");
				}
			}
		}catch(Exception e) {
			LOGGER.error("An occurred");
			LOGGER.error("error --> : "+e);
		}
	}
	/*
	 * 
	 */
	public void driver_publisher(Vector3 linear, Vector3 angular) {
		try {
			this.pubCmdVel = new Topic (this.ros, this.DRIVE_TOPIC, this.DRIVE_MESSAGE_TYPE);
			this.driveMessage = new Twist(linear, angular);
			LOGGER.info("Message "+ this.driveMessage);
			if(connectionState) {
				this.pubCmdVel.publish(this.driveMessage);
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
		Vector3 linear = new Vector3(this.getSpeedLinear(),0, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular);

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
		Vector3 linear = new Vector3(-this.getSpeedLinear(),0, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular);
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
		Vector3 linear = new Vector3(0, -this.getSpeedLinear(), 0);
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
		Vector3 linear = new Vector3(0, this.getSpeedLinear(), 0);
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
		double vx = -speedLinear*Math.cos((Math.PI)/4);
		double vy = -speedLinear*Math.sin((Math.PI)/4) ;
		Vector3 linear = new Vector3(vx,vy, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular); 
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
		double vx = speedLinear*Math.cos((Math.PI)/4);
		double vy = -speedLinear*Math.sin((Math.PI)/4) ;
		Vector3 linear = new Vector3(vx,vy, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular); 
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
		double vx = speedLinear*Math.cos((Math.PI)/4);
		double vy = speedLinear*Math.sin((Math.PI)/4) ;
		Vector3 linear = new Vector3(vx,vy, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular); 
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
		double vx = -speedLinear*Math.cos((Math.PI)/4);
		double vy =  speedLinear*Math.sin((Math.PI)/4) ;
		Vector3 linear = new Vector3(vx,vy, 0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular); 
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
		Vector3 linear = new Vector3(0,0,0);
		Vector3 angular = new Vector3(0,0,0);
		this.driver_publisher(linear, angular);
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
     * - term: open_gripper
     * - title: 
	 */
	@Override
	public void open_gripper()
	{
		LOGGER.debug("Action open_gripper() called on " + this);
		try {
			
		}catch(Exception e) {
			
		}
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
     * - term: turn_left
     * - title: 
	 */
	@Override
	public void turn_left()
	{
		LOGGER.debug("Action turn_left() called on " + this);
		Vector3 linear = new Vector3(0,0,0);
		Vector3 angular = new Vector3(0,0, this.getSpeedAngular());
		this.driver_publisher(linear, angular);
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
		Vector3 linear = new Vector3(0,0,0);
		Vector3 angular = new Vector3(0,0, -this.getSpeedAngular());
		this.driver_publisher(linear, angular);
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
		try {
			this.pubPose = new Topic (this.ros, this.POSE_TOPIC, this.POSE_MESSAGE_TYPE);
			Pose2D pose = new Pose2D(poseX, poseY, poseAngular);
			if(connectionState) {
				pubPose.publish(pose);
			}
		} catch(Exception e) {
			LOGGER.error("An error occurred");
			LOGGER.error("Error --> : "+e);
		}
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
