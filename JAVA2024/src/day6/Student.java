package day6;

public class Student {
	
	int sid;
	String sname;
	char grade;
	
	void printStudentdetails() {
		
		System.out.println(sid+" "+sname+ " "+grade);
	}
	
	
	
	void details(int id, String name, char g) {
		
		
		sid=id;
		sname=name;
		grade=g;
	}
	
	Student(int id, String name, char g){
		sid=id;
		sname=name;
		grade=g;
	}

}
