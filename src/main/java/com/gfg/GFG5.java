package com.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG5 {

    public static void main(String[] args){
        int[][] arr = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
        System.out.println(GFG5.mergeIntervals(arr));
    }

    public static List<int[]> mergeIntervals(int[][] arr){

        Arrays.sort(arr,(a, b)->Integer.compare(a[0],b[0]));
        //{1,5},{2,4},{4,6},{7,8}
        List<int[]> result = new ArrayList<>();
        result.add(arr[0]);
        for(int i=1;i< arr.length;i++){
            int[] curr = arr[i];
            int[] last = result.get(result.size() - 1);//res.get(res.size() - 1);
            if(curr[0]<=last[1]){
                last[1] = Math.max(curr[1],last[1]);
            }else{
                result.add(curr);
            }
        }
        return result;
    }
}
