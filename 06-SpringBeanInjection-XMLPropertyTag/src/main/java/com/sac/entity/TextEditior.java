package com.sac.entity;

public class TextEditior {
	
	private SpellChecker spellChecker;
	private int a;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public TextEditior() {
		System.out.println(" Inside Default Constructor of TextEditior ");
	}

	public SpellChecker getSpellChecker() {
		return spellChecker;
	}

	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	
	public void checkSpelling(){
		spellChecker.checkSpelling();
	}
	

}
