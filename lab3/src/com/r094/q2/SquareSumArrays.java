package com.r094.q2;
import java.util.Scanner;
public class SquareSumArrays {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int [10];
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter the numbers:");
			for(int j=0;j<arr.length;j++)
				arr[j] = sc.nextInt();
			System.out.println("Squares:");
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i] + "\t" + (int)Math.pow(arr[i], 2));
			int k, total = 0;
			for(k=0;k<arr.length;k++)
				total = total + arr[k];
			System.out.println("Sum: "+ total);
	}
}
