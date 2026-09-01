package org.tnsif.acce.c2tc.exception_handling;

public class StringIndexOutOfBoundDemo {

	public static void main(String[] args) {
		String str="hello";
		try {
			char ch=str.charAt(5);
			System.out.println(ch);
		}catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		
		

	}

}