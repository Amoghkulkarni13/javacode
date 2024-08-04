package Collection_frameowrk;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.List;

public class ArrayListDemo {
	
	public static void main(String args[]) {
		
		
		//Declartion of ArrayList there are many way through which we can declare
		ArrayList mylist=new ArrayList();
		//List mylist=new ArrayList();
		//ArrayList<String>mylist=new ArrayList<String>();// these <> denote that we can store only string type of input
		
		
		//Adding data into arraylist
		mylist.add("amogh");
		mylist.add(123);
		mylist.add(10.5);
		mylist.add(123);
		mylist.add(null);
		mylist.add(null);
		
		//size of arraylist
		//System.out.println("size of an arraylist: "+ mylist.size());//6
		
		//printing the arraylist
		System.out.println("arraylist contain:" +mylist);//[amogh, 123, 10.5, 123, null, null]
		
		//remove an element from arraylist
		mylist.remove(3);
		System.out.println("arraylist contain:" +mylist);//[amogh, 123, 10.5, null, null]
		
		
	    //modify/replace/change in arraylist
		mylist.set(3, 2.5);
		System.out.println("arraylist contain:" +mylist);//[amogh, 123, 10.5, 2.5, null]
		
		//inserting the element in arraylist
		mylist.add(4,null);
		System.out.println("arraylist contain:" +mylist);//[amogh, 123, 10.5, 2.5, null, null]
		
		
		//Accessing the element 
		
		System.out.println(mylist.get(3));//2.5
		
		//Reading all element from the arraylist
	/*	for(int i=0;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		*/
		
		/*for( Object x:mylist) {
			System.out.println(x);
		}
	*/
		//Third method using iterator method
/*	Iterator it=mylist.iterator();
	
	while(it.hasNext()) {
		
		System.out.println(it.next());
	}
	*/
	
		//arraylist is present or not 
		
	System.out.println(mylist.isEmpty());//false
	
	
	//Remove more than 1 element
	ArrayList mylist1=new ArrayList();
	mylist1.add(null);
	mylist1.add(null);
	
	mylist.removeAll(mylist1);
	System.out.println("arraylist contain:" +mylist);
	
	//remove all element or clear
	//mylist.clear();
	
	
		
	}

}
