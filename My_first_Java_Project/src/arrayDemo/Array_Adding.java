package arrayDemo;

import java.util.ArrayList;

public class Array_Adding {

	public static void main(String[] args) {
		
		ArrayList aa=new ArrayList();      // Global condition
		
		aa.add(100);
		aa.add("yasin");
		aa.add(300);
		aa.add("Mohammed");
		aa.add(500);
		
		aa.remove(3);     //    To remove ===========
		System.out.println(aa.get(3));
		
		ArrayList<Integer> list=new ArrayList<Integer>(); // distinct condition
		list.add(561);
		list.add(765);
		
		System.out.println(list.get(1));
		
		ArrayList<String> name=new ArrayList<String>();  // distinct condition
		
		name.add("Yasin");
		name.add("MD");
		
		System.out.println(name.get(1));
		
		
		
		
		
		
		
	}

	
}
