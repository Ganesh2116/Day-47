package method.pkg;

import java.util.Scanner;

public class MethodSearch {
	
	void search()
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Enter search element here:");
		int num = sc.nextInt();
		
		for (int i=0;i<a.length;i++)
		{
			if (num == a[i])
			{
				System.out.print("element persent on this index :"+i);
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		MethodSearch ms = new MethodSearch();
		ms.search();
	}

}
