package com.imooc;

public class TypeExchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c=(char)65534;
		System.out.println("c="+c);
		int n =c;
		c=(char)n;
		
		float f=10000000000000000L;
		System.out.println("f="+f);
		float f1=1000000000000033L;
		System.out.println("f1="+f1);
		

	}

}
