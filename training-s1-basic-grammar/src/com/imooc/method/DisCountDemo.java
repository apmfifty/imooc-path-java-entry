package com.imooc.method;

public class DisCountDemo {

	public void	discount(float price) {
		float discountVal=0;
		if (price<100) {
			System.out.println("no discount");
		}
		else if (price<=199) {
			discountVal=0.95f*price;
			System.out.println("5% discount="+discountVal);
			
		}else  {
			discountVal=0.85f*price;
			System.out.println("15% discount"+discountVal);
			
		}
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisCountDemo myDisCountDemo=new DisCountDemo();
		myDisCountDemo.discount(150f);
	}

}
