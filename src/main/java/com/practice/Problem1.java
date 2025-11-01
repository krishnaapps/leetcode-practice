package com.practice;

import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {

    }

    public int[] frequency(int[] arr){
        int[] result = new int[2];
        Map<Integer,Integer> data = new HashMap<>();
        for(int index = 0;index<arr.length;index++){
            if(data.containsKey(arr[index])){
                data.put(arr[index],data.get(arr[index])+1);
            }else{
                data.put(arr[index],1);
            }
        }

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        int minData = arr[0];
        int maxData = arr[0];
        for(Integer key: data.keySet()){
            int value = data.get(key);
            if(value>=maxFreq){
                maxFreq=value;
                maxData = key;
            }
            if(value<=minFreq){
                minFreq = value;
                minData = key;
            }
        }
        result[0] = minData;
        result[1] = maxData;
        return result;
    }
}
