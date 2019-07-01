package com.redington.java.oops;
interface x
{
	public int add();
}
interface y
{
	public int add();
	public int sub();
}
class Z implements x,y
{
	public int add()
	{
	return 1+3;	
	}
	public int sub()
	{
		return 5-2;
	}
}
public class Interface 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Z obj=new Z();
System.out.println(obj.add());
System.out.println(obj.sub());
	}

}
