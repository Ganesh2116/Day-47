package method.pkg;

public class MethodSort {
	
	void sort()
	{
		int a[] = {1,2,3,4,58,465,42,1,2,3,5};
		
		for (int i=1;i<a.length;i++)
		{
			for (int j=i+1;j<a.length;j++)
			{
				if (a[i]>a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
			
		}
			
		for (int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		MethodSort ms = new MethodSort();
		ms.sort();
	}
}
