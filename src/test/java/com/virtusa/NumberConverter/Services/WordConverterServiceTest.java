package com.virtusa.NumberConverter.Services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;

import org.junit.Test;

public class WordConverterServiceTest{

	private WordConverterService wordConverterService;
	
	@Test
	public void numberToWord_Zero_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("zero", wordConverterService.numberToWord(0));
	}
	
	@Test
	public void numberToWord_1digit_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("One", wordConverterService.numberToWord(1));
	}
	
	@Test
	public void numberToWord_2digit_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("Twenty-Three", wordConverterService.numberToWord(23));
	}
	
	@Test
	public void numberToWord_3digit_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("Nine Hundred Ninety-Nine", wordConverterService.numberToWord(999));
	}
	
	@Test
	public void numberToWord_NegativeNumber_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("minus One Hundred Twenty-Three", wordConverterService.numberToWord(-123));
	}
	
	@Test
	public void numberToWord_Custom_test() {
		wordConverterService = spy(WordConverterService.class);
		assertEquals("Seventy-Six Million Three Hundred One Thousand Sixty-Four", wordConverterService.numberToWord(76301064));
	}

}
