package com.redington.java.assessment1;

import java.util.Scanner;

public class Factors {
	private int n;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factors f = new Factors();
		f.getInput();
		f.findFactors();
	}

	public void getInput() {
		// TODO Auto-generated method stub
		System.out.println("Enter a Number N :");
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
	}

	public void findFactors() {
		// TODO Auto-generated method stub
		System.out.println("The Factors of the given Number " + n + " as follows :");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i + " ");
			}
		}
	}

}
