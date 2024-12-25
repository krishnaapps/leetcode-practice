package com.leetcode.practice;
//https://leetcode.com/problems/two-sum/description/
public class Problem1 {

	public static void main(String[] args) {
		int[] nums = {3,2,4};
		int target = 6;
		int[] result = Problem1.twoSum(nums,target);
		System.out.println(result[0]+"---"+result[1]);

	}
	
	//TC : O(N^2) , SC : O(1)
	public static int[] twoSum(int[] nums, int target) {
		for(int i=0;i<=nums.length-1;i++) {
			for(int j=0;j<=nums.length-1;j++) {
				if(i!=j) {
					int sum=nums[i]+nums[j];
					if(sum==target) {
						return new int[] {i,j};
					}
				}
			}
		}
        return null;
    }

}
