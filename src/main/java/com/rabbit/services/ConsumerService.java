package com.rabbit.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.rabbit.configuations.EventConsumerConfiguration;
import com.rabbit.consumerservice.RabbitmqConsumerServiceApplication;


@Service
public class ConsumerService {
	 private Logger logger = LoggerFactory.getLogger(RabbitmqConsumerServiceApplication.class);

	 	@RabbitListener(queues = EventConsumerConfiguration.QUEUE_GENERIC_NAME)
	    public void receiveMessage(final Message message) {
	        logger.info("MESSAGE RECIEVED {}", message.toString());
	    }

	    
}
