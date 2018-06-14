package com.automation.practice.java.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class TwoNumberSwapNo3rdElement {
	private static Logger log = LoggerFactory.getLogger(TwoNumberSwapNo3rdElement.class);
	
	@Test
	public void swapTwoNumbersWithNo3rdNum() {
		int a= 20;
		int b = 30;
		a= a+b;
		b=a-b;
		a=a-b;
		log.info("New swapped a value -->" + a);
		
		log.info("New Swapped b value--> " + b);
		
	}

}
