package day6;

public class Student_main {

	public static void main(String[] args) {
		
		
		//1 we can add value to the variable through object refrence
//		Student sobj=new Student();
//		
//		sobj.grade='A';
//		sobj.sid=101;
//		sobj.sname="amogh";
//		
//		sobj.printStudentdetails();
		
		// 2we can add value to the variable through method
//		  sobj.details(1, "anil", 'C');
//		  
//		  
//		  sobj.printStudentdetails();
		  
		  //3 we can add value to variable through constructer
		  Student s=new Student(101,"kumble",'A');
		  
		  s.printStudentdetails();
		

	}

}
