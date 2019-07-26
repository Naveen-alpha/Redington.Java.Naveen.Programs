package com.redington.java.loops;

import java.util.Scanner;

public class Reverse {
int n;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reverse r=new Reverse();
		r.getInput();
		r.makeReverse();
	}
	private void makeReverse() {
		// TODO Auto-generated method stub
		int rev=0;
			int reverse = 0;
		for(int i=0;i<n;rev=n/10)
		{
			 rev=n%10;
			 reverse=rev*10+rev;
			
		}
		System.out.println(reverse);
	}
	private void getInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n=scan.nextInt();

	}

}
