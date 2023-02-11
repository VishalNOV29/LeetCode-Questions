package com.ques;
import java.util.ArrayDeque;
import java.util.Deque;
public class Solution1352 {
     Deque<Integer> dq;
     
    public Solution1352() {
        dq=new ArrayDeque<Integer>();
        
    }
    
    public void add(int num) {
        dq.add(num);   
    }

    public int getProduct(int k) {
        int i =0;
        int res=1;
        int[] temp=new int[k];
        while (i<k){
            int num=dq.pollLast();
            res=res*num;
            temp[i]=num;
            i++;
        }
        while (i>=0){
            dq.add(temp[i-1]);
            i-=1;
        }
        return res;

    }

    public static void main(String[] args) {
    	System.out.println("Code is running");
    	Solution1352 obj=new Solution1352();
    	obj.add(2);
    	obj.add(0);
    	obj.add(2);
    	obj.add(5);
    	obj.add(4);
    	System.out.println(obj.dq);
    	int res1=obj.getProduct(2);
    	System.out.println(res1);
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */