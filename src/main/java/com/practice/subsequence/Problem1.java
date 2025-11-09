package com.practice.subsequence;

import java.util.ArrayList;
import java.util.List;
//Print All Subsequences,Sum of subsequences
//TC :O(N*2^N), SC :O(N)
public class Problem1 {
    public static void main(String[] args) {
        for(String data : Problem1.generateAllSubSeq("abc")){
            System.out.print(data+" ");
        }
        /*int count = 0;
        for(int i: Problem1.sumofAllSubSeq(new int[]{1,2,3})){
            System.out.print(i+" ");
            if(i==3) {
                count++;
            }
        }
        System.out.println("\nCount : "+count);*/
    }

    public static List<Integer> sumofAllSubSeq(int[] arr){
        List<Integer> result = new ArrayList<>();
        List<Integer> subSeq = new ArrayList<>();
        helperSum(0,arr,subSeq,result);
        return result;
    }

    private static void helperSum(int index, int[] arr, List<Integer> subSeq, List<Integer> result) {
        //Base Case
        if(index ==arr.length){
            int sum = 0;
            for(int i:subSeq){
                sum+=i;
            }
            result.add(sum);
            return;
        }

        subSeq.add(arr[index]);
        helperSum(index+1,arr,subSeq,result);
        subSeq.removeLast();
        helperSum(index+1,arr,subSeq,result);
    }

    public static List<String> generateAllSubSeq(String data){
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generateHelper(data,0,sb,result);
        return result;
    }

    private static void generateHelper(String data, int index, StringBuilder sb, List<String> result) {
        //Base Case
        if(index == data.length()){
            result.add(sb.toString());
            //System.out.println(sb.toString());
            //sb = new StringBuilder();
            return;
        }
        sb = sb.append(data.charAt(index));
        generateHelper(data,index+1,sb,result);
        sb = sb.deleteCharAt(sb.length()-1);
        generateHelper(data,index+1,sb,result);
    }
}
