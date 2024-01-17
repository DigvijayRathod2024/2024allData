package foreach1;

import java.awt.print.Printable;

public class Test1 {

	public static void main(String[] args) {
		
		int [] ar = {10,12,13,16,17};
		
		int total =0;
		
		for (int i:ar)
		{
			total=total+i;
		}
			
		System.out.println(total);
	

	
	}
}
