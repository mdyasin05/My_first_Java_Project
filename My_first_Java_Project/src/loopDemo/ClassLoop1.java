package loopDemo;

public class ClassLoop1 {

	public static void main(String[] args) {
	
		
		System.out.println("Loop started");
		
		//for(int i=1;i<=20;i++)
		for(int i=1;i<=20;i=i+2)
		{
			System.out.println("I values are" +i);
		}
		
        System.out.println("Loop Ended");
	}
}