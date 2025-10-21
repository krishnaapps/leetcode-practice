package com.hackerearth;

import java.util.List;

public class Problem25 {

    public static void main(String[] args){

    }

    public static String angryProfessor(int k, List<Integer> a) {
        // Write your code here
        int studentCount = 0;
        for(int i:a){
            if(i<=0){
                studentCount++;
            }
        }
        if(studentCount>=k){
            return "NO";
        }else {
            return "YES";
        }
    }
}
