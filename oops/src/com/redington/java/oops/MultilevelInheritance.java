package com.redington.java.oops;
class Ak
{
	int a=1;
	void display()
	{
		System.out.println(a);
	}
}
class Bk extends Ak
{
	int b=2;
	void print(){
		System.out.println(b);
	}
	}
class Ck extends Bk
{
	int c=3;
	void method(){
		System.out.println(c);
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Ck c=new Ck();
c.display();
c.print();
c.method();
	}

}
