package vowelCheck;

import java.util.Scanner;

public class VowelChecker {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);     
	    System.out.print("Enter the letter: " ); //Better prompt IMO
	    String str = sc.next(); //Get the whole string
	    char[] myChar = str.toCharArray(); //Turn the string into an array of char

	    for (char c : myChar) { //For every char in the array
	        switch (c) { //Check if it is a vowel or not
	            case 'a':     
	            case 'A':     
	            case 'e':     
	            case 'E':     
	            case 'i':     
	            case 'I':     
	            case 'o':     
	            case 'O':     
	            case 'u':     
	            case 'U':    
	                System.out.println(c + " is a vowel"); //Easier for me to read
	                break;
	            default:
	                System.out.println(c+ " is not a vowel");
	                break;
	        }
	    }
	} 
}
