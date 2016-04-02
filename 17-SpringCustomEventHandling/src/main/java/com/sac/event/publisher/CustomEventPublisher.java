package com.sac.event.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

import com.sac.event.CustomEvent;

public class CustomEventPublisher implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher applicationEventPublisher;
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.applicationEventPublisher = publisher;
	}
	
	public void publishEvent(){
		CustomEvent customEvent = new CustomEvent(this);
		applicationEventPublisher.publishEvent(customEvent);
	}

}
