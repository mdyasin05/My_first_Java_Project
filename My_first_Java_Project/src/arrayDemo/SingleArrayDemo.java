package arrayDemo;

import java.util.Arrays;

public class SingleArrayDemo {

	public static void main(String[] args) {
		
		int student_id[]=new int[5]; // be careful with the spelling 
		
		student_id[0]=90;
		student_id[1]=80;
		student_id[2]=70;
		student_id[3]=60;      
		student_id[4]=50;
		
		
		System.out.println("Student id is "+student_id[2]);
	    System.out.println(Arrays.toString(student_id));
		
		for(int i=0;i<student_id.length;i++)
		{
			System.out.println("The students id is "+student_id[i]);
		}
		
		        // limitation of array.
		        // limitation of size.
		
		
		

	}

}