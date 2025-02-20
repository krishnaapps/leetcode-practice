package com.leetcode.practice;

public class Problem12 {

	//https://takeuforward.org/data-structure/longest-subarray-with-given-sum-k/
	public static void main(String[] args) {
		int arr[] = {15, 2, 4, 8, 9, 5, 10, 23};
		int target = 23;
		int[] result = Problem12.findSubArrayWithSum(arr, target);
		System.out.println(result[0]+" "+result[1]);
		
		int arr1[] = {1, 10, 4, 1, 2, 6, 1};
		int target1 = 7;
		int[] result1 = Problem12.findSubArrayWithSum(arr1, target1);
		System.out.println(result1[0]+" "+result1[1]);

	}
	
	public static int[] findSubArrayWithSum(int[] nums, int target) {
		int[] result = new int[2];
		int start = 0;
		int end =1;
		int sum = nums[start]+nums[end];
		int maxLength = 0;
		while(end<=nums.length) {
			if(sum<target) {
				end++;
				sum+=nums[end];
			}else if (sum>target) {
				sum -=nums[start];
				start++;
			}else if(sum==target) {
				int currLength = end-start+1;
				if(currLength>maxLength) {
					maxLength= currLength;
					result[0] = start;
					result[1] = end;
					sum -=nums[start];
					start++;
				}else {
					
				}
				//return result;
			}
		}
		return result;
	}

}
