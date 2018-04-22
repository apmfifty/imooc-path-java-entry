package com.imooc;

public class _04_04_Practice_Type_Exchaneg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1、定义一个整型字面值67832，赋值给char类型变量c，并将c的值输出
		int i=67832;
		char c=(char)i;
		System.out.println("c="+c);
//		2、定义一个整型变量n，初始化为65//
		int n=65;
		
//		3、定义一个字符型变量c1，赋值为n，并输出c1的值
		char c1=(char)n;
		System.out.println("c1="+c1);
//		4、定义一个长整型变量l，值为987654321
		long l=987654321L;
		
//		5、定义一个整型变量i，赋值为l，并输出i的值
		int ii=(int)l;
		System.out.println("ii="+ii);
//		6、定义一个float类型变量f，将变量l的值赋值给f，并输出f的值
		float f=l;
		System.out.println("f="+f);
//		7、将float的值f，重新赋值给变量l，并输出l的值
		l=(long)f;
		System.out.println("l="+l);
		
	}

}
