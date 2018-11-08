package stringDemo;

public class StringDemo2 {

	public static void main(String[] args) {
		
		String actual="welcome to selenium world";
		String expected="welcome to selenium world";
		
		boolean status=actual.equalsIgnoreCase(expected);
        
		System.out.println("tahe status is "+status);
	}

}
