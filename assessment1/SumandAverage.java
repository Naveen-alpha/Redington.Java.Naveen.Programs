package com.redington.java.assessment1;

import java.util.Scanner;

public class SumandAverage {
	private int n, count = 0, sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumandAverage s = new SumandAverage();
		s.findSum();
		s.average();
	}

	public void findSum() {
		// TODO Auto-generated method stub
		boolean b = true;
		Scanner scan = new Scanner(System.in);
		while (b) {
			System.out.println("Enter a Number :");
			n = scan.nextInt();
			sum = sum + n;
			System.out.println("If you want to continue means press any,No means press -->'q' ");
			char ch = scan.next().charAt(0);
			if (ch == 'q') {
				b = false;
			}
			count++;
		}
		System.out.println("Sum of all Entered Numbers : " + sum);
	}

	public void average() {
		// TODO Auto-generated method stub
		double average = sum / count;
		System.out.println("Average is : " + average);
	}

}
