package arrays;

public class DuplicateElements {

	public static void main(String[] args) {

		int x [] = {3,4,5,66,7,899, 4, 55, 55, 34, 34};
		
		for (int i=0; i<x.length; i++)
		{
			for (int j =i+1; j<x.length; j++)
			{
				if (x[i]==x[j])
					System.out.println(x[j]);
			}
		}
		
	}

}
