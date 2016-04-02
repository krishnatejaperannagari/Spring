package com.sac.aop;

public class Logging {
	
	public void beforeAdvice(){
		System.out.println("Going to setupp Student profile");
	}

	public void afterAdvice(){
		System.out.println("Student profile has been setup");
	}
	
	public void afterReturningAdvice(Object returnObj){
		System.out.println("Returning: " + returnObj.toString());
	}
	
	public void afterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Encountered exception is: " + ex.toString());
	}
}
