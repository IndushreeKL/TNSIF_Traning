package org.tnsif.acce.c2tc.marker_interface;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		Registerable s=new Student(12,"bhagya",20000,"Java Programming");
		Registerable s1=new Student(01,"Samruthi",120000,"not yet");
		Registerable s2=new Student(22,"Shreya.Pawar",340000,"Iot");
		Registerable s3=new Student(12,"Pooja",32000,"Python Programming");
		Object obj=new Object();
		if(obj instanceof Registerable) {
			System.out.println("students is registered for this course");
		}else {
			System.out.println("students is not registered for this course");
		}
	}

}