package org.tnsif.acce.c2tc.oops;

class Human{
	//variables
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		Human obj=new Human();
		obj.setName("Mili");
		obj.setAge(20);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
		obj.setName("Sihi");
		obj.setAge(23);
		System.out.println(obj.getName());
		System.out.println(obj.getAge());
		
	}

}
