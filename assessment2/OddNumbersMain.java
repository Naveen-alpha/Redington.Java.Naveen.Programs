package com.redington.java.assessment2;

import java.util.Scanner;

public class OddNumbersMain {

	public static void main(String[] args) {
		System.out.println("'\t FINDING ODD NUMBERS\t");
		System.out.println("===============================");
		OddNumbersLogic od = new OddNumbersLogic();
		Scanner scan = new Scanner(System.in);
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter " + (i + 1) + " Number\t:");
			numbers[i] = scan.nextInt();
		}
		od.findOddNumbers(numbers);

	}

}
