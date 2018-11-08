package stringDemo;

public class StringDemo3 {

	public static void main(String[] args) {
		
		String actual="welcome to selenium world";
		String expected="selenium";
		boolean status=actual.contains(expected);  //this is very case sensitive 
		
		
		System.out.println("the status is "+status);
	}

}
