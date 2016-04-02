package com.sac.event;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent{

	/**
	 * Default serial version ID
	 */
	private static final long serialVersionUID = 1L;

	public CustomEvent(Object source) {
		super(source);
	}
	
	public void eventDescription(){
		System.out.println("Custom event description");
	}

	@Override
	public String toString() {
		System.out.println("This is a custom Event");
		return super.toString();
	}
}
