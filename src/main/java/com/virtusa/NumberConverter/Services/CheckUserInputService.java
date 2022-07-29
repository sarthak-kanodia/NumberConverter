package com.virtusa.NumberConverter.Services;

public class CheckUserInputService implements InterfaceCheckUserInput {
	
	private InterfaceWordConverter wordConverter;
	
	public CheckUserInputService(InterfaceWordConverter wordConverter) {
		this.wordConverter = wordConverter;
	}

	public String inputString(String input) {		
		try {
			int number = Integer.parseInt(input);
			
			if(input.length()>7) {
				return "Number should not exceeed 7 digits. Try Again";
			}
			
			return wordConverter.numberToWord(number);
		}
		catch(Exception e) {
			return "Invalid number. Try Again";
		}
				
	}

}
