package practice;

import java.util.Scanner;

public class palindrom {
	String value;
	String temp= "";
	public static void main (String args[])
	{
		palindrom p= new palindrom();
		p.data();
	}

	public void data() {
		System.out.println ("Enter word");
		Scanner s= new Scanner(System.in);
		value= s.next();
		for (int i= value.length()-1;i>=0;i--)
		{
			temp= temp+value.charAt(i);
			
		}
		System.out.println (temp);
		if (temp.equals(value)==true)
			{
				System.out.println ("Palindrom");
			}
		else 
		{
			System.out.println ("Not a Palindrom");
		}
	}
}
