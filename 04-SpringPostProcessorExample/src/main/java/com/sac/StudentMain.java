package com.sac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;

public class StudentMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("Student-Bean.xml");
		Student student = (Student) abstractApplicationContext.getBean("student");
		System.out.println(student.getName());
		abstractApplicationContext.registerShutdownHook();
		
	}

}
