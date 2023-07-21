package com.example.first;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyEndPoints2 {

	public MyEndPoints2() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	UserDaoService service;

	@GetMapping("/getUsers")
	public List<User> getUsers(){
		return service.findAllUser();
		
	}
	
	@GetMapping("getUser/{id}")
	public User retrieveUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("saveUser")
	public void saveUser(@RequestBody User user) {
		service.save(user);
	}

}
