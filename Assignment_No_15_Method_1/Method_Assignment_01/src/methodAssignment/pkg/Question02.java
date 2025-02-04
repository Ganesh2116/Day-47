package methodAssignment.pkg;
/*
  Q2.Given an array and a number K where K is smaller than the size of the array.
  Find the K’th smallest element in the given array. Given that all array elements are distinct.

Examples:  

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3
Output: 7

  */
public class Question02 {
	
	void kElement()
	{
		int arr[] = {7, 10, 4, 3, 20, 15};
		int k = 3;
		
		for (int i=0;i<arr.length;i++)
		{
			for (int j=i+1;j<arr.length;j++)
			{
			if (arr[i] >arr[j])
			{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			}
		}
		
		for (int j=0;j<arr.length;j++)
		{
			if (j == k)
			{
				System.out.println("K’th smallest element "+arr[j]);
			}
		}
	}
	
	public static void main(String[] args) {
		Question02 qu = new Question02();
		qu.kElement();
	}

}
