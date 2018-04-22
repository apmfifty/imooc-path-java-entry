package com.imooc.sms;

import java.util.Scanner;

/**
 * 
 * @author pengju
 * @version 1.0
 * @since 2018-04-18
 */
public class SimpleManagementSystem {
	//插入数据
	public int[] insertData() {
		//预先定义的变量		
		int[] arr=new int[10];
		for(int i=1;i<arr.length;i++) {
			System.out.println("请输入第"+i+"个数据:");
			Scanner scanner=new Scanner(System.in);
			arr[i-1]=scanner.nextInt();
		}
		showData(arr,arr.length-1);		
		return arr;
	}
	//显示所有数据
	public void showData(int[]a,int length) {
		System.out.println("数据元素为:");
		for(int i=0;i<(length<a.length?length:a.length);i++)
		{
			System.out.print(a[i]+"	");
		}
		System.out.println();
		notice();
	}
	//在指定位置处插入数据
	public void insertAtArray(int[]a,int val,int pos) {		
		for(int i=a.length-1;i>pos;i--)			
		{
			a[i]=a[i-1];
			showData(a,a.length);		
		}
		a[pos]=val;
		showData(a,a.length);			
	}
	//查询能被3整除的数据
	public void divThree(int[]a,int length) {
		System.out.print("数组中能被3整除的元素为：");
		for(int i=0;i<(length<a.length?length:a.length);i++)
		{
			if(a[i]%3==0) {
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		notice();
	}
	// 显示提示信息的方法
	public 	void notice() {
		System.out.println("************************************");
		System.out.println("		1--插入数据");
		System.out.println("		2--显示数据");
		System.out.println("		3--在指定位置处插入数据");
		System.out.println("		4--查询能被3整除的数据");
		System.out.println("		0--退出");		
		System.out.println("************************************");
		System.out.println("请输入对应的数字进行操作：");	
	}
	//主方法
	public static void main(String[] args) {
		//生成对象
		SimpleManagementSystem sms =new SimpleManagementSystem();
		//默认开始进行提示
		sms.notice();
		int[] arr=new int[10];
		boolean insertFlag=false;
		while (true) {					
			// 设置quitFlag判断是否退出循环
			boolean quitFlag=false;
			Scanner scanner=new Scanner(System.in);
			int methodSelection=scanner.nextInt();			
			switch (methodSelection) {
			case 0:	
				quitFlag=true;
				break;
			case 1:
				arr=sms.insertData();
				insertFlag=false;
				break;
			case 2:
				sms.showData(arr, insertFlag?arr.length:(arr.length-1));
				break;
			case 3:
				System.out.println("请输入要插入的数据：");
				int insertVal=scanner.nextInt();
				System.out.println("请输入要插入数据的位置：");
				int insertPos=scanner.nextInt();
				if (insertPos>(arr.length-1)){
					System.out.println("Error: 插入位置输入值("+insertPos+")大于被插入数组长度("+(arr.length-1)+")");
					sms.notice();					
				}
				else {				
					sms.insertAtArray(arr, insertVal, insertPos);
					insertFlag=true;
				}
				break;
			case 4:
				sms.divThree(arr, insertFlag?arr.length:(arr.length-1));
				break;
			default:
				System.out.println("Error: 请输入0-4之内的数字");
				sms.notice();
			}
//			scanner.close();
			if (quitFlag) {
				break;
			}
				
		}
		
		
		

	}

}
