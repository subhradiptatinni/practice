package practice;

import java.util.ArrayList;

public class duplicateNumber {

	public static void main(String[] args) {
		
		duplicateNumber dn= new duplicateNumber();
		dn.duplicate();

	}

	public void duplicate()
	{
	 int [] a= {1,2,3,2,4,3,5,2,6,7};
	 
	 ArrayList al= new ArrayList();
	 for (int i=0;i<=a.length-1;i++)
	 {
		int var= a[i];
		int k=1;
		while (!al.contains(a[i])) 
		{
			al.add(a[i]);
			
			for (int j=i+1; j<=a.length-1;j++)
			{
				 int var1= a[j];
				if (var == var1)
				{
				k++;
			}
			}
		System.out.println(a[i]+ " Present "+k+ " times" );
	 }
		
	 }
	}
}
