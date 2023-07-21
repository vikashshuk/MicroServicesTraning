package com.example.demo;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer implements CommandLineRunner{

	public Producer() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private JmsMessagingTemplate jmsMessagingTemplate;
	
	@Autowired
	private Queue queue;
	
	public void send(String message) {
		jmsMessagingTemplate.convertAndSend(this.queue,message);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		send("JMS Message From Oracle");
		System.out.println("Now receiver will receive");
	}

}
