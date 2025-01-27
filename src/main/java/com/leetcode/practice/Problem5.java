package com.leetcode.practice;

public class Problem5 {

	public static void main(String[] args) {
		int arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		System.out.println(Problem5.maxSum(arr, k));
		
	}
	
	public static int maxSum(int[] arr,int k) {
		int result =0;
		for(int i=0;i<=k-1;i++) {
			result+=arr[i];
		}
		int start =0;
		int currentSum = result;
		for(int i=k;i<arr.length;i++) {
			currentSum = result-arr[start++]+arr[i];
			result = Math.max(result, currentSum);
		}
		return result;
	}

}
