package fcu.iesc.oop;

import java.util.Scanner;

public class StringComparator {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a string1:");
		String str1=keyboard.next();
		System.out.println("Enter string2:");
		String str2=keyboard.next();
		if(str1.compareToIgnoreCase(str2)==0)
		{
			System.out.println("The two strings are the same.");
		}
		else
		{
			System.out.println("The two strings are not the same.");
		}
		// TODO Auto-generated method stub

	}

}
