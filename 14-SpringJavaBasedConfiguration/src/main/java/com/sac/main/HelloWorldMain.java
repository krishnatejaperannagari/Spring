package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sac.bean.HelloWorld;
import com.sac.bean.HelloWorldConfig;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
		HelloWorld helloWorld = applicationContext.getBean(HelloWorld.class);
		helloWorld.setMessage("Hello World");
		System.out.println(helloWorld.getMessage());

	}

}
