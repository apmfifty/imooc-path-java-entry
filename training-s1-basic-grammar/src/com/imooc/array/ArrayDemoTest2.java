package com.imooc.array;

public class ArrayDemoTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个字符数组ch并初始化
		char []ch= {'a','b','c','d','A',' '};
		//循环遍历数组，统计字符’a’或’A’出现的次数
		int count=0;
		 for(char c:ch) {
			 if(c=='a'|c=='A') {
				 count+=1;
			 }
		 }

		//打印输出统计数据
		System.out.println("count="+count);
		

	}

}
