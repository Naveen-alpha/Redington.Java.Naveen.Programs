package com.redington.java.MailExercise;
import java.util.Scanner;
public class BiggestNumber {
int number1;
int number2;
void getInput()
{
	Scanner scan=new Scanner(System.in);
System.out.println("Enter number1:");
number1=scan.nextInt();
System.out.println("Enter anotherone number:");
number2=scan.nextInt();
}
void findBiggestNumber()
{
	if(number1>number2)
	{
		System.out.println(number1+ "is Big");
	}else
	{
		System.out.println(number2+"is Big");
	}
}


}
