package com.usc.karthik;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = new int[]{3,2,1,6,4,9};
		int n = array.length;
		
		for(int c =0;c<n;c++){
			for(int d = 0;d<n-c-1 ;d++){
				if(array[d]>array[d+1]){
					int temp = array[d];
					array[d] = array[d+1];
					array[d+1] = temp;
				}
				
			}
		}
		for(int i : array){
			System.out.println(i + " ");
		}
	}
}
