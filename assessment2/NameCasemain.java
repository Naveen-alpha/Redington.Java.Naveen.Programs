package com.redington.java.assessment2;

import java.util.Scanner;

public class NameCasemain {

	public static void main(String[] args) {
		System.out.println("\t UPPER CASE& LOWER CASE\t");
		System.out.println("====================================");
		Scanner scan = new Scanner(System.in);
		NameCase nc = new NameCase();
		String[] names = new String[5];
		for (int i = 0; i < names.length; i++) {
			System.out.println("Enter " + (i + 1) + " Name\t:");
			names[i] = scan.nextLine();
		}
		
		 nc.doUpperCase(names);
		
		
		nc.doLowerCase(names);
		

	}

}
