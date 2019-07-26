package com.redington.java.MailExercise;

import java.util.Scanner;

public class StringAdd {
	 String str1;
	 String str2;
	String result;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringAdd obj=new StringAdd();
Scanner scan=new Scanner(System.in);
System.out.println("Enter a name");
String str1=scan.next();
System.out.println("Enter another name");
String str2=scan.next();
String result=obj.join(str1,str2);
System.out.println("The joining of "+str1+" and "+str2+" is " +result);
	}

	

	private String join(String str1,String str2) {
		// TODO Auto-generated method stub
		String x=str1+str2;
		return x;
		

	}
	


}
