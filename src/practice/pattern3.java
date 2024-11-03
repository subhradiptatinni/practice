package practice;
// *
//***
//*****
//*******
//*********
//***********
//*********
//*******
//*****
//***
//*  
public class pattern3 {

	public static void main(String[] args) {
		System.out.println("*");
		for (int i=0;i<=9;i+=2)
		{
			for (int j=0; j<=i+2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	
	for (int k=7; k>0; k-=2)
	{
		for (int l=k+2;l>0;l--)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("*");
	}

}
