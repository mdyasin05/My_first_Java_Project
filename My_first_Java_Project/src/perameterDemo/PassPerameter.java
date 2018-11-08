package perameterDemo;

public class PassPerameter {

	public static void main(String[] args)
	
	{
		PassPerameter obj=new PassPerameter();
		obj.sub(20.34, 19.55);
		obj.sum(28, 52);
		String aa=obj.ask("shakib ", "hasan");
		System.out.println("The value of aa "+aa);
		
		
	}
	
	public String ask(String a, String b)
	{
		String Fullname=a+b;
		return Fullname;
	}
	
	
      public void sum(int x, int y)
      {
    	  int z=x+y;
    	  System.out.println("The value is "+z);
    	  
      }
      public void sub(double a, double b)
      {
    	  double result=a+b;
    	  System.out.println("The result is "+result);
      }
}
