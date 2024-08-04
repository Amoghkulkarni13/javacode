package Collection_frameowrk;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		
		//declartion
		//HashMap h=new HashMap();
	    HashMap<Integer,String>mymap=new HashMap<Integer,String>();
	    
	    mymap.put(101,"amogh");
	    mymap.put(102,"jj");
	    mymap.put(103,"amey");
	    mymap.put(104,"shubham");
	    mymap.put(102, "bob");
	    
	    System.out.println(mymap);
	    
	    System.out.println(mymap.size());//4
	    
	    mymap.remove(102);
	    System.out.println(mymap);
	    
	    //accesing the value from hashmap
	    System.out.println(mymap.get(103));
	    
	    //accesing all the key and value and all at once
	    System.out.println(mymap.keySet());
	    System.out.println(mymap.values());
	    System.out.println(mymap.entrySet());
	    
	    //retreving all the one by one value
	    
	  /*  for(int x:mymap.keySet()) {
	    	
	    	System.out.println(x + " "+ mymap.get(x));
	    	
	    	
	    }
	    */
	}

}
