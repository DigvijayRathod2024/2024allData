package strings;

import java.util.Scanner;

public class ReverseTheString {

	public static void main(String[] args) {

		String s;  
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("enter any string :");
		
		s= sc.nextLine();
		
		System.out.println(" reveresd string will be :");
		
		for(int i=s.length(); i>0; --i)
		{
			System.out.print(s.charAt(i-1));
		}

	
	
	}

}
