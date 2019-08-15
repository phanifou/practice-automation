package com.automation.practice.java;

import java.util.Arrays;

public class Test1 {
	public static void main(String...string) {
		int nums[] = {1,-2,7,-8,9,35,200,-7};
		largestAndSmallest(nums);
	}

	private static void largestAndSmallest(int[] numbers) {
		int largest = numbers[0];
		int smallest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
		if(numbers[i]>largest){
		largest=numbers[i];
		}else if(numbers[i]<smallest){
		smallest=numbers[i];
		}
		}

		System.out.println("\nGiven integer array : " + Arrays.toString(numbers));
		System.out.println("Largest number in array is : " + largest);
		System.out.println("Smallest number in array is : " + smallest);
		}

		
}
