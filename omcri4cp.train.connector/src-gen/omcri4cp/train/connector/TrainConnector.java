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
 * Generated at Tue Aug 17 12:56:33 CEST 2021 from platform:/resource/omcri4cp.train/model/train.occie by org.eclipse.cmf.occi.core.gen.connector
 */
package omcri4cp.train.connector;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.wpi.rail.jrosbridge.Ros;
import edu.wpi.rail.jrosbridge.Topic;
import edu.wpi.rail.jrosbridge.messages.std.String;



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
	
	private Ros ros ;
	
	private Topic pubCommand ;
	
	private final java.lang.String CMD_TOPIC = "train/command";
	
	private final java.lang.String TOPIC_TYPE = "std_msgs/String";
	
	private String msg ;

	// Start of user code Trainconnector_constructor
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
			this.ros = new Ros(this.getIp(), this.getPort());
		} catch(Exception e) {
			LOGGER.error("Error -> " +e);
		}
	}
	/**
	 * 
	 */
	@Override
	public void connect() {
		try {
			if(!this.ros.isConnected()) {
				this.ros.connect();
				if(this.ros.isConnected()) {
					this.setConnectionState(this.ros.isConnected());
				}
			}
		} catch(Exception e) {
			LOGGER.error("Error -> " +e);
		}
	}
	/**
	 * 
	 */
	@Override
	public void disconnect() {
		try {
			if(this.ros.isConnected()) {
				this.ros.disconnect();
				if(!this.ros.isConnected()) {
					this.setConnectionState(this.ros.isConnected());
				}
			}
		} catch(Exception e) {
			LOGGER.error("Error -> " +e);
		}
	}
	public void publisher_command(java.lang.String msg) {
		this.pubCommand = new Topic(this.ros, this.CMD_TOPIC, this.TOPIC_TYPE);
		this.msg = new String(msg);
		LOGGER.info("Message" + this.msg);
		if(this.connectionState) {
			this.pubCommand.publish(this.msg);
		}
	}
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
	@Override
	public void faster()
	{
		LOGGER.debug("Action faster() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
								";" + "train_command:faster";
		if(this.connectionState) {
			this.publisher_command(msg);
		}
	}
	// Start of user code Train_Kind_stop_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: stop
     * - title: 
	 */
	@Override
	public void stop()
	{
		LOGGER.debug("Action stop() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";" + "train_command:speed"+
				";" + "speed_value:0";
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_faster_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: faster
     * - title: 
	 */
	
	// End of user code
	// Start of user code Train_Kind_setSpeed_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: setspeed
     * - title: 
	 */
	@Override
	public void setspeed()
	{
		LOGGER.debug("Action setspeed() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";" + "train_command:speed"+
				";" + "speed_value:"+this.getTrainSpeed();
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_slower_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: slower
     * - title: 
	 */
	@Override
	public void slower()
	{
		LOGGER.debug("Action slower() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
								"; train_command:slower";
		if(this.connectionState) {
			this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_set_train_noise_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: set_train_noise
     * - title: 
	 */
	@Override
	public void set_train_noise()
	{
		LOGGER.debug("Action set_train_noise() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";train_command:f1" + ";accessories_value:" + this.trainNoise;
		if(this.connectionState) {
		this.publisher_command(msg);
		}
		// TODO: Implement how to set_train_noise this train.
	}
	// End of user code
	// Start of user code Train_Kind_reverse_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: reverse
     * - title: 
	 */
	@Override
	public void reverse()
	{
		LOGGER.debug("Action reverse() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				"; train_command:reverse";
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_set_wagon_noise_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: set_wagon_noise
     * - title: 
	 */
	@Override
	public void set_wagon_noise()
	{
		LOGGER.debug("Action set_wagon_noise() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";train_command:f2" + ";accessories_value:" + this.wagonNoise;
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_set_light_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: set_light
     * - title: 
	 */
	@Override
	public void set_light()
	{
		LOGGER.debug("Action set_light() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";train_command:fl" + ";accessories_value:" + this.lightState;
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
	// Start of user code Train_Kind_set_honk_action
	/**
	 * Implement OCCI action:
     * - scheme: http://cristal.org/omcri4cp/train/train/action#
     * - term: set_honk
     * - title: 
	 */
	@Override
	public void set_honk()
	{
		LOGGER.debug("Action set_honk() called on " + this);
		java.lang.String msg = "train_number:"+this.getTrainNumber()+
				";train_command:f3" + ";accessories_value:" + this.honkState;
		if(this.connectionState) {
		this.publisher_command(msg);
		}
	}
	// End of user code
}	
