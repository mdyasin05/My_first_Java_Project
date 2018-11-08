package stringDemo;

public class StringDemo1 {

	public static void main(String[] args) {

		String name = "selenium webdriver";
		boolean status = name.startsWith("selenium");
		System.out.println("status is " + status);

		String name2 = "welcome selenium world";
		boolean status2 = name2.endsWith("qtp");
		System.out.println("new status is " + status2);

	}

}
