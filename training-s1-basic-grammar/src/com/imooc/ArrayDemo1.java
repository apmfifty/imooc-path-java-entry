package com.imooc;

import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[5];
		for(int i=0;i<a.length-1;i++) {
			System.out.println("请输入第"+(i+1)+"元素");
			Scanner scanner=new Scanner(System.in);
			a[i]=scanner.nextInt();			
		}
		int sum=0;
		for(int i=0;i<a.length-1;i++) {
			System.out.println("请输入第"+(i+1)+"元素="+a[i]);
			sum+=a[i];
		}
		System.out.println("sum="+sum);

	}

}
