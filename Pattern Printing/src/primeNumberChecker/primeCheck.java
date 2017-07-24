
//java program to take the input from user and determine if it is a prime number or not
package primeNumberChecker;

import java.util.Scanner;

public class primeCheck {
	 public static void main(String args[])
	    {
	        int num, i, count=0;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter a Number : \n");
	        num = scan.nextInt();
			
	        for(i=2; i<num; i++)
	        {
	            if(num%i == 0)
	            {
	                count++;
	                break;
	            }
	        }
	        if(count == 0)
	        {
	            System.out.print("This is a Prime Number");
	        }
	        else
	        {
	            System.out.print("This is not a Prime Number");
	        }
	    }

}
