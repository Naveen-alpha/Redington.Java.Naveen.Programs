package com.redington.java.String;

import java.util.Scanner;

public class DeleteConsonantsTest {

	public static void main(String[] args) {
		System.out.println("DELETE CONSONANTS FROM ASENTENCE");
		System.out.println("================================");
		DeleteConsonants dc = new DeleteConsonants();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		String sentence = scan.nextLine();
		String change=sentence.toLowerCase();
		dc.deleteConsonants(change);
	}

}
