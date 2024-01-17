package HardestAndToughetsssstttsts;

import java.util.Arrays;

public class DesecdingArray {

	public static void main(String[] args) {
		
		
int x [] = {2,3,4,4,2,7,3,9};
		
		Arrays.sort(x);
		
		for (int i=x.length-1; i>=0; --i)
		{
			System.out.print(x[i]);
		}
	

	}

}
