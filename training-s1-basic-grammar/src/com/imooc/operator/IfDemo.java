package com.imooc.operator;

public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义整型变量x和y，值分别为-2和0
		int x=-2;
		int y=0;
		//如果x大于0，则y的值为2*x+1
		if (x>0) {
			y=2*x+1;
		}
		//否则y的值为x+5
		else {
			y=x+5;
		}
        System.out.println("x="+x);
        System.out.println("y="+y);
        
		//分别输出x和y的值
		
	}

}
