package com.r094.q1;
import java.io.IOException;

import java.util.Scanner;

public class PossibleCombinations {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Input first number: ");
        int a = sc.nextInt();
        System.out.print("Input second number: ");
        int b = sc.nextInt();
        System.out.print("Input third number: ");
        int c = sc.nextInt();
        int arr[] = {a,b,c};
        for (int x = 0; x < 3; x++) {
        	for (int y = 0; y < 3; y++) {
        	    for (int z = 0; z < 3; z++) {
        	    	if (x != y && y != z && z != x) {
        	    		System.out.println(arr[x] + "" + arr[y] + "" + arr[z]);
        	    	}
        	    }
        	}
        }
	}
}
