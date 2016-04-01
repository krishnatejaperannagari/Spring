package com.sac.main;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		AbstractApplicationContext applicationContext = new
				ClassPathXmlApplicationContext("Spring-Beans.xml");
		
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.getMessage();
		applicationContext.registerShutdownHook();
	}

}
