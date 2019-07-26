package com.redington.java.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 0;
		int s = 1;
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the Limit");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			f = f + s;
			s = f - s;

			System.out.print(s+" ");
			}
			System.out.println();
		}
	}

}