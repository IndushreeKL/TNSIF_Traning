package org.tnsif.acce.c2tc.scannerclass.bufferreader;
import java.util.Scanner;
public class ScannerClassDemo2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		System.out.println("Enter your age");
		int age = scan.nextInt();
		
		System.out.println("Enter your marks");
		float marks=scan.nextFloat();
		
		System.out.println("Enter a string");
		char c=scan.next().charAt(1);
		
		System.out.println("Are you a Student");
		boolean stu=scan.nextBoolean();
		
		System.out.println("Name of the User: "+name);
		System.out.println("age of the User: "+age);
		System.out.println("marks of the User: "+marks);
		System.out.println("The second char is: "+c);
		System.out.println("Condition is : "+stu);
		

	}

}
