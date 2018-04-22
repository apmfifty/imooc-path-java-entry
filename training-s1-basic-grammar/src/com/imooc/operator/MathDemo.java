package com.imooc.operator;

public class MathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num1=10,num2=5;
//		int result;
//		result=num1+num2;
//		System.out.println(num1+"+"+num2+"="+result);
//		System.out.println(num1+num2);
//		System.out.println(""+num1+num2);
//		result=num1-num2;
//		System.out.println(num1+"-"+num2+"="+result);
//		result=num1*num2;
//		System.out.println(num1+"*"+num2+"="+result);
//		result=num1/num2;
//		System.out.println(num1+"/"+num2+"="+result);
//		System.out.println(13+"/"+5+"="+ 13/5);
//		result=num1%num2;
//		System.out.println(num1+"%"+num2+"="+result);
//		System.out.println(13.5+"%"+num2+"="+(13.5%num2));
//			
//		int n=789;
//		System.out.println("(n-n%10)/100 ="+(n-n%10)/100);
//		System.out.println("n%10 ="+(n%10));
//		System.out.println("n%100 ="+(n%10));
		
		//将变量m的初值赋值为10，变量n的初值赋值为5
	    int m=10;
	    int n=5;
		   
	    //变量m的值加3，n的值加5
	    m+=3;
	    n+=5;	    
	 
	    //求m和n的平均值，并将结果存于变量p中
	    double p=(m+n)/2.0;
	   
	    //求m的平方乘以n的平方，并将结果存于变量q中
	    int q=m*m*(n*n);

	    //将p和q的值打印输出
	    System.out.println("p="+p);
	    System.out.println("q="+q);
		

	}

}
