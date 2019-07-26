package com.redington.java.MailExercise;

import java.util.Scanner;

public class IncomeTax {
	int income, tax;
	Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IncomeTax obj = new IncomeTax();
		boolean b = true;
		Scanner scan = new Scanner(System.in);
		
		while (b) {
			
	  
		obj.findTax();
		
		System.out.println("Do you want to continue(y/n)");
		char ch = scan.next().charAt(0);
		if (ch == 'n') {
			b = false;
		}

	}
	}

	 
private void findTax() {
		// TODO Auto-generated method stub
		
		System.out.println("===========Enter your Income============");
		income = scan.nextInt();
		if (income <= 20000) {
			System.out.println("no tax");}

			else if ((20000 < income) && (income < 40001)) {
			income = income - 20000;
			tax = (income * 10) / 100;
			
		} else if ((income > 40000) && (income < 60001)) {
			income = income - 40000;
			tax = 2000 + (income * 20) / 100;

		} else if (income > 60001) {
			income = income - 60000;
			tax = 2000 + 4000 + (income * 30 / 100);
			
		}
		System.out.println("tax"+ tax);
		
	}
}
