package com.ques;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
public class Solution239 {
	
	 public int[] maxSlidingWindow(int[] nums, int k) {
		 PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>( Collections.reverseOrder());
		 int i=0;
		 int j=0;
		 int[] res=new int[nums.length-k+1];
		 int ptr=0;
		 while (j<k) {
			 maxHeap.add(nums[j]);
			 j++;
		 }
		 res[ptr]=maxHeap.peek();
		 ptr++;
		 
		 while (j<nums.length) {
			 maxHeap.add(nums[j]);
			 maxHeap.remove(nums[i]);
			 res[ptr]=maxHeap.peek();
			 ptr++;
			 i++;
			 j++;
		 }
		 return res;      
	 }
	public static void main(String[] args) {
		
		System.out.println("Code is running");
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		maxSlidingWindow(nums,k);
		
	}
}
