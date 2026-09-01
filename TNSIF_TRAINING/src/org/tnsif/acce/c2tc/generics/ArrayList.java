package org.tnsif.acce.c2tc.generics;


import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		List<Comparable> list=(List) new ArrayList();
		list.add("abc");
		boolean b = list.add(new Integer(5));
		for(Object obj : list){
			//type casting leading to ClassCastException at runtime
		    String str=(String) obj; 
		}


	}

}