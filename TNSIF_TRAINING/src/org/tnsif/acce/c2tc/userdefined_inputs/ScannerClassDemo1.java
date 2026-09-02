package org.tnsif.acce.c2tc.userdefined_inputs;
import java.util.Scanner;

public class ScannerClassDemo1 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		System.out.println("Name of the user: "+name);
		System.out.println("Age of the user: "+age);
		scan.close();
		
		

	}

}