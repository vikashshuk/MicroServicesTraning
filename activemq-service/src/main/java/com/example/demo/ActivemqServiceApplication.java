package com.example.demo;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class ActivemqServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ActivemqServiceApplication.class, args);
	}
	
	@Bean
	public Queue queue() {
		return new ActiveMQQueue("vikash.queue");
	}
}
