package com.leetcode.practice;
//https://leetcode.com/problems/subarray-sum-equals-k/description/
public class Problem19 {

	public static void main(String[] args) {
		int[] arr1 = {1,7,3,2,5,1,10}; int k1= 10;
		System.out.println("RES1 : "+Problem19.subarraySum(arr1, k1));
		int[] arr2 = {10,1,7,2,9,1,10}; int k2= 10;
		System.out.println("RES2 : "+Problem19.subarraySum(arr2, k2));
		
	}
	
	public static int subarraySum(int[] nums, int k) {
		int start = 0;
		int end = -1;
		int n= nums.length;
		int sum = 0;
		int count = 0;
		while(start<n) {
			
			while((end+1<n) && (sum+nums[end+1]<=k)) {
				sum+=nums[++end];
			}
			
			if(sum==k) {
				count++;
			}
			
			sum-=nums[start];
			start++;
		}
		return count;
	}
	
	
}
