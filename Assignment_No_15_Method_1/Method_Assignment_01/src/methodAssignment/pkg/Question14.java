package methodAssignment.pkg;

/*
 Q14.Write a Java program to find maximum product of two integers in a given array of integers.

 Example:
 Input :
 nums = { 2, 3, 5, 7, -7, 5, 8, -5 }
 Output:
 Pair is (7, 8), Maximum Product: 56
*/

public class Question14 {
	
	void maxproduct()
	{
		int arr[] = { 2, 3, 5, 7, -7, 5, 8, -5 };
		
		for (int i = 0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] <arr[j])
				{
					int temp  = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Maxmum product is:"+(arr[0]*arr[1]));
	}
	
	public static void main(String[] args) {
		Question14 qu = new Question14();
		qu.maxproduct();
	}

}
