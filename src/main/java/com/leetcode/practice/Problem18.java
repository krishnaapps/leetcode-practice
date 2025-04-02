package com.leetcode.practice;
//https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
public class Problem18 {

	public static void main(String[] args) {
		int[] arr1 = {1,7,3,2,5,1}; int k1= 10;
		System.out.println("RES1 : "+Problem18.longSubArraySumK(arr1, k1));
		int[] arr2 = {10,1,7,2,9,1,10}; int k2= 10;
		System.out.println("RES2 : "+Problem18.longSubArraySumK(arr2, k2));
		
	}
	
	public static int longSubArraySumK(int[] nums, int k) {
		int start = 0;
		int end = -1;
		int n= nums.length;
		int sum = 0;
		int maxLength = Integer.MIN_VALUE;
		while(start<n) {
			
			while((end+1<n) && (sum+nums[end+1]<=k)) {
				sum+=nums[++end];
			}
			
			if(sum==k) {
				int currLength = end-start+1;
				maxLength = Math.max(maxLength,currLength);
			}
			
			sum-=nums[start];
			start++;
		}
		return maxLength;
	}
	
	
}
