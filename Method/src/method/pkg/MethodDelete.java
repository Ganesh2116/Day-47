package method.pkg;

import java.util.Scanner;

public class MethodDelete {
	
	void delete()
	{
			Scanner sc = new Scanner(System.in);
			int a[] = {10,20,30,40,50};
			
			System.out.println("Enter the delete element");
			int num = sc.nextInt();
			
			for (int i = 0;i<a.length;i++)
			{
				if (num == a[i])
				{
					a[i] = -1;
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
					
			}
				
		
	}
	
	public static void main(String[] args) {
		MethodDelete md = new MethodDelete();
		md.delete();
	}

}
