package com.imooc.method;

public class MaxDemo {
	public void max(double a,double b) {
		
	}
	
	public void max(float a,float b) {
		float maxVal= (a>b)?a:b;
		System.out.println(maxVal);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDemo myMaxDemo=new MaxDemo();
		float a=10;
		float b=30;
		myMaxDemo.max(a=a,b=b);
		float m=5.6f;
		float n=4.7f;
		myMaxDemo.max(m, n);
		
		

	}

}
