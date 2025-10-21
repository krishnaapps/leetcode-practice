package com.hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/migratory-birds/problem
public class Problem16 {

    public static void main(String[] args){
        int result = Problem16.migratoryBirds(Arrays.asList(new Integer[]{1,5,2,2,3}));
        System.out.println(result);
        int result1 = Problem16.migratoryBirds(Arrays.asList(new Integer[]{1,4,4,4,5,3}));
        System.out.println(result1);
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int result = 0;
        Map<Integer,Integer> data = new HashMap<>();
        for (Integer key : arr) {
            if (data.containsKey(key)) {
                data.put(key, data.get(key) + 1);
            } else {
                data.put(key, 1);
            }
        }
        int max = Integer.MIN_VALUE;
        int value = -1;
        for(Integer key: data.keySet()){
            if(data.get(key)>=max){
                max = data.get(key);
                 value = key;
            }
        }
        result = value;
        return  result;
    }
}
