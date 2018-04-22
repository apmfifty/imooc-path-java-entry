package com.imooc.method;

public class Rectangle {
	
	public int area() {
		int length=10;
		int width=5;
		int getArea=length*width;
		return getArea;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle myRectangle=new Rectangle();
		int areaVal=myRectangle.area();
		System.out.println(areaVal);
	}

}
