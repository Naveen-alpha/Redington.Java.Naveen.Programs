package com.redington.java.Basic;

public class SimpleInterest {
int principle,no_of_year;
float rate;


	SimpleInterest(int i, int j, float k) {
	// TODO Auto-generated constructor stub
		principle=i;
		no_of_year=j;
		rate=k;
		System.out.println("SimpleInterest");
	}

	public SimpleInterest(int i) {
		// TODO Auto-generated constructor stub
		principle=i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SimpleInterest m1 =new SimpleInterest(2000,2,4.5f);
SimpleInterest m2 =new SimpleInterest(10000,5,4);
SimpleInterest m3 =new SimpleInterest(2000);
	m1.display();
	m2.display();
	m3.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		System.out.println("Simple Interest is:"+(principle*no_of_year*rate)/100);
	}
	

}
