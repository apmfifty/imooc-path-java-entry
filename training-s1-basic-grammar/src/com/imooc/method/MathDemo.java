package com.imooc.method;

public class MathDemo {
	public int  plus(int m,int n) {
		return m+n;
	}
	public double  plus(double m,double n) {
		return m+n;
	}
	public int	 plus(int[]arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=5,n=10;
		int[]arr= {1,2,3,3,4,5};
		MathDemo myMathDemo= new MathDemo();
		System.out.println("int="+myMathDemo.plus(m,n));
		System.out.println("double="+myMathDemo.plus((double)m,(double)n));
		System.out.println("arr="+myMathDemo.plus(arr));
		
		

	}

}
