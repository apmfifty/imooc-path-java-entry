package com.imooc.flow;

import java.util.Scanner;

public class IntCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("请输入整数a");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("请输入整数b");		
		int b=sc.nextInt();
		sc.close();
		if(a!=b) {
			if (a>b) {
				System.out.println(a+"大于"+b);
			}
			else {
				System.out.println(a+"小于"+b);
			}
		}
		else {
			System.out.println(a+"等于"+b);
		}
		
		

	}

}
