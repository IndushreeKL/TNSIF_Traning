package org.tnsif.acce.c2tc.scannerclass.bufferreader;

import java.util.Scanner;

public class AdvancedScannermethod {

	public static void main(String[] args) {
		

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter any value: ");

		        if (sc.hasNext()) {
		            System.out.println("Input is available.");

		            if (sc.hasNextInt()) {
		                int num = sc.nextInt();
		                System.out.println("You entered an integer: " + num);
		            } else {
		                String str = sc.next();
		                System.out.println("You entered a string: " + str);
		            }
		        } else {
		            System.out.println("No input available.");
		        }

		        sc.close();
		    }

}
