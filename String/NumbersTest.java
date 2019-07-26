package com.redington.java.String;

import java.util.Scanner;

public class NumbersTest {

	public static void main(String[] args) {
		System.out.println("FINDING NUMBER OF VOWELS,CONSONANTS,DIGITS AND SPACE");
		System.out.println("====================================================");
		Numbers n = new Numbers();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		String sent = scan.nextLine();

		int v = n.findVowels(sent);
		System.out.println("No of Vowels in " + sent + " is " + v);

		int c = n.findConsonants(sent);
		System.out.println("No of Consonants in "+sent+" is "+c);

		System.out.println("No of Digits in " + sent + " is " + sent.length());
		int w = n.findWhiteSpace(sent);
		System.out.println("No of WhiteSpace " + sent + " is " + w);
	}

}
