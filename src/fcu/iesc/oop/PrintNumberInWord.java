package fcu.iesc.oop;

import java.util.Scanner;

public class PrintNumberInWord {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		String number;
		System.out.println("Enter a integer:");
		int num1=keyboard.nextInt();
		switch(num1)
		{
		case 1:
			number="one";
			break;
		case 2:
			number="two";
			break;
		case 3:
			number="three";
			break;
		case 4:
			number="four";
			break;
		case 5:
			number="five";
			break;
		case 6:
			number="six";
			break;
		case 7:
			number="seven";
			break;
		case 8:
			number="eught";
			break;
		case 9:
			number="nine";
			break;
		default:
			number="other";
		}
		System.out.println(number);
		// TODO Auto-generated method stub

	}

}
