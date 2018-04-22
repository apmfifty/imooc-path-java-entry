package com.imooc.method;

public class ExchangeDemo1 {
	public void add(int n ) {
		n++;
		System.out.println("n="+n);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		System.out.println("before n="+n);
		ExchangeDemo1 mExchangeDemo =new ExchangeDemo1();
		mExchangeDemo.add(n);		
		System.out.println("after n="+n);
	}

}
