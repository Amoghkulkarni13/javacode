package Wrapper_Class;

public class DataConversion_Demo {

	public static void main(String[] args) {
	
		//String--int,dobule,char,boolean-not possible
		
		//String-int
		//String s="welcome";
		
		/*String s1="10";
		String s2="20";
		
	int sum=	Integer.parseInt(s1)+Integer.parseInt(s2);
	System.out.println(sum);
	*/
		
		//String-double
		String s3="10.5";
		String s4="11.5";
		
		double add=Double.parseDouble(s3)+Double.parseDouble(s4);
		System.out.println(add);
				
		//String -to char not possible
		
		String s="true";
		boolean b=Boolean.parseBoolean(s);
		
		//int,double,boolean,char----String
		
		int i=10;
		String svalue=String.valueOf(i);
		
		char c='A';
		String cvalue=String.valueOf(c);
		
		double d=10.5;
		String dvalue=String.valueOf(d);
		
		boolean b1=false;
		String bvlaue=String.valueOf(b);

	}

}
