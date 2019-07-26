package com.redington.java.thread;

public class MyThreadTest {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
MyThread t1=new MyThread();
MyThread t2=new MyThread();
MyThread t3=new MyThread();
MyThread t4=new MyThread();
MyThread t5=new MyThread();
MyThread t6=new MyThread();
MyThread t7=new MyThread();
MyThread t8=new MyThread();
MyThread t9=new MyThread();
MyThread t10=new MyThread();
try {
	t1.sleep(2000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
t1.setName("naveen");
System.out.println(t1.getName());
t1.setPriority(t1.MAX_PRIORITY);
System.out.println(t1.getPriority());
t1.setDaemon(true);
System.out.println(t1.isDaemon());
t10.setName("alpha");
t10.setPriority(t10.MAX_PRIORITY);
t10.start();

t1.start();
//t1.stop();

	}

}
