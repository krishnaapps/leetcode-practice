package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};
        int k=3;
        //System.out.println("Max Length : "+Problem3.longSubArrSumk(arr,k));
        int[] arr1 = {1, 2, 1, 0, 1, 1, 0};
        int k1=4;
        //System.out.println("Max Length : "+Problem3.longSubArrSumk(arr1,k1));
        int[] arr2 = {-1, -1, 10, -1, -1,-1};
        int k2=5;
        System.out.println("Max Length : "+Problem3.longSubArrSumk(arr2,k2));

    }

    public static  int maxSum(int[] arr){
        int sum = 0;
        int maxSum = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            maxSum = Math.max(sum,maxSum);
            if(sum<0){
                sum = 0;
            }
        }
        return maxSum;
    }

    public static int longSubArrSumk(int[] arr, int k){
        Map<Integer,Integer> prefixSum = new HashMap<>();
        int sum = 0;
        int lenght = 0;
        for(int i = 0;i<arr.length;i++){
            sum +=arr[i];
            if(sum==k) lenght = Math.max(lenght,i+1);
            if(prefixSum.containsKey(sum-k)) lenght = Math.max(lenght,i-prefixSum.get(sum-k));
            if(!prefixSum.containsKey(sum)) prefixSum.put(sum,i);
        }
        return lenght;
    }
}
