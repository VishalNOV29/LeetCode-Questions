package com.chegg;

import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the lenght of the row: ");
		int r=sc.nextInt();
		
		System.out.print("Enter the amount of space used by post-assembly: ");
		int e=sc.nextInt();
		
		System.out.print("Enter the space between vines: ");
		int s=sc.nextInt();
		
		int v=r-2*e*s;
		System.out.println("Number of grapevine that will fit in the row: "+v);
	}

}
