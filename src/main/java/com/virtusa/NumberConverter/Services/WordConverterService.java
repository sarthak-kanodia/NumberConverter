package com.virtusa.NumberConverter.Services;

import com.virtusa.NumberConverter.Repository.NumWordConstants;

public class WordConverterService implements InterfaceWordConverter{
	
	public String numberToWord(int num) {
		
		String word = "";
		
		if(num==0) {
			return "zero";
		}
		
		if(num<0) {
			return "minus "+numberToWord(Math.abs(num));
		}
		
		if(num/1000000>0) {
			word += numberToWord(num/1000000)+" Million ";
			num %= 1000000;
		}
		
		if(num/1000>0) {
			word += numberToWord(num/1000)+" Thousand ";
			num %= 1000;
		}
		
		if(num/100>0) {
			word += numberToWord(num/100)+" Hundred ";
			num %= 100;
		}
		
		if(num>0) {
			if(num<20) {
				word += NumWordConstants.LessThan20(num);
			}
			else {
				word+= NumWordConstants.TensPlace(num/10);
				if(num%10>0) {
					word += "-"+NumWordConstants.LessThan20(num%10);
				}
			}
		}
		
		return word;
	}
	
}
