package com.redington.java.Basic;
import java.util.Scanner;
public class SimpleCalculator {
int number1,number2;
void getInput(){
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number :");
	number1=scan.nextInt();
	System.out.println("Enter another number :");
	number2=scan.nextInt();
	}
void add(){
	System.out.println("Addition is :"+(number1+number2));
}
void sub(){
	System.out.println("Subtraction is :"+(number1-number2));
}
void Mul(){
	System.out.println("Multiplication is :"+(number1*number2));
}
void Div(){
	System.out.println("Division is :"+(number1/number2));
}
void test() {
	// TODO Auto-generated method stub
boolean b=true;
System.out.println("Menu");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Multiplication");
System.out.println("4.Division");
while(b){

SimpleCalculator obj = new SimpleCalculator();
Scanner scan = new Scanner(System.in);
System.out.println("Enter your option :");
int num=scan.nextInt();

if(num==1){
	obj.getInput();
	obj.add();
	System.out.println("Do you want to continue (y/n)");
	char ch=scan.next().charAt(0);
	if (ch=='n')
	{
		System.out.println("Thank you");
		b=false;
		
	}

	
}
if(num==2){
	obj.getInput();
	obj.sub();
	System.out.println("Do you want to continue (y/n)");
	char ch=scan.next().charAt(0);
	if (ch=='n')
	{
		System.out.println("Thank you");
		b=false;
		
	}
}
if(num==3){
	obj.getInput();
	obj.Mul();
	System.out.println("Do you want to continue (y/n)");
	char ch=scan.next().charAt(0);
	if (ch=='n')
	{
		System.out.println("Thank you");
		b=false;
		
	}

}
if(num==4){
	obj.getInput();
	obj.Div();

	System.out.println("Do you want to continue (y/n)");
	char ch=scan.next().charAt(0);
	if (ch=='n')
	{
		System.out.println("Thank you");
		b=false;
		}
}
if(num==1 || num==2 ||num==3 || num==4 ) {
	
	}else
	{

	System.out.println("Wrong choice");
	}
	
/*System.out.println("Do you want to continue (y/n)");
char ch=scan.next().charAt(0);
if (ch=='n')
{
	b=false;
}*/
	
}

}
}
