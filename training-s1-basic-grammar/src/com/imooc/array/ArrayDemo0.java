package com.imooc.array;

public class ArrayDemo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//定义一个整型数组，并初始化
		int [] intArray={1,2,3,4,5,6};
		//循环遍历数组，找出能被3整除的元素并打印输出
		for(int i=0;i<=intArray.length-1;i++)
		{
//			System.out.println(intArray[i]);
			if(intArray[i]%3==0) {
				System.out.println(intArray[i]);
			}
		}
		

	}

}
