package com.example.demo;

import java.util.Map;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HttpBinService {

	public HttpBinService() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;

	public HttpBinService(RestTemplate restTemplate) {
		super();
		this.restTemplate = restTemplate;
	}
	
	public Map get() {
		return restTemplate.getForObject("https://httpbin.org/get", Map.class);
	}
	
	public Map delay(int second) {
		return restTemplate.getForObject("https://httpbin.org/delay/"+second, Map.class);
	}
	
	public Supplier<Map> delaySupplier(int seconds) {
		return () -> this.delay(seconds);
	}
}
