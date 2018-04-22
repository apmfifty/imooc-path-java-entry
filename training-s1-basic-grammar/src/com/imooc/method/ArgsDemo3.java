package com.imooc.method;
/**
 * 关于可变参数列表和重载的问题
 * @author pengju
 *@version1.0
 *@version
 */

public class ArgsDemo3 {
	public int plus(int a,int b) {
		System.out.println("not kebian var");
		return a+b;		
	}
	public int plus(int...a) {
		int sum=0;
		for(int i:a) {
			sum+=i;
		}
		System.out.println("kebian");
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo3 aDemo3=new ArgsDemo3();
		aDemo3.plus(1,2);

	}

}
