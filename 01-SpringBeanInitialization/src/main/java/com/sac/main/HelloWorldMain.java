package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.HelloWorld;

public class HelloWorldMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
		HelloWorld helloWorld  = (HelloWorld) applicationContext.getBean("helloWorld");
		helloWorld.displayName();
		System.out.println(helloWorld.toString());
		
		HelloWorld helloWorld2 = (HelloWorld) applicationContext.getBean("helloWorld");
		System.out.println(helloWorld2.toString());
	}

}
