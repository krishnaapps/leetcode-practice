package com.leetcode.practice;
//167
//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
public class Problem2 {

	public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = Problem2.twoSum(nums,target);
		System.out.println(result[0]+"---"+result[1]);

	}
	
	//TC : O(N) , SC : O(1)
	public static int[] twoSum(int[] nums, int target) {
		int first =0;
		int second = nums.length-1;
		while(first<second) {
			int sum = nums[first]+nums[second];
			if(sum==target) {
				return new int[] {first,second};
			}else if(sum>target) {
				second--;
			}else {
				first++;
			}
		}
        return null;
    }
	

}
