package com.imooc.method;


public class ArryDemo {
	public void updateArray(int[] a) {
		a[3]=15;
		System.out.println("a=:");
		for(int n:a) {
			System.out.print(n+" ");
		}
		System.out.println();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArryDemo arryMethod=new ArryDemo();
		int[]a1= {1,2,3,4,5};
		System.out.println("before a1");
		for(int n:a1) {
			System.out.print(n+" ");			
		}
		System.out.println();
		arryMethod.updateArray(a1);
		System.out.println("after a1");
		for(int n:a1) {
			System.out.print(n+" ");			
		}
		System.out.println();		
		

	}

}
