package com.redington.java.assessment2;

public class SumAndReverse {
	int[] sumAr = new int[5];
	int[] revAr = new int[5];

	public void doSumOfDigit(int[] numbers) {
		System.out.println();
		System.out.println("\tSUM OF DIGITS\t");
		System.out.println();
		int n = numbers.length;
		int[] copy = new int[5];
		for (int i = 0; i < copy.length; i++) {
			copy[i] = numbers[i];
		}
		for (int i = 0; i < n; i++) {
			int sum = 0;
			while (numbers[i] > 0 || sumAr[i] > 9) {
				if (numbers[i] == 0) {
					numbers[i] = sumAr[i];
					sumAr[i] = 0;
				}
				sumAr[i] = sumAr[i] + numbers[i] % 10;
				numbers[i] = numbers[i] / 10;
			}
			System.out.println("Sum Of " + copy[i] + " untill single Digit is " + sumAr[i]);
		}
	}

	public void doreverseNumbers(int[] copynum) {
		System.out.println();
		System.out.println("\tREVERSE OF NUMBERS\t");
		System.out.println();
		int n = copynum.length;
		/*int[] cop = new int[5];
		for (int i = 0; i < cop.length; i++) {
			cop[i] = copynum[i];
		}*/

		for (int i = 0; i < n; i++) {
			System.out.print(copynum[i]+" -->");

			while (copynum[i] > 0) {
				

					revAr[i] = copynum[i] % 10;
					System.out.print(revAr[i]);
					copynum[i] = copynum[i] / 10;

				}
			System.out.println();

			}
		
		}
	}


