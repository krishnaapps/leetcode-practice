package com.leetcode.practice;
//https://takeuforward.org/data-structure/subarray-with-given-sum/
public class Problem17 {

	public static void main(String[] args) {
		int[] arr1 = {1,7,3,9}; int k1= 10;
		Problem17.subArraySumK(arr1, k1);
		int[] arr2 = {10,1,7,3,9,1,10}; int k2= 10;
		Problem17.subArraySumK(arr2, k2);
		
	}
	
	public static void subArraySumK(int[] nums, int k) {
		int start = 0;
		int end = -1;
		int n= nums.length;
		int sum = 0;
		while(start<n) {
			
			while((end+1<n) && (sum+nums[end+1]<=k)) {
				sum+=nums[++end];
			}
			
			if(sum==k) {
				for(int i=start;i<=end;i++) System.out.print(nums[i]+" ");
				System.out.println();
			}
			
			sum-=nums[start];
			start++;
		}
	}
	
	
}
