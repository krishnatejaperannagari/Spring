package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.JavaCollection;

public class JavaCollectionMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		JavaCollection collection = (JavaCollection) context.getBean("javaCollection");
		
		System.out.println(collection.getAddressList());
		System.out.println(collection.getAddressMap());
		System.out.println(collection.getAddressSet());
	}

}
