package com.hackerearth;

import java.util.Arrays;
import java.util.List;

public class Problem13 {

    public static void main(String[] args){

        int result0 = Problem13.birthday(Arrays.asList(new Integer[]{4}),4,1);
        System.out.println(result0);
        int result = Problem13.birthday(Arrays.asList(new Integer[]{2, 2, 1, 3, 2}),4,2);
        System.out.println(result);

        int result1 = Problem13.birthday(Arrays.asList(new Integer[]{1, 2, 1, 3, 2}),3,2);
        System.out.println(result1);

        int result2 = Problem13.birthday(Arrays.asList(new Integer[]{1, 1, 1, 1, 1,1}),3,2);
        System.out.println(result2);


    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int result = 0;
        int start = 0;
        int first = 0;
        int end = first+m;
        while(end<=s.size()){
            int currentSum = 0;
            while(start<end){
                currentSum+=s.get(start);
                start++;
            }
            if(currentSum==d){
                result++;
            }
            first++;
            start = first;
            end = first+m;

        }
        return result;
    }
}
