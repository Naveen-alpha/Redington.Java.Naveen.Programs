package com.redington.java.MailExercise;

import java.util.Scanner;

public class GrossSalary {
	int salary;
	float allowance;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrossSalary obj = new GrossSalary();
		boolean b=true;
		while(b)
		{
		obj.getInput();
		obj.calculateGrossSalary();
		System.out.println("........Do you want continue then Press(y/n)........");
		Scanner scan = new Scanner(System.in);
		char ch=scan.next().charAt(0);
		if(ch=='n')
		{
			b=false;
			System.out.println("======Program Terminated======");
			System.out.println("===========Thank you==========");
		}
	}
	}

	private void getInput() {
		// TODO Auto-generated method stub
		System.out.println("===========Welcome===========");
		System.out.println("Enter Your Basic Salary---->");
		Scanner scan = new Scanner(System.in);
		salary = scan.nextInt();
	}

	private void calculateGrossSalary() {
		// TODO Auto-generated method stub
		if (salary <= 10000) {
			allowance = (float) ((0.2 * salary) + (0.8 * salary));
			System.out.println("The Net Salary is :"+(salary+allowance));
		} else if (salary <= 20000) {
			allowance = (float) ((0.25 * salary) + (0.9 * salary));
			System.out.println("The Net Salary is :"+(salary+allowance));
		} else if (salary > 20000) {
			allowance = (float) ((0.3 * salary) + (0.95 * salary));
			System.out.println("The Net Salary is :"+(salary+allowance));
		}
	}

	
}
