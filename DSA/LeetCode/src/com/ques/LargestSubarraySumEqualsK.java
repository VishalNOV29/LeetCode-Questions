package com.ques;

import java.util.ArrayDeque;
import java.util.Deque;

public class LargestSubarraySumEqualsK {
	
	public static int largestSubarray(int[] arr,int k) {
		System.out.println("This method is called");
		
		int n=arr.length;
		int i=0;
		int j=0;
		
		Deque<Integer> dq=new ArrayDeque<Integer>();
		int sum=0;
		int maxLength=0;
		int count=0;
		
		while (j<n) {
			System.out.println("##########################################");
			sum+=arr[j];
			dq.addLast(arr[j]);
			System.out.println(dq);
			if (sum==k) {
				System.out.println("Equal...");
				count++;
				maxLength=Math.max(maxLength, j-i+1);
			}if (sum>k) {
				System.out.println("Greater...");
				while (sum>k) {
					sum-=dq.pollFirst();
					i+=1;
				}
				System.out.println(dq);
				if (sum==k) {
					System.out.println("Equal...");
					count++;
					maxLength=Math.max(maxLength, j-i+1);
				}
			}
			j+=1;
		}
		System.out.println("count = "+count);
		return maxLength;
	}
	public static void main(String[] args) {
		System.out.println("COde is running");
//		int[] arr= {4,1,1,1,2,3,5};
		int[] arr= {4,1,4,1,2,3,5};
		int k=5;
		int res=largestSubarray(arr,k);
		System.out.println(res);
	}

}
