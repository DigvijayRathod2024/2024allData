package foreach1;

public class Test4 {

	public static void main(String[] args) {
		
		String s = " the india is my country";
		
		
		for (int i=0; i<=s.length()-1 ;i++)
		{
			if(i%2==0)
			{
				System.out.println(s.charAt(i));
			}
		}

	}

}
