package com.practice;

import java.util.*;

public class Problem5 {

    public static void main(String[] args) {
            String[] words = {"bella","label","roller"};
            System.out.println(commonChars(words));
    }

    public static List<String> commonChars(String[] words) {
        List<String> result = new java.util.ArrayList<>();
        int[] minFreq = new int[26];

        for(int i=0;i<words.length;i++){
            char[] wordsData = words[i].toCharArray();
            for(int j=0;j<wordsData.length;j++){
                minFreq[wordsData[j]-'a'] = i+1;
            }
        }
        for(int i=0;i<minFreq.length;i++){
            if(minFreq[i]== words.length) result.add(String.valueOf((char) ('a' + i)));
        }
        return result;
    }

    public int firstUniqChar(String s) {
        char[] data = s.toCharArray();
        Map<Character,int[]> freq = new LinkedHashMap<>();
        for(int i=0;i<data.length;i++){
            if(freq.containsKey(data[i])){
                freq.put(data[i],new int[]{freq.get(data[i])[0]+1,i});
            }else{
                freq.put(data[i],new int[]{1,i});
            }
        }
        Set<Map.Entry<Character, int[]>> entries = freq.entrySet();
        for(Map.Entry<Character, int[]> entry: entries){
            if(entry.getValue()[0]==1){
                return entry.getValue()[1];
            }
        }


        return -1;
    }
}
