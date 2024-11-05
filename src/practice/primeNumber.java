package practice;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("Enter number");
		Scanner s= new Scanner(System.in);
		num= s.nextInt();
		int k=0;
		if (num==2)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
		for(int i= 1;i<num/2; i++ )
		{
			if(num%i==0)
			{
				k++;
			}
			
		}
		if (k==1)
		{
			System.out.println(num + " is a prime number");
		
		}
		else 
		{
			System.out.println(num + " is not a prime number");
		}
		}
			
	}

}
