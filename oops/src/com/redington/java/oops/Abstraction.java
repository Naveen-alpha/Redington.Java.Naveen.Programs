package com.redington.java.oops;
abstract class Abs
{
	int n(){
		return 2;
	}
	abstract int m();
}
 abstract class ChildAbs extends Abs{
 
	int m() {
		return 0;
	}
	abstract int s();
	
}
 class BBB extends ChildAbs
 {
	 int s(){
		 return 8;
	 }
 }
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BBB obj=new BBB();
System.out.println( obj.m());
System.out.println( obj.n()) ;
System.out.println( obj.s());
	}
}
