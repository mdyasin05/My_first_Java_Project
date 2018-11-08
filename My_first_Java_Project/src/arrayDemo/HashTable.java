package arrayDemo;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		Hashtable table=new Hashtable();
		
		table.put(1, "Mohammed");
		table.put(2, "Yasin");
		table.put(3, "Yasin Mohammed");
		
		System.out.println(table.get(2));
		
		
		Hashtable<Integer, String> tab=new Hashtable<Integer, String>();
		
		tab.put(22, "Steave");
		tab.put(33, "Marker");
		
	    System.out.println(tab.get(33));
		
        
	    Hashtable<Integer, Integer> cc=new Hashtable<Integer, Integer>();
	    
	    cc.put(12, 4355);
	    cc.put(32, 6743);
	    
	    System.out.println(cc.get(32));
	    
	    
	    
	    
	}

}
