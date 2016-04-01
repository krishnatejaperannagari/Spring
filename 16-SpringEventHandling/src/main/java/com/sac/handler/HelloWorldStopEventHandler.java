package com.sac.handler;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class HelloWorldStopEventHandler implements 
ApplicationListener<ContextStoppedEvent>{

	@Override
	public void onApplicationEvent(ContextStoppedEvent contextStoppedEvent) {
		System.out.println("Context Stopped Event");
	}

	
}
