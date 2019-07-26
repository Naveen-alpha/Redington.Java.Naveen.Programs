package com.redington.java.Basic;

public class Area {
int radius;
void findAreaofCircle(){
	radius=10;
	System.out.println("the area of cicle is:"+ (3.14*radius*radius));
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Area area=new Area();
area.findAreaofCircle();
	}

}
