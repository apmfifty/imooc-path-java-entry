package com.imooc.operator;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int year=2000;
		Scanner s=new Scanner(System.in);
		int year= s.nextInt();
		boolean ifLeapYear=(year%400==0)?true:(
				(year%4==0)&(year%100!=0)?true:false );
		
		System.out.println(year+"ifLeapYear="+ifLeapYear);
		

	}

}
