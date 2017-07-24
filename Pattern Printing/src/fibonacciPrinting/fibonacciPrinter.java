package fibonacciPrinting;

public class fibonacciPrinter {
	public static void main(String args[])  
	{    
	 int n1=0,n2=1;       
	    while (n2<200){
	    	  n1=n1+n2;
	    	  System.out.print(" "+n2);    
	    	  n2=n2+n1;
	    	  System.out.print(" "+n1);
	    	 }    
	    }
	
}
