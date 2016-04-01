package com.sac.bean;

public class Student {

	private String name;
	private int age;
	
	public Student() {
		System.out.println(" Inside Student Constructor ");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
