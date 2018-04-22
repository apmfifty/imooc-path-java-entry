package com.imooc.flow;

import java.util.Scanner;

public class CharDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("输入一个字符");
		Scanner scanner= new Scanner(System.in);
		String c=scanner.next();
		switch (c) {
		case "a":
			System.out.println("a");
			break;
		case "e":
			System.out.println("e");
			break;
		case "i":
			System.out.println("i");
			break;
		case "o":
			System.out.println("o");
			break;
		case "u":
			System.out.println("u");
			break;			
		default:
			System.out.println("非");
		}
		
		

	}

}
