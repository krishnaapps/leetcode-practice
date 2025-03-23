package com.leetcode.practice;

public class Problem9 {

	public static void main(String[] args) {
		int[] nums = {8,7,3,11,10,9,2};
		Problem9.reverseArray(0, nums.length-1, nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		int[] data = {1,2,3,4,5,6,7} ;
		int k=3;
		Problem9.reverseArray(0, data.length-k-1, data);
		Problem9.reverseArray(data.length-k, data.length-1, data);
		Problem9.reverseArray(0, data.length-1, data);
		System.out.println();
		for(int i=0;i<data.length;i++) {
			System.out.print(data[i]+" ");
		}
		
	}
	
	public static void reverseArray(int start, int end, int[] nums) {
		int last = end;
		for(int i=start;i<=(start+end)/2;i++) {
			int temp = nums[i];
			nums[i] =nums[last];
			nums[last--]=temp;
			
		}
	}

}
