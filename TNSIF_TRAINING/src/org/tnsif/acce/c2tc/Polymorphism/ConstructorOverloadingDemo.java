package org.tnsif.acce.c2tc.Polymorphism;

class Student
{
	String name;
	int age;
	
	Student()
	{
		System.out.println("Default constructor");
	}
	Student(String name)
	{
		this.name=name;
		System.out.println("Name "+name);
	}
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+ name +"Age "+age);	 
	}	
}
public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student("Mili");
		Student student3 = new Student("Mili",21);
		
		}
		  
	}
