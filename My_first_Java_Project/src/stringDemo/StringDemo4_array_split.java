package stringDemo;

public class StringDemo4_array_split {

	public static void main(String[] args) {
		
		String fulname="selenium-Hp-Qtp-Grid-UI";
		String []toolname=fulname.split("-");  //   Split with array. why do i have to declare
		                                       // int i? otherwise its not printing any value.
		                              
		int i;  
		for(i=0;i<toolname.length;i++)
		{
			System.out.println("value for "+i+" is "+toolname[i]);
		
			if(toolname[i].equalsIgnoreCase("selenium"))
			{	
				System.out.println("Test passed");
				break;
			}
			
		}
		
   
	}

}

