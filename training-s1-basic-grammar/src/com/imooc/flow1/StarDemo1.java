package com.imooc.flow1;

public class StarDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=1;
		int n=1;
		while(m<=4) {
			while (n<=4) {
				System.out.print("*");
				n++;
			}
			m++;
			n=1;
			System.out.println();;
		}
		m=1;
		n=1;
		while(m<=4) {
			while (n<=m) {
				System.out.print("*");
				n++;
			}
			m++;
			n=1;
			System.out.print("\n");
		}

		

	}

}
