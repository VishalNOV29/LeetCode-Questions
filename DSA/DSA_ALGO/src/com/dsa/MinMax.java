package com.dsa;

import java.util.Arrays;

public class MinMax {
	public static int[] minMax(int[] arr) {
		int[] res=new int[2];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for (int i=0;i<arr.length;i++) {
			if (arr[i]<min) {
				System.out.println("value is smaller than min");
				min=arr[i];
			}else if (arr[i]>max) {
				System.out.println("Value is larget than max");
				max=arr[i];
			}
			System.out.println(min+", "+max);
		}
		res[0]=min;
		res[1]=max;
		
		return res;
	}

	public static int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            if (nums[i]<min) {
				min=nums[i];
			}else if (nums[i]>max) {
				max=nums[i];
			}

        }
        System.out.println(min+" "+max);
        for (int i=min;i>1;i--){
            if (min%i==0 && max%i==0){
                return i;
            }

        }
        return 1;
    }
	public static void main(String[] args) {
		int[] arr= {10,6,9};
		int res=findGCD(arr);
		int[] res2=minMax(arr);
		System.out.println(Arrays.toString(res2));
//		System.out.println(res);
//		System.out.println("Code is running");
	}
}
