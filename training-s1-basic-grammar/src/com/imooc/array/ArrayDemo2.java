package com.imooc.array;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {132,445,89,90,87};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if( max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		

	}

}
