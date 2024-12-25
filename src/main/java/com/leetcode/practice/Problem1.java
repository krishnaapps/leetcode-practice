package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

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
	
	//TC : O(N) , SC : O(N)
	public static int[] twoSum1(int[] nums, int target) {
		Map<Integer,Integer> data = new HashMap<>();
		for(int i=0;i<=nums.length-1;i++) {
			data.put(nums[i], i);
		}
		for(int i=0;i<=nums.length-1;i++) {
			int num=target-nums[i];
			if(data.containsKey(num)&& i!=data.get(num)) {
				return new int[] {i,data.get(num)};
			}
		}
        return null;
	 }

}
