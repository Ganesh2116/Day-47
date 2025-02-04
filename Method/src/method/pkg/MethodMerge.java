package method.pkg;

public class MethodMerge {
		
	void merge()
	{
		int a[] = {1,2,3,4,5,6};
		int b[] = {7,8,9};
		int c[] = new int[a.length+b.length];
		
		for (int i=0;i<a.length;i++)
		{
			c[i] = a[i];
		}
		
		for (int i=0;i<b.length;i++)
		{
			c[a.length+i] = b[i];
		}
		
		for (int i=0;i<c.length;i++)
		{
			System.out.print (c[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		
			MethodMerge mm = new MethodMerge();
			mm.merge();
	}
}
