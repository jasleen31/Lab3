package com.r094.q3;
import java.util.Scanner;
public class NumbertoMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number (1 to 12) :");
		int num  = sc.nextInt();
		if (num==1)
			System.out.println("Month = January");
		else if (num==2)
			System.out.println("Month = February");
		else if (num==3)
			System.out.println("Month = March");
		else if (num==4)
			System.out.println("Month = April");
		else if (num==5)
			System.out.println("Month = May");
		else if (num==6)
			System.out.println("Month = June");
		else if (num==7)
			System.out.println("Month = July");
		else if (num==8)
			System.out.println("Month = August");
		else if (num==9)
			System.out.println("Month = September");
		else if (num==10)
			System.out.println("Month = October");
		else if (num==11)
			System.out.println("Month = November");
		else if (num==12)
			System.out.println("Month = December");
		else 
			System.out.println("Invalid number");
	}
}
