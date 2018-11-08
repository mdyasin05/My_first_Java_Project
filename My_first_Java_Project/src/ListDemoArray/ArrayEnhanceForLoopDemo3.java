package ListDemoArray;

import java.util.ArrayList;

public class ArrayEnhanceForLoopDemo3 {

	public static void main(String[] args) {
		
     ArrayList obj=new ArrayList();
     
     obj.add(20);
     
     obj.add('M');
     
     obj.add("Selenium webdriver");
     
     obj.add(12.34);
                                 // Enhance For Loop The best way to Looping. 
     for(Object abc:obj)        // "Object" should be Capital later.
     {
    	 System.out.println("Values are "+abc);
     }
     
	}

}
