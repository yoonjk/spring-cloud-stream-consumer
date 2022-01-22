package com.demo.microservices.processor;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface MyProcessor {
	@Input("validProcess")
	SubscribableChannel validProcess();
	
	@Input("approved")
	SubscribableChannel approved();
	
	@Input("declined")
	SubscribableChannel declined();
}

