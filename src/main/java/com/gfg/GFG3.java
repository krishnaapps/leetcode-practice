package com.gfg;

import java.util.Arrays;

public class GFG3 {

    public static void main(String[] args){
        int[] arr = {10, 3, 5, 6, 2};
        int[] result = GFG3.productArrayExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] productArrayExceptSelf(int[] arr){
        int[] result = new int[arr.length];
        int[] prefix = new int[arr.length];
        int[] suffix = new int[arr.length];
        //int[] arr = {10, 3, 5, 6, 2};
        prefix[0] = 1;
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1] * arr[i-1];
        }

        suffix[arr.length-1] = 1;
        for(int i=arr.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }

        for(int i=0;i< arr.length;i++){
            result[i] = prefix[i]*suffix[i];
        }
        return result;
    }
}
