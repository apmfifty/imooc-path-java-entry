package com.imooc.method;

public class AreaDemo {
	public double area(double radius) {
		return Math.PI*radius*radius;
		
	}
	public double area(double width,double height) {
		return width*height;				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double radius=4.5;
		double width=8;
		double height=5;
		AreaDemo myAreaDemo=new AreaDemo();
		double circleArea=myAreaDemo.area(radius);
		System.out.println(circleArea);
		System.out.println(myAreaDemo.area(width,height));
		

	}

}
