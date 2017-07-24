package arrayCompare;

public class ArrayComparer {
	public static void main (String[] args) 
    {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3,4};
        if (arr1 == arr2) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            if(arr1.length>arr2.length){
            	System.out.println("Array 1's length is greater than array 2");
            	
            }
        
            else{
            	System.out.println("Array 2's length is greater than array 1");
            }
    }

}
