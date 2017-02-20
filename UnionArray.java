package com.usc.karthik;

public class UnionArray {

	
	public static void main(String[] args) {
		int[] arr1 = new int[] {1,3,4,5};
		int[] arr2 = new int[] {1,2,4,5,8,9};
		
		int n = arr1.length;
		int m = arr2.length;
		
		int i =0,j=0;
		while(i<n && j<m){
			if(arr1[i] < arr2[j]){
				System.out.println(arr1[i++]);
				
			}else if(arr1[i] > arr2[j]){
				System.out.println(arr2[j++]);
				
			}else{
				System.out.println(arr2[j++]);
				i++;
				
			}
		}
		while(i<n){
			System.out.println(arr1[i++]);
		}
		while(j<m){
			System.out.println(arr2[j++]);
		}
	}
}
