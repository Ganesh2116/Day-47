package method.pkg;
import java.util.Scanner;

public class MethodFrequency {
	
	void frequency()
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5,6,7,8,9,12,3,5,5,4,6,52,1,5,5,2,3};
		
		System.out.println("Enter the element:");
		int num = sc.nextInt();
		int count = 0;
		
		for (int i=0;i<a.length;i++)
		{
			if (num == a[i])
			{
				count++;
			}
		}
		System.out.println(count+" ");
	}
	
	public static void main(String[] args) {
		MethodFrequency mf = new MethodFrequency();
		mf.frequency();
	}

}
