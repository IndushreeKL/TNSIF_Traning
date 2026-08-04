package org.tnsif.acce.c2tc.scannerclass.bufferreader;
import java.util.Scanner;
public class ScannerCharDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter a String");
		char c = scan.next().charAt(2);
		System.out.println("The second char is: "+c);
		scan.close();

	}

}
