package org.tnsif.acce.c2tc.markerinterface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		registerable s=new Student(12,"Sushma",20000,"Java Programming");
		registerable s1=new Student(13,"Anil",30000,"Java Programming");
		
		Object obj=new Object();
		
		if(obj instanceof registerable)
		{
			System.out.println("Student is registered for this course");
			
		}
		else
		{
			System.out.println("Student is not registered for this course");
		}
		

	}

}