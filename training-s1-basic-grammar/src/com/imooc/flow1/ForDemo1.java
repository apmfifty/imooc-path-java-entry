package com.imooc.flow1;

public class ForDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			
		}
		int j=1;
		for (; j <=10; j++) {
			System.out.print(j+" ");
			
		}
		for (; ; j++) {
			System.out.print(j+" ");
			if (j==100) {break;}
				
		}
		

	}

}
