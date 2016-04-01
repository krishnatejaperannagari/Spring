package com.sac.bean;

public class Address {
	
	private String addresLine1;
	private String addressLine2;
	private String zipCode;
	
	public Address() {
		System.out.println("Default Constructor of Address Class");
	}

	public String getAddresLine1() {
		return addresLine1;
	}
	public void setAddresLine1(String addresLine1) {
		this.addresLine1 = addresLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	

}
