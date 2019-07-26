package com.redington.java.Basic;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank bank=new Bank();
Bank.CalculateInterest();
bank.deposit();
bank.changeATMpin();
bank.withdraw();
System.out.println(Bank.name);
	}

}
