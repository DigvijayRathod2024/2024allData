package strings;

public class PrintEvenLengthwords {


		public static void main(String[] args) {
			
			String s = "thisisnotfair";
			
			for (int i=0; i<s.length(); i++)
			{
				if (s.charAt(i)%2==0)
					System.out.println(" the word at even place is " + s.charAt(i));
		
			}
		}
	}


