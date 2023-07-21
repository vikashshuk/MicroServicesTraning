package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPints {

	public MyEndPints() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/mypage")
	public String myPage() {
		return "My First Page";
	}
	
	@RequestMapping("/second")
	public String second(@RequestParam String param) {
		return "Welcome" +param;
	}
	
	@RequestMapping("/secondpathvar/{name}")
	public String usingPathVar(@PathVariable String name) {
		return "Path Variable is:" + name;
	}
}
