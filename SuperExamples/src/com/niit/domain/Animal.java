package com.niit.domain;

public class Animal {
	
	//attribute
	String name;
	String bark;
	
	//constructor
	public Animal(String n, String b)
	{
		name=n;
		bark=b;
	}
	
	public void shout()
	{
		System.out.println("The name of the animal is"+name + "It shouts like"+bark);
	}

}
