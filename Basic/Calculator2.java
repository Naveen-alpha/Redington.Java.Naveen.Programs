package com.redington.java.Basic;

public class Calculator2 {
public Calculator2(){
	System.out.println("I am  the default constructor - you can see me");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator2 calc =new Calculator2();
		//int result=calc.add();
		//System.out.println("Total value in main method is"+ result);
		//calc.calculatepercentage(calc.add());
		/*int no1=10;
		int no2=20;
		int total=no1+no2;*/
		//System.out.println("Total is "+ (5+4));//+ concatenation
		System.out.println("Percentage is" + calc.calculatepercentage(calc.add()));
/*
 * Arithmatic operators
 * + - * / %
 
 */
	}

	private int  calculatepercentage(int r) //method signature (arguments)
	{
		// TODO Auto-generated method stub
		int percentage=r/2;
		//System.out.println("Percentage is:"+percentage);
		return percentage;
	}

	private int add() {
		// TODO Auto-generated method stub
		int no1=10;
		int no2=20;
		int total=no1+no2;
		System.out.println("Total is "+ total);
		return total;
		
	}

}
