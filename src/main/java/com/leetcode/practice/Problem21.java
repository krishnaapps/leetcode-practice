package com.leetcode.practice;

//https://takeuforward.org/data-structure/merge-sort-algorithm/
public class Problem21 {

	public static void main(String[] args) {
		int[] arr = {3,2,4,1,3};
		Problem21.mergeSort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");
	}

	private static void mergeSort(int[] arr, int low, int high) {
		if(low>=high) return;//Base Condition
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}

	private static void merge(int[] arr, int low, int mid, int high) {
		int[] temp = new int[high-low+1];
		int tempIndx =0;
		int left = low; int right = mid+1;
		while(left<=mid &&right<=high) {
			if(arr[left]<=arr[right]) {
				temp[tempIndx] = arr[left];
				tempIndx++;left++;
			}else {
				temp[tempIndx] = arr[right];
				tempIndx++;right++;
			}
		}
		
		while(left<=mid) {
			temp[tempIndx] = arr[left];
			tempIndx++;left++;
		}
		
		while(right<=high) {
			temp[tempIndx] = arr[right];
			tempIndx++;right++;
		}
		tempIndx = 0;
		for(int i=low;i<=high;i++) {
			arr[i] = temp[tempIndx++];
		}
	}

	
	
	
}
