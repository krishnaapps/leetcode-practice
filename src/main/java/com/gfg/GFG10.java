package com.gfg;

public class GFG10 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 4;
        //int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        //        int key = 3;
        System.out.println(GFG10.binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target) return mid+1;
            else if(arr[mid]<target) low = mid+1;
            else if(arr[mid]>target) high = mid-1;
        }
        return -1;
    }
}
