package day4;

import java.util.Scanner;

public class Reverse_no {
	
	public static void main (String args[]) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int a=	sc.nextInt();
//        int r=0;
//	
//	while(a!=0) {
//   r= r*10+a%10;
//
//	a=a/10;
//		
//	}
//    System.out.println(r);
	
	
		
		//2nd methoud
    
//    StringBuffer sb=new StringBuffer(String.valueOf(a));
//    StringBuffer reverse_no=sb.reverse();
//    
//    System.out.println(reverse_no);
		
		//3rd method using StringBuilder
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(a);
		sb1.reverse();
		
		System.out.println(sb1);

	}

}


