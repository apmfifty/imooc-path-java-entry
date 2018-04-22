package com.imooc.operator;

import java.util.Scanner;

public class ConditionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n=10;		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		boolean isOu= n%2==0;
		if (isOu) {
			System.out.println(n+"偶数");
		}
		else {
			System.out.println(n+"奇数");
		}
		
		

	}

}
