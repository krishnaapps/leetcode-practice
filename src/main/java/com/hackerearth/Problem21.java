package com.hackerearth;
//https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
public class Problem21 {
    public static void main(String[] args){
        System.out.println(Problem21.catAndMouse(2,5,4));
        System.out.println(Problem21.catAndMouse(1,2,3));
        System.out.println(Problem21.catAndMouse(1,3,2));
    }

    public static String catAndMouse(int x, int y, int z) {
        String result = new String();
        int xDist = Math.abs(x - z);
        int yDist = Math.abs(y-z);
        if(xDist <yDist){
            result = "Cat A";
        }else if(yDist < xDist){
            result = "Cat B";
        }else if(xDist == yDist){
            result = "Mouse C";
        }
        return result;

    }
}
