package ListDemoArray;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
     ArrayList obj=new ArrayList();
     
     obj.add(20);
     
     obj.add('M');
     
     obj.add("Selenium webdriver");
     
     obj.add(12.34);
     
     int MyListSize=obj.size();
     
     int i;
     
     for(i=0;i<MyListSize;i++)
     {
    	 System.out.println("Value from ArrayList is "+obj.get(i));
     }
     
	}

}
