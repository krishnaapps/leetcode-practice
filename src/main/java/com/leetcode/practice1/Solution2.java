package com.leetcode.practice1;

public class Solution2 {

    public static void main(String[] args){
        Solution2 sol = new Solution2();
        //int[] arr = { 3,4,5,5,2,1 };
        //System.out.println("Second: "+sol.findSecondLargest(arr));

        //int[] arr = { 3,4,1 };
        //System.out.println("Second: "+sol.isSorted(arr));

//        int[] arr = {1,2,2,2,3,3,4};
//        int k = sol.removeDuplicates(arr);
//        for(int i=0;i<k;i++){
//            System.out.println(arr[i]);
//        }

          int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
          sol.moveZerosToEnd(arr);
          for(int i =0;i<arr.length;i++){
              System.out.println(arr[i]);
          }
    }

    public void moveZerosToEnd(int[] arr){
        int firstIndx  = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                firstIndx = i;
                break;
            }
        }

        if(firstIndx!=-1){
            //{1 ,0 ,2 ,3 ,0 ,4 ,0 ,1}
            for(int i=firstIndx+1;i<arr.length;i++){
                if(arr[i]!=0) {
                    int temp = arr[firstIndx];
                    arr[firstIndx] = arr[i];
                    arr[i] = temp;
                    firstIndx++;
                }
            }
        }

    }

    public int removeDuplicates(int[] arr){
        int start = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                arr[start++] = arr[i];
            }
        }
        return start;
    }

    public boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public int findSecondLargest(int[] arr){
        int secondLarge = Integer.MIN_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                secondLarge = large;

                large = arr[i];

            } else if (arr[i]<large && arr[i]>secondLarge) {
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }



}
