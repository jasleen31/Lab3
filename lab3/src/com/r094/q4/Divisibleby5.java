package com.r094.q4;

public class Divisibleby5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum=0;
		System.out.println("Numbers between 40 and 250, divisible by 5");
		for(i=39;i<250;i++)
			if(i%5==0) {
				System.out.println(i);
				sum+= i;
			}
		System.out.println("Sum of the numbers divisible by 5 b/w 40 and 250 is:" + sum);

	}

}
