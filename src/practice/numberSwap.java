package practice;

import java.util.Scanner;

public class numberSwap {
	
	public void swap()
	{
		Scanner s= new Scanner(System.in); // Scanner class for taking user input
		System.out.println("Enter 1st number");
		int a = s.nextInt(); 
		System.out.println("Enter 2nd number");
		int b = s.nextInt();
		int c= a; //Store value of a in c
		    a=b; //Store value of b in a
		    b=c; //Store value of c in b
		System.out.println("After swap : First number= " +a +" Second number= " +b);
		
	}

	public static void main(String[] args) {
		
		
		numberSwap ns= new numberSwap ();	// Creating object
		ns.swap(); //Calling method
		

	}

}
