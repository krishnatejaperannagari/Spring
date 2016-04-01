package com.sac.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void initialize(){
		/*this.name = "Sachin";
		System.out.println("This method is used for Initializing");*/
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		this.name = "Sachin";
		System.out.println("This method is used for Initializing");
		
	}
	
	@Override
	public void destroy() throws Exception {
		
		this.name = null;
		System.out.println("This method is used for releasing resource");
		
	}
	
}
