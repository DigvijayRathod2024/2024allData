package strings;

public class Splitstring {

	public static void main(String[] args) {

						
				String s10 = "hello @ this @ is @ test";
		
				String s1 = "hello this is test";
						 
				String s2 = " this is timepass";
						
				String s3 = " this is timepass";
						
				String s4 = s1.concat(s2);
						
				String s5 = s3.concat(s4);
						
				String ww[] = s10.split("@");
						
				for (int i=0; i<ww.length; i++)
				{
					System.out.println("parts are " + ww[i]);
				}

	}
	
}
