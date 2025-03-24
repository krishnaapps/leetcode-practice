package com.leetcode.practice;
//https://takeuforward.org/data-structure/binary-search-explained/
public class Problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {7, 8, 9, 1, 2, 3, 4, 5, 6};
		int target1 = 6;
		int resultIdx1 = Problem16.binarySearchRotated(arr1,target1);
		System.out.println("resultIdx1 "+resultIdx1);
		
		int[] arr2= {4,5,1,2,3};
		int target2 = 4;
		int resultIdx2 = Problem16.binarySearchRotated(arr2,target2);
		System.out.println("resultIdx2 "+resultIdx2);
		
		int[] arr3= {4,5,1,2,3};
		int target3 = 6;
		int resultIdx3 = Problem16.binarySearchRotated(arr3,target3);
		System.out.println("resultIdx2 "+resultIdx3);
	}

	private static int binarySearchRotated(int[] nums, int target) {
		int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (nums[mid] == target) {
                return mid+1;
            }

            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1; 
    }
	
}
