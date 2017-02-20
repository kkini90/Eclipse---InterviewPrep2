package com.usc.karthik;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = new int[]{3,2,1,6,4,9};
		int n = array.length;
		
		for( int i =0;i<n-1;i++){
			int index =i ;
			for(int j = i+1 ;j<n ;j++){
				if(array[j] < array[index]){
					index = j;
				}
			}
				int temp = array[i];
				array[i] = array[index];
				array[index] = temp;		
			
		}
		for(int i : array){
			System.out.println(i + " ");
		}	
	}
}
