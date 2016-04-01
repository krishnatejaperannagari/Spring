package com.sac.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sac.bean.TextEditor;
import com.sac.bean.TextEditorConfiguration;

public class SpellCheckerMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TextEditorConfiguration.class);
		TextEditor textEditor = applicationContext.getBean(TextEditor.class);
		textEditor.spellCheck();
	
		
	}

}
