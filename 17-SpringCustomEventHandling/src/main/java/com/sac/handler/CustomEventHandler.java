package com.sac.handler;

import org.springframework.context.ApplicationListener;

import com.sac.event.CustomEvent;

public class CustomEventHandler implements ApplicationListener<CustomEvent>{

	@Override
	public void onApplicationEvent(CustomEvent customEvent) {
		customEvent.eventDescription();
	}
	
	

}
