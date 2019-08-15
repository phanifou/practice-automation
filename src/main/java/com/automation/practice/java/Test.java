package com.automation.practice.java;

import java.util.ArrayList;

//import org.apache.log4j.*;
//import org.apache.log4j.Logger;
import org.slf4j.*;
public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	//private static final Logger log = LogManager.getLogger(Test.class);
	public static void main(String... args) {
		
		String abc = "kghslahg";
		
		StringBuilder sb = new StringBuilder(abc);
		sb.replace(5, 7, "xz");
		log.info("Actual String-->"+ sb.toString());
		
		log.info("This is being printed from main method");
		log.error("This is to print error");
		log.debug("This to print debug message");
		Test.print();
		new Test().print1();
		ArrayList list = new ArrayList();
		
		
		
		
	}
	
	static void print() 
	{
		System.out.println("static print");
	}
	void print1() {
		System.out.println("obj print");
	}

}
     