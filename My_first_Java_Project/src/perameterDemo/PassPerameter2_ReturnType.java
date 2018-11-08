package perameterDemo;

public class PassPerameter2_ReturnType {

	public static void main(String[] args) {
		
		PassPerameter2_ReturnType obj=new PassPerameter2_ReturnType();
		
		int sub=obj.add(38, 33);
		System.out.println("the int value is "+sub);
		
		double nop=obj.sum(29.67, 65.34);
        System.out.println("The double value is "+nop);
        
        
	}
	public int add(int a, int b)
	{
		int c=a+b;
		return c;
	}
	public double sum(double x, double y)
	{
		double z=x+y;
		return z;
	}

}
