package com.imooc.method;

public class ArgsDemo {
	public void sum(int...n) {
		int sum=0;
		for(int i:n) {
			sum+=i;
		}
		System.out.println("sum="+sum);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo myArgsDemo=new ArgsDemo();
		myArgsDemo.sum(1,2,3);
		myArgsDemo.sum(1,2);
		myArgsDemo.sum(1);

	}

}
