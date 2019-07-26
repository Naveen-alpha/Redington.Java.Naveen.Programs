package com.redington.java.MailExercise;
import java.util.Scanner;
public class Forloop {
	int i;
	int j;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Forloop f=new Forloop();

		f.getInput();
	}
	void getInput(){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter one number:");
		j=scan.nextInt();
		
	
		System.out.println("Multiplication");
		for(i=1;i<=10;i++)
	{
			//System.out.println("Multiplication");
			System.out.println(i+"*" +j+ "=" + i*j);
	
	}
		System.out.println("Addition");
	for(i=1;i<=10;i++)
	{
		
		System.out.println(i+"+" +j+ "=" + (i+j));
	}
	
	}
}
