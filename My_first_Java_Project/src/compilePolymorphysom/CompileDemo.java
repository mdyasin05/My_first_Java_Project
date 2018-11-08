package compilePolymorphysom;

public class CompileDemo {

	public static void main(String[] args) {
	    
		CompileDemo obj=new CompileDemo();  // What is constractor overloading in Java??
		obj.add(45, 76);
		obj.add(45, 73, 59);
		obj.add(23.22, 34.29);
		
	}

	public void add(int a, int b)  // number of arguments are same 
	{
		int c=a+b;
		System.out.println("Teh value of c is "+c);  
	}
	
	public void add(int a, int b,int c) 
	{
	    int d=a+b;
	    System.out.println("The value of d is "+d);
	
	}
	public void add(double a, double b)   // type of arguments different
	{
		double c=a+b;
		System.out.println("Teh value of c is "+c);
	}
	
	public void add(double a, int b)
	{
		double c=a+b;
		System.out.println("Teh value of c is "+c);
	}
	
	public void add(int a,double b)
	{
		double c=a+b;
		System.out.println("Teh value of c is "+c);
	}
	
}
