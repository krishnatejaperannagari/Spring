package com.sac.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TextEditorConfiguration {
	
	@Bean
	public Object textEditor(){
		
		/*TextEditor textEditor =  new TextEditor();
		textEditor.setSpellChecker(spellChecker());
		return textEditor;*/
		return new TextEditor(spellChecker());
		
	}

	@Bean
	public SpellChecker spellChecker(){
		return new SpellChecker();
	}
}
