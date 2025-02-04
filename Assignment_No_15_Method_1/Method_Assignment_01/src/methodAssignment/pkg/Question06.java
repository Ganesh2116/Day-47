package methodAssignment.pkg;

/*
 Q6.Given an array, cyclically rotate the array clockwise by one.

Examples:  

Input:  arr[] = {1, 2, 3, 4, 5}
Output: arr[] = {5, 1, 2, 3, 4}
 */

public class Question06 {
	
	void rotation()
	{
		int arr[] = {1, 2, 3, 4, 5};
		
		
		int temp = arr[arr.length-1];
		for (int i=arr.length-1;i>0;i--)
		{
			int dtemp = arr[i];
			arr[i] = arr[i-1];
			arr[i-1] = dtemp;
		}
		arr[0]= temp ;
		
		System.out.println("Output array is :");
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
		
	
	public static void main(String[] args) {
		Question06 qu = new Question06();
		qu.rotation();
	}

}
