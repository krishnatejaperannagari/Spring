package com.sac.bean;

import javax.annotation.Resource;

public class SpellChecker {
	
	private String spellCheck;

	
	public String getSpellCheck() {
		return spellCheck;
	}

	@Resource(name="spellChecker")
	public void setSpellCheck(String spellCheck) {
		this.spellCheck = spellCheck;
	}
	
	

}
