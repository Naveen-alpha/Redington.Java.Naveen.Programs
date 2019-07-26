package com.redington.java.MailExercise;

import java.util.Scanner;

public class PlaceOfwork {
	int age;
	char sex;
	char maritalStatus;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PlaceOfwork obj = new PlaceOfwork();
		obj.workSchedule();
	}

	private void workSchedule() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter age");
		age = scan.nextInt();
		System.out.println("Enter sex");
		sex = scan.next().charAt(0);
		System.out.println("Enter marital status");
		maritalStatus = scan.next().charAt(0);
		if(sex=='f'){
			System.out.println("you have to work in urban areas only");
		}else if(sex=='m' && age>20 && age<40){
			System.out.println("you may work anywhere");
		}else if(sex=='m' && age>40 && age<60){
			System.out.println("you have to work in urban areas only");
			
		}else{
			System.out.println("ERROR");
		}
	}

}
