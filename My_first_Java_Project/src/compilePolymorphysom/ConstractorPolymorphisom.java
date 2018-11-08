package compilePolymorphysom;

public class ConstractorPolymorphisom

    {	
	   int num1;
	   int num2;
	   String operation;
	
	public ConstractorPolymorphisom()
	
	{
		num1=5;                            // This one is called default constructor.
		num2=10;
		System.out.println("In constructor");
		
	}
   public ConstractorPolymorphisom(int n)
	
	{
		num1=n;                          // This is called  peramiteriged constructor.  
		num2=n;
		System.out.println("The number is ");
		
	}
	public ConstractorPolymorphisom(double a,int b) // we cant't have return type on constructor.
	
	{
		num1=(int)a;                    // This is called  perameteriged constructor. 
		num2=b;
		System.out.println("The constructor is ");
		
	}
     
                   	//constructor has to be same as Class name.
	                //does not return value.
	               //will be called automatically when the object created.
	               // based on the input on the object it will execute.
	
	
	public static void main(String[] args)
	{
		ConstractorPolymorphisom obj=new ConstractorPolymorphisom(7.33,65);// declaration point
	 
	    System.out.println(obj.num1); // it will execute based on the declaration.
	    System.out.println(obj.num2);
	    
	}

}

