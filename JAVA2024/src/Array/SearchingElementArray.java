package Array;

import java.util.Scanner;

public class SearchingElementArray {

	public static void main(String[] args) {
	
		int a[]= {10,20,30,40,50};
		
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
	    int key_search=  sc.nextInt();
	    boolean condition=false;
	    
	    for(int i=0;i<a.length;i++) {
	    	if(key_search==a[i]) {
	    		System.out.println("element found");
	    		condition=true;
	    		break;
	    		
	    	}
	    	
	    }
		if(condition==false) {
    		System.out.println("element not found");
    	
	    }
	     

	}

}
