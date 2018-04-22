package com.imooc.flow1;

public class DoWhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		int sum=0;
		do {
			sum+=n;
			n++;
			System.out.println("n="+n+"\tsum="+sum);
		}while(n<=5);
	}

}
