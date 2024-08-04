package String;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {

	//object type of array can store any type of data
	/*	Object obj[]=new Object[5];
		obj[0]="amogh";
		obj[1]=10;
		obj[2]=10.5;
		obj[3]='A';
		obj[4]=true;
		
		System.out.println(Arrays.toString(obj));
		*/
		
		//declartion of string
		String s="amogh";
		//String s=new String("amogh");
		
		//using length method
		System.out.println(s.length());
		
		//concat method
		String s1="willbe";
		String s2="goodboy";
		
		System.out.println(s.concat("be"));
		
		System.out.println(s.concat(s1).concat(s2));
		
		//trim() method 
		s="   amogh     ";
		System.out.println(s.length());
		
		System.out.println(s.trim().length());
		
		//charAt() method
		s="amogh";
		System.out.println(s.charAt(4));//h
		
		//contains() mehod
		
		System.out.println(s.contains("amog"));//true
		System.out.println(s.contains("gh"));//true;
		System.out.println(s.contains("amohg"));//false
		
		//replace method
	
		System.out.println(s.replace('g', 'k'));
		System.out.println(s.replace("am", "as"));
		
		//equls() equalsIgnoreCase() method
		s1="Amogh";
		
	 System.out.println(s==s1);//false
	 System.out.println(s.equals(s1));//false
	 System.out.println(s.equalsIgnoreCase(s1));//true
	 
	 //spilit method
	 
	 s="abc@xyz";
	String a[]=s.split("@");
	System.out.println(a[0]);//abc
	System.out.println(a[1]);//xyz
	
	//Ex2
	s="amogh@gmail.com";
	String a1[]=s.split("@");
	System.out.println(a1[0]);
	System.out.println(a1[1]);
	
	
	s="$12,54,23";//output 125423
	System.out.println(s.replace("$", "").replace(",", ""));
	
	
	//Ex4
	s="abc,123@xyz";       // output abc , 123, xyz
	
	String a2[]=s.split(",");
	System.out.println(a2[0]);//abc
	System.out.println(a2[1]);//123@xyz
	
	String a3[]=a2[1].split("@");
	System.out.println(Arrays.toString(a3));
	 
		
	}

}
