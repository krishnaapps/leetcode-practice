package com.leetcode.practice;
//https://takeuforward.org/data-structure/binary-search-explained/
public class Problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {3, 4, 6, 7, 9, 12, 16, 17};
		int target1 = 6;
		int resultIdx1 = Problem15.binarySearchIterative(arr1,target1);
		System.out.println("resultIdx1 "+resultIdx1);
		int resultIdxRec1 = Problem15.binarySearchRecursive(arr1,target1,0,arr1.length-1);
		System.out.println("resultIdxRec1 "+resultIdxRec1);
		
		int[] arr2= {1,3,8,12,15,19};
		int target2 = 15;
		int resultIdx2 = Problem15.binarySearchIterative(arr2,target2);
		System.out.println("resultIdx2 "+resultIdx2);
		int resultIdxRec2 = Problem15.binarySearchRecursive(arr2,target2,0,arr2.length-1);
		System.out.println("resultIdxRec2 "+resultIdxRec2);
	}

	private static int binarySearchIterative(int[] nums, int target) {
        int resultIdx = -1;
        int low = 0;
        int high = nums.length-1;
        
        while(low<=high) {
        	int mid = (low+high)/2;
        	if(nums[mid] == target) return mid+1;
        	else if(target<nums[mid]) {
        		high = mid-1;
        	}else {
        		low = mid+1;
        	}
        }
        return resultIdx;
    }
	
	private static int binarySearchRecursive(int[] nums, int target, int low, int high) {
		if(low>high) return -1;
		
		int mid = (low+high)/2;
		if(nums[mid] ==target) return mid+1;
		else if(target<nums[mid]) return binarySearchRecursive(nums, target, low, mid-1);
		else return binarySearchRecursive(nums, target, mid+1, high);
	}

}
