package com.imooc.array;

import java.awt.datatransfer.FlavorEvent;

public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] intArray;
		String strArry[];
		float [] floatArray;
		
		intArray=new int[5];
		strArry=new String[5];
		floatArray=new float[4];
		
		char []ch= {'a','b','c','d'};
		System.out.println(ch.length);
		System.out.println(intArray[2]);
		System.out.println(strArry[4]);
		System.out.println(floatArray[floatArray.length-1]);
		
		for(int i=0;i<5;i++)
		{
			intArray[i]=i+1;
		}
		
		for(int i=0;i<5;i++) {
			System.out.println(intArray[i]+" ");
		}
		for(int i:intArray) {
			System.out.println(i+" ");
		}

	}

}
