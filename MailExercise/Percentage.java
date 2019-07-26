package com.redington.java.MailExercise;

import java.util.Scanner;

public class Percentage {
	int mark1, mark2, mark3, mark4, mark5;
	double percentage;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Percentage obj = new Percentage();
		boolean b=true;
		while(b)
			{
		obj.getInput();
		obj.calculatePercentage();
		obj.findGrade();
		System.out.println("Do you want to continue(y/n)");
		Scanner scan=new Scanner(System.in);
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
		System.out.println("Calculate Percentage and Find Grade ");
		System.out.println("====================================");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Mark1 :");
		mark1=scan.nextInt();
		System.out.println("Enter Mark2 :");
		mark2=scan.nextInt();
		System.out.println("Enter Mark3 :");
		mark3=scan.nextInt();
		System.out.println("Enter Mark4 :");
		mark4=scan.nextInt();
		System.out.println("Enter Mark5 :");
		mark5=scan.nextInt();

	}
	private void calculatePercentage() {
		// TODO Auto-generated method stub
		percentage=(mark1+mark2+mark3+mark4+mark5)/5;
		System.out.println("Percentage is :"+percentage);
	}

	private void findGrade() {
		// TODO Auto-generated method stub
		if((percentage>=90)&&(percentage<=100))
		{
			System.out.println("===Grade A===");
		}else if(percentage>=80)
		{
			System.out.println("===Grade B===");
		}else if(percentage>=70)
		{
			System.out.println("===Grade C===");
		}else if(percentage>=60)
		{
			System.out.println("===Grade D===");
		}else if(percentage>=40)
		{
			System.out.println("===Grade E===");
		}else if(percentage<40)
		{
			System.out.println("===Grade F===");
		}else
		{
			System.out.println("====ERROR====");
		}

	}

}
