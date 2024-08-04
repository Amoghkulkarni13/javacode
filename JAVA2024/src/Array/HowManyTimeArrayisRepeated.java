package Array;

import java.util.Scanner;

public class HowManyTimeArrayisRepeated {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,40,60,60};
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		int count=0;
		
		for(int x:a) {
			if(number==x) {
				
				count++;
			}
		}
System.out.println(count);
	}

}
