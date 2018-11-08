package arrayDemo;

public class SingleArrayDemo2 {

	public static void main(String[] args) {
		
		int student_id[]=new int[5]; // be careful with the spelling 
		
		student_id[0]=90;
		student_id[1]=80;
		student_id[2]=70;
		student_id[3]=60;      
		student_id[4]=50;
	    
		
		int sizeofarray=student_id.length;
	    System.out.println("The size of array is "+sizeofarray);
		
		for(int i=0;i<sizeofarray;i++)
		{
			System.out.println("Students Id is "+student_id[i]);
		}
		
		

	}

}
