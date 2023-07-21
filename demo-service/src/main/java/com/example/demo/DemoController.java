package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class DemoController {

	public DemoController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/serviceName")
	public String getServiceName() {
		return "Welcome Oracle India";
	}
	
	@GetMapping("/serviceAddress")
	public String getServiceAddress() {
		return "Location Bangalore";
	}
	
	@GetMapping("/serviceDetail")
	public String getServiceDetail() {
		return "Oracle MicroService Session";
	}
	
}
