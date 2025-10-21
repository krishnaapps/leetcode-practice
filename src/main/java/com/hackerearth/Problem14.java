package com.hackerearth;
import java.util.Arrays;

import java.util.List;


//https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
public class Problem14 {

    public static void main(String[] args){
        int result = Problem14.divisibleSumPairs(6,5, Arrays.asList(new Integer[]{1,2,3,4,5,6}));
        System.out.println(result);

        int result1 = Problem14.divisibleSumPairs(6,3, Arrays.asList(new Integer[]{1,3,2,6,1,2}));
        System.out.println(result1);
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int result = 0;

        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++){
                if((ar.get(i)+ar.get(j))%k==0){
                    result++;
                }
            }
        }
        return result;
    }
}
