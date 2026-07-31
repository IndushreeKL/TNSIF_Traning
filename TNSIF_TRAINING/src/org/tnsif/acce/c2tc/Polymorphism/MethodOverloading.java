package org.tnsif.acce.c2tc.Polymorphism;

class add{
	
	void add(int a , int b) {
	System.out.println("add two numbers:"+ (a+b));
}
	void add(int a,double b,int c) {
	System.out.println("add three numbers:"+ (a+b+c));
	}
}

public class MethodOverloading {

	public static void main(String[] args) {
		add obj=new add();
		obj.add(1, 2);
		obj.add(1, 5.1,3);
		
	}
}
