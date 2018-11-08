package arrayDemo;

import java.util.ArrayList;
import java.util.List;

public class Arrexp2_Duplicate_Value {

	public static void main(String[] args) {
		
		String[] tt= {"kobir","Kolib","kasper","kobir","kolib"};
		
		    ArrayList te=new ArrayList();
		
		    for(int i=0;i<tt.length;i++)
			
		       {
			    for(int k=i+1;k<tt.length;k++)
			   {
				
				if(tt[i]==tt[k])
				{
					te.add(tt[i]);  
				}	
			}			
		}
		
		System.out.println(te);
		
		for(int c=0;c<te.size();c++)
		{
			System.out.println(te.get(c));
		}

	}

}
