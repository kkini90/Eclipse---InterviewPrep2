package com.usc.karthik;

public class MaxRepeatedElement {

	private static void findElement(int[] array,int length){
		/*//sort the array
		int count=1;
		int elemnt =0;
		for(int i=0;i<length-1;i++){
			if(array[i] == array[i+1]){
				count++;
				if(count >= length/2){
					 elemnt = array[i];
					}
				}else{
				count = 1;
			}
		}
		System.out.println(elemnt);*/
		//int maxCount =0 ;
		int count  =1;
		int element =0;
		int current = array[0];
		for(int i=1;i<length;i++){
			if(current == array[i]){
				count++;
				if(count>=length/2){
					element = current;
				}
			}else{
				//if(count > maxCount){
				//	maxCount = count;
				//	element = current;
				//}
				count =1;
				current = array[i];
			}
		}
		System.out.println(element);
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{1,2,3,4,4,4,5,5,5,5,5,5};
		MaxRepeatedElement.findElement(array,array.length);
	}
}
//http://www.geeksforgeeks.org/find-the-maximum-repeating-number-in-ok-time/
/*
 *  static int maxRepeating(int arr[], int n, int k)
    {
        // Iterate though input array, for every element
        // arr[i], increment arr[arr[i]%k] by k
        for (int i = 0; i< n; i++)
            arr[(arr[i]%k)] += k;
 
        // Find index of the maximum repeating element
        int max = arr[0], result = 0;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }
 
        
 
        // Return index of the maximum element
        return result;
    }
    */
