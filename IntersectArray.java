package com.usc.karthik;

public class IntersectArray {	
	public static void main(String[] args) {
		
		int[] arr1 = new int[] {1,3,4,5};
		int[] arr2 = new int[] {1,2,4,5,8,9};
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i =0,j=0;
		while(i<n && j<m){
			if(arr1[i] < arr2[j]){
				i++;
				
			}else if(arr1[i] > arr2[j]){
				j++;
				
			}else{
				System.out.println(arr2[j++]);
				i++;
				
			}
		}		
	}
}
