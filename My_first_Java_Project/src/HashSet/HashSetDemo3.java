package HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo3 {

	public static void main(String[] args) {
		
		Set<String> value=new HashSet<>();
		
		value.add("Java Selenium");
		
		value.add("Qtp");
		
		value.add("automation");
		
		value.add("Selenium");
		
		System.out.println(value); 
		
		ArrayList<String> list=new ArrayList<>(value); // handeling Set into a LIST
		
		System.out.println(list.get(4));
		
	

	}

}
