package com.imooc.method;

public class ArgsDemo1 {
	public void search(int n,int ...a) {
		boolean flag=false;
		for(int a1:a)
		{
			if(a1==n) {
				flag=true;
				break;
			}
		}
		if (flag) {
			System.out.println("find it");
		}else {
			System.out.println("not find it");
		}
			
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArgsDemo1 myArgsDemo1=new ArgsDemo1();
		myArgsDemo1.search(10, 10,390,20);
		

	}

}
