package com.redington.java.MailExercise;

import java.util.Scanner;

public class DiscountAndSales {
	String productName;
int productPrice,discountRate;
double discountAmount,salePrice;

void getInput(){
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the product name:");
	productName=scan.next();
	
	System.out.println("Enter the product price:");
	productPrice=scan.nextInt();
	System.out.println("Enter the discountRate:");
	discountRate=scan.nextInt();
	}
void findDiscountPrice(){
	discountAmount=productPrice*discountRate/100;
	System.out.println("Discount Amount :"+discountAmount);
	//return discountAmount;
}
void findSalePrice(){
	salePrice=productPrice-discountAmount;
	System.out.println("SalePrice of the "+productName+"is :"+salePrice);
}

}
