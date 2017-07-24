package armstrongNumber;

import java.util.Scanner;

public class ArmstrongNumberChecker {
	public static void main(String args[]) 
	{

		Scanner scanner=new Scanner(System.in);
	// Input number to check if its Armstrong number
	System.out.println("Please enter a number to find if it is an Armstrong number: \n");
	int number = scanner.nextInt();

	// Printing result
	if(isArmStrong(number))
	{
	System.out.println("True");
	}
	else
	{
	System.out.println("False");
	}

	} 

	// Function returning true if number is Armstrong number or returning false

	private static boolean isArmStrong(int number) 
	{
	int result = 0;
	int dc=0; 
	int orig = number;
	while(orig != 0)
	{ 
	dc++; 
	orig = orig/10;
	}
	orig = number;
	while (orig!=0)
	{
	result = result + (int)Math.pow(orig%10, dc);
	orig = orig/10;
	}
	if(number == result)
	return true; 
	else
	return false;
	}
}
