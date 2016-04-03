package com.sac.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	@Pointcut("execution(* com.sac.bean.*.*(..))")
	public void selectAll(){
		
	}
	
	@Before("selectAll()")
	public void beforeAdvice(){
		System.out.println("Going to setup Student profile");
	}

	@After("selectAll()")
	public void afterAdvice(){
		System.out.println("Student profile has been setup");
	}
	
	@AfterReturning(pointcut = "selectAll()", returning="returnObj")
	public void afterReturningAdvice(Object returnObj){
		System.out.println("Returning: " + returnObj.toString());
	}
	
	@AfterThrowing(pointcut = "selectAll()", throwing = "ex")
	public void afterThrowingAdvice(IllegalArgumentException ex){
		System.out.println("Encountered exception is: " + ex.toString());
	}
}
