package fcu.iesc.oop;

import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num1=keyboard.nextInt();
		System.out.println("Enter a float point number:");
		float num2=keyboard.nextFloat();
		System.out.println("Enter a you name:");
		String name=keyboard.next();
		System.out.printf("Hi %s,the mutiplication of %d and %.5f is %4.2e",name,num1,num2,num1*num2,num1);
		// TODO Auto-generated method stub

	}

}
