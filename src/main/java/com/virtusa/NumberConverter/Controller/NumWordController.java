package com.virtusa.NumberConverter.Controller;

import com.virtusa.NumberConverter.Services.InterfaceCheckUserInput;

public class NumWordController {

	private InterfaceCheckUserInput checkUserInput;

	public NumWordController(InterfaceCheckUserInput checkUserInput) {
		this.checkUserInput = checkUserInput;
	}
	
	public String UserNumWord(String input) {
		
		return checkUserInput.inputString(input);
	}
	
}
