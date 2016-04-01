package com.sac.bean;

public class TextEditor {
	
	private SpellChecker spellChecker;

	public TextEditor() {
		System.out.println("Inside TextEditor Constructor");
	}
	
	public TextEditor(SpellChecker spellChecker){
		System.out.println("Inside TextEditor Constructor");
		this.spellChecker = spellChecker;
	}
	
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}


	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}


	public void spellCheck(){
		spellChecker.spellCheck();
	}
}
