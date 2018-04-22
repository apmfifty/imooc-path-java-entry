package com.imooc.method;

public class ExchangeDemo {

	public void swap(int a,int b) {
		int  temp;
		System.out.println("a="+a+"b="+b);
		temp=a;a=b;b=temp;		
		System.out.println("a="+a+"b="+b);
		
	}
	public void swapTest() {
		int m=4,n=5;		
		System.out.println("m="+m+"n="+n);
		swap(m, n); 		
		System.out.println("m="+m+"n="+n);		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=4,n=5;
		ExchangeDemo eDemo=new ExchangeDemo();
		eDemo.swapTest();
//		System.out.println("m="+m+"n="+n);
//		eDemo.swap(m, n); 		
//		System.out.println("m="+m+"n="+n);		
	}

}
