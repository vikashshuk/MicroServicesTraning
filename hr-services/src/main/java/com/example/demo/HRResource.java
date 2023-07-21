package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hr")
public class HRResource {

	public HRResource() {
		// TODO Auto-generated constructor stub
	}
	
	List<Employee> employees = Arrays.asList(
			new Employee("1", "Ram", "Kumar","Abc"),
			new Employee("2", "Rakesh", "Kumar","DEF"),
			new Employee("3", "Shyam", "Kumar","GHE"));
	
	@RequestMapping("/employees")
	public EmployeeList getEmployees(){
		EmployeeList el = new EmployeeList();
		el.setEployeeList(employees);
		return el;
	}
	
	@RequestMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable ("id") String id) {
		return employees.stream().filter(employee -> id.equals(employee.getEmployeeId()))
				.findAny().
				orElse(null);
		
	}
	
}
