package com.sac.main;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	static Logger logger = Logger.getLogger(StudentMain.class);
	
	public static void main(String[] args) {
		
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
	
	logger.info("Going to create HelloWorld Object");
	
	HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
	System.out.println(helloWorld.getMessage());
	
	logger.info("Exiting the program");
	
	}

}
