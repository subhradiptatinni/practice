package practice;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		SimpleInterest si= new SimpleInterest();
		System.out.print(si.CalculateInterest());

	}
	
	public double CalculateInterest()
	{
	 	Scanner s= new Scanner(System.in);
	 	System.out.print("Enter principal ");
	 	int pri= s.nextInt();
	 	System.out.print("Enter rate ");
	 	int rate= s.nextInt();
	 	System.out.print("Enter time ");
	 	int time= s.nextInt();
	 	double interest= pri*rate*time*0.01;
	 	return interest;
	}

}
