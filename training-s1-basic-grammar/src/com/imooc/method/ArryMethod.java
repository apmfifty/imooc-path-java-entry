package com.imooc.method;

public class ArryMethod {
	public  void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,20,30,40,60};
		ArryMethod myArryMethod=new ArryMethod();
		myArryMethod.printArray(arr);
	}

}
