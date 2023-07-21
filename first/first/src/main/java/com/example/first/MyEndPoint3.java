package com.example.first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoint3 {

	public MyEndPoint3() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	ExampleProperties prop;
	
	@RequestMapping("/greetOthers")
	public String greetOthers(@RequestParam String greeting) {
		return prop.getGreetings()+" "+greeting;
	}
}
