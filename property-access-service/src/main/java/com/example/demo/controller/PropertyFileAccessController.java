package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.beans.PropertyAccessBean;
import com.example.demo.beans.PropertyAccessvalue;

@RestController
@RequestMapping("/access")
public class PropertyFileAccessController {

	public PropertyFileAccessController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	PropertyAccessBean propertyAccessBean;
	
	@GetMapping("/accessPropertyFile")
	public PropertyAccessvalue getPropertyValue() {
		return new PropertyAccessvalue(propertyAccessBean.getName() , propertyAccessBean.getDescription());
	}
	
	public void refreshActuator() {
		RestTemplate restTemplate = new RestTemplate();
		
		final String baseUrl = "http://localhost:8100/actuator/refresh";
		
		HttpHeaders httpHeader = new HttpHeaders();
		httpHeader.set("Content-Type", "application/json");
		
		HttpEntity entity = new HttpEntity(httpHeader);
		
		ResponseEntity<String> response = restTemplate.postForEntity(baseUrl, entity, String.class);
	}
}
