package com.imooc.operator;

public class AverageDemo {

	public float avgMehtod(float[] arr) {
		float  sum=0f;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum/(arr.length);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[] arr= {78.5f,98.5f,65.5f,32.5f,75.5f};
		AverageDemo myAverageDemo=new AverageDemo();
		float avg=myAverageDemo.avgMehtod(arr);
		System.out.println("数组的平均值为="+avg);
	
	}		
}
