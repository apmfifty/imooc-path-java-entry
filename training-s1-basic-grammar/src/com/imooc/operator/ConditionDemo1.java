package com.imooc.operator;

public class ConditionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price1,price2;
		price1=80;
		price2=50;
		double sum=price1+price2;
		System.out.println("sum="+sum);
		if  (sum>=100) {
			sum-=20;
		}
		System.out.println("sum="+sum);

	}

}
