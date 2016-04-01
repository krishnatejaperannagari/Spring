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
		System.out.println(" This is initialize method for Student ");
	}
	
	public void destroy(){
		System.out.println(" This is destroy method for Student ");
	}

}
