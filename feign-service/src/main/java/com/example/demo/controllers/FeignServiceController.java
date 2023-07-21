package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FeignServiceUtil;

@RestController
@RequestMapping("/feignDemo")
public class FeignServiceController {

	public FeignServiceController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	FeignServiceUtil feignServiceUtil;
	
	@GetMapping("/customerServiceName")
	public String getCustomerServiceName() {
		String message = "Eecute Local logic here ";
		return message + feignServiceUtil.getServiceName();
	}
	
	@GetMapping("/customerServiceAddress")
	public String getCustomerServiceAddress() {
		String message = "Eecute Local logic here ";
		return message + feignServiceUtil.getServiceAddress();
	}
	
	@GetMapping("/customerServiceDeatil")
	public String getCustomerServiceDeatil() {
		String message = "Eecute Local logic here ";
		return message + feignServiceUtil.getServiceDetail();
	}
}
