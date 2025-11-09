package com.practice.subsequence;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        System.out.println(Problem2.getSubArrCount(arr,k));
    }

    public static int getSubArrCount(int[] arr, int k){
        int count =0;
        int sum = 0;
        Map<Integer,Integer> dataStore = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
            if(sum==k) count++;
            else if(dataStore.containsKey(sum-k)) {
                count++;
            } else if(!dataStore.containsKey(sum-k)) {
                dataStore.put(sum,i);
            }
        }
        return count;
    }
}
