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
 * Generated at Mon Aug 23 16:19:12 CEST 2021 from platform:/resource/omcri4cp.drone/model/drone.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.drone.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * - scheme: http://cristal.org/omcri4cp/drone#
 * - term: drone
 * - title: 
 */
public class DroneConnector extends omcri4cp.drone.impl.DroneImpl
{
	/**
	 * Initialize the logger.
	 */
	private static Logger LOGGER = LoggerFactory.getLogger(DroneConnector.class);

private Ros ros ;
	
	private Topic pubCmdVel ;
	
	private Topic pubPose ;
	
	private Topic pubGripperPose ;
	
	private Topic pubGripperState ;
	
	private Twist driveMessage ;
	
	private final String DRIVE_TOPIC = "/"+this.getDroneId()+"/setpoint_velocity/cmd_vel_unstamped";
	
	private final String POSE_TOPIC = "/"+this.getDroneId()+"/local_position/pose";
	
	private final String BATTERY_POSE = "/"+this.getDroneId()+"/battery";
	
	// private final String STATE_TOPIC
	
	private final String DRIVE_MESSAGE_TYPE = "geometry_msgs/Twist";
	
	private final String POSE_MESSAGE_TYPE = "geometry_msgs/PoseStamped";
	
	private final String BATTERY_MESSAGE_TYPE = "sensor_msgs/BatteryState";
	
	/**
	 * Constructs a drone connector.
	 */
	DroneConnector()
	{
		LOGGER.debug("Constructor called on " + this);
		// TODO: Implement this constructor.
	}
	// End of user code
	//
	// OCCI CRUD callback operations.
	//
	
	// Start of user code DroneocciCreate
	/**
	 * Called when this Drone instance is completely created.
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
	// End of user code

	// Start of user code Drone_occiRetrieve_method
	/**
	 * Called when this Drone instance must be retrieved.
	 */
	@Override
	public void occiRetrieve()
	{
		LOGGER.debug("occiRetrieve() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code Drone_occiUpdate_method
	/**
	 * Called when this Drone instance is completely updated.
	 */
	@Override
	public void occiUpdate()
	{
		LOGGER.debug("occiUpdate() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	// Start of user code DroneocciDelete_method
	/**
	 * Called when this Drone instance will be deleted.
	 */
	@Override
	public void occiDelete()
	{
		LOGGER.debug("occiDelete() called on " + this);
		// TODO: Implement this callback or remove this method.
	}
	// End of user code

	//
	// Drone actions.
	//

	// Start of user code Drone_Kind_up_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: up
     * - title: 
	 */
	@Override
	public void up()
	{
		LOGGER.debug("Action up() called on " + this);

		// TODO: Implement how to up this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_disarm_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: disarm
     * - title: 
	 */
	@Override
	public void disarm()
	{
		LOGGER.debug("Action disarm() called on " + this);

		// TODO: Implement how to disarm this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_go_to_position_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: go_to_position
     * - title: 
	 */
	@Override
	public void go_to_position()
	{
		LOGGER.debug("Action go_to_position() called on " + this);

		// TODO: Implement how to go_to_position this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_backward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: backward
     * - title: 
	 */
	@Override
	public void backward()
	{
		LOGGER.debug("Action backward() called on " + this);

		// TODO: Implement how to backward this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_left_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: left
     * - title: 
	 */
	@Override
	public void left()
	{
		LOGGER.debug("Action left() called on " + this);

		// TODO: Implement how to left this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_down_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: down
     * - title: 
	 */
	@Override
	public void down()
	{
		LOGGER.debug("Action down() called on " + this);

		// TODO: Implement how to down this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_right_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: right
     * - title: 
	 */
	@Override
	public void right()
	{
		LOGGER.debug("Action right() called on " + this);

		// TODO: Implement how to right this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_arm_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: arm
     * - title: 
	 */
	@Override
	public void arm()
	{
		LOGGER.debug("Action arm() called on " + this);

		// TODO: Implement how to arm this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_change_mode_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: change_mode
     * - title: 
	 */
	@Override
	public void change_mode()
	{
		LOGGER.debug("Action change_mode() called on " + this);

		// TODO: Implement how to change_mode this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_forward_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: forward
     * - title: 
	 */
	@Override
	public void forward()
	{
		LOGGER.debug("Action forward() called on " + this);

		// TODO: Implement how to forward this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_turn_right_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: turn_right
     * - title: 
	 */
	@Override
	public void turn_right()
	{
		LOGGER.debug("Action turn_right() called on " + this);

		// TODO: Implement how to turn_right this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);

		// TODO: Implement how to stop this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_set_speed_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: set_speed
     * - title: 
	 */
	@Override
	public void set_speed()
	{
		LOGGER.debug("Action set_speed() called on " + this);

		// TODO: Implement how to set_speed this drone.
	}
	// End of user code
	// Start of user code Drone_Kind_turn_left_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/drone/drone/action#
     * - term: turn_left
     * - title: 
	 */
	@Override
	public void turn_left()
	{
		LOGGER.debug("Action turn_left() called on " + this);

		// TODO: Implement how to turn_left this drone.
	}
	// End of user code
}	
