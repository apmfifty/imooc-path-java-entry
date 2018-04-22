package com.imooc.animal;
/**
 * cat class
 * @author pengju
 *
 */
public class Cat {
	//属性
	String name;
	int month;
	double weight;
	String species;
	public  Cat() {
		System.out.println("无参构造");		
	}
	public Cat(String name) {
		System.out.println("我是name参构造方法");
	}
	public Cat(String name,int month,double weight,String species) {
		this();
		this.name=name;
		this.month=month;
		this.weight=weight;
		this.species=species;
		
	}
	
	
	//method:run eat
	public void run() {
		this.eat();
		System.out.println("run");		
	}
	public void run(String name) {
		this.eat();
		System.out.println(name+" run");
	}
	public void	 eat() {
		System.out.println("eat");
	}

}
