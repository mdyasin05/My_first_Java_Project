package inheritanceDemo;

public class ChieldClass extends BaseClass {

	public static void main(String[] args)
	
	{
		ChieldClass obj=new ChieldClass();
		obj.add();
		obj.sub();
		obj.mul();
		obj.div();
		obj.division();
		

	}
	public void mul()
	{
		System.out.println("this is the chieldclass and multification is 3200");
	}

	public void division()
	{
		System.out.println("this is the chieldclass and division is 25");
	}
}
