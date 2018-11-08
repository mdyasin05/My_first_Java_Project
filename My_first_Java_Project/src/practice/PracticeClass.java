package practice;

public class PracticeClass {

	public static void main(String[] args) {
		
		
		String total="Selenium-hq-Java-Grid-UI";
		String[] name=total.split("-"); 

		for(int i=0;i <name.length;i++)
		{
			System.out.println("The value of i : "+ name[i]);
			
			if(name[i].equalsIgnoreCase("Selenium")) 
			{
				System.out.println("The test is Passed");
				break;
				
			}
			
			
			
		}
		
		
		
		
	}

}
