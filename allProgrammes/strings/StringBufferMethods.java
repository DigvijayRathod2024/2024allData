package strings;

public class StringBufferMethods {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Hello ");  
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//prints Hello Java  
		

		
		StringBuffer st = new StringBuffer(" teest");
		
		
		System.out.println(sb.append(st));
		
		
		
		System.out.println(sb.isEmpty());
		
		System.out.println(sb.compareTo(st));
		

		
	}

}
