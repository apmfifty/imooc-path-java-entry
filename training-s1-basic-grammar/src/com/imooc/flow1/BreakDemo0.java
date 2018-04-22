package com.imooc.flow1;

public class BreakDemo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=0;
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<5;j++)
			{
				k=i+j;
				System.out.println("i="+i+"j="+j+"k="+(k));
				if(j==3) {
					break;
				}
				
			}
		}

	}

}
