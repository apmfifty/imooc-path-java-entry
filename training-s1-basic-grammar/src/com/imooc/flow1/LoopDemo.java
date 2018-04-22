package com.imooc.flow1;

public class LoopDemo {

	public static void main(String[] args) {
		//定义整型变量n作为循环变量，并初始化
		int i =1;
        //定义整型变量sum存放和，并初始化
		int sum=0;

        //使用while循环求1到5的平方和
        while(i<=5) {
        	sum+=(i*i);
        	i++;
        }
        
        

        //输出平方和
        System.out.println(sum);

	}

}
