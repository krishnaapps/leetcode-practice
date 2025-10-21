package com.hackerearth;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/sock-merchant/problem
public class Problem18 {
    public static void main(String[] args){
        int result = Problem18.sockMerchant(7, Arrays.asList(new Integer[]{1,2,1,2,1,3,2}));
        System.out.println(result);

        int result1 = Problem18.sockMerchant(9, Arrays.asList(new Integer[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
        System.out.println(result1);
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer,Integer> data = new HashMap<>();
        for(int i=0;i<n;i++){
            Integer key = ar.get(i);
            if(data.containsKey(key)){
                data.put(key,data.get(key)+1);
            }else{
                data.put(key,1);
            }
        }
        int pair=0;
        for(Integer key:data.keySet()){
            int value=data.get(key);
            pair=pair+(value/2);
        }
        return pair;
    }
}
