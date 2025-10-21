package com.hackerearth;

import java.util.Arrays;
//https://www.hackerrank.com/challenges/electronics-shop/problem?isFullScreen=true
public class Problem24 {

    public static void main(String[] args){
        System.out.println(Problem24.getMoneySpent(new int[]{40,50,60},
                new int[]{5,8,12},60));
    }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int result = 0;
        int maxBudget = -1;
        for(int key:keyboards){
            for(int drive:drives){
                int currBudget = key+drive;
                if(currBudget<=b && currBudget>maxBudget){
                    maxBudget = currBudget;
                }
            }
        }
        result = maxBudget;
        return result;

    }
}
