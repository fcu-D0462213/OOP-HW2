package fcu.iesc.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		int x=1;
		Scanner keyboard=new Scanner(System.in);
		/*System.out.println("Enter a string1:");
		String str1=keyboard.next();
		System.out.println("Enter string2:");
		String str2=keyboard.next();*/
		while(x!=0)
		{
			System.out.println("Enter a string1:");
			String str1=keyboard.next();
			System.out.println("Enter string2:");
			String str2=keyboard.next();
			x=str1.compareToIgnoreCase(str2);
		}
		System.out.println("OVER!");
		// TODO Auto-generated method stub

	}

}
