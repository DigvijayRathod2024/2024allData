package trial2023Testss;

import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

	 
		int num = 12345;
		int sum = 0;
		
		while (num>0)
		{
			sum = sum+num%10;
			num=num/10;
		}
		
		System.out.print(sum);
	}
}
