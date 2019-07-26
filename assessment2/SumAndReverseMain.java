package com.redington.java.assessment2;

import java.util.Scanner;

public class SumAndReverseMain {

	public static void main(String[] args) {
		System.out.println("\t SUM AND REVERSE THE DIGITS OF AN ARRAY ELEMENTS");
		System.out.println("=============================================================");
		Scanner scan = new Scanner(System.in);
		SumAndReverse sr = new SumAndReverse();
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Enter " + (i + 1) + " Number\t:");
			numbers[i] = scan.nextInt();
		}
		int[] copynum = new  int[5];
		for(int i=0;i<copynum.length;i++)
		{
			copynum[i]=numbers[i];
		}
		sr.doSumOfDigit(numbers);
		sr.doreverseNumbers(copynum);
	}

}
