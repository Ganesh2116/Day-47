package methodAssignment.pkg;
/*
Q12.Find the majority element in the array. A majority element in an array A[] of size n is an element that appears more than n/2 times (and hence there is at most one such element).

  Examples :

  Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
  Output : 4
*/

public class Question12 {
	void majority()
	{
		int arr[] = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		
		
		for (int i=0;i<arr.length;i++)
		{
			int count = 1;
			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i] == arr[j] )
				{
					arr[j] = -1;
					count++;
				}
				
			}
			if (arr.length/2 < count && arr[i] != -1)
			{
				System.out.println("Output is :"+arr[i]+" ");
			}
		}
		
		
	}
	
	public static void main(String[] args) {
		Question12 qu = new Question12();
		qu.majority();
	}

}
