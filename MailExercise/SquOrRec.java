package com.redington.java.MailExercise;

import java.util.Scanner;

public class SquOrRec {
int l,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub



 SquOrRec obj=new SquOrRec();
obj.find();


	}
	private void find() 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Length :");
		int  l=scan.nextInt();
		System.out.println("Enter Breath");
		 int b=scan.nextInt();
		 
		if(l==b)
		{
			System.out.println("The object is Square");
		}
		else
		{
			System.out.println("The object is not a square");
		}
	}

}
