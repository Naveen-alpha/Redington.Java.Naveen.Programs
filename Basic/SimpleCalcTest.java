package com.redington.java.Basic;
import java.util.Scanner;
public class SimpleCalcTest {

	public static void main(String[] args) {
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
		
}
	if(num==1 || num==2 ||num==3 || num==4 ) {
		obj.getInput();
		obj.Div();

		System.out.println("Do you want to continue (y/n)");
		char ch=scan.next().charAt(0);
		if (ch=='n')
		{
			System.out.println("Thank you");
			b=false;
			}
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


