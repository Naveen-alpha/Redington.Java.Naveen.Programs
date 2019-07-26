package com.redington.java.loops;

import java.util.Scanner;

public class PrimeOrNot {
	int i = 2;
	int n;
	boolean ifentry = false;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeOrNot obj = new PrimeOrNot();
		obj.findprime();
	}

	private void findprime() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		n = scan.nextInt();
		
		while (i < n) {
			if (n% i == 0) {
				System.out.println("Not a prime number");
				ifentry = true;
				break;
			}
			i++;
		}
		if (ifentry == false) {
			System.out.println("-----Prime-----");
		}
		
	}
	

}
