package com.leetcode.practice;
// Longest Sub Array with Given Sum Revision using Sliding window and 2 Pointer for Positive Values in Array
//TC - O(N) , SC -O(1)
public class Problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,7,3,9}; int k1= 10;
		
		Problem22.function(nums1, k1);
	}
	
	public static void function(int[] nums, int target) {
		int sum = 0;
		int start = 0;
		int end=-1;
		int n= nums.length;
		while(start<n) {
			
			while((end+1<n) && (sum+nums[end+1]<=target)) {
				sum+=nums[++end];
			}
			
			if(sum==target) {
				for(int i=start;i<=end;i++) {
					System.out.print(nums[i]+" ");
				}
				System.out.println();
			}
			
			sum-=nums[start];
			start++;
		}
	}

}
