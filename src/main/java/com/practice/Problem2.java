package com.practice;

import java.util.HashSet;
import java.util.Set;

public class Problem2 {

    public static void main(String[] args) {

    }

    public static int getCount(int[] arr,int target){
        int count = 0;
        Set<Integer> data = new HashSet<>();
        for(int index = 0;index<arr.length;index++){
            if(data.contains(target-arr[index])){
                count++;
            }else{
                data.add(arr[index]);
            }
        }
        return count;
    }
}
