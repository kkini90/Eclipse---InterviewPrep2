package com.usc.karthik;

public class MaxSumSubArray {

	static int start = 0, end = 0;

	public static void main(String[] args) {
		int a[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		int k = 0;
		System.out.println("Max sum: " + getMaxSum(a));
		System.out.println("Sub array");
		for (k = start; k < end; k++) {
			System.out.print(a[k] + " ");
		}
	}

	public static int getMaxSum(int[] a) {
		int i = 0, max = 0, tstart = 0, tend = 0;
		int sum = 0;
		for (i = 0; i < a.length; i++) {
			sum += a[i];
			tend++;
			if (max < sum) {
				end = tend;
				start = tstart;
				max = sum;
			} else if (sum < 0) {
				tstart = tend = i + 1;
				sum = 0;
			}
		}
		return max;
	}
}
// in edge case , when all elements of the array are negative, then currently I
// am returning 0 as the max sum.
// however it can be changed to return INT_MIN
// or just the first element if I assume the subsequence can't be empty.