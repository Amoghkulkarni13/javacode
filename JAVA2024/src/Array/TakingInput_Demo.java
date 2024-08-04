package Array;

import java.util.Scanner;

public class TakingInput_Demo {
	public static void main(String args[]) {
		
		
		Scanner s= new Scanner( System.in);
		
		System.out.println("enter the number");
	int s1=	s.nextInt();
		
	 int s2=s.nextInt();
	 
	 System.out.println(s1+s2);
	 
	 //Decimal
	 
	 int d=(int)s.nextDouble();
	 System.out.println(d);
	 
	 //String
	 
	 String sd=s.next();
	 System.out.println(sd);
	}

}
