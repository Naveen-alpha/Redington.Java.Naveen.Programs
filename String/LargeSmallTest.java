package com.redington.java.String;

import java.util.Scanner;

public class LargeSmallTest {

	public static void main(String[] args) {
		// TODO Auto-generate
		System.out.println("FIND LARGEST AND SMALLEST WORDS IN A SENTENCE");
		System.out.println("=============================================");
		LargeSmall n = new LargeSmall();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a Sentence :");
		String sentence = scan.nextLine();
		String change=sentence.toLowerCase();
		String word[] = change.split(" ");
		int z=word.length;
		String copy[]=new String[z];
		for(int i=0;i<z;i++)
		{
			copy[i]=word[i];
		}
		/*for (int i = 0; i < word.length; i++) {
			System.out.println(word[i]);
		}*/
		System.out.println("LARGEST WORD");
		String[] s=n.findLargest(word);
		System.out.println(s[0]);
		System.out.println(s[1]);

		System.out.println("SMALLEST WORD");
		String[] l=n.findSmallest(copy);
		System.out.println(l[0]);
	}

}
