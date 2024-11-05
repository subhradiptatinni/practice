package practice;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int [5];
		int largest;
		Scanner s= new Scanner (System.in);
		System.out.println("Enter numbers");
		for (int i=0;i<a.length;i++)
		{
			a[i]= s.nextInt();
		}
		largest= a[0];
		for (int i=0;i<a.length-1;i++)
		{
			
			if(largest<a[i+1])
			{
				largest= a[i+1];
			}
			
		}
		System.out.print("Largest number is " +largest);

	}

}
