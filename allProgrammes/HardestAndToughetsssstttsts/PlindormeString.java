package HardestAndToughetsssstttsts;

public class PlindormeString {

	public static void main(String[] args) {

		String s = "madam222madawrrm";
		
		String org = s;
	
		String rev = "";
		
		for (int i=s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);	
		}
		
		System.out.println(rev);
		
		if (org.equals(rev))
		System.out.println("yes pali");
		else
			System.out.println("not pali");
		
		
	}

}
