package arrays;

public class SumofALlelements {

	public static void main(String[] args) {

		int x[] = {2,3,5,6,7};
		
		int sum=0;
		
		for (int i=0; i<x.length; i++)
		{
			sum=sum+x[i];
			sum++;
		}
		
		System.out.println(sum);
	}

}
