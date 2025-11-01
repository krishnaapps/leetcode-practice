package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 1};
        System.out.println(Problem4.maxDist(arr));
        int[] arr1 = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2};
        System.out.println(Problem4.maxDist(arr1));
    }

    public static int maxDist(int[] arr){
        int maxLen = 0;
        Map<Integer,Integer> startIndex = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(startIndex.containsKey(arr[i])){
                maxLen = Math.max(maxLen,i-startIndex.get(arr[i]));
            }else{
                startIndex.put(arr[i],i);
            }
        }
        return maxLen;
    }
}
