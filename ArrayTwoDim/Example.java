package com.redington.java.ArrayTwoDim;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 6 };
		int b[] = { 6, 5, 7 };
		int i = 0, j = 0;
		/*	int c[][] = new int[2][3];
		for (j = 0; j < 3; j++) {

			c[i][j] = a[j];

			System.out.print(" "+c[i][j]);
		}
i++;
		for (j = 0; j < 3; j++) {

			c[i][j] = b[j];

			System.out.print(" "+c[i][j]);
		}
		*/
		
		int c[][]={a,b};
		System.out.println(c[1][2]);
		

	}

}
