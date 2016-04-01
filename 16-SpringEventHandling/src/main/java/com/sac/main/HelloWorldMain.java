package com.sac.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		applicationContext.start();
		
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		System.out.println(helloWorld.getMessage());
		
		applicationContext.stop();
	}

}
