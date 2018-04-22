package com.imooc.array;

public class BububleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int []a= {132,445,89,90,87};
		int []a= {34,53,12,32,56,17};
		for(int i=a.length-1;i>=0;i--)
		{			
			for(int j=0;j<i;j++)
			{
				if(a[j]>a[j+1]) {
					int tmp=a[j];
					a[j]=a[j+1];
					a[j+1]=tmp;
				}
			}
			for(int k:a) {
				System.out.print(k+" ");	
			}
			System.out.println();
		}
		for(int k:a) {
			System.out.print(k+" ");	
		}

		

	}

}
