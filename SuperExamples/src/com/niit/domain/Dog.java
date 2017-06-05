package com.niit.domain;

public class Dog extends Animal {
	
	
	public Dog(String n,String b)
	{
		super(n,b);
	}	
	public void makeShout()
	{
		super.shout();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Dog d=new Dog("Dog","Bow Bow!!");
		d.makeShout();

	}

}
