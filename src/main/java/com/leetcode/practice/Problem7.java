package com.leetcode.practice;

public class Problem7 {
	
	public static void main(String ...args) {
		int[] arr = {5,8,10,1,30};
		
		int large = arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		
		System.out.println("Largest Element in Array is "+large);
	}

}
