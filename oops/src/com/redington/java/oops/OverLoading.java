package com.redington.java.oops;

public class OverLoading {
int add(int a,int b)
{
	int c=a+b;
	System.out.println("Sum of 2 variables-->"+c);
	return c;
}
int add(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println("sum of 3 Variables-->"+d);
	return d;
}
double avg()
{
	double a=add(14,26)/2;
	
	return a;
}
double add(double a,double b)
{
	double c=a+b;
	return c;
	
}

int m(int x){
	x=x+10;
	return x;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
OverLoading obj=new OverLoading();
System.out.println(obj.add(4, 8));
System.out.println(obj.add(4, 8,6));
System.out.println(obj.add(2.5,6.3));
int i = obj.add(5, 5);
System.out.println(obj.m(i));
	}

}

