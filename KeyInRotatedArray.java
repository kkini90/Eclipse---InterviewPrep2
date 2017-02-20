
package com.usc.karthik;

public class KeyInRotatedArray {

	private static int findKey(int[] array,int key){
		int n =array.length;
		 int left = 0;
		  int right = n - 1;
		 
		  while (left <= right) {
		    // Avoid overflow, same as M=(L+R)/2
		    int middle = left + ((right - left) / 2);
		    if (array[middle] == key) return array[middle];
		 
		    // the bottom half is sorted
		    if (array[left] <= array[middle]) {
		      if (array[left] <= key && key < array[middle])
		        right = middle - 1;
		      else
		        left = middle + 1;
		    }
		    // the upper half is sorted
		    else {
		      if (array[middle] < key && key <= array[right])
		        left = middle + 1;
		      else 
		        right = middle - 1;
		    }
		  }
		  return -1;
	}
	public static void main(String[] args) {
		int key = KeyInRotatedArray.findKey(new int[] {3,4,5,1,2},3);
		System.out.println(key);
	}
}
