/**
 * 
 */
package com.redington.java.Basic;

import java.util.Scanner;

/**
 * @author Redington
 *
 */
public class Calculation {


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

int a,b,c,d,e,f;

		Scanner in = new Scanner(System.in);
System.out.println("Entr two number");
 a= in.nextInt();
 b=in.nextInt();
c=a+b;
d=a-b;
e=a*b;
f=a/b;
System.out.println("sum is:"+c);
System.out.println("sub is:"+d);
System.out.println("mul is:"+e);
System.out.println("div is:"+f);



	}

}
