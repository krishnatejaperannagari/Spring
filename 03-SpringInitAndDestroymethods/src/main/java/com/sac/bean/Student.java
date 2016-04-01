package com.sac.bean;

public class Student {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initialize(){
		this.name = "Sachin";
		System.out.println("This method is used for Initializing");
	}
	
	public void destroy(){
		
		this.name = null;
		System.out.println("This method is used for releasing resource");
		
	}
	
}
