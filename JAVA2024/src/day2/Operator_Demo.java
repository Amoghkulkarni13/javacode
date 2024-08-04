package day2;

public class Operator_Demo {

	public static void main(String[] args) {

	//Arithmetic operator =,-,*,/,%
		
		int a=10, b=20;
		
		System.out.println("the add of two number "+(a+b));
		System.out.println("the  diff of two number "+(a-b));
		System.out.println("the divide of two number "+(a/b));
		System.out.println("the remainder of two number "+(a%b));
		System.out.println("the mutlti of two number "+(a*b));
		
		//Relational /comparsion operator  ,>,>=,<=,!=,==
		//these will return boolean value true or false
		
		System.out.println(a>b);//false
		System.out.println(a>=b);//false
		System.out.println(a<=b);//true
		System.out.println(a!=b);//true
		System.out.println(a==b);//false
		
		
		//logical operator || && !
		
		boolean b1=20>10;//true
		boolean b2=10<20;//true
		
		
		System.out.println(b1||b2);//true
		System.out.println(b1&&b2);//true
		System.out.println(!b1);//false
		System.out.println(!b2);//false
		
		
		System.out.println((10>20)&&(20>10));
	}

}
