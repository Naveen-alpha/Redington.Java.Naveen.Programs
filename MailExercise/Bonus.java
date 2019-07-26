package com.redington.java.MailExercise;

import java.util.Scanner;

public class Bonus {
	int salary, yearOfService;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bonus obj = new Bonus();
		obj.find();
	}

	private void find() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter yearOfService :");
		yearOfService = scan.nextInt();
		System.out.println("Enter your salary :");
		salary = scan.nextInt();
		if(yearOfService>5){
			int bonus=(salary*5)/100;
			System.out.println("Your bonus " +bonus+ " and your Final salary is: " +(salary+bonus));
		}else{
			System.out.println("no bonus and your salary is" +salary);
		}

	}

}
