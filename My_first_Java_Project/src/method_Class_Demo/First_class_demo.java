package method_Class_Demo;

public class First_class_demo {
	
	int x=70000;
	int y=85000;
	

	public static void main(String[] args) 
	
	{
		
		First_class_demo call=new First_class_demo();
		System.out.println("Momeen salary is "+call.x);
		System.out.println("shon salary is "+call.y);
		call.sum();
        call.add();
	}
	
	public void sum()
	{
		int a=70000;
		int b=85000;
		int c=a+b;
		System.out.println("The both employs salary total is "+c);
		
	}
   public void add()
   {
	    
	   String d="momeen and  ";
	   String e="shon ";
	   String f=(d+e);
	   System.out.println("Both employes are actively working "+f);
	   
	   
   }
	
	
}
