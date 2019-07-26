package com.redington.java.loops;

import java.util.Scanner;

public class loop {
int i;
	public static void main(String args[]) {
		// TODO Auto-generated method stub
loop obj=new loop();
obj.one();
/*obj.two();
obj.three();
obj.four();
obj.five();
obj.six();
obj.seven();
obj.eight();
obj.nine();
obj.ten();*/
	}
	

	private void ten() {
		// TODO Auto-generated method stub
		
	}

	private void eight() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("    avoid two forloop2");
		for(i=1;i<=10;i=i+2)
		{
			System.out.print(" "+i);
			if(i==9)
			{
				i=0;
			}
		}
	}

	private void nine() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("    avoid two forloop1");
		for(i=1;i<=9;i++)
		{
			System.out.print(" "+i);
			if(i%3==0)
			{
				System.out.println();
			}
		}
	}

	private void seven() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("    Numbers divisible by 2 and 3");
		for(i=1;i<=10;i++)
		{
			if((i%2==0)||(i%3==0))
			{
				System.out.print(" "+i);
			}
		}
	}

	private void six() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("    Prime Numbers untill 20");
		for(int i=2;i<=20;i++)
		{
			if((i==2)||(i==3)||(i%2!=0)&&(i%3!=0))
			//for( int i1=2;i1<=5;i1++){
				//int j=i1%i1;
			//if(j!=0)
			{
				System.out.print(" "+i);
			}
		}
			
		
	}

	private void five() {
		// TODO Auto-generated method stub
		System.out.println("");
		System.out.println("    3 powers");
		for(i=3;i<=250;i*=3)
		{
			System.out.print(" " +i);
		}
	}

	private void four() {
		// TODO Auto-generated method stub
		System.out.println("");
		for(i=3;i<=15;i+=3)
		{
			System.out.print(" "+i);
		}
	}

	private void three() {
		// TODO Auto-generated method stub
		System.out.println("");
		for(i=1;i<=10;i+=2)
		{
			System.out.print(" "+i);
		}
	}

	private void two() {
		// TODO Auto-generated method stub
		System.out.println("");
		for(i=2;i<=10;i+=2)//i=i+2
		{
			System.out.print(" "+i);
		}
	}

	private void one() {
		// TODO Auto-generated method stub
		/*int a='c';
		System.out.println(a);
		while(i<=5)
		{
			System.out.print(" "+i);
			i++;
		}*/
		int ch = 0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a letter");
		ch=scan.nextInt();
		while(ch<='z')
		{
			System.out.print(" "+ch);
			ch++;
		}
	}

	
}
