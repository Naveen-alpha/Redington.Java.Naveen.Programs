package com.redington.java.assessment1;

import java.util.Scanner;

public class Digit {
	private int number, value;
	private int rem, sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		Digit d = new Digit();
		d.getInput();
		int sum=d.findSumOfDigits();
		System.out.println(sum);
		//d.findDivisibleOrNot();
	}

	public void getInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input :N= ");
		number = scan.nextInt();
		value = number;
	}

	public int findSumOfDigits() {
		// TODO Auto-generated method stub
		if (number > 0 || sum > 9) {
			if (number == 0) {
				number = sum;
				sum = 0;
			}
			rem = number % 10;
			sum = sum + rem;
			number = number / 10;
			findSumOfDigits();//regressive calling
		}
		return sum;
		
	}

	public void findDivisibleOrNot() {
		// TODO Auto-generated method stub
		if (value % sum == 0) {
			System.out.println("Output: YES");
		} else {
			System.out.println("Output: NO");
		}
	}

}
