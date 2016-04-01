package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.entity.TextEditior;

public class TextEditorMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		TextEditior textEditior = (TextEditior) applicationContext.getBean("textEditor");
		System.out.println(textEditior.getA());
		textEditior.checkSpelling();
	}

}
