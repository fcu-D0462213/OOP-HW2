package fcu.iesc.oop;

import java.util.Scanner;

public class Break {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int i;
		for(i=0;i<5;i++)
		{
			if(i>1)
			{
				break;
			}
			else
			{
				System.out.println(i);
			}
		}
		// TODO Auto-generated method stub

	}

}
