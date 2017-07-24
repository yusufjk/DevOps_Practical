package arrayCopier;

public class ArrayCopier {
	 public static void main(String args[]) {
	        int a[] = { 1, 2, 3, 4, 5, 6 };
	        int b[] = new int[a.length];

	        System.out.println("Printing the first array");
	        for(int i=0;i<a.length;i++){
	        	System.out.print(a[i]+" ");
	        }
	        
	        for (int i = 0; i < a.length; i++) {
	            b[i] = a[i];
	        
	    }
	        System.out.println("\nPrinting the copied array");
	        for (int i=0;i<b.length;i++){
	        	System.out.print(b[i]+" ");
	        }
	    }
}
