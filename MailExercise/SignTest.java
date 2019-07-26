package com.redington.java.MailExercise;

import java.util.Scanner;

public class SignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SignTest obj = new SignTest();
		obj.findSign();
	}

	private void findSign() {
		// TODO Auto-generated method stub
		double number;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		number=scan.nextDouble();
		if(number>0){
			System.out.println("The number "+number+" is a Positive Number");
		}else if(number<0){
			System.out.println("The number "+number+" is a Negative Number");
		}
		

	}

}
