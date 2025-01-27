package com.leetcode.practice;

public class Problem8 {

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,2,3,3};
		int uniqueLength = Problem8.removeDuplicates(arr);
		for(int i=0;i<=uniqueLength;i++) {
			System.out.print(arr[i]+" ");
		}
		int[] arr1 = {1,1,2,2,2,3};
		int uniqueLength1 = Problem8.removeDuplicates(arr1);
		System.out.println();
		for(int i=0;i<=uniqueLength1;i++) {
			System.out.print(arr1[i]+" ");
		}
		int[] arr2 = {1,2,2,2,3,3};
		int uniqueLength2 = Problem8.removeDuplicates(arr2);
		System.out.println();
		for(int i=0;i<=uniqueLength2;i++) {
			System.out.print(arr2[i]+" ");
		}
	}
	
	public static int removeDuplicates(int[] nums) {
		int start = 0;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {
				nums[++start] = nums[i];
			}
		}
		return start;
	}

}
