package com.hackerearth;
//https://www.hackerrank.com/challenges/counting-valleys/problem
public class Problem22 {

    public static void main(String[] args){
        System.out.println(Problem22.countingValleys(8,"UDDDUDUU"));
        System.out.println(Problem22.countingValleys(8,"DDUUUUDD"));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int currLevel = 0;
        int result = 0;
        int n= path.length();

        for(int i=0;i<n;i++){
            if(path.charAt(i)=='U'){
                currLevel++;
            }else if(path.charAt(i)=='D'){
                if(currLevel==0){
                    result++;
                }
                currLevel--;
            }
        }
        return result;
    }
}
