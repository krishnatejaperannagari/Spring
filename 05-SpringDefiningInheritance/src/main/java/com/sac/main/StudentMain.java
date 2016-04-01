package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;
import com.sac.bean.StudentSachin;

public class StudentMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext
				("Student-Bean.xml");
	
		Student student = (Student) applicationContext.getBean("student");
		System.out.println("Parent Class Name:- " + student.getName());
		
		
		StudentSachin studentSachin = (StudentSachin) applicationContext.getBean("studentSachin");
		System.out.println("Child Class Name:-" + studentSachin.getName());
		System.out.println("Child Class Country:- "+ studentSachin.getCountry());
	}

}
