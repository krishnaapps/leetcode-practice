package com.leetcode.practice;
//https://leetcode.com/problems/sort-colors/description/
public class Problem14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {2,0,2,1,1,0};
		Problem14.sortColors(arr1);
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		int[] arr2= {2,0,1};
		Problem14.sortColors(arr2);
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
	}

	private static void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 0) {
                int temp = nums[left];
                nums[left] = nums[mid];
                nums[mid] = temp;
                mid++;
                left++;
            } else if (nums[mid] == 2) {
                int temp = nums[right];
                nums[right] = nums[mid];
                nums[mid] = temp;
                right--;
            } else {
                mid++;
            }
        }
    }

}
