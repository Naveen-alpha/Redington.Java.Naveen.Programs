package com.redington.java.MailExercise;

import java.util.Scanner;

public class Smallest {
int num1;
int num2;
int num3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Smallest obj=new Smallest();
obj.buyInput();
obj.findSmallest();
	}
	private void findSmallest() {
		// TODO Auto-generated method stub
		if(num1<num2 && num1<num3){
			System.out.println("Number 1 "+num1+" is Smallest");
		}else if (num2<num3){
			System.out.println("Number2 "+num2+" is Smallest");
		}else{
			System.out.println("Number3 "+num3+" is Smallest");
		}
	}
	private void buyInput() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		 num1=scan.nextInt();
		System.out.println("Enter second number");
		 num2=scan.nextInt();
		System.out.println("Enter third number");
		 num3=scan.nextInt();
	}

}
