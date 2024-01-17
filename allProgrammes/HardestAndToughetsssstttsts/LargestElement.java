package HardestAndToughetsssstttsts;

public class LargestElement {

	public static void main(String[] args) {

		int x[]= {3,5,6,8,9,2,5}; 
		
		int max = x[0]; 
		
		for (int i=0; i<x.length; i++)
		{
			if (x[i]>max)
			
				max=x[i];
		}
		
		System.out.println(max);
	}

}
