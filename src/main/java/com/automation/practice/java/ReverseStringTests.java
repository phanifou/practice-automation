package com.automation.practice.java;

public class ReverseStringTests {
	

		public static void main(String... args){

		String test = reverseStringRecursively("Hi How long have you been here");
		System.out.println("The reversed String is --> " + test);
		}

		public static String reverseStringRecursively(String str){
		if(str.length()<2)
		return str;

		System.out.println("SusbString --> : " +str.substring(1));
		String str1 = reverseStringRecursively(str.substring(1))+ str.charAt(0);
		System.out.println("String after each iteration---> : " + str1);
		return str1;
		}
		

}
