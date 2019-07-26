package com.redington.java.String;

import java.util.Scanner;

public class OccuranceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OCCURANCE OF ALPHABET");
		System.out.println("=====================");
		Occurance o = new Occurance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence ");
		String sentence = sc.nextLine();
		o.findOccurance(sentence);
	}

}
