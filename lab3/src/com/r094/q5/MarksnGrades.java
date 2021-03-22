package com.r094.q5;
import java.io.IOException;
import java.util.Scanner;
public class MarksnGrades {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int n, temp;
        Scanner s = new Scanner(System.in);
        n=10;
        int a[] = new int[n];
        System.out.println("Enter the marks :");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.print(a[i] + ",");
        }
        System.out.println(a[n - 1]);
		for(int k=0;k < n;k++)
			if (a[k]<40)
				System.out.println(a[k]+"----" + "Grade: FAIL");
			else if (a[k]>=40 && a[k]<=50)
				System.out.println(a[k]+"----" + "Grade: PASS");
			else if (a[k]>=51 && a[k]<=75)
				System.out.println(a[k]+"----" + "Grade: MERIT");
			else
				System.out.println(a[k]+"----" + "Grade: DISTINCTION");
	}
}