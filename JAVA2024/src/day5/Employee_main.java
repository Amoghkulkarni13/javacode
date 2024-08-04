package day5;

public class Employee_main {

	public static void main(String[] args) {
		Employee_details objemp=new Employee_details();
		
		objemp.eid=2218628;
		objemp.ename="AMogh";
		objemp.job="TCS";
		objemp.salary=25000;
		
		objemp.display();
		
		
		Employee_details objemp2=new Employee_details();	
		
		objemp2.eid=221867;
		objemp2.ename="Kulkarni";
		objemp2.job="INFOSYS";
		objemp2.salary=250000;
		
		objemp2.display();
		
	}

}
