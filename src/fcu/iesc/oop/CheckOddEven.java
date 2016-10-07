package fcu.iesc.oop;

import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a integer:");
		int num1=keyboard.nextInt();
		if(num1/2==1)
		{
			System.out.print("The input integer is Even Number.");
		}
		else
		{
			System.out.print("The input integer is Odd Number.");
		}
		// TODO Auto-generated method stub

	}

}
