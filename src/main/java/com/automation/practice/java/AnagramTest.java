package com.automation.practice.java;

public class AnagramTest {
	
	public static void main (String... args){
		isAnagram("phani", "ianhp");
		isAnagram("p ani", "ianhp");
		
	}


	public static boolean isAnagram(String word, String anagram){


	if(word!=null && anagram!=null && word.length()==anagram.length())
	{
		word.toLowerCase();
		anagram.toLowerCase();
		char[] wordAry = word.toCharArray();
		StringBuilder temp = new StringBuilder(anagram);
		for(char ch : wordAry){
			int index = temp.indexOf(""+ch);
		if(index!=-1)
		temp.deleteCharAt(index);
		}
		System.out.printf("The given words %s : %s are anagrams --> %b  %n",word,anagram,temp.toString().isEmpty());
		System.out.println("String --> " + temp.toString());
		return temp.toString().isEmpty();
	}
	return false;


	}

}
