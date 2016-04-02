package com.sac.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.event.publisher.CustomEventPublisher;

public class HelloWorldMain {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		applicationContext.start();
		
		CustomEventPublisher customEventPublisher = (CustomEventPublisher) applicationContext.getBean("customEventPublisher");
		customEventPublisher.publishEvent();
	}

}
