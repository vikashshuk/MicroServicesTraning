package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.models.Car;
import com.example.demo.repository.CarMongoRepository;
import com.example.demo.repository.CarSearshRepository;

@Controller
public class CarController {

	public CarController() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	CarMongoRepository carMongoRepository;
	
	@Autowired
	CarSearshRepository carSearchRepository;
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("carList", carMongoRepository.findAll());
		return "home";
	}
	
	@RequestMapping(value = "/addCar", method = RequestMethod.POST)
	public String addCar(@ModelAttribute Car car) {
		carMongoRepository.save(car);
		return "redirect:home";
	}
	
	@RequestMapping(value = "/search")
	public String searchCar(Model model, @RequestParam String search) {
		model.addAttribute("carList", carSearchRepository.searchCars(search));
		model.addAttribute("search", search);
		return "home";
		
	}

}
