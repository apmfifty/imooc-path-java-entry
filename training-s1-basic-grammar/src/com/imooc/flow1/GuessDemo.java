package com.imooc.flow1;

import java.util.Scanner;

public class GuessDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int number=6;
		int number= (int)(Math.random()*10+1);		
		int guess;
		System.out.println("输入1-10的数");		
		Scanner scanner=new Scanner(System.in);
		guess=scanner.nextInt();
		do {
			if (guess<number) {
				System.out.println("guess bigger number");
				guess=scanner.nextInt();
			}
			else {
				System.out.println("guess smaller number");
				guess=scanner.nextInt();
			}
		}while(guess!=number);
		System.out.println("number="+number+"\tguess="+guess);
	}

}
