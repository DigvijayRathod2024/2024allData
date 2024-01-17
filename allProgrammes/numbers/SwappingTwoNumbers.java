package numbers;

public class SwappingTwoNumbers {

	  static void swap(int m, int n)
	    {
	        // Swapping the values
	        int temp = m;
	        m = n;
	        n = temp;
	        System.out.println("Value of m is " + m
	                           + " and Value of n is " + n);
	    }

	public static void main(String[] args) {

		
		 
		    // Main driver code
		        // Random integer values
		        int m = 9, n = 5;
		 
		        // Calling above function to
		        // reverse the numbers
		        
		        swap(m, n); 
	}

}
