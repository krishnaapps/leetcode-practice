package com.gfg;

import java.util.Stack;

public class GFG7 {

    public static void main(String[] args) {
        SpecialStack st = new SpecialStack();

        // Function calls
        st.push(2);
        st.push(3);
        System.out.print(st.peek() + " ");
        st.pop();
        System.out.print(st.getMin() + " ");
        st.push(1);
        System.out.print(st.getMin() + " ");
    }

    static class SpecialStack{

        Stack<int[]> data = new Stack<>();

        public void push(int pushData){
            int minEle = data.isEmpty()?pushData:Math.min(pushData,data.peek()[1]);
            data.push(new int[]{pushData,minEle});
        }

        public int pop(){
            return data.pop()[0];
        }

        public int getMin(){
            return data.isEmpty()?-1:data.peek()[1];
        }

        public  int peek(){
            return data.isEmpty()?-1:data.peek()[0];
        }
    }
}
