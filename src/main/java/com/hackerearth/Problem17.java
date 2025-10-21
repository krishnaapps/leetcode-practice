package com.hackerearth;

import java.util.Arrays;
import java.util.List;

//https://www.hackerrank.com/challenges/bon-appetit/problem
public class Problem17 {
    public static void main(String[] args){
        Problem17.bonAppetit(Arrays.asList(new Integer[]{3,10,2,9}),1,12);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int billTotal = 0;
        for(int i=0;i<bill.size();i++){
            if(i!=k){
                billTotal+=bill.get(i);
            }
        }
        billTotal = billTotal/2;
        if(billTotal==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-billTotal);
        }
    }
}
