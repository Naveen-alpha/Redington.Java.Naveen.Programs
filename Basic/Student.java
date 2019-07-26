package com.redington.java.Basic;

public class Student {
	String name;
	int m1,m2,m3,m4,m5;
	String address;
	

	public Student(String string, int i, int j, int k, int l, int m, String string2) {
		// TODO Auto-generated constructor stub
		System.out.println("Welcome to Student Zone");
		name=string;
		m1=i;
		m2=j;
		m3=k;
		m4=l;
		m5=m;
		address=string2;
	}


	public Student() {
		// TODO Auto-generated constructor stub
		System.out.println("Check where i am printed");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student student1=new Student("kumar",100,90,80,90,80,"DGL");
Student student2=new Student("raja",98,97,96,95,100,"MDU");
Student student3=new Student();
student1.display();
student2.display();
student3.display();

	}


	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Student Name:"+name);
		System.out.println("Student Mark1:"+m1);
		System.out.println("Student Mark2:"+m2);
		System.out.println("Student Mark3:"+m3);
		System.out.println("Student Mark4:"+m4);
		System.out.println("Student Mark5:"+m5);
		System.out.println("Student Address:"+address);
	}

}
