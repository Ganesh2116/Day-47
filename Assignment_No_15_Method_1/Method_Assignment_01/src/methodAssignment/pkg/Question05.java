package methodAssignment.pkg;
/*
 Q5.Given two sorted arrays, find their union and intersection.
Example:

 Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6}
 Output: Union : {1, 2, 3, 4, 5, 6, 7}
         Intersection : {3, 5}
 */
public class Question05 {
	
	void unionIntersection()
	{
		int arr1[] = {1, 3, 4, 5, 7};
		int arr2[] = {2, 3, 5, 6};
		int arr3[] = new int[arr1.length+arr2.length];
		int x = 0;
		
		for (int i=0;i<arr1.length;i++)
		{
			arr3[x++] = arr1[i];
		}
		
		for (int i=0;i<arr2.length;i++)
		{
			arr3[x++] = arr2[i];
		}
		
		System.out.println("Intersection is :");
		for (int i=0;i<arr3.length;i++)
		{
			for (int j=i+1;j<arr3.length;j++)
			{
				if (arr3[i] == arr3[j] && arr3[i] != -1)
				{
					System.out.print(arr3[i]+" ");
					arr3[j] = -1;
				}
			}
		}
		
		System.out.println("Union array is:");
		for (int i=0;i<arr1.length;i++)
		{
			System.out.print(arr3[i]+" ");
		}
		
	}
	
	public static void main(String[] args) {
		Question05 qu = new Question05();
		qu.unionIntersection();
	}

}
