package com.imooc.flow1;

public class StarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 使用嵌套for循环完成 
		1、外重循环控制输出行数
		2、第一个内重循环控制输出的空格数，依次递减。
		     注意：由于星号和空格在屏幕上所占的空间不同，所以可以适当调整空格的输出，比如每次循环都输出两个空格。这样输出来的图形会更加接近梯形
		3、第二个内重循环控制每行输出的星号数
		4、输出完一行的星号和空格后换行
		*/
		int n=5;
		for(int i=1;i<=n;i++) {			
			for(int j=i;j<=n;j++)
			{
				System.out.print("  ");			
//				System.out.print(" "+j);
			}
			for (int k=1;k<=(2*i+1);k++)
			{
				
				System.out.print("* ");
//				System.out.print("*"+k);
			}
			System.out.println();
		
		}
	}

}
