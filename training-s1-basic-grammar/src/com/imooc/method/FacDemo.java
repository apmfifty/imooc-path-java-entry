package com.imooc.method;

public class FacDemo {
	public int fac(int a) {
		int result=1;
		for(int i=1;i<=a;i++) {
			result*=i;
		}

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacDemo myFacDemo=new FacDemo();
		System.out.println(myFacDemo.fac(3));
		int sum=0;
		for(int i=1;i<=5;i++) {
			sum+=myFacDemo.fac(i);
		}
		System.out.println(sum);

	}

}
