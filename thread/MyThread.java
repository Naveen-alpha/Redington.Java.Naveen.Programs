package com.redington.java.thread;

public class MyThread extends Thread {
public void run(){
	String tname=Thread.currentThread().getName();
			System.out.println(tname+" "+"run");
			System.out.println(tname+" "+"run");
			System.out.println(tname+" "+"run");
			System.out.println(tname+" "+"run");
	
}
}
