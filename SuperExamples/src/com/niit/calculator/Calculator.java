package com.niit.calculator;

import java.util.Scanner;


class Calculate {
	Scanner scanner=new Scanner(System.in);
	
	double num1, num2;
	public double add(){
		double total=this.num1+this.num2;
		System.out.println(total);
		return total;
	}
	public double subtract(){
		double total=this.num1-this.num2;
		System.out.println(total);
	return total;
	}
	public double divide(){
		double total=this.num1/this.num2;
		System.out.println(total);
		return total;
	}
	public double multiply(){
		double total=this.num1*this.num2;
		System.out.println(total);
		return total;
	}
public void print()

{
System.out.println("Please select the operation : ");
System.out.println("1.Addition");
System.out.println("2.Subtraction");
System.out.println("3.Division");
System.out.println("4.Multiplication");
int num=scanner.nextInt();

switch(num){
case 1:add();
return;
case 2: subtract();
return;
case 3:divide();
return;
case 4: multiply();
return;
default:System.out.println("Incorrect option");
}

}

}
public class Calculator{
	private static Scanner scanner;

	public static void main(String args[])
	{
		scanner = new Scanner(System.in);
	Calculate calc=new Calculate();
	System.out.println("Enter the first number: ");
	double first =scanner.nextDouble();
	calc.num1=first;
	System.out.println("Enter the second number:  ");
	double second=scanner.nextDouble();
	calc.num2=second;
	calc.print();

	}
}
