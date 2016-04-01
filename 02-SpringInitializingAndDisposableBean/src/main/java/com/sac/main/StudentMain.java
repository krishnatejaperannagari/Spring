package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Student-Bean.xml");
		
		//Initialization method is implicitly invoked 
		Student student = (Student) applicationContext.getBean("student");
		System.out.println(student.getName());
		
		try {
			//Releasing the resource
			student.destroy();
			System.out.println(student.getName());
			System.out.println(student.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
