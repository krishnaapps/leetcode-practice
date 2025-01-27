package com.leetcode.practice;

public class Problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,0,2,3,2,0,0,4,5,1};
		Problem10.moveZerosToEnd(arr1);
		System.out.println();
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		int[] arr2= {1,2,0,1,0,4,0};
		Problem10.moveZerosToEnd(arr2);
		System.out.println();
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		
		int[] arr3 = {0,1,0,3,12};
		Problem10.moveZerosToEnd(arr3);
		System.out.println();
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		int[] arr4 = {0,0,5,8,0,1};
		Problem10.moveZerosToEnd(arr4);
		System.out.println();
		for(int i=0;i<arr4.length;i++) {
			System.out.print(arr4[i]+" ");
		}
	}

	private static void moveZerosToEnd(int[] nums) {
		
		int j=-1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==0) {j=i;break;}
		}
		
		for(int i=j+1;i<nums.length;i++) {
			if(nums[i]!=0) {
				int temp= nums[i];
				nums[i] = nums[j];
				nums[j] = temp;
				j++;
			}
		}
		
	}

}
