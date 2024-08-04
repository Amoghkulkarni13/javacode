package Array;

public class Even_Odd_Array {

	public static void main(String[] args) {
		/*
2) Print Even and Odd numbers  from array.
a={1,2,3,4,5,6}
Even= 3
Odd=3
*/
		
		int a[]= {1,2,3,4,5,6};
		
	/*	int even=0;
		int odd=0;
		for(int i=0;i<a.length;i++) {
			
			if(a[i]%2==0) {
				even++;
				
			}
			else {
				odd++;
				
			}
		}
		System.out.println(even);
		System.out.println(odd);
		
	*/
		
		//using enhanced loop
		int even=0;
		int odd=0;
		for(int x:a) {
			if(x%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
