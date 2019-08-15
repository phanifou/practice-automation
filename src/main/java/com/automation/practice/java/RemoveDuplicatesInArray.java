package com.automation.practice.java;

public class RemoveDuplicatesInArray {

	    public static int[] removeDuplicates(int[] input){
	         
	        int j = 0;
	        int i = 1;
	        //return if the array length is less than 2
	        if(input.length < 2){
	        		            return input;
	        }
	        while(i < input.length){
	            if(input[i] == input[j]){
	            	System.out.println("Value of array at index  i : " + i + " " + input[i]);
	            	System.out.println("Value of array at index  j : " + j + " " + input[j]);
	                i++;
	                System.out.println("Value of i after when items are equal  " + i);
	            }else{
	            	
	            	input[++j] =input[i++];
	                              
	            }    
	        }
	        int[] output = new int[j+1];
	        for(int k=0; k<output.length; k++){
	            output[k] = input[k];
	        }
	         
	        return output;
	    }
	    
	    static int[] returnNonDuplicateArrayLength(int[] nums) {
	    	
	    	if(nums.length==1)
	    		return nums;
	    	
	    	else{
	    		int nonDuplicateLength = 0;
	    		for(int i=1;i<nums.length;i++) {
	    			if(nums[nonDuplicateLength]!=nums[i]) {
	    				//nonDuplicateLength++;
	    				nums[++nonDuplicateLength]=nums[i];
	    			}
	    		}
	    		int [] nonDupInt = new int[nonDuplicateLength+1];
	    		for(int j=0;j<nonDupInt.length;j++)
	    			nonDupInt[j] = nums[j];
	    		return nonDupInt;
	    	}
	    	
	    }
	     
	    public static void main(String a[]){
	        /*int[] input1 = {-2,3,-6,-6,8,9,10,10,10,12,12};
	        int[] output = removeDuplicates(input1);
	        for(int i:output){
	            System.out.print(i+" ");
	        }*/
	        int [] input2 = {11,2,3,-3,-4,4,5,5,6};
	        
	        int [] op =  returnNonDuplicateArrayLength(input2);
	        for(int i:op)
	        	System.out.print(i+ " ");
               	    }
	}

