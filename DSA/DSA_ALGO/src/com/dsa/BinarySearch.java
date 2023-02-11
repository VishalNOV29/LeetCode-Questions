package com.dsa;

public class BinarySearch {
	public static int binarySearch(int[] arr,int left, int right,int target) {
		while (left<=right) {
			int mid=(left+right)/2;
			if (arr[mid]==target) {
				return mid;
			}else if (arr[mid]>target) {
				right=mid-1;
			}else {
				left=mid+1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8};
		int target=5;
		int left=0;
		int right=arr.length-1;
		int result=binarySearch(arr,left,right,target);
		System.out.println("Index = "+result);
		
//		System.out.println("Code is running");
	}
}
