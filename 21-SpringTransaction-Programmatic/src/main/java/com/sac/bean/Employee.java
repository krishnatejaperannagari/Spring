package com.sac.bean;

public class Employee {
	
	private Integer eID;
	private String firstName;
	private String lastName;
	private String gender;
	
	public Integer geteID() {
		return eID;
	}
	public void seteID(Integer eID) {
		this.eID = eID;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "Employee [eID=" + eID + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
				+ "]";
	}
	
	

}
