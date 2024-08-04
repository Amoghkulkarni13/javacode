package day2;

public class Swappingtwono {
	public static void main(String args[]) {
		
		
		//approch using temp variable
		
		int a=10;
		int b=20;
		
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println(a+" "+b);
//		
		
		//approch 2 without using temp
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println(a+" "+b);
	}

}
