package arrayDemo;

import java.util.ArrayList;
import java.util.List;

public class Arrexp {

	public static void main(String[] args) {
		
		
		int[] tt= {34,56,45,34,7,56};
	
		     List te=new ArrayList();

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


      // int [] val={2,3,5};

      // if i need to print last 2, or '+' or '-'

     //  sys(val[0] + val[2]);
     //  sys(val[0]- val[2]);



