package arraySorter;

import java.util.Arrays;

public class ArraySorter {
		public static void main(String[] args){   
		    
		    int[] numArray = {
		            1789, 2035, 1899, 1456, 2013, 
		            1458, 2458, 1254, 1472, 2365, 
		            1456, 2165, 1457, 2456};
		            
		    String[] stringArray = {
		            "Java",
		            "Python",
		            "PHP",
		            "C#",
		            "C Programming",
		            "C++"
		        };        
		    System.out.println("Original numeric array : "+Arrays.toString(numArray));
		    Arrays.sort(numArray);
		    System.out.println("Sorted numberic array : "+Arrays.toString(numArray));
		    System.out.println("Original string array : "+Arrays.toString(stringArray));
		    Arrays.sort(stringArray);
		    System.out.println("Sorted numeric array :"+ Arrays.toString(stringArray));

}}
