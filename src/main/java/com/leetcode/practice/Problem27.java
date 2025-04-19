package com.leetcode.practice;
//Next Permutation
//TC : O(3N) , SC - O(1)
//https://takeuforward.org/data-structure/next_permutation-find-next-lexicographically-greater-permutation/
//https://leetcode.com/problems/next-permutation/
public class Problem27 {

	public static void main(String[] args) {
		int[] nums1 = {2,1,5,4,3,0,0};
		Problem27.nextPermutation(nums1);
		
		int[] nums2 = {1,3,2};
		Problem27.nextPermutation(nums2);
		
		int[] nums3 = {3,2,1};
		Problem27.nextPermutation(nums3);

	}

	public static void nextPermutation(int[] nums) {
		
		//Step1 : Identify the Break Point 
		
		int n = nums.length;
		int ind = -1;
		for(int i=n-2;i>=0;i--) {
			if(nums[i]<nums[i+1]) {
				ind = i;
				break;
			}
		}
		
		if(ind == -1) {
			//Reverse Array
			Problem27.revArr(nums, 0, n-1);
		}else {
			// Step 2 : Find Next Greater and Swap it
			for(int i = n-1;i>ind;i--) {
				if(nums[i]>nums[ind]) {
					int temp = nums[i];
					nums[i] = nums[ind];
					nums[ind] = temp;
					break;
				}
			}
			
			// Step 3 : Reverse Array from ind+1 to n-1;
			Problem27.revArr(nums, ind+1, n-1);
		}
		System.out.print("Next Permutation : ");
		for(int i=0;i<n;i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
	}
	
	//{2,3,4} {1,2,3,4} {5,4,1,0,0}
	public static void revArr(int[] nums,int start,int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			start++;end--;
		}
	}
}
