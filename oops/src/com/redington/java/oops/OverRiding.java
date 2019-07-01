package com.redington.java.oops;
class Cpp
{
	void m()
	{
		System.out.println("I am Learning C++");
	}
	void n()
	{
		System.out.println("C++");
	}
}
class Java extends Cpp{
	void m(){
		System.out.println("I am learning Java");
	}
}
public class OverRiding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Cpp cpp=new Cpp();
Java java=new Java();
//cpp.n(); cpp.m(); java.m();
Animal ani=new Animal();
ani.walk(); ani.sound();
Dog d=new Dog();
d.sound();
Cat c=new Cat();
c.sound();
	}

}
class Animal
{
	void walk(){
		System.out.println("walk/run");
	}
	void sound(){
		System.out.println("MakesNoise");
	}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Barks");
		}
}
class Cat extends Animal
{
	void sound()
	{
		System.out.println("Meow");
	}
}