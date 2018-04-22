package com.imooc.operator;

import java.util.Scanner;

public class ArraySearch {
	public boolean search(int n,int[]arr) {
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				flag=true;
				break;
			}
		}
		return flag;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {10,20,30,40,80};
		System.out.println("请输入要查找的数据：");		
		Scanner scanner=new Scanner(System.in);
		int n1=scanner.nextInt();
		ArraySearch myArraySearch=new ArraySearch();
		boolean flag=myArraySearch.search(n1, arr1);
		if(flag) {
			System.out.println("找到了");
		}else {
			System.out.println("没哟找到");
		}
		
		
	}

}
