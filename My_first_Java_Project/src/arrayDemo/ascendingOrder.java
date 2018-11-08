package arrayDemo;

import java.util.Arrays;
import java.util.Collections;

public class ascendingOrder {

	public static void main(String[] args) {
		
		String str[]= {"B","D","C","A"};
		
		for(String string:str)
		{
			System.out.println(string);
		}
		
          Arrays.sort(str);    // Ascending Orders
          
          System.out.println("After shorting   ============="); 
          
          for(String string:str)
  		{
  			System.out.println(string);
  			
  		}
          
          Arrays.sort(str,Collections.reverseOrder());  // Descending Orders
          
          
          System.out.println("Orer Descending =================");
          
          for(String string:str)
  		{
  			System.out.println(string);
  		}
	}

}
