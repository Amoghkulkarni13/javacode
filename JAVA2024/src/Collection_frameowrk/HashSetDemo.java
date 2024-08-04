package Collection_frameowrk;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
	
	public static void main(String args[]) {
	
		//few points to  hetro allowed  
		HashSet myset=new HashSet();
	//	Set myset1=new HashSet();
		//HashSet<String>myset2=new HashSet<String>();
		
		myset.add(10.2);
		myset.add("amogh");
		myset.add("java");
		myset.add('A');
		myset.add(null);
		
		//print the hashset
		System.out.println(myset);
		
		//size of hashset
		System.out.println(myset.size());
		
		//accessing the specific element not possible
		//Inserting the element not possible
		
		//remove of the element
	  // System.out.println(myset.remove("amogh"));
	   System.out.println(myset);
	   
	   //converting HashSet to ArrayList
	   ArrayList a1=new ArrayList(myset);
	    System.out.println(a1);
	    System.out.println(a1.get(2));
	    
	    
	    //reading element from the hashset
	 /*   for(Object x:myset) {
	    	System.out.println(x);
	    }
	    */
	}

}
