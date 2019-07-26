package com.redington.java.MailExercise;

import java.util.Scanner;

public class AreaTriangle {
int breath,height;
float result;
void findAreaOfTriangle(){
	Scanner scan =new Scanner(System.in);
	System.out.println("Enter Breath :");
	breath=scan.nextInt();
	System.out.println("Enter Height :");
	height=scan.nextInt();
	result=(float) ((1/2)*breath*height);
	System.out.println("The Area Of Triangle :"+result);
	
}
}
