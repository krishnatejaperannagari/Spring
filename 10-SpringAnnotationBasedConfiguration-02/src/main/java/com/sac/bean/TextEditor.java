package com.sac.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {

	//Auto-wiring on property
	/*@Autowired*/
	private SpellChecker spellChecker;
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}
	
	//Turn off default behavior of auto-wire
	@Autowired(required = false)
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	//Auto-wiring on constructor
	@Autowired
	public TextEditor(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
		System.out.println("Default Constructor of TextEditor");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	//Auto-wiring on setter method
	/*@Autowired*/
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void spellCheck(){
		spellChecker.checkSpelling();
	}
	
}
