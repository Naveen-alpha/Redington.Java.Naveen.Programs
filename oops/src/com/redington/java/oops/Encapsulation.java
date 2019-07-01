package com.redington.java.oops;

public class Encapsulation {
private int accountNo;
int phoneNo;
private void setAccountNo(int accountNo)
{
	this.accountNo=accountNo;
	}
int getAccountNo()
{
	return accountNo;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Encapsulation obj=new Encapsulation();
System.out.println(obj.getAccountNo());
obj.setAccountNo(5846491); 
System.out.println(obj.getAccountNo());
	}

}
