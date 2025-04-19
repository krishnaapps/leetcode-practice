package com.leetcode.practice;
//https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
//https://leetcode.com/problems/maximum-subarray/
//Maximum Sum in SubArray -Kadenes Algo
//TC -O(N), SC - O(1)
public class Problem26 {

	public static void main(String[] args) {
		int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4}; 
		Problem26.kadenAlgo(nums);
	}
	
	public static void kadenAlgo(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
		int sum = 0;
		
		for(int i=0;i<nums.length;i++) {
			sum +=nums[i];
			
			maxSum = Math.max(maxSum, sum);
			
			if(sum<0) {
				sum = 0;
			}
		}
		System.out.println("Max Sum : "+maxSum);
	}

}
