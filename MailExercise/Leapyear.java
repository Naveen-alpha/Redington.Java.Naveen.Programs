package com.redington.java.MailExercise;

import java.util.Scanner;

public class Leapyear {
	int year;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leapyear obj = new Leapyear();
		obj.find();
	}

	private void find() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the year :");
		year = scan.nextInt();

		if (year % 4 == 0) {
			System.out.println("The year is Leap Year");
		}else{
			System.out.println("The year is not a Leap year");
		}
	}

}
