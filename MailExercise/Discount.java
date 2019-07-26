package com.redington.java.MailExercise;

import java.util.Scanner;

public class Discount {
int quantity;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Discount obj=new Discount();
obj.find();
	}

	private void find() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the quantity you bought");
		quantity=scan.nextInt();
		int price=quantity*100;
		if(price>1000)
		{
			int disprice=(price*10)/100;
			System.out.println("FInal price is :"+ (price-disprice));
		}else{
			System.out.println("Dear customer you are not bought more than 1000rs.So you are not eligible for discount and your price is:"+price);;
		}
	}

}
