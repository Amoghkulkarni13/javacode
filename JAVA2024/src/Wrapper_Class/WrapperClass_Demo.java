package Wrapper_Class;

public class WrapperClass_Demo {

	public static void main(String[] args) {
	
		int i=10;
		double d=10.5;
		char c='A';
		boolean  b=true;
		
		//Converting primitive to object is call Autoboxing
		
		Integer iobj=i;
		Double dobj=d;
		Character cobj=c;
		Boolean bobj=b;
		
		System.out.println(iobj);
		System.out.println(dobj);
		System.out.println(cobj);
		System.out.println(bobj);
		
		//Converting object to primitive type is called unboxing
		
		int io=iobj;
		double dos=dobj;
		char co=cobj;
		boolean bo=bobj;
		System.out.println("-------------------------------------");
		System.out.println(io);
		System.out.println(dos);
		System.out.println(co);
		System.out.println(bo);
	}

}
