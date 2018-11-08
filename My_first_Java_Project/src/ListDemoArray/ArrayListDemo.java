package ListDemoArray;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
     ArrayList obj=new ArrayList();
     
     obj.add(20);
     
     obj.add('M');
     
     obj.add("Selenium webdriver");
     
     obj.add(12.34);
     
     System.out.println(obj);         // either way we can print this.
     System.out.println(obj.get(3));
	
	}

}
