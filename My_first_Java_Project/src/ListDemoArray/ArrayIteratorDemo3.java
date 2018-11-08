package ListDemoArray;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayIteratorDemo3 {

	public static void main(String[] args) {
		
     ArrayList obj=new ArrayList();
     
     obj.add(20836356);
     
     obj.add('M');
     
     obj.add("Selenium webdriver");     // Iterator List Array
     
     obj.add(12.34);
     
     Iterator itr=obj.iterator();  // Iterator should take Java Util. 
     
     while(itr.hasNext())
     {
    	Object value= itr.next();
    	System.out.println("Values are "+value);
    	
     }
	}

}
