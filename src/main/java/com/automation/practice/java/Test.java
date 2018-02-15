package com.automation.practice.java;

//import org.apache.log4j.*;
//import org.apache.log4j.Logger;
import org.slf4j.*;
public class Test {
	private static final Logger log = LoggerFactory.getLogger(Test.class);
	//private static final Logger log = LogManager.getLogger(Test.class);
	public static void main(String... args) {
		
		log.info("This is being printed from main method");
		log.error("This is to print error");
		log.debug("This to print debug message");
	}

}
     