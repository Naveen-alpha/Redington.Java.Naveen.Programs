package com.redington.java.MailExercise;

import java.util.Scanner;

public class Biggest {
	int number1;
	int number2;
	int number3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Biggest obj = new Biggest();
obj.getInput();
obj.findBiggest();

	}

	private void findBiggest() {
		// TODO Auto-generated method stub
		if(number1>number2 && number1>number3){
			System.out.println("Number 1 "+number1+" is Bigger");
		}else if (number2>number3){
			System.out.println("Number2 "+number2+" is Bigger");
		}else{
			System.out.println("Number3 "+number3+" is Bigger");
		}
	}

	private void getInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		 number1=scan.nextInt();
		System.out.println("Enter second number");
		 number2=scan.nextInt();
		System.out.println("Enter third number");
		 number3=scan.nextInt();
		
	}

}
