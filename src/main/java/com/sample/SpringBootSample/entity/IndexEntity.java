package com.sample.SpringBootSample.entity;

public class IndexEntity {

	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void testAspect() {
		System.out.println("Aspect testing");
	}
}
