package Array;

public class MutipleDemsional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		1) Declare an array
		2) add values into array
		3) Find size of an array
		4) read single value from an array
		5) read multiple values from an array
		*/

		//declare 
		int a[][]=new int[3][2];
		
		//add the value to array
		//a[0][0]= 30;
		//2 method declare+assign
		
		int b[][]= {{100,200},
				   {300,400},
				   {500,600}
				   };
		
		//find size of array
		
		System.out.println(b.length);
		System.out.println(b[0].length);

		//single value from the array
		System.out.println(a[0][0]);
		
		//read mutiple value from the array
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				System.out.println(b[i][j]);
			}
		}
		
		
		System.out.println("------------------------------");
		//2 method
		
		for(int arr[]:b) {
			for(int x:arr) {
				System.out.println(x);
			}
		}
		
	};

}
