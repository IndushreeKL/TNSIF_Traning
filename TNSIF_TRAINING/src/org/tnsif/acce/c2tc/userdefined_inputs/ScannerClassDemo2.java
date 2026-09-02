package org.tnsif.acce.c2tc.userdefined_inputs;
import java.util.Scanner;
public class ScannerClassDemo2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name=s.nextLine();
		
		System.out.println("Enter your fav teacher name: ");
		String Teachername=s.nextLine();
		
		System.out.println("Enter The age: ");
		int age= s.nextInt();
		
		System.out.println("Enter your Marks: ");
		float marks= s.nextFloat();
		
		System.out.println("Enter a string");
		char c =s.next().charAt(2);
		
		System.out.println("Are you a student");
		boolean stu=s.nextBoolean();
		
		System.out.println("Enter Adhar Number");
		long adhar=s.nextLong();
		s.nextLine();
		
		System.out.println("Enter CGPA ");
		double cgpa=s.nextDouble();
		
		System.out.println("Enter Number of siblings");
		short siblings=s.nextShort();
		
		
		
		System.out.println("The name is : "+name);
		System.out.println("The Teacher name is : "+Teachername);
		System.out.println("The Age is : "+age);
		System.out.println("The Marks is : "+marks);
		System.out.println("The second String is : "+c);
		System.out.println("Condition is : "+stu);
		System.out.println("Your adhar number is : "+adhar);
		System.out.println(" your CGPA is : "+cgpa);
		System.out.println("The number of siblings are : "+siblings);
		
		
		s.close();
	}

}