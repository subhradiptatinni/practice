package practice;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter 1st word");
		String a= s.nextLine();
		System.out.println("Enter 2nd word");
		String b= s.nextLine();
		char[] a1= a.toCharArray();
		char[] b1= b.toCharArray();
		Arrays.sort(a1);
		Arrays.sort(b1);
		boolean result= Arrays.equals(a1, b1);
		if (result==true)
		{
			System.out.println("Both are anagram");
		}
		else
		{
			System.out.println("Both are not anagram");
		}
		}
		
		

	}


