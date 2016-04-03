package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		Student student = (Student) applicationContext.getBean("student");
		
		//System.out.println(student.getName());
		//System.out.println(student.getAge());
		System.out.println(student.toString());
		student.printThrowException();
	}

}
