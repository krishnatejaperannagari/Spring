package com.sac.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student-Bean.xml");
		
		//Initialization method is implicitly invoked 
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getName());
		applicationContext.registerShutdownHook();
	}

}
