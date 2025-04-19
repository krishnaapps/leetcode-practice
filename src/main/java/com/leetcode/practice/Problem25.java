package com.leetcode.practice;

import java.util.HashMap;
import java.util.Map;

//Majority >N/2
//TC - O(N), SC - O(1)
public class Problem25 {

	public static void main(String[] args) {
		int[] nums1= {2,2,3,3,1,2,2};
		System.out.println(Problem25.majority2(nums1));
		int[] nums2= {3,2,3};
		System.out.println(Problem25.majority2(nums2));

	}
	
	public static int majority2(int[] nums) {
		int count = 0;
		int element = -1;
		int n = nums.length;
		for(int i=0;i<n;i++) {
			if(count ==0) {
				count =1;
				element = nums[i];
			}else if(element ==nums[i]) {
				count++;
			}else {
				count--;
			}
		}
		return element;
	}
	//Better Approach : TC = O(N) , SC = O(N) bcoz of Hash Map
	public static int majority22(int[] nums) {
		int n = nums.length;
		Map<Integer,Integer> data = new HashMap<>();
		for(int i=0;i<n;i++) {
			if(data.containsKey(nums[i])) {
				data.put(nums[i], data.get(nums[i])+1);
			}else {
				data.put(nums[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> it : data.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
        }
		return -1;
	}

}
