package conditionalPackage;

public class If_Else_Demo {

	public static void main(String[] args) {
        
		System.out.println("Test started");
	    String browser="chrome";
		
		if(browser.equals("chrome"))  // This is case sensitive.
		{
			System.out.println("Test cases runing on Chrome");
		}
		else
        {
        	System.out.println("Test cases runing on Firefox");
        }
        {
        	System.out.println("test ended");
        }
	}

}
