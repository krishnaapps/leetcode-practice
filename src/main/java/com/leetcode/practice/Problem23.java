package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

//Longest Sub array with Given Sum Having both Positive and Negative Numbers using Prefix Sum Technique
//TC - O(N) , SC -O(N)
public class Problem23 {

	public static void main(String[] args) {
		int[] nums1 = {1,2,3,1,1,1,1,4,2,3}; int target1= 3;
		
		Problem23.function(nums1, target1);
		int[] nums2 = {-1,1,1}; int target2= 1;
		
		Problem23.function(nums2, target2);
		
		int[] nums3 = {2,0,0,0,3}; int target3= 3;
		
		Problem23.function(nums3, target3);
		
		int[] nums4 = {1, 2, 3, 4, 5, -3, 6, 7, 8}; int target4= 9;
		
		Problem23.function(nums4, target4);

	}
	
	public static void function(int[] nums,int target){
		int prefixSum = 0;
		int length = 0; int maxLength = Integer.MIN_VALUE;
		int rem = 0;
		Map<Integer,Integer> pSumData = new HashMap<Integer,Integer>();
		int n= nums.length;
		for(int i=0;i<n;i++) {
			prefixSum +=nums[i];
			if(prefixSum == target) {
				length = i+1;
				maxLength = Math.max(maxLength, length);
			}
			rem = prefixSum-target;
			if(pSumData.containsKey(rem)) {
				int rLen = i-pSumData.get(rem);
				maxLength = Math.max(maxLength, rLen);
			}
			if(!pSumData.containsKey(prefixSum)) {
				pSumData.put(prefixSum, i);
			}
		}
		System.out.println("Max Length : "+maxLength);
	}

}
