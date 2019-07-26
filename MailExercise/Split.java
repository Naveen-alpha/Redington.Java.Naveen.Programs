package com.redington.java.MailExercise;

import java.util.Scanner;

public class Split {
	int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Split obj = new Split();
		obj.digit();
	}

	private void digit() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		n = scan.nextInt();
		while(n>0)
		{
			int rem=n%10;
			System.out.println(rem);
			n=n/10;
		}
	}

}
