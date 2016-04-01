package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sac.bean.TextEditor;

public class TextEditorMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Beans.xml");
		TextEditor textEditor = (TextEditor) applicationContext.getBean("textEditor");
		
		textEditor.spellCheck();
		System.out.println(textEditor.getFileName());

	}

}
