
package com.usc.karthik;

public class MyDuplicateElements {
 
    public static  void removeDuplicates(){
		
    	 int[] input = new int[]{1,2,2,3,3,3,4,4,4,5,6};
    	 //If array is not sorted then sort using java.util.Arrays.sort(input)
    	    int current = input[0];
    	    boolean found = false;

    	    for (int i = 0; i < input.length; i++) {
    	        if (current == input[i] && !found) {
    	            found = true;
    	        } else if (current != input[i]) {
    	            System.out.print(" " + current);
    	            current = input[i];
    	            found = false;
    	        }
    	    }
    	    System.out.print(" " + current);    	
    }
     
    public static void main(String a[]){      
        removeDuplicates();       
    }
}
