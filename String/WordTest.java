package com.redington.java.String;

import java.util.Scanner;

public class WordTest {

	public static void main(String[] args) {
		System.out.println("FIND WORDS FROM A SENTENCE");
		System.out.println("=========================");
		Word w = new Word();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Sentence :");
		String sentence = scan.nextLine();
		//System.out.println(sentence.length());
		String change=sentence.toLowerCase();
		System.out.println("Enter a Word to Find :");
		String find = scan.nextLine();
		
		try {
			w.findWord(sentence, find);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
