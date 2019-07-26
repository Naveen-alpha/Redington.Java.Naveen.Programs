package com.redington.java.MailExercise;

import java.util.Scanner;

public class EB_Bill {
	int unit;
	double bill;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EB_Bill obj = new EB_Bill();
		obj.getInput();
		obj.calculateBill();
	}

	private void getInput() {
		// TODO Auto-generated method stub
		System.out.println("****Welcome to TNEB online Payment*****");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your current unit");
		unit = scan.nextInt();
	}

	private void calculateBill() {
		// TODO Auto-generated method stub
		if (unit <= 100) {
			bill = unit * 5;
		}else if(unit<=200){
			bill=((unit-100)*7+500);
		}else if(unit<=300){
			bill=((unit-200)*10+1200);
		}else if(unit>300){
			bill=((unit-300)*15+2200);
		}
		System.out.println("EB amount is :"+bill);
	}

}
