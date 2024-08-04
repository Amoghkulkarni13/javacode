package Array;

public class SingleDimensional {

	public static void main(String[] args) {
	/*	1) Declare an array
	2) add values into array
	3) Find size of an array
	4) read single value from an array
	5) read multiple values from an array
	*/
		//declartion
		int a[]=new int[5];
		
		int b[]= {1,2,3,45,};
		
		//add value into the array
		a[0]=100;
		a[1]=25;
		a[2]=36;
		a[3]=48;
		a[4]=75;
		
		//find size of array
		System.out.println(a.length);
		//read single value from the array]
		System.out.println(a[0]);
		
		//read mutiple value from thr array
		//2 method through normal for loop or enhanced for loop
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}
		
		System.out.println("------2 method -----------");
		//2 method
		for(int amogh:a) {
			System.out.println(amogh);
		}
		
		

	}

}
