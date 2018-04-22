package com.imooc.flow1;

public class ContinueDemo0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=9;
		int sum=0;
		for(int i=0;i<=9;i++) {
			if(i%2==0) continue;
			sum+=i;			
			System.out.println(i);
		}
		System.out.println(sum);
		
		int k=0;
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i%2==0) continue;
				k+=j;
				
			}
		}
		System.out.println(k);
				
		

	}

}
