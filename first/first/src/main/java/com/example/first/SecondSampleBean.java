package com.example.first;

public class SecondSampleBean {
	
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public SecondSampleBean() {
		// TODO Auto-generated constructor stub
	}

	public SecondSampleBean(String string) {
		this.message = string;
	}

	@Override
	public String toString() {
		return "SecondSampleBean [message=" + message + "]";
	}
	

}
