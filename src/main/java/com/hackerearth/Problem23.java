package com.hackerearth;

import java.util.Arrays;
import java.util.List;
//https://www.hackerrank.com/challenges/the-hurdle-race/problem?isFullScreen=true
public class Problem23 {
    public static void main(String[] args){
        System.out.println(Problem23.hurdleRace(1, Arrays.asList(new Integer[]{1,2,3,3,2})));
    }

    public static int hurdleRace(int k, List<Integer> height) {
        // Write your code here
        int result =0;
        int maxHeight = 0;
        for(int h:height){
            if(h>maxHeight){
                maxHeight = h;
            }
        }
        result = maxHeight-k>=0?maxHeight-k:0;
        return result;
    }
}
