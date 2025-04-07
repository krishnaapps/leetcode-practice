package com.leetcode.practice;

import java.util.ArrayList;
import java.util.List;
//Printing Subsequences
//https://leetcode.com/problems/subsets/
//TC-(2^N)*N --N to print Sub Sequence 
//SC--O(N) --Max N elements are waiting in Stack Space based on depth of recursion tree
public class Problem20 {

	public static void main(String[] args) {
		int[] arr = {3,1,2};
		List<Integer> data = new ArrayList<>();
		Problem20.printAllSubSets(0,arr,arr.length,data);
		
	}

	private static void printAllSubSets(int index, int[] arr, int n, List<Integer> data) {
		
		if(index>=n) {
			for(int i=0;i<data.size();i++)	System.out.print(data.get(i)+" ");
			if(data.size()==0) System.out.print("{}");
			System.out.println();
			return;
		}
		//Take 
		data.add(arr[index]);
		printAllSubSets(index+1, arr, n, data);
		//Not Take
		data.removeLast();
		printAllSubSets(index+1, arr, n, data);
	}
	
	
	
}
