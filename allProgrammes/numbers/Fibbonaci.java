package numbers;

public class Fibbonaci {

	public static void main(String[] args) {

		int n1=0;
		int n2=1;
		int n3;
		
		for (int i =0; i<5; i++)
		{
			System.out.print(n3=n1+n2);
			
			n1=n2;
			n2=n3;
		}
		
		System.out.println();
	}

}
