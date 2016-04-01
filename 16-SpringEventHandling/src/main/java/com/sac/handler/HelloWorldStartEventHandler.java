package com.sac.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class HelloWorldStartEventHandler implements 
ApplicationListener<ContextStartedEvent>{

	@Override
	public void onApplicationEvent(ContextStartedEvent contextStartedEvent) {
		System.out.println("Context Started Event");
	}
	

}
