package com.leetcode.practice1;

public class Solution1 {

    public static void main(String[] args){
        System.out.println("TEST");
        Solution1 solution1 = new Solution1();
        int n=4;
        //solution1.function(1,n);
        //solution1.backTrackFunction(n,n);
        int start = 0;
        char[] data = {'l','e','e','t','c','o','d','e'};
        int end = data.length;
        solution1.reverse(start,end-1,data);
        System.out.println(data);
    }

    public void reverse(int start,int end,char[] data){
        if(start>end) return;
        char temp = data[start];
        data[start] = data[end];
        data[end] = temp;
        start++;end--;
        reverse(start,end,data);

    }

    public void function(int i,int n){
        if(i>n) return;
        System.out.println(i);
        function(i+1,n);
    }

    public void backTrackFunction(int i,int n){
        if(i<1) return;
        backTrackFunction(i-1,n);
        System.out.println(i);
    }


}
