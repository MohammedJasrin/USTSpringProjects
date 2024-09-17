package com.iist.rabbit.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.iist.rabbit.model.OrderStatus;
@Component
public class PurchaseOrderConsumer {
	@Value("ust_queue")
	private String queuename;

	

	@Value("ust_exchange")
	private String exchange;

	

	@Value("ust_routingKey")
	private String routingkey;
	
	@RabbitListener(queues ="ust_queue")
	public void consumeMessageFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from Queue :"+orderStatus);
	}

}
