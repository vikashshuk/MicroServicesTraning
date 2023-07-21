package com.example.demo;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

	public Consumer() {
		// TODO Auto-generated constructor stub
	}
	
	@JmsListener( destination ="vikash.queue")
	public void receiveQueue(String text) {
		System.out.println("Message received "+text);
	}
}
