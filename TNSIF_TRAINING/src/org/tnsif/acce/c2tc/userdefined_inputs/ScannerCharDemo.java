package org.tnsif.acce.c2tc.userdefined_inputs;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter a string");
		char c =scan.next().charAt(2);
		System.out.println("The second character is :"+c);
		scan.close();
	}

}