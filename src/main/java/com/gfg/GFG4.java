package com.gfg;

public class GFG4 {

    public static void main(String[] args){
        String s = "geeksforgeeks";
        System.out.println(GFG4.longestSubStr(s));
    }

    public static int longestSubStr(String data){
        int result = 0;
        char[] charData = data.toCharArray();
        boolean[] visible = new boolean[26];
        int left = 0;
        int right = 0;
        while(right<charData.length){
            if(visible[charData[right]-'a'] == true){
                left = right;
                visible = new boolean[26];

            }
            visible[charData[right]-'a'] = true;
            result = Math.max(result,right-left+1);
            right++;
        }
        return result;

    }
}
