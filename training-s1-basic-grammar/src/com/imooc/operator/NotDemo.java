package com.imooc.operator;

public class NotDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=4,j=5,k=9,m=5;
		if (i>j&&m<k++) {
			k++;
			System.out.println("k="+k);
		}
		else {
			System.out.println("k="+k);
			k--;
			System.out.println("k="+k);
		}

	}

}
