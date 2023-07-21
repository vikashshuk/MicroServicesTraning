package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/admission")
public class AdmissionResource {

	public AdmissionResource() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@RequestMapping("/physicians")
	public EmployeeList getPhysicians() {
		EmployeeList physicians = restTemplate.getForObject("http://hr-services/hr/employees",EmployeeList.class);
		return physicians;
	}
	
	@RequestMapping("/healthissues")
	public DiseaseList getDiseases() {
		DiseaseList disease = restTemplate.getForObject("http://pathalogy-services/pathalogy/deseases",DiseaseList.class);
		return disease;
	}

}
