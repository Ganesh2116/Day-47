package methodAssignment.pkg;
/*
Q8.Given three arrays sorted in non-decreasing order, print all common elements in these arrays.

Examples:

 Input:
ar1[] = {1, 5, 10, 20, 40, 80}
ar2[] = {6, 7, 20, 80, 100}
ar3[] = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20, 80
*/
public class Question08 {
	
	void sameEle()
	{
		int ar1[] = {1, 5, 10, 20, 40, 80};
		int ar2[] = {6, 7, 20, 80, 100};
		int ar3[] = {3, 4, 15, 20, 30, 70, 80, 120};
		
		System.out.println("same elements in 3 array :");
		for (int i=0;i<ar1.length;i++)
		{
			for (int j=0;j<ar2.length;j++)
			{
				for (int k=0;k<ar3.length;k++)
				{
					if ((ar1[i] == ar2[j]) && (ar3[k] == ar2[j] ))
					{
						System.out.print(ar1[i]+" ");
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		Question08 qu = new Question08();
		qu.sameEle();
	}
	

}
