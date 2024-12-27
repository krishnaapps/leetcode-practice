package com.leetcode.practice;
//26
//https://leetcode.com/problems/remove-duplicates-from-sorted-array
public class Problem3 {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		int result = Problem3.removeDuplicates(nums);
		System.out.println(result);

	}
	
	public static int removeDuplicates(int[] nums) {
		int k=0;
		for(int index = 0;index<nums.length-1;index++) {
			if(nums[index]!=nums[index+1]) {
				nums[k++]=nums[index];
			}
		}
		if(nums[k]!=nums[nums.length-1]) {
        	nums[k++] = nums[nums.length-1];
        }else{
            nums[k++] = nums[nums.length-1];
        }
		return k;
	}
	

}
