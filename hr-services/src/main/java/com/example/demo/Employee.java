package com.example.demo;

public class Employee {

	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	private String employeeId;
	private String firstName;
	private String lastName;
	private String speciality;
	public Employee(String employeeId, String firstName, String lastName, String speciality) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.speciality = speciality;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	
}
