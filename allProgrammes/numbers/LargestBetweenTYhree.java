package numbers;

public class LargestBetweenTYhree {

	public void largest(int a, int b, int c)
	{
		if (a>b && a>c)
			System.out.println("lareste is " + a);
		else if (b>a && b>c)
			System.out.println("largest  is  " + b);
		else 
			System.out.println("lartgest is " + c);
	}
	
	public static void main(String[] args) {
		
		LargestBetweenTYhree large  = new LargestBetweenTYhree();
		
		large.largest(2, 4, 8);

		
	}

}
