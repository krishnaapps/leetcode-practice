package com.hackerearth;
//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
public class Problem12 {
    public static void main(String[] args){
        int[] scores = {12,24,10,24};
        int[] result = Problem12.breakingRecords(scores);
        System.out.println(result[0]+" "+result[1]);
        int[] scores1 = {10,5, 20, 20, 4, 5, 2, 25, 1};
        int[] result1 = Problem12.breakingRecords(scores1);
        System.out.println(result1[0]+" "+result1[1]);
        int[] scores2 = {3 ,4, 21 ,36 ,10 ,28 ,35 ,5 ,24 ,42};
        int[] result2 = Problem12.breakingRecords(scores2);
        System.out.println(result2[0]+" "+result2[1]);
    }

    public static int[] breakingRecords(int[] scores){
        int[] result = new int[2];
        System.out.println();
        int highBreak = 0;
        int lowBreak = 0;
        int low = scores[0];
        int high = scores[0];
        int n = scores.length-1;
        for(int i=1;i<=n;i++){
            if(scores[i]<low){
                low= scores[i];
                lowBreak++;
            }else if(scores[i]>high){
                high = scores[i];
                highBreak++;
            }
        }
        result[0] = highBreak;
        result[1] = lowBreak;
        return result;
    }
}
