package HashSet;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> value=new HashSet<>();
		
		value.add("Java Selenium");
		value.add("Qtp");
		value.add("Selenium");
		value.add("Automation");
		//System.out.println(value);  // to BRake it down we need to use for Loop.
		
		for(String top:value)

		{
			System.out.println(top);
		}
		

	}

}
