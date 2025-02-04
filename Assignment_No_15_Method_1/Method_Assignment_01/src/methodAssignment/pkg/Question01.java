package methodAssignment.pkg;

/*
 Q1.Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors.

 Note: For corner elements, we need to consider only one neighbor.

  Example:
 Input: array[]= {5, 10, 20, 15}
 Output: 20
  
 */

public class Question01 {
	
	void peak()
	{
		int a[] = {5,10,20,15};
		int pe = 0;
		for (int i=1;i<a.length;i++)
		{
			if (pe<a[i])
			{
				pe = a[i];
			}
		}
		
		System.out.print("Peak Elements is in array : "+pe);
		
	}
	
	public static void main(String[] args) {
		
		Question01 ue = new Question01();
		ue.peak();
		
	}

}
