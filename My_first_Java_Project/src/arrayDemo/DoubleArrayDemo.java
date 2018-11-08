
package arrayDemo;

public class DoubleArrayDemo {

	public static void main(String[] args) {
		
		
		String studentname[][]=new String[2][2];
		
		studentname[0][0]="james";
		studentname[0][1]="strong";
		studentname[1][0]="akram";
		studentname[1][1]="ahsan";
		
		System.out.println(studentname[1][0]);
		System.out.println(studentname[1][1]);
		
		int fullname=studentname.length;
		
		System.out.println(fullname);
		
	
//	int student_id[][]=new int[2][2];
//	
//	student_id[0][0]=12;
//	student_id[0][1]=24;
//	student_id[1][0]=36;
//	student_id[1][1]=48;
//		
//    System.out.println(student_id[0][1]);
		

	}

}
