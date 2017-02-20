package com.usc.karthik;

public class MinInRotateArray {

	private static int findMin(int [] array){
		return findMin(array, 0, array.length - 1);
		
	}
	private static int findMin(int[] array, int left, int right) {
		if (left == right)
			return array[left];
		if ((right - left) == 1)
			return Math.min(array[left], array[right]);
			//Math.max for Maximum
	 
		int middle = left + (right - left) / 2;
	 
		// not rotated
		if (array[left] < array[right]) {
			return array[left];
	 
		// go right side
		} else if (array[middle] > array[left]) {
			return findMin(array, middle, right);
	 
		// go left side
		} else {
			return findMin(array, left, middle);
		}
	}
	public static void main(String[] args) {
		int[] array = new int[] {3,4,5,1,2};
		int  min = MinInRotateArray.findMin(array);
		System.out.println(min);
	}
// O(log n)
}

/*
 * This is a follow-up problem of finding minimum element in rotated sorted array without duplicate elements. 
 * We only need to add one more condition, which checks if the left-most element and the right-most element are equal. 
 * If they are we can simply drop one of them. In my solution below, 
 * I drop the left element whenever the left-most equals to the right-most.

public int findMin(int[] num) {
    return findMin(num, 0, num.length-1);
}
 
public int findMin(int[] num, int left, int right){
    if(right==left){
        return num[left];
    }
    if(right == left +1){
        return Math.min(num[left], num[right]);
    }
    // 3 3 1 3 3 3
 
    int middle = (right-left)/2 + left;
    // already sorted
    if(num[right] > num[left]){
        return num[left];
    //right shift one
    }else if(num[right] == num[left]){
        return findMin(num, left+1, right);
    //go right    
    }else if(num[middle] >= num[left]){
        return findMin(num, middle, right);
    //go left    
    }else{
        return findMin(num, left, middle);
    }
}
 */
