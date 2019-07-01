package com.redington.java.oops;
class RBI{
	double debit(double balance,double amount){
		balance=balance-amount;
		return balance;
		}
	double credit(double balance,double amount){
		balance=balance+amount;
		return balance;
	}
	double rateOfInterest(double balance){
		balance=(balance*5.5)/100;
		return balance;
	}
}
class ICC extends RBI{
	double rateOfInterest(double balance){
		balance=(balance*6)/100;
		return balance;
	}
}
class BOB extends RBI{
	double rateOfInterest(double balance){
		balance=(balance*7)/100;
		return balance;
	}
	boolean checkMinimum(double balance){
		
		if(balance >=500){
			
			return true;
			
		}else{
			return false;
		}
		
		
			
	}
		
	
}

public class Hierarchical {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ICC icc =new ICC();
BOB bob=new BOB();
System.out.println(icc.credit(600, 10000));
System.out.println(icc.debit(500, 5000));	
System.out.println(icc.rateOfInterest(1000));
System.out.println(bob.checkMinimum(3000));
}
}