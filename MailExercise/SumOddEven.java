package com.redington.java.MailExercise;

import java.util.Scanner;

public class SumOddEven {
	 int n, sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumOddEven obj = new SumOddEven();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Limit :");
		 int n=scan.nextInt();
		
		obj.addEven(n);
		obj.addOdd(n);
	}

	private void addOdd(int n) {
		// TODO Auto-generated method stub
		
		sum=0;
		for(int i=1;i<=n;i=i+2){
			sum=sum+i;
			//System.out.println("The Sum of Odd Numbers in your given limit = "+sum);
		}
		System.out.println("The Sum of Odd Numbers in your given limit = "+sum);
	}

	private void addEven(int n) {
		// TODO Auto-generated method stub
		sum=0;
		for(int i=0;i<=n;i=i+2){
			sum=sum+i;
			//System.out.println("The Sum of Even Numbers in your given limit = "+sum);
		}
		System.out.println("The Sum of Even Numbers in your given limit = "+sum);
	}

}
