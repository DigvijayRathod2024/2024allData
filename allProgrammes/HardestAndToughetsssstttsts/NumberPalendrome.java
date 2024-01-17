package HardestAndToughetsssstttsts;

import java.util.Scanner;

public class NumberPalendrome {

	public static void main(String[] args) {

		int rev = 0;	
		
		int num  = 12345;
		
		System.out.println("your number is " + num);
		
		int orginial = num;
		
		while (num>0)
		{
			rev=rev*10+num%10;    // sum = sum +num%10; ......sum of digits
			num=num/10;           //num=num/10;
		}
		
		System.out.println("reverred number is " +rev);
		
		
		if (rev==orginial)
			System.out.println(" palindrome");
		else 
			System.out.println(" not palindrome");
	}
	
	}

