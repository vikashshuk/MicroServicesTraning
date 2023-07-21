package com.example.demo.beans;

public class PropertyAccessvalue {

	public PropertyAccessvalue() {
		// TODO Auto-generated constructor stub
	}
	

	private String name;
	private String description;
	public PropertyAccessvalue(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name Is " + this.name + " Description is " +this.description;
	}
	
	

}
