package com.redington.java.loops;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=0;
		Scanner scan = new Scanner(System.in);
		int i = 0, num = 0;
		String primeNumbers = "";
		System.out.println("Enter the value of n: ");
		int n = scan.nextInt();
		for (i = 1; i <= n; i++) {
			int count = 0;
			for (num = i; num >= 1; num--) 
			{
				if (i % num == 0) {
					count = count + 1;
				}
			}
			if(count==2)
			{
				z++;
				primeNumbers=primeNumbers+i+" ";
			}
		}
		System.out.println("Prime Numbers Are :"+z+" There are :");
		System.out.println(primeNumbers);
	}

}
