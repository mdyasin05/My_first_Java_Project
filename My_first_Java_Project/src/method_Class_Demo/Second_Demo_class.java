package method_Class_Demo;

public class Second_Demo_class {
	

	public static void main(String[] args) {
		Example_demo add1=new Example_demo();
		First_class_demo adopt=new First_class_demo();
        add1.sub();
        add1.sum();    // static method can call directly by calling the class name directly
        adopt.sum();   // non static method call be called through object.
        adopt.add();
        
		
        System.out.println("The first name is "+add1.a);
        System.out.println("The second name is "+add1.b);
        System.out.println("the name value is "+adopt.x);
        System.out.println("the second name value is "+adopt.y);
		
	}

}
