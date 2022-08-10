package com.virtusa.NumberConverter.Repository;

public class NumWordConstants {
	
	public static String LessThan20(int val) {
		String[] lessThan20 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", 
                "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve",
                "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", 
                "Eighteen", "Nineteen"};
		
		return lessThan20[val]; 
	}
	
	public static String TensPlace(int val) {
		String[] tensPlace = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty",
                "Sixty", "Seventy", "Eighty", "Ninety"};
		
		return tensPlace[val];
	}

}
