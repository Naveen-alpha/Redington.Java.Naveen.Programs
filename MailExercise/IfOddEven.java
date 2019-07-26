package com.redington.java.MailExercise;
import java.util.Scanner;
public class IfOddEven {
int number1;
void getInput()
{
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter one number:");
	number1=scan.nextInt();
	}
void findOddEven()
{
	if(((number1)%2)==0){
		System.out.println("It is Even");
	}else{
		System.out.println("It is Odd");
	}
}
}
