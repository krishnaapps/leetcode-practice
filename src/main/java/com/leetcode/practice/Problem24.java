package com.leetcode.practice;

//Sort Array 0,1,2 using Dutch National Flag Algo
//TC-O(N), SC -O(1)
public class Problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,0,2,1,2,1,0};
		Problem24.sortColors(nums);
		for(int i=0;i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public static void sortColors(int[] nums) {
		int low = 0;
		int mid = 0;
		int n = nums.length;
		int high =n-1;
		while(mid<=high) {
			if(nums[mid]==0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;mid++;
			}else if(nums[mid]==1) {
				mid++;
			}else {
				int temp = nums[high];
				nums[high] = nums[mid];
				nums[mid] = temp;
				high--;
			}
		}
	}

}
