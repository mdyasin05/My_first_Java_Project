package conditionalPackage;

public class If_Else_If_Demo {

	public static void main(String[] args) {
        
		System.out.println("Test started");
        
		String browser="IE";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test in runing on Chrome");
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test is runing on Firefox");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("Test is runing on IE");
		}
		else
		{
			System.out.println("Please provide the currect Browser");
		}
        {
        	System.out.println("test ended");
        }
	}

}
