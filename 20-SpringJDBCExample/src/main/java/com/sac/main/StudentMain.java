package com.sac.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.Student;
import com.sac.dao.StudentDAOImpl;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		StudentDAOImpl daoImpl = (StudentDAOImpl) applicationContext.getBean("studentDAoImpl");
		
		/*System.out.println("---- Creating A Record ---");
		daoImpl.create("Sachin", 27);
		daoImpl.create("Sadan", 25);*/
		
		
		System.out.println("---- Fetching Record ---");
		List<Student> arlStudents = daoImpl.listStudents();
		
		for (Student student : arlStudents) {
			System.out.println("Student ID: " + student.getId());
			System.out.println("Student Name: " + student.getName());
			System.out.println("Student Age: " + student.getAge());
		}

	}

}
