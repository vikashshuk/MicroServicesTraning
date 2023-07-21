package com.example.first;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("oracleprop")
public class ExampleProperties {

	public ExampleProperties() {
		// TODO Auto-generated constructor stub
	}
	
	private String greetings = "Thank you";

	public String getGreetings() {
		return greetings;
	}

	public void setGreetings(String greetings) {
		this.greetings = greetings;
	}

}
