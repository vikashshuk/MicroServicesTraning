package com.example.demo;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="feignDemo",url ="http://localhost:8081/user")
public interface FeignServiceUtil {
	
	@GetMapping("/serviceName")
	public String getServiceName(); 
	
	@GetMapping("/serviceAddress")
	public String getServiceAddress();
	
	@GetMapping("/serviceDetail")
	public String getServiceDetail();
}
