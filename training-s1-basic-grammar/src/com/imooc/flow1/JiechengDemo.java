package com.imooc.flow1;

public class JiechengDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=50;
		int i=1;
		int sum=0;
		while (i<=m) {
			int jicheng=1;
			int j=i;
			while (j>=1) {
				jicheng*=j;
				j--;
			}
			System.out.println("jicheng of "+i+"="+jicheng);
			sum+=jicheng;
			i++;
		}
		System.out.println("sum="+sum);
		
		i=1;
		sum=0;
		for(i=1;i<=m;i++) {
			int jicheng=1;
			for(int j=i;j>=1;j--)
			{
				jicheng*=j;
			}
			System.out.println("jicheng of "+i+"="+jicheng);
			sum+=jicheng;
		}
		System.out.println("sum="+sum);
		
		
		

	}

}
