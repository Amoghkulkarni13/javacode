package Array;

public class SumofElementArray {
	
	public static void main(String args[]) {
		
	/*	1) Find Sum of Elements in Array
	a={1,2,3,4,5}
	Sum=15
	*/
		
		int a[]= {1,2,3,4,5};
	  int sum=0;
	  
	  for(int i=0;i<a.length;i++) {
		  sum=sum+a[i];
	  }
	 
	  System.out.println(sum);//15

	}

}
