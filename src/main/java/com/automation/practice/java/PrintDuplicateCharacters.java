package com.automation.practice.java;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Scanner;


public class PrintDuplicateCharacters {

	public static void main(String...strings) {
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		printDuplicateCharacters(userInput);
	}
	
	public static void printDuplicateCharacters(String word) {
		try {
			if(word!=null&word!="") {
				char [] characters = word.toCharArray();
				Map<Character,Integer> charMap = new HashMap<Character,Integer>();
				for(Character ch :characters) {
					
					charMap.put(ch, charMap.containsKey(ch)?charMap.get(ch)+1:1);             
					/*if(charMap.containsKey(ch))
						charMap.put(ch, charMap.get(ch)+1);
				
				else
					charMap.put(ch, 1);
				*/
				}
		//Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.printf("Printing dupliate characters '%s' %n", word);
		for(Map.Entry<Character, Integer> entry:charMap.entrySet())
			if(entry.getValue()>1)
				System.out.printf("%s : %d %n",entry.getKey(),entry.getValue());
			}
			else
				System.out.println("You have supplied an empty or null String");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
