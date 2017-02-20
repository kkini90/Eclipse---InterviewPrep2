package com.usc.karthik;

public class RevArray {
	private static void reverse(int[] array){
		for( int i =0;i< array.length/2;i++){
			int temp = array[i];
			array[i] =array[array.length-i-1];
			array[array.length-i-1] = temp;
		}
		for(int i :array){
			System.out.print(" "+i);
		}
	}
		
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4};
		RevArray.reverse(array);
		//RevArray.reverse1(array);
	}

	private static void reverse1(int[] a) {
		int left =0;
		int right = a.length-1;
		
		while(left<right){
			/*int temp = a[left];
			a[left] =a[right];
			a[right] =temp;*/
			//Without temp
			a[left] =a[left] + a[right];
			a[right]=a[left] - a[right];
			a[left]=a[left] - a[right];
			
			left++;
			right--;
		}
		for(int i :a){
			System.out.print(" "+i);
		}		
	}
}
