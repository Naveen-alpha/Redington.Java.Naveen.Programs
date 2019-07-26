package com.redington.java.String;

public class Occurance {
	public void findOccurance(String sent) {
		for (int i = 0; i <= sent.length() - 1; i++) {
			int count = 1;
			boolean b = true;
			/*if (i == (sent.length() - 1)) {
				// i--;
				count--;
			}*/

			for (int j = i + 1; j < sent.length(); j++) {
				if (b) {
					int k=0;
					for ( k = i - i; k >= 0; k--) {
						k++;
						if (sent.charAt(i) == sent.charAt(k)) {
							b = false;
							
						}
						
					}
					if (sent.charAt(i) == sent.charAt(j)) {
						count++;

					}
				}

			}
			if (count != 0) {
				System.out.println("The " + i + " Letter " + sent.charAt(i) + " Repeted " + count + " times");
			}
		}

	}
}
