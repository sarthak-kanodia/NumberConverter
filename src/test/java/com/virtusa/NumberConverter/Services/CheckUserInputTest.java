package com.virtusa.NumberConverter.Services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class CheckUserInputTest{
	
	private CheckUserInputService checkUserInputService;
	
	@Test
	public void inputString_validInteger_Test() {
		InterfaceWordConverter wordConverter = mock(InterfaceWordConverter.class);
		when(wordConverter.numberToWord(123)).thenReturn("One Hundred Twenty-Three");
		checkUserInputService = new CheckUserInputService(wordConverter);
		assertEquals("One Hundred Twenty-Three", checkUserInputService.inputString("123"));
	}
	
	@Test
	public void inputString_InvalidInput_Test() {
		InterfaceWordConverter wordConverter = mock(InterfaceWordConverter.class);
		checkUserInputService = new CheckUserInputService(wordConverter);
		assertEquals("Invalid number. Try Again", checkUserInputService.inputString("SA1234"));
	}
	
	@Test
	public void inputString_InputExceeds7Digits_Test() {
		InterfaceWordConverter wordConverter = mock(InterfaceWordConverter.class);
		checkUserInputService = new CheckUserInputService(wordConverter);
		assertEquals("Number should not exceeed 7 digits. Try Again", checkUserInputService.inputString("12345678"));
	}
// Updates
}
