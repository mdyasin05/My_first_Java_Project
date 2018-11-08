package HashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		LinkedHashSet<String> value=new LinkedHashSet<>();
		
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
