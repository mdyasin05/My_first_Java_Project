package ListDemoArray;

import java.util.ArrayList;

public class ArrayListGeneric {

	public static void main(String[] args) {

	 ArrayList<String> obj1=new ArrayList<String>();
	 obj1.add("First Name is Mohammad");
	 obj1.add("Last Name is Yasin");
	 obj1.add("Selenium");   // based on our declaration we have to add only String Value.
	                      
	 
	 for(String v:obj1)
	 {
		 System.out.println("The names are "+v);
	 }
    
	
	}

}
