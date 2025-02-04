package method.pkg;
import java.util.Scanner;

public class MethodInsert {
		
	void insert()
	{
			Scanner sc = new Scanner(System.in);
			int a[] = {10,20,30,40,50};
			
			System.out.println("Enter the insert element");
			int num = sc.nextInt();
			
			System.out.println("Enter the insert index");
			int index = sc.nextInt();
			
			for (int i = 0;i<a.length;i++)
			{
				if (i == index)
				{
					a[i] = num;
					System.out.print(a[i]+" ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
					
			}
				
		
	}
		
	public static void main(String[] arge)
	{
	MethodInsert me = new MethodInsert();
	me.insert();

	}

}
