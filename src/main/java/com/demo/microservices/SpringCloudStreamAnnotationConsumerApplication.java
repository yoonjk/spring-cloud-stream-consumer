package com.demo.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.integration.support.MessageBuilder;

import com.demo.microservices.model.Loan;
import com.demo.microservices.processor.MyProcessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@EnableBinding(MyProcessor.class)
@SpringBootApplication
public class SpringCloudStreamAnnotationConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudStreamAnnotationConsumerApplication.class, args);
	}
	

	@StreamListener(target = "approved")
	public void receive1(Loan message) {
		log.info("Loan approved:{}", message);
	}	
	@StreamListener(target = "declined")
	public void receive2v(Loan message) {
		log.info("Loan declined:{}", message);
	}		
	
}

