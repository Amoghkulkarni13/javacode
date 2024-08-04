package Exception_handling;

import java.util.Scanner;

public class Handled_exception {

	public static void main(String[] args) {
		
		System.out.println("Program is started----");
		Scanner sc= new Scanner(System.in);
		//System.out.println("enter a number:");
	/*	int num=sc.nextInt();
		
		try {
			System.out.println(100/num);
		}
		catch(Exception e) {
			System.out.println("please provide valid input");
			System.out.println(e.getMessage());
			
			
		}
	*/
		
		
		//Example 2
		
	/*	int a[]=new int[5];
		
		System.out.println("enter the positon from [0-4]: ");
		int pos=sc.nextInt();
		
		System.out.println("enter the value: ");
		int value=sc.nextInt();
		
		
		try {
			a[pos]=value;
		
		System.out.println(a[pos]);
		}
		catch(Exception e){
			System.out.println("bhai andher raha kya bahar jara hai");
			System.out.println(e.getMessage());
			
		}
		*/
		
		//Example 3
		/*String s="welcome";
		
		try {
			int num=Integer.parseInt(s);
			System.out.println(num);
		}
		catch(Exception e) {
			System.out.println("please provide valid to convert to int");
			System.out.println(e.getMessage());
			
		}
		*/
		
		//Exampl 4
		String s=null;
		try {
		System.out.println(s.length());
		}
		catch(Exception e){
			System.out.println("do not intialize has null ");
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("program is endedd---=--=-");
	}

}
