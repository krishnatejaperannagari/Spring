package com.sac.bean;

public class Student {
	
	private Address address;
	private String firstName;
	private String lastName;
	
	public Student() {
		System.out.println("Default Constructor of Student Class");
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	
	

}
