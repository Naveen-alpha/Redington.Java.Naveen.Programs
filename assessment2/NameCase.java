package com.redington.java.assessment2;

public class NameCase {

	public void doUpperCase(String[] names) {
		int n = names.length;

		System.out.println("Upper Cased Names if name starts with 'u'");

		for (int i = 0; i < n; i++) {
			if (names[i].charAt(0) == 'u') {

				System.out.println(names[i].toUpperCase());
			}
		}

	}

	public void doLowerCase(String[] names) {
		int n = names.length;
		System.out.println("Lower Cased Names if name ends with 'l'");

		for (int i = 0; i < n; i++) {
			if (names[i].charAt(names[i].length() - 1) == 'l') {
				System.out.println(names[i].toLowerCase());
			}
		}

	}

}
