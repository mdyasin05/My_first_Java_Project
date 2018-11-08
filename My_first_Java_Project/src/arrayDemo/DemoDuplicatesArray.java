package arrayDemo;

public class DemoDuplicatesArray {

	public static void main(String[] args) {
		
		int names[]= {3,4,5,3,4,12,23,2222,34,23};
		int ram;
		for(int i=0;i<names.length;i++) {
			
			for(int j=i+1;j<names.length;j++) {
				
				if(names[i]==(names[j])) {
					
					System.out.println("Duplicates values are :: " +  names[i]);
				}
			
		}
		
		
		}
	}
}


