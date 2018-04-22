package com.imooc.array2;

import java.util.Scanner;

public class ScoreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       //定义一个三行两列的整型二维数组intArray
		int[][] intArray=new int[3][2];

	       //从键盘输入学生成绩，要求输入顺序与效果图一致
		for(int i=0;i<intArray.length;i++) {
			int [] stuScore=intArray[i];			
			for(int j=0;j<stuScore.length;j++)
			{
				System.out.println("请输入第"+(i+1)+"学生的"
			+(j==0?"语文":"数学")+"成绩");
				Scanner scanner=new Scanner(System.in);
				intArray[i][j]=scanner.nextInt();
			}
		}


	       //求语文的总成绩和平均分
			int sum_yuwen=0;
			int avg_yuwen=0;
			for(int i=0;i<intArray.length;i++)
			{
				sum_yuwen+=intArray[i][0];
			}
			avg_yuwen=sum_yuwen/intArray.length;
			System.out.println(sum_yuwen+" "+avg_yuwen);

	       //求数学的总成绩和平均分
			int sum_shuxue=0;
			int avg_shuxue=0;
			for(int i=0;i<intArray.length;i++)
			{
				sum_shuxue+=intArray[i][1];
			}
			avg_shuxue=sum_shuxue/intArray.length;
			System.out.println(sum_shuxue+" "+avg_shuxue);

	}

}
