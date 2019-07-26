package com.redington.java.loops;

public class Swap {
int a=100,b=200,c=300;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Swap obj=new Swap();
//obj.makeswap2();
obj.makeswap3();
	}
	private void makeswap3() {
		// TODO Auto-generated method stub
		a=a+b+c;
		b=a-(b+c);
		c=a-(b+c);
		a=a-(b+c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}
	private void makeswap2() {
		// TODO Auto-generated method stub
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
