package day2;

public class Assignment_Ternary_Operator_Demo {
	
	public static void main(String args[]) {
		
		
		int a=10;
		
		System.out.println(a+=5);//15
		System.out.println(a-=5);//10
		System.out.println(a/=5);//2
		System.out.println(a*=5);//10
		System.out.println(a%=5);//0
		
		
//		Ternary operator sysntax
		
		//var=exp?res1:res2
		
		
		int person_age=18;
		
		String vote=(person_age>=18)?"Eligible":"Not eligible";
		
		System.out.println(vote);
		
		int x=(1==1)?100:200;
		System.out.println(x);
	}

}
