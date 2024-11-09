package practice;

import java.util.Scanner;

public class factorialCalculation {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter number");
		Scanner s= new Scanner (System.in);
		int num= s.nextInt();
		int fact=1;
		for(int j= 1; j<= num;j++)
		{
			fact= fact* j;
		}
		
		System.out.println("Factorial is = " + fact);
	 }

}
