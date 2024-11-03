package practice;

import java.util.ArrayList;

public class DuplicateAndDelete {

	public static void main(String[] args) {
		ArrayList <String> a= new ArrayList();
		a.add("apple");
		a.add("banana");
		a.add("apple");
		a.add("Orange");
		a.add("grapes");
		System.out.println("New list is ");
		for (int i=0;i<=a.size()-1;i++)
		{
			String temp= a.get(i);
			for (int j=i+1;j<=a.size()-1;j++)
			{
				String temp1= a.get(j);
				if (temp.equals(temp1))
				{
					a.remove(temp);
				}
				
			}
			System.out.println(a.get(i)+ " index " + i);
		}
		

	}

}
