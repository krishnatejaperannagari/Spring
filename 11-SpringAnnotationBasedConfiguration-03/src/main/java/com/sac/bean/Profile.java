package com.sac.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {

	@Autowired
	@Qualifier("sadan")
	private Student student;
	
	public Profile() {
		System.out.println("Inside profile constructor");
	}
	
	public void studentDetails(){
		
		System.out.println(" Student Name "+ student.getName());
		System.out.println(" Student Age "+ student.getAge());
	}
}
