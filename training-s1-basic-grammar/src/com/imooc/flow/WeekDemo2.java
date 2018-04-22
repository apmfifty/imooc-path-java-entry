package com.imooc.flow;

import java.util.Scanner;

//import java.util.Scanner;

public class WeekDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入星期几");
		Scanner sc = new Scanner(System.in);
		String weekday = sc.next();
		weekday=weekday.toUpperCase();
		switch (weekday) {
		case "MONDAY":
			System.out.println("星期一");
			break;
		case "TUESDAY":
			System.out.println("星期二");
			break;
		case "WEDNESDAY":
			System.out.println("星期三");
			break;
		case "THURSDAY":
			System.out.println("星期四");
			break;
		case "FRIDAY":
			System.out.println("星期五");
			break;
		case "SATURDAY":
			System.out.println("星期六");
			break;
		case "SUNDAY":
			System.out.println("星期日");
			break;
		default:
			System.out.println("weeday=" + weekday + "拼写错误");

		}

	}

}
