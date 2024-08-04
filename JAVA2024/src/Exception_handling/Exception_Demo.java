package Exception_handling;

import java.util.Scanner;

public class Exception_Demo {

	public static void main(String[] args) {
		
	System.out.println("Program is started----");
	Scanner sc= new Scanner(System.in);
	
	//Example 1
	/*System.out.println("enter a number:");
	
	int num=sc.nextInt();
	
	System.out.println(100/num);//Arithmetic exception
	
	*/
	
	//Example 2
	
	/*int a[]=new int[5];
	
	System.out.println("enter the positon from [0-4]: ");
	int pos=sc.nextInt();
	
	System.out.println("enter the value: ");
	int value=sc.nextInt();
	
	a[pos]=value;
	
	System.out.println(a[pos]);//ArrayIndexOutofBOundException
	
	
	
*/
	
	//Example 3
/*	String s="welcome";
	int num=Integer.parseInt(s);
	System.out.println(num);//numberfromatexception
	*/
	
	//Example 4
	
	String s=null;
	System.out.println(s.length());//NullPointerException
	
	
	System.out.println("program is ended");
	}

}
